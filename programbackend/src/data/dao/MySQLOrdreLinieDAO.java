package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.OrdreLinieDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IOrdreLinieDAO;

public class MySQLOrdreLinieDAO implements IOrdreLinieDAO {

	@Override
	public OrdreLinieDTO getOrdrelinie(int id) throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM OrdreLinie WHERE linieNummer = " + id);
	    try {
	    	if (!rs.first()) throw new DALException("OrdreLinie med linieNummer " + id + " findes ikke."); 
	    	return new OrdreLinieDTO (rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getBoolean(6));
	    }
	    catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<OrdreLinieDTO> getOrdrelinieList() throws DALException {
	
		List<OrdreLinieDTO> list = new ArrayList<OrdreLinieDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM OrdreLinie");
		try { 
			while (rs.next()){
				list.add(new OrdreLinieDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getBoolean(6)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;	
		
	}

	@Override
	public void createOrdrelinie(OrdreLinieDTO ordreL) throws DALException {
		
		Connector.doUpdate(
				"INSERT INTO OrdreLinie(linieNummer, vareNummer, antal, stykPris, linieTotal, erGave) VALUES " +
				"('" + ordreL.getLinieNummer() + "', '" + ordreL.getVareNummer() + "', '" + ordreL.getAntal() + "', '" + ordreL.getStykPris() + "', '" + ordreL.getLinieTotal() + "', '" + ordreL.isErGave() + "')"
				);
	}

	@Override
	public void updateOrdrelinie(OrdreLinieDTO ordreL) throws DALException {

		Connector.doUpdate(
				"UPDATE OrdreLinie SET vareNummer = '" + ordreL.getVareNummer() 
				+ "', antal =  '" + ordreL.getAntal() 
				+ "', stykPris =  '" + ordreL.getStykPris()
				+ "', linieTotal =  '" + ordreL.getLinieTotal()
				+ "', erGave =  '" + ordreL.isErGave()
				+ "' WHERE linieNummer = " + ordreL.getLinieNummer());
	}

}