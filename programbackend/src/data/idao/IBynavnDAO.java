package data.idao;

import java.util.List;

import logic.dto.BynavnDTO;

public interface IBynavnDAO {
	BynavnDTO getBynavn(int postnummer) throws DALException;
	List<BynavnDTO> getBynavnList() throws DALException;
	void createbynavn(BynavnDTO by) throws DALException;
	void updateBynavn(BynavnDTO by ) throws DALException;

	}
