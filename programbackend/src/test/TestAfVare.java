package test;

import java.sql.SQLException;

import logic.dto.IndstillingDTO;
import logic.dto.VareDTO;
import data.connect.Connector;
import data.dao.MySQLIndstillingDAO;
import data.dao.MySQLVareDAO;
import data.idao.DALException;

public class TestAfVare {

	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLVareDAO va = new MySQLVareDAO();
		//System.out.println(java.lang.System.currentTimeMillis());
		
		System.out.println("Oprettelse af et par jeans");
		VareDTO i1 = new VareDTO(4, "Levis Pony", 240, 1, "blå jeans", 0.2, 0.4, 0.02, 1.2);
		try {va.createVare(i1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Oprettelse af et andet par jeans");
		VareDTO i2 = new VareDTO(5, "Levis Faggot", 240, 1, "pink jeans", 0.2, 0.4, 0.02, 1.2);
		try {va.createVare(i2);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent vare nummer 4");
		try {System.out.println(va.getVare(4));}
		catch (DALException e){ System.out.println(e.getMessage()); }

		System.out.println("Hent alle varer");
		try {System.out.println(va.getVareList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer beskrivelse i nummer 4");
		VareDTO i3 = null;
		try {
			i3 = va.getVare(4);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}
		if (i3 !=null)
		i3.setBeskrivelse("orange jeans");
		try {
			va.updateVare(i3);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}		
	}

}
