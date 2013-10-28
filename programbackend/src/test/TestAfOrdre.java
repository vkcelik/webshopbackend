package test;

import java.sql.SQLException;
import java.sql.Timestamp;

import logic.dto.OrdreDTO;
import data.connect.Connector;
import data.dao.MySQLIndstillingDAO;
import data.idao.DALException;

public class TestAfOrdre {

	public static void main(String[] args) {
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLIndstillingDAO ia = new MySQLIndstillingDAO();
		//System.out.println(java.lang.System.currentTimeMillis());
		
		OrdreDTO i1 = new OrdreDTO(1, 1, new Timestamp(System.currentTimeMillis()), 120, 1);
		try {ia.createIndstilling(i1);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Oprettelse af underlig indstilling");
		OrdreDTO i2 = new OrdreDTO(2, "HEJ");
		try {ia.createIndstilling(i2);}
		catch (DALException e){System.out.println(e.getMessage());}
		
		System.out.println("Hent indstilling nummer 4");
		try {System.out.println(ia.getIndstilling(4));}
		catch (DALException e){ System.out.println(e.getMessage()); }

		System.out.println("Hent alle indstillinger");
		try {System.out.println(ia.getIndstillingList());}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Ændrer HEJ til NEJ i nummer 4");
		OrdreDTO i3 = null;
		try {
			i3 = ia.getIndstilling(4);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}
		if (i3 !=null)
		i3.setIndstillingVærdi("NEJ");
		try {
			ia.updateIndstilling(i3);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}		
	}

}
