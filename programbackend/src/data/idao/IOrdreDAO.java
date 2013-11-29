package data.idao;

import java.util.List;

import logic.dto.OrdreDTO;



/**
* @author  Veli Kerim Celik  
*/

public interface IOrdreDAO {
	OrdreDTO getOrdre(int ordreId) throws DALException;
	List<OrdreDTO> getOrdreList() throws DALException;
	void createOrdre(OrdreDTO ordreObject) throws DALException;
	void updateOrdre(OrdreDTO ordreObject) throws DALException;
}
