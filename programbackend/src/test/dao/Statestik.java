package test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.OrdreLinieDTO;
import data.connect.Connector;
import data.dao.MySQLOrdreLinieDAO;
import data.idao.DALException;
import data.idao.IOrdreLinieDAO;

public class Statestik {
	
	public List<String> getTop10() throws DALException{

		List<String> liste = new ArrayList<String>();
		
		MySQLOrdreLinieDAO ol = new MySQLOrdreLinieDAO(); 
		System.out.println("Top 10 over ordrelinier");
		try {liste = ol.getOrdrelinieTop10();}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		return liste;
	}
	
}
