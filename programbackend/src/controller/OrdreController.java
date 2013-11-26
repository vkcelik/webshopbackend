package controller;

import java.util.List;

import logic.dto.MedarbejderDTO;
import logic.dto.OrdreDTO;
import data.dao.MySQLOrdreDAO;
import data.dao.MySQLOrdreLinieDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.OversigtOrdre;

public class OrdreController {
	MySQLOrdreDAO odao;
	MySQLOrdreLinieDAO oldao; 
	private OrdreDTO dto;

	public OrdreController() {
		this.odao = new MySQLOrdreDAO();
		this.oldao = new MySQLOrdreLinieDAO();
		GUI.seOrdre.setController(this);
		GUI.redigerOrdre.setController(this);
	}

	public void updateList() {
		GUI.seOrdre.list.setListData(hentOrdreInfo());
	}

	private String[] hentOrdreInfo() {
		String info[];
		List<OrdreDTO> ords = null;

		try {ords = odao.getOrdreList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		info = new String[ords.size()];
		for (int i=0; i < ords.size(); i++){
			info[i]=ords.get(i).getOrdreNummer()+", " + ords.get(i).getBestillingsDato()+", " + ords.get(i).getOrdreStatus();
		}

		return info;
	}

	public void visOrdre(String selectedValue) {
		int x = 0;
		// fjerne ", navn" og lave det om til int
		try {
			x = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(",")));
		} catch (Exception e) {
			// exception should never be catched
		}

		dto = null;
		try {
			dto = odao.getOrdre(x);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//GUI.redigerOrdre.medarbejderNavnText.setText(dto.getMedarbejderNavn());

		GUI.cardLayout.show(GUI.cards, "redigerOrdre");

	}	
	
}
