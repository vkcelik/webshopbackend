package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.VarehusDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IVarehusDAO;

public class MySQLVarehusDAO implements IVarehusDAO{

	@Override
	public VarehusDTO getVarehus(int varehusNummer) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM Varehus WHERE varehusNummer = " + varehusNummer);
		try {
			if (!rs.first()) throw new DALException("Varehus med varehusNummer " + varehusNummer); 
			return new VarehusDTO (rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
		}
		catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<VarehusDTO> getVarehusList() throws DALException {
		List<VarehusDTO> list = new ArrayList<VarehusDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Varehus");
		try { 
			while (rs.next()){
				list.add(new VarehusDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;		

	}

	@Override
	public void createVarehus(VarehusDTO varehus) throws DALException {
		Connector.doUpdate(
				"INSERT INTO Varehus(varehusNummer, adresse, postnummer, leveringstid) VALUES " +
						"('" + varehus.getVarehusNummer() + "', '" + varehus.getAdresse() + "', '" + varehus.getPostnummer() + "', '" + varehus.getLeveringsTid() + "')"
				);
	}

	@Override
	public void updateVarehus(VarehusDTO varehus) throws DALException {
		Connector.doUpdate(
				"UPDATE Varehus SET adresse = '" + varehus.getAdresse()
				+ "', postnummer =  '" + varehus.getPostnummer()
				+ "', leveringstid =  '" + varehus.getLeveringsTid()
				+ "' WHERE varehusNummer = " + varehus.getVarehusNummer() );
	}

}
