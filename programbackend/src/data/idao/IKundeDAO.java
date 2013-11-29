package data.idao;

import java.util.List;

import logic.dto.KundeDTO;



/**
* @author  Veli Kerim Celik  
*/

public interface IKundeDAO {
	
	KundeDTO getKunde(int id) throws DALException;
	List<KundeDTO> getKundeList() throws DALException;
	void createKunde(KundeDTO kunde) throws DALException;
	void updateKunde(KundeDTO kunde) throws DALException;


}
