package data.idao;

import java.util.List;

import logic.dto.MedarbejderDTO;

/**
* @author  Veli Kerim Celik  
*/

public interface IMedarbejderDAO {
	MedarbejderDTO getMedarbejder(int medarbejderId) throws DALException;
	MedarbejderDTO getMedarbejder(int medarbejderId, String password) throws DALException;
	List<MedarbejderDTO> getMedarbejderList() throws DALException;
	void createMedarbejder(MedarbejderDTO medarbejderObject) throws DALException;
	void updateMedarbejder(MedarbejderDTO medarbejderObject) throws DALException;
	int getLastInsertId() throws DALException;
	void deleteMedarbejder(int id) throws DALException;
}
