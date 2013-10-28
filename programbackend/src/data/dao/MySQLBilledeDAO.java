package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.BilledeDTO;
import logic.dto.IndstillingDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IBilledeDAO;

public class MySQLBilledeDAO implements IBilledeDAO{

	@Override
	public BilledeDTO getbilledNummer(int billedeNummer ) throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM Billede WHERE BilledeNummer = " + billedeNummer);
		try {
			if (!rs.first())
				throw new DALException("Billede med BilledeNummer " + billedeNummer + " findes ikke.");
			return new BilledeDTO(rs.getInt(1),rs.getInt(2), rs.getString(2) );
		} catch (SQLException e) {throw new DALException(e); }
	}
		
		
		
		
	

	@Override
	public List<BilledeDTO> getBilledeList() throws DALException {
		List<BilledeDTO> list = new ArrayList<BilledeDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Billede");
		try { 
			while (rs.next()){
				list.add(new BilledeDTO(rs.getInt(1),rs.getInt(2), rs.getString(2)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;
	}	 
	

	@Override
	public List<BilledeDTO> getBilledeList(int vareNummer) throws DALException {
		
		List<BilledeDTO> list = new ArrayList<BilledeDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Billede where vareNummer = vareNummer");
		try { 
			while (rs.next()){
				list.add(new BilledeDTO(rs.getInt(1),rs.getInt(2), rs.getString(2)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;
	}

	@Override
	public void createBillede(BilledeDTO billede) throws DALException {
		Connector.doUpdate(
				"INSERT INTO Billede(billedeNummer,vareNummer, billedeSti) VALUES " +
				"(" + billede.getBilledeNummer() + "', '" + billede.getBilledeSti() + "','" +billede.getBilledeSti() +"')"
				);

		
	}

	@Override
	public void updateBillede(BilledeDTO billede) throws DALException {
		Connector.doUpdate(
		
		"UPDATE Billede SET billedeNummer = '" + billede.getBilledeNummer() + "' , vareNummer = '" + billede.getVareNummer() +"' , billedeSti = '" + billede.getBilledeSti()
				);
		
	}

}
