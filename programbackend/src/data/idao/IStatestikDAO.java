package data.idao;

import java.util.List;

/**
* @author  Ayhan Erman
*/

public interface IStatestikDAO {
	List<String[]> getTop10Vare(String tid) throws DALException;
	String getOmsætning(String omsætning) throws DALException;
	String getAntalOrdre(String antalordre) throws DALException;

}