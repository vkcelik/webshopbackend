package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.OrdreDTO;
import logic.dto.OrdrelinieDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IOrdrelinieDAO;

public class MySQLOrdrelinieDAO implements IOrdrelinieDAO {

	@Override
	public OrdrelinieDTO getOrdrelinie(int ordreLinieID) throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM ordrelinieDTO WHERE vareNummer = " + ordreLinieID);
	    try {
	    	if (!rs.first()) throw new DALException("Produktbatchkomponent med produktbatch " + ordreLinieID); 
	    	return new OrdrelinieDTO (rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getBoolean(5));
	    }
	    catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<OrdrelinieDTO> getOrdrelinieList() throws DALException {
	
		List<OrdrelinieDTO> list = new ArrayList<OrdrelinieDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Ordelinie");
		try { 
			while (rs.next()){
				list.add(new OrdrelinieDTO(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getBoolean(5)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;	
		
	}

	@Override
	public void createOrdrelinie(OrdrelinieDTO ordreL) throws DALException {
		
		Connector.doUpdate(
				"INSERT INTO ordreL(vareNummer, antal, stykPris, linieTotal, erGave) VALUES " +
				"(" + ordreL.getVareNummer() + ", '" + ordreL.getAntal() + ", '" + ordreL.getStykPris() + ", '" + ordreL.getLinieTotal() + ", '" + ordreL.isErGave() + "')"
				);
	}

	@Override
	public void updateOrdrelinie(OrdrelinieDTO ordreL) throws DALException {

		Connector.doUpdate(
				"UPDATE ordrelinieDTO SET vareNummer = '" + ordreL.getVareNummer() 
				+ "', antal =  '" + ordreL.getAntal() 
				+ "', stykPris =  '" + ordreL.getStykPris()
				+ "', linieTotal =  '" + ordreL.getLinieTotal()
				+ "', erGave =  '" + ordreL.isErGave());
	}

}
