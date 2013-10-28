package test;

import java.sql.SQLException;

import logic.dto.BynavnDTO;
import logic.dto.IndstillingDTO;



import data.connect.Connector;
import data.dao.MySQLBynavnDAO;
import data.idao.DALException;

public class TestBynavn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLBynavnDAO bn = new MySQLBynavnDAO();
		
		System.out.println("Oprettelse af bynavn");
		BynavnDTO bn1 = new BynavnDTO(3000, "Helsingør");
		try {bn.createbynavn(bn1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		
		
		
		
		
		

		
		
		

	}

}
