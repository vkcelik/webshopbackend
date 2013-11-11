package data.idao;

import java.util.List;

import logic.dto.MedarbejderDTO;

public interface IMedarbejderDAO {
	MedarbejderDTO getMedarbejder(int medarbejderId) throws DALException;
	MedarbejderDTO getMedarbejder(int medarbejderId, String password) throws DALException;
	List<MedarbejderDTO> getMedarbejderList() throws DALException;
	void createMedarbejder(MedarbejderDTO medarbejderObject) throws DALException;
	void updateMedarbejder(MedarbejderDTO medarbejderObject) throws DALException;

}
