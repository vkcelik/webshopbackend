package test.dao;


import java.sql.SQLException;
import logic.dto.LeveringsmetodeDTO;
import data.connect.Connector;
import data.dao.MySQLLeveringsmetodeDAO;
import data.idao.DALException;


/**
* @author  Veli Kerim Celik  
*/

public class TestLeveringsmetode
{
	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }

		MySQLLeveringsmetodeDAO l = new MySQLLeveringsmetodeDAO();

		System.out.println("Oprettelse af Leveringsmetode");
		LeveringsmetodeDTO l1 = new LeveringsmetodeDTO(1,"post", 2.1);
		try {l.createLeveringsmetode(l1);}
		catch (DALException e){System.out.println(e.getMessage());}

		System.out.println("Hent Leveringsmetode nummer 1");
		try {System.out.println(l.getLeveringsmetode(1).getLeveringsmetodeNummer());}
		catch (DALException e){ System.out.println(e.getMessage());}

		System.out.println("Ændrer post til Postdanmark i nummer 1");
		l1.setLeveringsmetodeNavn("Postdanmark");
		try {
			l.updateLeveringsmetode(l1);
		} catch (DALException e) {
			System.out.println(e.getMessage());

		}
	}}