package data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import data.connect.Connector;
import data.idao.DALException;
import data.idao.IStatestikDAO;

public class MySQLStatestikDAO implements IStatestikDAO {

	@Override
	public List<String[]> getTop10() throws DALException {
		List<String[]> top = new ArrayList<String[]>();
		ResultSet rs = Connector.doQuery("SELECT vareNavn,vareNummer, sum(antal) FROM webshop.OrdreLinie natural join webshop.Vare GROUP BY (vareNummer) ORDER BY (antal)  DESC LIMIT 10");
		try { 
			while (rs.next()){
					String[] linje = new String[3];
					linje[0] = rs.getString(1);
					linje[1] = rs.getString(2);
					linje[2] = rs.getString(3);

					top.add(linje);
				}
			} 
			catch (SQLException e) {throw new DALException(e);}
			return top;	
		}

	}