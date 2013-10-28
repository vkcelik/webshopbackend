package test;

import java.sql.SQLException;

import logic.dto.BynavnDTO;

import data.connect.Connector;
import data.dao.MySQLBynavnDAO;
import data.idao.DALException;

public class TestBynavn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLBynavnDAO bn = new MySQLBynavnDAO();
		
		System.out.println("Oprettelse af bynavn");
		BynavnDTO bn1 = new BynavnDTO(3000, "Helsingør");
		try {bn.createbyNavn(bn1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent Bynavn");
		try {System.out.println(bn.getByNavnList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		
		System.out.println("Ændre bynavn til Halsingar");
		BynavnDTO b1 = null;
		try {
			b1 = bn.getByNavn(3000);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}
		if (b1 !=null)
		b1.setByNavn("Halsingar");
		try {
			bn.updateByNavn(b1);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}	
		
		

		
		
		

	}

}
