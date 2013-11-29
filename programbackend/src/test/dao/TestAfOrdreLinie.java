package test.dao;

import java.sql.SQLException;

import logic.dto.OrdreLinieDTO;
import data.connect.Connector;
import data.dao.MySQLOrdreLinieDAO;
import data.idao.DALException;

/**
* @author  Veli Kerim Celik  
*/

public class TestAfOrdreLinie {

	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLOrdreLinieDAO ia = new MySQLOrdreLinieDAO();
		
		System.out.println("Oprettelse af ordrelinieNummer 39 til af varer 5");
		OrdreLinieDTO i1 = new OrdreLinieDTO(39, 5, 2, 240, 480, false, 4);
		try {ia.createOrdrelinie(i1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Oprettelse af ordrelinieNummer 40 til af varer 4 som gave");
		OrdreLinieDTO i2 = new OrdreLinieDTO(40, 4, 1, 240, 240, true, 4);
		try {ia.createOrdrelinie(i2);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent ordrelinie nummer 40");
		try {System.out.println(ia.getOrdrelinie(40));}
		catch (DALException e){ System.out.println(e.getMessage()); }

		System.out.println("Hent alle ordrelinier");
		try {System.out.println(ia.getOrdrelinieList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer erGave til false i nummer 40");
		i2.setErGave(false);
		try {
			ia.updateOrdrelinie(i2);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}		

	}

}
