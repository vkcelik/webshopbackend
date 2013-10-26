package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import logic.dto.KundeDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IKundeDAO;

public class MySQLKundeDAO implements IKundeDAO {

	
	public KundeDTO getKunde(int id) throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM kundeDTO WHERE kundeNummer = " + id);
	    try {
	    	if (!rs.first()) throw new DALException("Produktbatchkomponent med produktbatch " + id); 
	    	return new KundeDTO (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(6));
	    }
	    catch (SQLException e) {throw new DALException(e); }
		
	}

	
	public List<KundeDTO> getKundeList() throws DALException {
		
		List<KundeDTO> list = new ArrayList<KundeDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Kunde");
		try
		{
			while (rs.next()) 
			{
				list.add(new KundeDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(6)));
			}
		}
		catch (SQLException e) { throw new DALException(e); }
		return list;
		
	}

	
	public void createKunde(KundeDTO kunde) throws DALException {
		
		Connector.doUpdate(
				"INSERT INTO KundeDTO(kundeNummer, kundeNavn, kundeEmail, kundeAdresse, KundeLand, kundePostnummer, kundeTelefon) VALUES " +
				"(" + kunde.getKundeNummer() + ", '" + kunde.getKundeNavn()+ ", '" + kunde.getKundeEmail() + ", '" + kunde.getKundeAdresse()+ ", '" +
				kunde.getKundeLand()+ ", '" + kunde.getKundePostnummer()+ ", '" + kunde.getKundeTelefon()  + "')");
	
		
	}

	
	public void updateKunde(KundeDTO kunde) throws DALException {
		
		Connector.doUpdate(
				"UPDATE kundeDTO SET kundeNummer = '" + kunde.getKundeNummer() + "', kundeNavn =  '" + kunde.getKundeNavn() + "', kundeEmail =  '" + kunde.getKundeEmail() 
				+ "', kundeAdresse =  '" + kunde.getKundeAdresse() + "', kundeLand =  '" + kunde.getKundeLand() + "', kundePostnummer =  '" + kunde.getKundePostnummer()
				+ "', kundeTelefon =  '" + kunde.getKundeTelefon());
		
	}

}
