package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logic.dto.VarebatchDTO;
import data.connect.Connector;
import data.idao.DALException;
import data.idao.IVareBatchDAO;

public class MySQLVareBatchDAO implements IVareBatchDAO {

	@Override
	public VarebatchDTO getVareBatch(int vareBatchNummer) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM VareBatch WHERE vareBatchNummer = " + vareBatchNummer);
	    try {
	    	if (!rs.first()) throw new DALException("VareBatch med vareBatchNummer " + vareBatchNummer + " findes ikke."); 
	    	return new VarebatchDTO (rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
	    }
	    catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<VarebatchDTO> getVareBatchList() throws DALException {
		List<VarebatchDTO> list = new ArrayList<VarebatchDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM VareBatch");
		try { 
			while (rs.next()){
				list.add(new VarebatchDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (SQLException e) {throw new DALException(e);}
		return list;		
		
	}

	@Override
	public void createVareBatch(VarebatchDTO vb) throws DALException {	
		Connector.doUpdate(
				"INSERT INTO VareBatch(vareBatchNummer, vareNummer, vareLager, lagerPlacering, mængde) VALUES " +
				"(" + vb.getVareBatchNummer() + ", '" + vb.getVareNummer() + ", '" + vb.getVareLager() + ", '" + vb.getLagerPlacering() + ", '" + vb.getMængde()  + "')"
				);
				
	}

	@Override
	public void updateVareBatch(VarebatchDTO vb) throws DALException {
		Connector.doUpdate(
				"UPDATE VareBatch SET vareLager = '" + vb.getVareLager()
				+ "', lagerPlacering =  '" + vb.getLagerPlacering()
				+ "', mængde =  '" + vb.getMængde() 
				+ "' WHERE vareBatchNummer = " + vb.getVareBatchNummer());
	}
	
	@Override
	public String getVareNavn(int vbId) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT vareNavn FROM VareBatch NATURAL JOIN Vare WHERE vareBatchNummer = " + vbId);
	    try {
	    	if (!rs.first()) throw new DALException("VareBatch med vareBatchNummer " + vbId + " findes ikke."); 
	    	return rs.getString(1);
	    }
	    catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public void deleteVarebatch(int id) throws DALException {
	
		String query = "DELETE FROM Varebatch WHERE vareNummer = " + id;
		Connector.doUpdate(query);
		
	}
	
}
