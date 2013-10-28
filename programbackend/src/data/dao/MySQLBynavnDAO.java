package data.dao;

import java.util.ArrayList;
import java.util.List;

import logic.dto.BynavnDTO;
import logic.dto.KategoriDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import data.connect.Connector;
import data.idao.DALException;
import data.idao.IBynavnDAO;



public class MySQLBynavnDAO implements IBynavnDAO   {



	@Override
	public BynavnDTO getBynavn(int postnummer) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM BynavnDTO WHERE Bynavn = " +postnummer );
	    try {
	    	if (!rs.first()) throw new DALException("By med Bynavn = " + postnummer +" findes ikke"); 
	    	return new BynavnDTO (rs.getInt(1), rs.getString(2));
	    }
	    catch (SQLException e) {throw new DALException(e); }
	
		
	}

	@Override
	public List<BynavnDTO> getBynavnList() throws DALException {
		List<BynavnDTO> list = new ArrayList<BynavnDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Bynavn");
		try
		{
			while (rs.next()) 
			{
				list.add(new BynavnDTO(rs.getInt(1), rs.getString(2)));
			}
		}
		catch (SQLException e) { throw new DALException(e); }
		return list;
		
		
	}

	@Override
	public void createbynavn(BynavnDTO by) throws DALException {
	
		Connector.doUpdate(
				"INSERT INTO by(postNummer, byNavn) VALUES " +
				"(" + by.getPostNummer() + ", '" + by.getByNavn() + "')");
		
		
		
		
	}

	@Override
	public void updateBynavn(BynavnDTO by) throws DALException {
		
		
		Connector.doUpdate(
				"UPDATE bynavnDTO SET byNavn=  '" + by.getPostNummer()
				+ "' WHERE postNummer = " + by.getByNavn()
				);
	

		
	}
	
	
	
	

}
