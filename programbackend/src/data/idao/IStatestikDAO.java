package data.idao;

import java.util.List;


public interface IStatestikDAO {
	List<String> getTop10() throws DALException;

}