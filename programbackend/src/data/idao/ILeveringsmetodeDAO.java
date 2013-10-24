package data.idao;

import java.util.List;

import logic.dto.LeveringsmetodeDTO;;

public interface ILeveringsmetodeDAO {
	LeveringsmetodeDTO getLeveringsmetode(int levmetodeId) throws DALException;
	List<LeveringsmetodeDTO> getLeveringsmetode() throws DALException;
	void createLeveringsmetode(LeveringsmetodeDTO l) throws DALException;
	void updateLeveringsmetode(LeveringsmetodeDTO l) throws DALException;
}
