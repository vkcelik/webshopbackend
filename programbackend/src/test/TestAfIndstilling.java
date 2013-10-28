package test;

import java.sql.SQLException;

import logic.dto.IndstillingDTO;

import data.connect.Connector;
import data.dao.MySQLIndstillingDAO;
import data.idao.DALException;

public class TestAfIndstilling {
	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLIndstillingDAO ia = new MySQLIndstillingDAO();
		//System.out.println(java.lang.System.currentTimeMillis());
		
		System.out.println("Oprettelse af momsprocent indstilling");
		IndstillingDTO i1 = new IndstillingDTO(3, "0.25");
		try {ia.createIndstilling(i1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Oprettelse af underlig indstilling");
		IndstillingDTO i2 = new IndstillingDTO(4, "HEJ");
		try {ia.createIndstilling(i2);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent indstilling nummer 4");
		try {System.out.println(ia.getIndstilling(4));}
		catch (DALException e){ System.out.println(e.getMessage()); }

		System.out.println("Hent alle indstillinger");
		try {System.out.println(ia.getIndstillingList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer HEJ til NEJ i nummer 4");
		i2.setIndstillingVærdi("NEJ");
		try {
			ia.updateIndstilling(i2);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}		
		
	}
}
