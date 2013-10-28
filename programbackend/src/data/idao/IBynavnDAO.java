package data.idao;

import java.util.List;

import logic.dto.BynavnDTO;

public interface IBynavnDAO {
	BynavnDTO getByNavn(int postnummer) throws DALException;
	List<BynavnDTO> getByNavnList() throws DALException;
	void createbyNavn(BynavnDTO ByNavn) throws DALException;
	void updateByNavn(BynavnDTO ByNavn ) throws DALException;

	}
