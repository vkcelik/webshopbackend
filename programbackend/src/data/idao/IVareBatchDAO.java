package data.idao;

import java.util.List;
import logic.dto.VareBatchDTO;

public interface IVareBatchDAO {
	
	VareBatchDTO getVareBatch(int vareBatchNummer) throws DALException;
	List<VareBatchDTO> getVareBatchList() throws DALException;
	void createVareBatch(VareBatchDTO vb) throws DALException;
	void updateVareBatch(VareBatchDTO vb) throws DALException;

}
