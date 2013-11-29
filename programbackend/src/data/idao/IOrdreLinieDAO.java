package data.idao;

import logic.dto.OrdreLinieDTO;
import java.util.List;

/**
* @author  Assaad kassem 
*/

public interface IOrdreLinieDAO {
	OrdreLinieDTO getOrdrelinie(int ordreLinieID) throws DALException;
	List<OrdreLinieDTO> getOrdrelinieList() throws DALException;
	void createOrdrelinie(OrdreLinieDTO ordreL) throws DALException;
	void updateOrdrelinie(OrdreLinieDTO ordreL) throws DALException;
	List<OrdreLinieDTO> getOrdrelinieList(int ordre) throws DALException;
}