package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.LeveringsmetodeDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.ILeveringsmetodeDAO;

public class MySQLLeveringsmetodeDAO implements ILeveringsmetodeDAO {

	@Override
	public LeveringsmetodeDTO getLeveringsmetode(int levmetodeId) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM Leveringsmetode WHERE metodeNummer = " + levmetodeId);
		try {
			if (!rs.first())
				throw new DALException("Leveringsmulighed med metodeNummer " + levmetodeId + " findes ikke.");
			return new LeveringsmetodeDTO(rs.getInt(1), rs.getString(2), rs.getDouble(3));
		} catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<LeveringsmetodeDTO> getLeveringsmetode() throws DALException {
		List<LeveringsmetodeDTO> list = new ArrayList<LeveringsmetodeDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Leveringsmetode");
		try { 
			while (rs.next()){
				list.add(new LeveringsmetodeDTO(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;
	}

	@Override
	public void createLeveringsmetode(LeveringsmetodeDTO l) throws DALException {
		String q = "INSERT INTO Leveringsmetode(metodeNummer, metodeNavn, metodePris) VALUES " +
				"(" + l.getLeveringsmetodeNummer() + ", '" + l.getLeveringsmetodeNavn() + "', " + l.getLeveringsmetodePris() + ")";
		Connector.doUpdate(
				q
				);
	}

	@Override
	public void updateLeveringsmetode(LeveringsmetodeDTO l) throws DALException {
		Connector.doUpdate(
				"UPDATE Leveringsmetode SET metodeNavn = '" + l.getLeveringsmetodeNavn() + 
				"', metodePris =  '" + l.getLeveringsmetodePris()  +
				"' WHERE metodeNummer = " + l.getLeveringsmetodeNummer()
				);
	}

}
