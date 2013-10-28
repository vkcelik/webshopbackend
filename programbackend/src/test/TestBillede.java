package test;
import java.sql.SQLException;

import logic.dto.BilledeDTO;
import logic.dto.IndstillingDTO;

import data.connect.Connector;
import data.dao.MySQLBilledeDAO;
import data.idao.DALException;


public class TestBillede {
	
	

	public static void main(String[] args) {
		
	
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		
		MySQLBilledeDAO ba = new MySQLBilledeDAO();
		
		System.out.println("Oprettelse af billede");
		BilledeDTO b1 = new BilledeDTO(1, 4,"bukser.jpg");
		try {ba.createBillede(b1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
//		System.out.println("Oprettelse billede 2");
//		BilledeDTO b2 = new BilledeDTO(2, 3, "Shirt");
//		try {ba.createBillede(b2);}
//		catch (DALException e){System.out.println(e.getMessage());}
//		
		
		System.out.println("Hent Billede nummer 5");
		try {System.out.println(ba.getbilledNummer(5));}
		catch (DALException e){ System.out.println(e.getMessage()); }
		

	}

}
