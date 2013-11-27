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
	public List<String[]> getTop10Vare(String tid) throws DALException {
		List<String[]> top = new ArrayList<String[]>();
		String q = null;

		if(tid.equals("Dag"))
			q= "SELECT vareNavn,vareNummer, sum(antal) FROM webshop.OrdreLinie natural join webshop.Vare natural join webshop.Ordre WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 DAY) GROUP BY (vareNummer) ORDER BY (antal)  DESC LIMIT 10";

		else if(tid.equals("Uge"))
			q = "SELECT vareNavn,vareNummer, sum(antal) FROM webshop.OrdreLinie natural join webshop.Vare natural join webshop.Ordre WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 WEEK) GROUP BY (vareNummer) ORDER BY (antal)  DESC LIMIT 10";

		else if(tid.equals("Måned"))
			q = "SELECT vareNavn,vareNummer, sum(antal) FROM webshop.OrdreLinie natural join webshop.Vare natural join webshop.Ordre WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 MONTH) GROUP BY (vareNummer) ORDER BY (antal)  DESC LIMIT 10";

		else if(tid.equals("År"))
			q = "SELECT vareNavn,vareNummer, sum(antal) FROM webshop.OrdreLinie natural join webshop.Vare natural join webshop.Ordre WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 12 MONTH) GROUP BY (vareNummer) ORDER BY (antal)  DESC LIMIT 10";

		ResultSet rs = Connector.doQuery(q);
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


	public String getOmsætning(String omsætning) throws DALException {
		
		String q = null;

		if(omsætning.equals("Dag"))
			q = "SELECT sum(total) FROM webshop.Ordre  WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 DAY)";
		
		else if(omsætning.equals("Uge"))
			q = "SELECT sum(total) FROM webshop.Ordre  WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 WEEK)";
			
		else if(omsætning.equals("Måned"))
			q = "SELECT sum(total) FROM webshop.Ordre  WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 MONTH)";
		
		else if(omsætning.equals("År"))
			q = "SELECT sum(total) FROM webshop.Ordre  WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 12 MONTH)";
		
		ResultSet rs = Connector.doQuery(q);
		String s = null;
		try { 
			while (rs.next()){
				s = rs.getString(1);
			}
		}
		catch (SQLException e) {throw new DALException(e); }
		return s;
	}

	public String getAntalOrdre(String antalordre) throws DALException {
		
		String q = null;

		if(antalordre.equals("Dag"))
			q = "SELECT COUNT(ordreNummer) FROM webshop.Ordre  WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 DAY)";
		
		else if(antalordre.equals("Uge"))
			q = "SELECT COUNT(ordreNummer) FROM webshop.Ordre  WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 WEEK)";
			
		else if(antalordre.equals("Måned"))
			q = "SELECT COUNT(ordreNummer) FROM webshop.Ordre  WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 1 MONTH)";
		
		else if(antalordre.equals("År"))
			q = "SELECT COUNT(ordreNummer) FROM webshop.Ordre  WHERE bestillingsDato >= DATE_SUB(CURRENT_DATE, INTERVAL 12 MONTH)";
		
		
		ResultSet rs = Connector.doQuery(q);
		String s = null;
		try { 
			while (rs.next()){
				s = rs.getString(1);
			}
		}
		catch (SQLException e) {throw new DALException(e); }
		return s;
	}

}
