package data.idao;

import java.util.List;

import logic.dto.BilledeDTO;

/**
* @author  Fadi abdul harim 
*/

public interface IBilledeDAO {
	BilledeDTO getbilledNummer(int billedeNummer) throws DALException;
	List<BilledeDTO> getBilledeList() throws DALException;
	List<BilledeDTO> getBilledeList(int vareNummer) throws DALException;
	void createBillede(BilledeDTO billede) throws DALException;
	void updateBillede(BilledeDTO billede) throws DALException;
	void deleteBillede(int vareNummer, String billedeSti) throws DALException;
}
