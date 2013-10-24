package data.idao;

import logic.dto.OrdrelinieDTO;
import java.util.List;

public interface IOrdrelinieDAO {
	OrdrelinieDTO getOrdrelinie(int ordreLinieID) throws DALException;
	List<OrdrelinieDTO> getOrdrelinieList() throws DALException;
	void createOrdrelinie(OrdrelinieDTO ordreL) throws DALException;
	void updateOrdrelinie(OrdrelinieDTO ordreL) throws DALException;
}
