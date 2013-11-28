package controller;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import logic.dto.MedarbejderDTO;
import logic.dto.VareDTO;
import logic.dto.VarebatchDTO;
import logic.dto.VarehusDTO;
import presentation.GUI;
import presentation.RedigerVarebatch;
import presentation.TilføjVarebatch;
import data.dao.MySQLVareBatchDAO;
import data.dao.MySQLVareDAO;
import data.dao.MySQLVarehusDAO;
import data.idao.DALException;

public class VarebatchController {
	
	MySQLVareBatchDAO vbdao;
	MySQLVareDAO vdao;
	MySQLVarehusDAO vhdao;
	VarebatchDTO dto;
	
	public VarebatchController() {
		this.vbdao = new MySQLVareBatchDAO();
		this.vdao = new MySQLVareDAO();
		this.vhdao = new MySQLVarehusDAO();
		GUI.tilføjVarebatch.setController(this);
		GUI.redigerVarebatch.setController(this);
		GUI.seVarebatch.setController(this);
	}

	public void updateOversigt(){
		GUI.seVarebatch.list.setListData(hentVarebatchInfo());
	}

	public String[] hentVarebatchInfo(){
		String info[];
		List<VarebatchDTO> vbs = null;

		try {vbs = vbdao.getVareBatchList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		info = new String[vbs.size()];
		for (int i=0; i < vbs.size(); i++){
			try {
				info[i]=vbs.get(i).getVareBatchNummer()+": " + vbdao.getVareNavn(vbs.get(i).getVareBatchNummer());
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return info;
	}
	
	public String[] hentVareInfo(){
		String info[];
		List<VareDTO> varer = null;
		
		try {
			varer = vdao.getVareList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		info = new String[varer.size()];
		for (int i=0; i<varer.size(); i++){
			info[i]=varer.get(i).getVareNummer()+": " + varer.get(i).getVareNavn();
		}
		return info;
	}
	
	public String[] hentVarehusInfo(){
		String info[];
		List<VarehusDTO> vhs = null;
		
		try {
			vhs = vhdao.getVarehusList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		info = new String[vhs.size()];
		for (int i=0; i<vhs.size(); i++){
			info[i]=vhs.get(i).getVarehusNummer()+": " + vhs.get(i).getAdresse();
		}
		return info;
	}

	public void visVarebatch(String selectedValue) {
		VareDTO vare = null;
		VarehusDTO vh = null;
		int id = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(":")));
		try {
			dto = vbdao.getVareBatch(id);
			vare = vdao.getVare(dto.getVareNummer());
			vh = vhdao.getVarehus(dto.getVareLager());
		} catch (DALException e) {
			e.printStackTrace();
		}
		GUI.redigerVarebatch.combobox1.setSelectedItem(dto.getVareBatchNummer() + ": " + vare.getVareNavn());
		GUI.redigerVarebatch.combobox2.setSelectedItem(vh.getVarehusNummer() + ": "+ vh.getAdresse());
		GUI.redigerVarebatch.lagerPlaceringText.setText(dto.getLagerPlacering());
		GUI.redigerVarebatch.mængdeText.setText(Integer.toString(dto.getMængde()));
		GUI.cardLayout.show(GUI.cards, "redigerVarebatch");
	}

	public void tilføjVarebatch(JComboBox<String> combobox1,
			JComboBox<String> combobox2, JTextField lagerPlaceringText,
			JTextField mængdeText) {
		int vareNummer = 0;
		int vareLager = 0;
		String lagerPlacering = null;
		int mængde = 0;
		try {
			String temp =(String)combobox1.getSelectedItem();
			vareNummer = Integer.parseInt(temp.substring(0, temp.indexOf(":")));
			String temp2 =(String)combobox2.getSelectedItem();
			vareLager = Integer.parseInt(temp2.substring(0, temp2.indexOf(":")));
			lagerPlacering = lagerPlaceringText.getText();
			mængde = Integer.parseInt(mængdeText.getText());
		} catch (Exception e) {
			GUI.popupBogstavFejl();
		}
		
		try {
			vbdao.createVareBatch(new VarebatchDTO(null, vareNummer, vareLager, lagerPlacering, mængde));
			GUI.popupTilføjet();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateComboboxes(RedigerVarebatch rvb) {
		GUI.redigerVarebatch.combobox1.removeAllItems();
		GUI.redigerVarebatch.combobox1.setModel(new DefaultComboBoxModel<String>(hentVareInfo()));
		GUI.redigerVarebatch.combobox2.removeAllItems();
		GUI.redigerVarebatch.combobox2.setModel(new DefaultComboBoxModel<String>(hentVarehusInfo()));
		
	}
	
	public void updateComboboxes(TilføjVarebatch tvb) {
		GUI.tilføjVarebatch.combobox1.removeAllItems();
		GUI.tilføjVarebatch.combobox1.setModel(new DefaultComboBoxModel<String>(hentVareInfo()));
		GUI.tilføjVarebatch.combobox2.removeAllItems();
		GUI.tilføjVarebatch.combobox2.setModel(new DefaultComboBoxModel<String>(hentVarehusInfo()));
		
	}

	public void updateVarebatch(JComboBox<String> combobox1,
			JComboBox<String> combobox2, JTextField lagerPlaceringText,
			JTextField mængdeText) {
	
		int vareNummer = 0;
		int vareLager = 0;
		String lagerPlacering = null;
		int mængde = 0;
		
		try {
			String temp =(String)combobox1.getSelectedItem();
			vareNummer = Integer.parseInt(temp.substring(0, temp.indexOf(":")));
			String temp2 =(String)combobox2.getSelectedItem();
			vareLager = Integer.parseInt(temp2.substring(0, temp2.indexOf(":")));
			lagerPlacering = lagerPlaceringText.getText();
			mængde = Integer.parseInt(mængdeText.getText());
		} catch (Exception e) {
			GUI.popupBogstavFejl();
		}
		
		dto.setVareNummer(vareNummer);
		dto.setVareLager(vareLager);
		dto.setLagerPlacering(lagerPlacering);
		dto.setMængde(mængde);
		try {
			vbdao.updateVareBatch(dto);
			GUI.popupÆndret();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void slet() {
		try {
			vbdao.deleteVarebatch(dto.getVareBatchNummer());
			GUI.popupSlettet();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
