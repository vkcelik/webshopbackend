package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.OrdreDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IOrdreDAO;

public class MySQLOrdreDAO implements IOrdreDAO {

	@Override
	public OrdreDTO getOrdre(int ordreId) throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM Ordre WHERE ordreNummer = " + ordreId);
	    try {
	    	if (!rs.first()) throw new DALException("Ordre med ordreNummer " + ordreId + " findes ikke."); 
	    	return new OrdreDTO (rs.getInt(1), rs.getInt(2), rs.getTimestamp(3), rs.getDouble(4), rs.getString(5));
	    }
	    catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<OrdreDTO> getOrdreList() throws DALException {
		
		List<OrdreDTO> list = new ArrayList<OrdreDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Ordre");
		try { 
			while (rs.next()){
				list.add(new OrdreDTO(rs.getInt(1), rs.getInt(2),  rs.getTimestamp(3), rs.getDouble(4), rs.getString(5)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;	
		
	}

	@Override
	public void createOrdre(OrdreDTO ordreObject) throws DALException {
		
		Connector.doUpdate(
				"INSERT INTO Ordre(ordreNummer, kundeNummer, bestillingsDato, total, ordreStatus) VALUES " +
				"(" + ordreObject.getOrdreNummer() + ", '" + ordreObject.getKundeNummer() + ", '" + ordreObject.getBestillingsDato() + ", '" + ordreObject.getTotal() + ", '" + ordreObject.getOrdreStatus() + "')"
				);
	}

	@Override
	public void updateOrdre(OrdreDTO ordreObject) throws DALException {
		
		Connector.doUpdate(
				"UPDATE Ordre SET total =  '" + ordreObject.getTotal()
				+ "', ordreStatus =  '" + ordreObject.getOrdreStatus()
				+ "' WHERE ordreNummer = " + ordreObject.getOrdreNummer()
				);
	
		
	}

}
