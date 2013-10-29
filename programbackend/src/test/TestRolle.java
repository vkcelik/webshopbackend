package test;


import java.sql.SQLException;
import logic.dto.RolleDTO;
import data.connect.Connector;
import data.dao.MySQLRolleDAO;
import data.idao.DALException;

public class TestRolle {

	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLRolleDAO r = new MySQLRolleDAO();
		
		System.out.println("Oprettelse af Rolle");
		RolleDTO r1 = new RolleDTO(1, 1);
		try {r.createRolle(r1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent Rolle nummer 1");
		try {System.out.println(r.getRolle(1).getRolleNummer());}
		catch (DALException e){ System.out.println(e.getMessage());}
		
		System.out.println("Hent alle Roller");
		try {System.out.println(r.getRolleList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		

	}}

