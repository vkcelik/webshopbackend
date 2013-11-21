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

		
		List<String[]> top = null;
		MySQLStatestikDAO ol = new MySQLStatestikDAO(); 
		System.out.println("Top 10 over ordrelinier");
		try {top = ol.getTop10Vare("Dag");}
		catch (DALException e) { System.out.println(e.getMessage()); }
		printArray(top);
		
		System.out.println("Top 10 over ordrelinier");
		try {top = ol.getTop10Vare("Uge");}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Top 10 over ordrelinier");
		try {top = ol.getTop10Vare("Måned");}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Top 10 over ordrelinier");
		try {top = ol.getTop10Vare("År");}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		
		
		System.out.println("Omsætning");
		try {System.out.println(ol.getOmsætning());}
		catch (DALException e){ System.out.println(e.getMessage()); }
		
		System.out.println("antal ordre");
		try {System.out.println(ol.getAntalOrdre());}
		catch (DALException e){ System.out.println(e.getMessage()); }
		
	}
	
	static void printArray(List<String[]> top ){
		for (int i=0; i<top.size(); i++)
			for(int j=0; j<top.get(i).length; j++)
				System.out.println(top.get(i)[j]);
	}
	
	
}



