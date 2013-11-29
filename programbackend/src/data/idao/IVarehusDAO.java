package data.idao;

import java.util.List;

import logic.dto.VarehusDTO;


/**
* @author  Veli Kerim Celik  
*/

public interface IVarehusDAO {
	VarehusDTO getVarehus(int varehusNummer) throws DALException;
	List<VarehusDTO> getVarehusList() throws DALException;
	void createVarehus(VarehusDTO varehus) throws DALException;
	void updateVarehus(VarehusDTO varehus) throws DALException;
	void deleteVarehus(int id) throws DALException;

}
