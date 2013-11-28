package controller;

import java.util.List;

import logic.dto.KundeDTO;
import data.dao.MySQLStatestikDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.Statestik;

public class StatestikController {

	MySQLStatestikDAO sdao;

	public StatestikController() {
		this.sdao = new MySQLStatestikDAO();
		GUI.seStatestik.setController(this);

	}
	
	

	public void updateList() {
		GUI.seStatestik.list3.setListData(hentStatistik());
	}

	private String[] hentStatistik() {
		
		List<String[]> top = null;
		MySQLStatestikDAO ol = new MySQLStatestikDAO();
		
		try {top = ol.getTop10Vare("År");}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		//printArray(top);
		
				for (int i = 0; i<top.size(); i++){
					String[] linje = top.get(i);
					for (int j=0; j<linje.length; j++){
						System.out.print(linje[j] + "\t");
					}
					System.out.println();
				}
		
		return null;
	}
	

}


