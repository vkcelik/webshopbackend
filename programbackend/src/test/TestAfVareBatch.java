package test;

import java.sql.SQLException;

import logic.dto.VarebatchDTO;
import data.connect.Connector;
import data.dao.MySQLVareBatchDAO;
import data.idao.DALException;

public class TestAfVareBatch {

	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLVareBatchDAO ia = new MySQLVareBatchDAO();
		
		System.out.println("Oprettelse af varebatch 1");
		VarebatchDTO i1 = new VarebatchDTO(1, 5, 100, "R4", 10);
		try {ia.createVareBatch(i1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Oprettelse af varebatch 2");
		VarebatchDTO i2 = new VarebatchDTO(2, 4, 100, "R4", 4);
		try {ia.createVareBatch(i2);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent varebatch nummer 2");
		try {System.out.println(ia.getVareBatch(4));}
		catch (DALException e){ System.out.println(e.getMessage()); }

		System.out.println("Hent alle varebatches");
		try {System.out.println(ia.getVareBatchList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer lagerplacering til A5 i nummer 2");
		i2.setLagerPlacering("A5");
		try {
			ia.updateVareBatch(i2);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}		

	}

}
