package data.dao;

import java.util.ArrayList;
import java.util.List;

import logic.dto.BynavnDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import data.connect.Connector;
import data.idao.DALException;
import data.idao.IBynavnDAO;



public class MySQLBynavnDAO implements IBynavnDAO   {



	@Override
	public BynavnDTO getByNavn(int postnummer) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM ByNavn WHERE postNummer = " +postnummer );
	    try {
	    	if (!rs.first()) throw new DALException("By med Bynavn = " + postnummer +" findes ikke"); 
	    	return new BynavnDTO (rs.getInt(1), rs.getString(2));
	    }
	    catch (SQLException e) {throw new DALException(e); }
	
		
	}

	@Override
	public List<BynavnDTO> getByNavnList() throws DALException {
		List<BynavnDTO> list = new ArrayList<BynavnDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM ByNavn");
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
	public void createbyNavn(BynavnDTO ByNavn) throws DALException {
	

		Connector.doUpdate(
				"INSERT INTO ByNavn(postNummer, byNavn) VALUES " +
				"(" + ByNavn.getPostNummer() + ", '" + ByNavn.getByNavn() + "')");
			
		
	}

	@Override
	public void updateByNavn(BynavnDTO ByNavn) throws DALException {
		
		Connector.doUpdate(
				"UPDATE ByNavn SET byNavn=  '" + ByNavn.getByNavn()
				+ "' WHERE postNummer = " + ByNavn.getPostNummer()
				);
		}
	}