package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import data.connect.Connector;
import data.idao.DALException;
import data.idao.IKategoriDAO;
import logic.dto.KategoriDTO;

public class MySQLKategoriDAO implements IKategoriDAO {

	@Override
	public KategoriDTO getKategori(int id) throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM kategoriDTO WHERE kategorinummer = " + id);
	    try {
	    	if (!rs.first()) throw new DALException("Produktbatchkomponent med produktbatch " + id); 
	    	return new KategoriDTO (rs.getInt(1), rs.getString(2));
	    }
	    catch (SQLException e) {throw new DALException(e); }
	
	}

	@Override
	public List<KategoriDTO> getKategoriList() throws DALException {
		List<KategoriDTO> list = new ArrayList<KategoriDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Kategori");
		try
		{
			while (rs.next()) 
			{
				list.add(new KategoriDTO(rs.getInt(1), rs.getString(2)));
			}
		}
		catch (SQLException e) { throw new DALException(e); }
		return list;
	}

	@Override
	public void createKategori(KategoriDTO kategori) throws DALException {
	
		Connector.doUpdate(
				"INSERT INTO KategoriDTO(kategorNummer, kategoriNavn) VALUES " +
				"(" + kategori.getKategoriNummer() + ", '" + kategori.getKategoriNavn()  + "')");
	
		
	}

	@Override
	public void updateKategori(KategoriDTO kategori) throws DALException {
		Connector.doUpdate(
				"UPDATE kategoriDTO SET kategoriNummer = '" + kategori.getKategoriNummer() + "', kategoriNavn =  '" + kategori.getKategoriNavn());
	
	}
}
