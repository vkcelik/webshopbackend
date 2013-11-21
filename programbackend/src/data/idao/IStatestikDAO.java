package data.idao;

import java.util.List;


public interface IStatestikDAO {
	List<String[]> getTop10Vare(String tid) throws DALException;
	String getOmsætning() throws DALException;
	String getAntalOrdre() throws DALException;

}