package test;

import java.sql.SQLException;

import data.connect.Connector;
import data.dao.MySQLKundeDAO;
import logic.dto.KundeDTO;
import data.idao.DALException;

public class TestAfKunde {


		public static void main(String[] args) {
			try { new Connector(); }
			catch (InstantiationException e){ e.printStackTrace(); }
			catch (IllegalAccessException e){ e.printStackTrace(); }
			catch (ClassNotFoundException e){ e.printStackTrace(); }
			catch (SQLException e){ e.printStackTrace(); }
	
			MySQLKundeDAO K = new MySQLKundeDAO();
	
			System.out.println("opret en kunde med kundenummer 1");
			KundeDTO K1 = new KundeDTO(1, "egon olsen", "egon@olsen", "olsengade 123", "olsenland", 3000, 88888888 );
			try {K.createKunde(K1);}
			catch (DALException e){System.out.println(e.getMessage());}
		
			System.out.println("Hent Kundenummer 1");
			try {System.out.println(K.getKunde(1));}
			catch (DALException e){ System.out.println(e.getMessage()); }
			
			System.out.println("Hent alle kunder");
			try {System.out.println(K.getKundeList());}
			catch (DALException e) { System.out.println(e.getMessage()); }
			

			System.out.println("Ændrer kundenavn til Casper Hansen");
			K1.setKundeNavn("Casper Hansen");
			try {
				K.updateKunde(K1);
			} catch (DALException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
}