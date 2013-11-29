package data.idao;

import logic.dto.RolleDTO;

import java.util.List;


/**
* @author  Veli Kerim Celik  
*/


public interface IRolleDAO {
	RolleDTO getRolle(int rolleId) throws DALException;
	List<RolleDTO> getRolleList() throws DALException;
	List<Integer> getRolleList(int medarbejderId) throws DALException;
	void createRolle(RolleDTO rolle) throws DALException;
	void deleteRolle(RolleDTO rolle) throws DALException;
	
}
