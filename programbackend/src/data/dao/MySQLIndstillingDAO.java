package data.dao;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;

import logic.dto.IndstillingDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IIndstillingDAO;


/**
* @author  Veli Kerim Celik  
*/

public class MySQLIndstillingDAO implements IIndstillingDAO {

	@Override
	public IndstillingDTO getIndstilling(int iId) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM Indstilling WHERE indstillingsNummer = " + iId);
		try {
			if (!rs.first())
				throw new DALException("Indstilling med id " + iId + " findes ikke.");
			return new IndstillingDTO(rs.getInt(1), rs.getString(2) );
		} catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<IndstillingDTO> getIndstillingList() throws DALException {
		List<IndstillingDTO> list = new ArrayList<IndstillingDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Indstilling");
		try { 
			while (rs.next()){
				list.add(new IndstillingDTO(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;
	}

	@Override
	public void createIndstilling(IndstillingDTO i) throws DALException {
		Connector.doUpdate(
					"INSERT INTO Indstilling(indstillingsNummer, indstillingsVærdi) VALUES " +
					"(" + i.getIndstillingNummer() + ", '" + i.getIndstillingVærdi() + "')"
					);
	}

	@Override
	public void updateIndstilling(IndstillingDTO i) throws DALException {
		Connector.doUpdate(
					"UPDATE Indstilling SET indstillingsVærdi = '" + i.getIndstillingVærdi() + 
					"' WHERE indstillingsNummer = " + i.getIndstillingNummer()
					);
	}

}
