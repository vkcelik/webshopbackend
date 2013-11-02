package test.dao;

import java.sql.SQLException;

import logic.dto.MedarbejderDTO;
import data.connect.Connector;
import data.dao.MySQLMedarbejderDAO;
import data.idao.DALException;

public class TestAfMedarbejder {

	public static void main(String[] args) {
		
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLMedarbejderDAO mdao = new MySQLMedarbejderDAO();
		
		System.out.println("Oprettelse af admin medarbejder");
		MedarbejderDTO i1 = new MedarbejderDTO(1, "Admin Peter", "Kælderen 2", "Danmark", 3000, "admin@system.dk", "sikkerhed", "Funktionær", 35000, 4545, "2147483647", "311299-1343");
		try {mdao.createMedarbejder(i1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Oprettelse af en anden medarbejder");
		MedarbejderDTO i2 = new MedarbejderDTO(2, "Jan Kim", "Loftet 5", "Danmark", 3000, "jan@system.dk", "sikkerhed", "Timelønnet", 190, 4523, "7766338811", "123323-4341");
		try {mdao.createMedarbejder(i2);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent medarbejder nummer 1");
		try {System.out.println(mdao.getMedarbejder(1));}
		catch (DALException e){ System.out.println(e.getMessage()); }

		System.out.println("Hent alle medarbejdere");
		try {System.out.println(mdao.getMedarbejderList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer adresse til i nummer 1");
		i2.setMedarbejderAdresse("Trianglen 8");
		try {
			mdao.updateMedarbejder(i2);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}

	}

}
