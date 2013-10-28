package test;

import java.sql.SQLException;

import logic.dto.KategoriDTO;

import data.connect.Connector;
import data.dao.MySQLKategoriDAO;
import data.idao.DALException;

public class Test_Kategori {

	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }

		
		MySQLKategoriDAO ka = new MySQLKategoriDAO();
		
		System.out.println("Oprettelse af Kategori");
		KategoriDTO kat1 = new KategoriDTO(1, "jeans");
		try {ka.createKategori(kat1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		
		System.out.println("Hent Kategori nummer 1");
		try {System.out.println(ka.getKategori(1).getKategoriNavn());}
		catch (DALException e){ System.out.println(e.getMessage());}
		

		System.out.println("Hent alle kategorier");
		try {System.out.println(ka.getKategoriList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer jeans til bukser i nummer 1");
		kat1.setKategoriNavn("bukser");
		try {
			ka.updateKategori(kat1);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}	
	}
}