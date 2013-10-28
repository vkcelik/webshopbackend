package data.idao;

import java.util.List;

import logic.dto.VareDTO;

public interface IVareDAO {
	VareDTO getVare(int vareNummer) throws DALException;
	List<VareDTO> getVareList() throws DALException;
	void createVare(VareDTO vare) throws DALException;
	void updateVare(VareDTO vare ) throws DALException;

	}