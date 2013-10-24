package test;

import java.sql.SQLException;

import logic.dto.IndstillingDTO;

import data.connect.Connector;
import data.dao.MySQLIndstillingDAO;
import data.idao.DALException;

public class Main {
	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		System.out.println("Hent indstilling nummer 2");
		MySQLIndstillingDAO ia = new MySQLIndstillingDAO();
		try {System.out.println(ia.getIndstilling(2));}
		catch (DALException e){ System.out.println(e.getMessage()); }
		
		System.out.println("Oprettelse af momsprocent indstilling");
		IndstillingDTO i1 = new IndstillingDTO(3, "0.25");
		try {ia.createIndstilling(i1);}
		catch (DALException e){System.out.println(e.getMessage());}
	}
}
