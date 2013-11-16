package test.dao;


import java.sql.SQLException;
import java.util.List;

import data.connect.Connector;
import data.dao.MySQLStatestikDAO;
import data.idao.DALException;


public class Statestik  {


	public static void main(String[] args) {
		
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }

		
		List<String[]> top;
		MySQLStatestikDAO ol = new MySQLStatestikDAO(); 
		System.out.println("Top 10 over ordrelinier");
		try {System.out.println(ol.getTop10());}
		catch (DALException e) { System.out.println(e.getMessage()); }
	
	}
}
