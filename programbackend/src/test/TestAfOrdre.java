package test;

import java.sql.SQLException;
import java.sql.Timestamp;

import logic.dto.OrdreDTO;
import data.connect.Connector;
import data.dao.MySQLIndstillingDAO;
import data.dao.MySQLOrdreDAO;
import data.idao.DALException;

public class TestAfOrdre {

	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLOrdreDAO ia = new MySQLOrdreDAO();
		
		System.out.println("Oprettelse af ordre 1");
		OrdreDTO i1 = new OrdreDTO(1, 1, new Timestamp(System.currentTimeMillis()), 120.00, "Oprettet");
		try {ia.createOrdre(i1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Oprettelse af underlig indstilling");
		OrdreDTO i2 = new OrdreDTO(1, 1, new Timestamp(System.currentTimeMillis()), 120.00, "Oprettet");
		try {ia.createOrdre(i2);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent indstilling nummer 4");
		try {System.out.println(ia.getOrdre(4));}
		catch (DALException e){ System.out.println(e.getMessage()); }

		System.out.println("Hent alle indstillinger");
		try {System.out.println(ia.getOrdreList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer HEJ til NEJ i nummer 4");
		i2.set
		try {
			ia.update
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}		
	}

}
