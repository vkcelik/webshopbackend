package data.idao;

import java.util.List;

import logic.dto.LeveringsmetodeDTO;;

/**
* @author  Veli Kerim Celik  
*/

public interface ILeveringsmetodeDAO {
	LeveringsmetodeDTO getLeveringsmetode(int levmetodeId) throws DALException;
	List<LeveringsmetodeDTO> getLeveringsmetode() throws DALException;
	void createLeveringsmetode(LeveringsmetodeDTO l) throws DALException;
	void updateLeveringsmetode(LeveringsmetodeDTO l) throws DALException;
	void deleteLeveringsmetode(int id) throws DALException;
}
