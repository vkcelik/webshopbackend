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
			return new MedarbejderDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDouble(10), rs.getInt(11), rs.getInt(12), rs.getInt(13));
		} catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<MedarbejderDTO> getMedarbejder() throws DALException {
		List<MedarbejderDTO> list = new ArrayList<MedarbejderDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Medarbejder");
		try { 
			while (rs.next()){
				list.add(new MedarbejderDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDouble(10), rs.getInt(11), rs.getInt(12), rs.getInt(13))s);
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;
	}

	@Override
	public void createMedarbejder(MedarbejderDTO medarb)
			throws DALException {
		Connector.doUpdate(
				"INSERT INTO Medarbejder(medarbejderNummer, medarbejderNavn, medarbejderAdresse, medarbejderPostnummer, medarbejderEmail, medarbejderPassword, medarbejderRolle, medarbejderLøn, medarbejderRegnr, medarbejderKonto, medarbejderCpr) VALUES " +
				"(" + medarb.getMedarbejderNummer() + ", '" + medarb.getMedarbejderLand() + ", '" + medarb.getMedarbejderAdresse() + ", '" + medarb.getMedarbejderPostnummer() + ", '" + medarb.getMedarbejderEmail() + ", '" + medarb.getMedarbejderPassword()+ ", '" + medarb.getMedarbejderRolle() + ", '" + medarb.getMedarbejder + "')"
				);
}

	@Override
	public void updateMedarbejder(MedarbejderDTO medarbejderObject)
			throws DALException {
		// TODO Auto-generated method stub
		
	}

}
