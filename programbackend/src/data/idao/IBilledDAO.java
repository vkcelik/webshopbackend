package data.idao;

import java.util.List;

import logic.dto.BilledeDTO;

public interface IBilledDAO {
	BilledeDTO getbilledNummer(int billedNummer) throws DALException;
	List<BilledeDTO> getBilledList() throws DALException;
	List<BilledeDTO> getBilledList(int vareNummer) throws DALException;
	void createBilled(BilledeDTO billed) throws DALException;
	void updateBilled(BilledeDTO billed) throws DALException;
}
