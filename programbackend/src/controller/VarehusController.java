package controller;

import java.util.HashMap;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import logic.dto.KategoriDTO;
import logic.dto.KundeDTO;
import logic.dto.VarehusDTO;
import data.dao.MySQLVarehusDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.OversigtVarehus;
import presentation.RedigerVarehus;
import presentation.TilføjVarehus;

public class VarehusController {
	MySQLVarehusDAO vhdao;
	VarehusDTO dto;
	public VarehusController() {
		this.vhdao = new MySQLVarehusDAO();
		GUI.redigerVarehus.setController(this);
		GUI.seVarehus.setController(this);
		GUI.tilføjVarehus.setController(this);
		
	}
	
	public void tilføjVarehus(JTextField adresse, JTextField Postnr, JTextField Leveringstid){
		String vhadresse = adresse.getText();
		int postNr = 0;
		String vhLeveringstid = Leveringstid.getText();
		try {
			postNr = Integer.parseInt(Postnr.getText());			
			try {
				vhdao.createVarehus(new VarehusDTO(null, vhadresse, postNr, vhLeveringstid));
				GUI.popupTilføjet();
			} catch (DALException e) {
				e.printStackTrace();
			}
		} catch (NumberFormatException e) {
			GUI.popupBogstavFejl();
		}

	}
	
	public String[] hentVarehus() {

		String RedigerVarehus[];
		List<VarehusDTO> kats = null;

		try {kats = vhdao.getVarehusList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		RedigerVarehus = new String[kats.size()];
		for (int i=0; i < kats.size(); i++){
			RedigerVarehus[i]=kats.get(i).getVarehusNummer()+", " + kats.get(i).getAdresse();
		}

		return RedigerVarehus;
	
	}

	public void updateList() {
		
		GUI.seVarehus.list.setListData(hentVarehus());
		
	}

	public void visVarehus(String selectedValue) {
		
		{

			int x = 0;
			// fjerne ", navn" og lave det om til int
			try {
				x = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(",")));
			} catch (Exception e) {
				// exception should never be catched
			}

			dto = null;
			try {
				dto = vhdao.getVarehus(x);
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			GUI.redigerVarehus.varehusadresseText.setText(dto.getAdresse());
			GUI.redigerVarehus.PostVarehusText.setText(String.valueOf(dto.getPostnummer()));
			GUI.redigerVarehus.LeveringstidText.setText(String.valueOf(dto.getLeveringsTid()));
			


			GUI.cardLayout.show(GUI.cards, "redigerVarehus");

		}
		
	}

	public void updateVarehus(JTextField varehusadresseText,
			JTextField PostVarehusText, JTextField LeveringstidText) {
		
		String Varehusadresse = varehusadresseText.getText();
		
		
		int postnr = 0;
		
		try {
			postnr = Integer.parseInt(PostVarehusText.getText());
			
		} catch (Exception e) {
			GUI.popupBogstavFejl();
		}
		
		String Leveringstid = LeveringstidText.getText();
		
		try {
			vhdao.updateVarehus(new VarehusDTO(dto.getVarehusNummer(), Varehusadresse, postnr, Leveringstid));
			GUI.popupÆndret();
		} catch (DALException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public void slet() {
		try {
			vhdao.deleteVarehus(dto.getVarehusNummer());
			GUI.popupSlettet();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	
