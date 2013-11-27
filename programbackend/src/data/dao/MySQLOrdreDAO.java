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
			return new OrdreDTO (rs.getInt(1), rs.getInt(2), rs.getTimestamp(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getInt(11));
		}
		catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<OrdreDTO> getOrdreList() throws DALException {

		List<OrdreDTO> list = new ArrayList<OrdreDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Ordre");
		try { 
			while (rs.next()){
				list.add(new OrdreDTO(rs.getInt(1), rs.getInt(2), rs.getTimestamp(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getInt(11)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;	

	}

	@Override
	public void createOrdre(OrdreDTO ordreObject) throws DALException {
		String query = "INSERT INTO Ordre(ordreNummer, kundeNummer, bestillingsDato, total, leveringsPris, ordreStatus, leveringsAdresse, leveringsPostnummer, faktureringsAdresse, faktureringsPostnummer, leveringsMetode) VALUES " +
				"('" + ordreObject.getOrdreNummer() + "', '" + ordreObject.getKundeNummer() + "', '" + ordreObject.getBestillingsDato() + "', '" + ordreObject.getTotal() + "', '" + ordreObject.getLeveringsPris() + "', '" +  ordreObject.getOrdreStatus()  + "', '" + ordreObject.getLeveringsAdresse() + "', '" + ordreObject.getLeveringsPostnummer() + "', '" + ordreObject.getFaktureringsAdresse()  + "', '" + ordreObject.getFaktureringsPostnummer() + "', '" + ordreObject.getLeveringsMetode() + "')" ;
		Connector.doUpdate(
				query
				);
	}

	@Override
	public void updateOrdre(OrdreDTO ordreObject) throws DALException {
		
		Connector.doUpdate(
				"UPDATE Ordre SET total =  '" + ordreObject.getTotal()
				+ "', ordreStatus =  '" + ordreObject.getOrdreStatus()
				+ "', leveringsPris =  '" + ordreObject.getLeveringsPris()
				+ "', leveringsAdresse =  '" + ordreObject.getLeveringsAdresse()
				+ "', leveringsPostnummer =  '" + ordreObject.getLeveringsPostnummer()
				+ "', faktureringsAdresse =  '" + ordreObject.getFaktureringsAdresse()
				+ "', faktureringsPostnummer =  '" + ordreObject.getFaktureringsPostnummer()
				+ "', leveringsMetode =  '" + ordreObject.getLeveringsMetode()
				+ "' WHERE ordreNummer = " + ordreObject.getOrdreNummer()
				);


	}

}
