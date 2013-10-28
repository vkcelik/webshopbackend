package test;
import java.sql.SQLException;

import logic.dto.BilledeDTO;
import data.connect.Connector;
import data.dao.MySQLBilledeDAO;
import data.idao.DALException;


public class TestAfBillede {



	public static void main(String[] args) {


		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }


		MySQLBilledeDAO ba = new MySQLBilledeDAO();

		System.out.println("Oprettelse af billede 1");
		BilledeDTO b1 = new BilledeDTO(1, 4,"bukser.jpg");
		try {ba.createBillede(b1);}
		catch (DALException e){System.out.println(e.getMessage());}

		System.out.println("Oprettelse billede 2");
		BilledeDTO b2 = new BilledeDTO(2, 4, "bukser1.jpg");
		try {ba.createBillede(b2);}
		catch (DALException e){System.out.println(e.getMessage());}

		System.out.println("Hent Billede nummer 1");
		try {System.out.println(ba.getbilledNummer(1));}
		catch (DALException e){ System.out.println(e.getMessage()); }
		
		System.out.println("Hent alle billeder");
		try {System.out.println(ba.getBilledeList()); }
		catch (DALException e){System.out.println(e.getMessage()); }
		
		System.out.println("Hent alle billeder for vare 4");
		try {System.out.println(ba.getBilledeList(4)); }
		catch (DALException e){System.out.println(e.getMessage()); }
		
		System.out.println("Jeg ændre stien til et billede");
		b2.setBilledeSti("0332.png");
		try {ba.updateBillede(b2); } 
		catch (DALException e){System.out.println(e.getMessage());
		
		}


	}

}
