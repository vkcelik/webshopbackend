package data.idao;

import java.util.List;

import logic.dto.KategoriDTO;

/**
* @author  Veli Kerim Celik  
*/

public interface IKategoriDAO {
	
	KategoriDTO getKategori(int id) throws DALException;
	List<KategoriDTO> getKategoriList() throws DALException;
	void createKategori(KategoriDTO kategori) throws DALException;
	void updateKategori(KategoriDTO kunde) throws DALException;
	void deleteKategori(int id) throws DALException;
}
