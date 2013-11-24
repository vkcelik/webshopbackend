package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.RolleDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IRolleDAO;

public class MySQLRolleDAO implements IRolleDAO {

	@Override
	public RolleDTO getRolle(int rolleId) throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM Rolle WHERE rolleNummer = " + rolleId);
	    try {
	    	if (!rs.first()) throw new DALException("Rolle med rolleNummer " + rolleId); 
	    	return new RolleDTO (rs.getInt(1), rs.getInt(2));
	    }
	    catch (SQLException e) {throw new DALException(e); }
	}
	
	@Override
	public List<RolleDTO> getRolleList() throws DALException {
		
		List<RolleDTO> list = new ArrayList<RolleDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Rolle");
		try
		{
			while (rs.next()) 
			{
				list.add(new RolleDTO(rs.getInt(1), rs.getInt(2)));
			}
		}
		catch (SQLException e) { throw new DALException(e); }
		return list;
	}


	@Override
	public List<Integer> getRolleList(int medarbejderId) throws DALException {
		
		List<Integer> list = new ArrayList<Integer>();
		String q = "SELECT * FROM Rolle WHERE medarbejderNummer = " + medarbejderId;
		ResultSet rs = Connector.doQuery(q);
		try
		{
			while (rs.next()) 
			{
				list.add(rs.getInt(1));
			}
		}
		catch (SQLException e) { throw new DALException(e); }
		return list;
	}

	@Override
	public void createRolle(RolleDTO rolle) throws DALException {
	
		Connector.doUpdate(
				"INSERT INTO Rolle(rolleNummer, medarbejderNummer) VALUES " +
				"(" + rolle.getRolleNummer() + ", '" + rolle.getMedarbejderNummer()  + "')");
		
	}

}
