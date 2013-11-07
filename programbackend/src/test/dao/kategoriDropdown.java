package test.dao;

import java.sql.SQLException;
import java.util.List;

import data.connect.Connector;
import data.dao.MySQLKategoriDAO;
import data.idao.DALException;
import logic.dto.KategoriDTO;

public class kategoriDropdown {
	public static void main(String[] args) {
		String KategoriDropdown[];
		List<KategoriDTO> kats = null;
		
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLKategoriDAO kaDd = new MySQLKategoriDAO();
		try {kats = kaDd.getKategoriList();}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		KategoriDropdown = new String[kats.size()];
		for (int i=0; i < kats.size(); i++){
			KategoriDropdown[i]=kats.get(i).getKategoriNavn();
		}

		
	}
}
