package data.dao;

import java.util.List;

import logic.dto.BilledeDTO;
import data.idao.DALException;
import data.idao.IBilledeDAO;

public class MySQLBilledeDAO implements IBilledeDAO{

	@Override
	public BilledeDTO getbilledNummer(int billedeNummer) throws DALException {
		
		return null;
	}

	@Override
	public List<BilledeDTO> getBilledeList() throws DALException {
		return null;
	}

	@Override
	public List<BilledeDTO> getBilledeList(int vareNummer) throws DALException {
		return null;
	}

	@Override
	public void createBillede(BilledeDTO billede) throws DALException {
		
	}

	@Override
	public void updateBillede(BilledeDTO billede) throws DALException {
		
	}

}
