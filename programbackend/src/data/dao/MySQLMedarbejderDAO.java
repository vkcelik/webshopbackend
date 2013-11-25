package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.MedarbejderDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IMedarbejderDAO;

public class MySQLMedarbejderDAO implements IMedarbejderDAO{
	@Override
	public MedarbejderDTO getMedarbejder(int medarbejderId) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM Medarbejder WHERE medarbejderNummer = " + medarbejderId);
		try {
			if (!rs.first())
				throw new DALException("Medarbejder med medarbejderNummer " + medarbejderId + " findes ikke.");
			return new MedarbejderDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10), rs.getString(11), rs.getString(12));
		} catch (SQLException e) {throw new DALException(e); }
	}
	
	@Override
	public MedarbejderDTO getMedarbejder(int medarbejderId, String password) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM Medarbejder WHERE medarbejderNummer = " + medarbejderId + " AND medarbejderPassword = '" + password + "'");
		try {
			if (!rs.first())
				throw new DALException("Denne kombination findes ikke.");
			return new MedarbejderDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10), rs.getString(11), rs.getString(12));
		} catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<MedarbejderDTO> getMedarbejderList() throws DALException {
		List<MedarbejderDTO> list = new ArrayList<MedarbejderDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Medarbejder");
		try { 
			while (rs.next()){
				list.add(new MedarbejderDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10), rs.getString(11), rs.getString(12)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;
	}

	@Override
	public void createMedarbejder(MedarbejderDTO medarb) throws DALException {
		Connector.doUpdate(
				"INSERT INTO Medarbejder(medarbejderNummer, medarbejderNavn, medarbejderAdresse, medarbejderLand, medarbejderPostnummer, medarbejderEmail, medarbejderPassword, medarbejderLønType, medarbejderLøn, medarbejderRegnr, medarbejderKonto, medarbejderCpr) VALUES " +
				"('" + medarb.getMedarbejderNummer() + "', '" + medarb.getMedarbejderNavn() + "', '" + medarb.getMedarbejderAdresse() + "', '" + medarb.getMedarbejderLand() + "', '" + medarb.getMedarbejderPostnummer() + "', '" + medarb.getMedarbejderEmail() + "', '" + medarb.getMedarbejderPassword() + "', '" + medarb.getMedarbejderLønType() + "', '" + medarb.getMedarbejderLøn() + "', '" + medarb.getMedarbejderRegnr() + "', '" + medarb.getMedarbejderKonto() + "', '" + medarb.getMedarbejderCpr() + "')"
				);
	}

	@Override
	public void updateMedarbejder(MedarbejderDTO m) throws DALException {
		Connector.doUpdate(
				"UPDATE Medarbejder SET medarbejderNavn = '" + m.getMedarbejderNavn() + 
				"', medarbejderAdresse =  '" + m.getMedarbejderAdresse() +
				"', medarbejderPostnummer =  '" + m.getMedarbejderPostnummer() +
				"', medarbejderEmail =  '" + m.getMedarbejderEmail() + 
				"', medarbejderPassword =  '" + m.getMedarbejderPassword() +
				"', medarbejderLønType =  '" + m.getMedarbejderLønType() +
				"', medarbejderLøn =  '" + m.getMedarbejderLøn() +
				"', medarbejderRegnr =  '" + m.getMedarbejderRegnr() +
				"', medarbejderKonto =  '" + m.getMedarbejderKonto() +
				"', medarbejderCpr =  '" + m.getMedarbejderCpr() +
				"' WHERE medarbejderNummer = " + m.getMedarbejderNummer()
				);
	}

	@Override
	public int getLastInsertId() throws DALException {
		ResultSet rs = Connector.doQuery("SELECT LAST_INSERT_ID()");
		int id = -1;
	    try {
	    	if (!rs.first()) throw new DALException("Fejl"); 
	    	id = rs.getInt(1);
	    }
	    catch (SQLException e) {throw new DALException(e); }
		return id;
	}
}
