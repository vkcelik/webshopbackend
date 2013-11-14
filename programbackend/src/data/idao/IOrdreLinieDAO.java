package data.idao;

import logic.dto.OrdreLinieDTO;
import java.util.List;

public interface IOrdreLinieDAO {
	OrdreLinieDTO getOrdrelinie(int ordreLinieID) throws DALException;
	List<OrdreLinieDTO> getOrdrelinieList() throws DALException;
	List<String> getOrdrelinieTop10() throws DALException;
	void createOrdrelinie(OrdreLinieDTO ordreL) throws DALException;
	void updateOrdrelinie(OrdreLinieDTO ordreL) throws DALException;
}