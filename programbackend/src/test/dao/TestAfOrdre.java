package test.dao;

import java.sql.SQLException;
import java.sql.Timestamp;

import logic.dto.OrdreDTO;
import data.connect.Connector;
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
		
		System.out.println("Oprettelse af ordre 2");
		OrdreDTO i2 = new OrdreDTO(2, 1, new Timestamp(System.currentTimeMillis()), 150.00, "Oprettet");
		try {ia.createOrdre(i2);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent ordre nummer 1");
		try {System.out.println(ia.getOrdre(1));}
		catch (DALException e){ System.out.println(e.getMessage()); }

		System.out.println("Hent alle ordre");
		try {System.out.println(ia.getOrdreList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer ordreStatus til Afsluttet i nummer 1");
		i2.setOrdreStatus("Afsluttet");
		try {
			ia.updateOrdre(i2);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}		
	}

}
