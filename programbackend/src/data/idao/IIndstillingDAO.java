package data.idao;

import java.util.List;

import logic.dto.IndstillingDTO;

public interface IIndstillingDAO {
	IndstillingDTO getIndstilling(int iId) throws DALException;
	List<IndstillingDTO> getIndstillingList() throws DALException;
	void createIndstilling(IndstillingDTO i) throws DALException;
	void updateIndstilling(IndstillingDTO i) throws DALException;
}
