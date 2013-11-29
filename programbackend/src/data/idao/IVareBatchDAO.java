package data.idao;

import java.util.List;

import logic.dto.VarebatchDTO;

/**
* @author  Ziad bahlawan 
*/

public interface IVareBatchDAO {
	
	VarebatchDTO getVareBatch(int vareBatchNummer) throws DALException;
	List<VarebatchDTO> getVareBatchList() throws DALException;
	void createVareBatch(VarebatchDTO vb) throws DALException;
	void updateVareBatch(VarebatchDTO vb) throws DALException;
	String getVareNavn(int vbId) throws DALException;
	void deleteVarebatch(int id) throws DALException;
}
