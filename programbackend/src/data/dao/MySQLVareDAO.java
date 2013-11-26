package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import logic.dto.VareDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IVareDAO;

public class MySQLVareDAO implements IVareDAO {

	@Override
	public VareDTO getVare(int vareNummer) throws DALException {

		ResultSet rs = Connector.doQuery("SELECT * FROM Vare WHERE vareNummer = " + vareNummer);
		try {
			if (!rs.first()) throw new DALException("Produktbatchkomponent med produktbatch " + vareNummer); 
			return new VareDTO (rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8), rs.getDouble(9));
		}
		catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<VareDTO> getVareList() throws DALException {
		List<VareDTO> list = new ArrayList<VareDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Vare");
		try { 
			while (rs.next()){
				list.add(new VareDTO(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8), rs.getDouble(9)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;		


	}

	@Override
	public void createVare(VareDTO vare) throws DALException {

		Connector.doUpdate(
				"INSERT INTO Vare(vareNummer, vareNavn, Pris, kategoriNummer, beskrivelse, vægt, bredde, dybde, højde) VALUES " +
						"('" + vare.getVareNummer() + "', '" + vare.getVareNavn() + "', '" + vare.getPris() + "', '" + vare.getKategoriNummer() + "', '" + vare.getBeskrivelse() + "', '" + vare.getVægt()+ "', '" + vare.getBredde() + "', '" + vare.getDybde() + "', '" + vare.getHøjde()  + "')"
				);

	}

	@Override
	public void updateVare(VareDTO vare) throws DALException {

		Connector.doUpdate(
				"UPDATE Vare SET vareNavn  = '" + vare.getVareNavn()
				+ "', Pris = '" + vare.getPris() 
				+ "', kategoriNummer =  '" + vare.getKategoriNummer()
				+ "', beskrivelse =  '" + vare.getBeskrivelse()
				+ "', vægt =  '" + vare.getVægt()
				+ "', bredde =  '" + vare.getBredde()
				+ "', dybde =  '" + vare.getDybde()
				+ "', højde =  '" + vare.getHøjde() 
				+ "' WHERE vareNummer = " + vare.getVareNummer() );

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


