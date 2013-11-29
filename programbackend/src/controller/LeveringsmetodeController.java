package controller;

import java.util.HashMap;
import java.util.List;

import javax.swing.JTextField;

import logic.dto.KategoriDTO;
import logic.dto.LeveringsmetodeDTO;
import presentation.GUI;
import presentation.RedigerLeveringsmetode;
import presentation.TilføjLeveringsmetode;
import data.dao.MySQLLeveringsmetodeDAO;
import data.idao.DALException;

public class LeveringsmetodeController {

	MySQLLeveringsmetodeDAO lmdao;
	LeveringsmetodeDTO dto;
	boolean ok;

	public LeveringsmetodeController(){
		this.lmdao = new MySQLLeveringsmetodeDAO();
		GUI.tilføjLeveringsmetode.setController(this);
		GUI.redigerLeveringsmetode.setController(this);
		GUI.seLeveringsmetode.setController(this);
	}

	public void tilføjLeveringsmetode(JTextField metodeNavn,
			JTextField metodePris) {
		ok = true;
		String navn = metodeNavn.getText();
		double pris = -1;
		String prisStr;
		try {
			prisStr = metodePris.getText();
			pris = Double.parseDouble(prisStr);
		} catch (Exception e) {
			ok = false;
			GUI.popupBogstavFejl();
		}

		try {
			if (ok){
				lmdao.createLeveringsmetode(new LeveringsmetodeDTO(null, navn, pris));
				GUI.popupTilføjet();
			}
		} catch (DALException e) {
			e.printStackTrace();
		}

	}

	public String[] hentLeveringsmetodeNavne(){
		String[] navne;

		List<LeveringsmetodeDTO> levs = null;

		try {levs = lmdao.getLeveringsmetode(); }
		catch (DALException e) { System.out.println(e.getMessage()); }

		navne = new String[levs.size()];
		for (int i=0; i < levs.size(); i++){
			navne[i]=levs.get(i).getLeveringsmetodeNummer()+": "+ levs.get(i).getLeveringsmetodeNavn();
		}
		return navne;
	}

	public void updateOversigtList(){
		GUI.seLeveringsmetode.list.setListData(hentLeveringsmetodeNavne());
	}

	public void visLeveringsmetode(String selectedValue) {
		int x = 0;
		// fjerne ", navn" og lave det om til int
		try {
			x = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(":")));
		} catch (Exception e) {
			// exception should never be catched
		}

		dto = null;
		try {
			dto = lmdao.getLeveringsmetode(x);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GUI.redigerLeveringsmetode.metodeNavn.setText(dto.getLeveringsmetodeNavn());
		GUI.redigerLeveringsmetode.metodePris.setText(Double.toString(dto.getLeveringsmetodePris()));
		GUI.cardLayout.show(GUI.cards, "redigerLeveringsmetode");
	}

	public void opdaterLeveringsmetode(JTextField metodeNavn,
			JTextField metodePris) {
		dto.setLeveringsmetodeNavn(metodeNavn.getText());
		dto.setLeveringsmetodePris(Double.parseDouble(metodePris.getText()));
		try {
			lmdao.updateLeveringsmetode(dto);
			GUI.popupÆndret();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void slet() {

		try {
			lmdao.deleteLeveringsmetode(dto.getLeveringsmetodeNummer());
			GUI.popupSlettet();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


