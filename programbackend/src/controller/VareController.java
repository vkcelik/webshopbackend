package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import logic.dto.BilledeDTO;
import logic.dto.KategoriDTO;
import logic.dto.VareDTO;
import data.dao.MySQLBilledeDAO;
import data.dao.MySQLKategoriDAO;
import data.dao.MySQLVareBatchDAO;
import data.dao.MySQLVareDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.OversigtKategori;
import presentation.OversigtVare;
import presentation.RedigerVare;
import presentation.TilføjVare;

public class VareController {
	MySQLVareDAO vdao;
	MySQLVareBatchDAO vbdao;
	MySQLKategoriDAO kdao;
	MySQLBilledeDAO bdao;

	HashMap<String,Integer> map = new HashMap<String, Integer>();
	private VareDTO dto;

	public VareController() {
		this.vdao = new MySQLVareDAO();
		this.vbdao = new MySQLVareBatchDAO();
		this.kdao = new MySQLKategoriDAO();
		this.bdao = new MySQLBilledeDAO();
		GUI.redigerVare.setController(this);
		GUI.seVare.setController(this);
		GUI.tilføjVare.setController(this);
	}

	public String[] hentVareNavne(){
		String navne[];
		List<VareDTO> vars = null;
		map = new HashMap<String, Integer>();

		try {vars = vdao.getVareList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		navne = new String[vars.size()];
		for (int i=0; i < vars.size(); i++){
			navne[i]=vars.get(i).getVareNavn();
			map.put(vars.get(i).getVareNavn(), vars.get(i).getVareNummer());
		}
		System.out.println(map);
		return navne;
	}

	public void tilføjVarer(JTextField vareNavnText, JTextField prisText,
			JComboBox<String> combobox, JTextField vægtText,
			JTextField breddeText, JTextField dybdeText, JTextField højdeText,
			JTextPane beskrivelseText, JTextField billederText) {
		boolean ok = true;
		double pris = -1;
		try {
			pris = Double.parseDouble(prisText.getText());
		} catch (Exception e) {
			ok = false;
		}
		double vægt = -1;
		try {
			vægt = Double.parseDouble(vægtText.getText());
		} catch (Exception e) {
			ok = false;
		}
		double bredde = -1;
		try {
			bredde = Double.parseDouble(breddeText.getText());
		} catch (Exception e) {
			ok = false;
		}
		double dybde = -1;
		try {
			dybde = Double.parseDouble(dybdeText.getText());
		} catch (Exception e) {
			ok = false;
		}
		double højde = -1;
		try {
			højde = Double.parseDouble(højdeText.getText());
		} catch (Exception e) {
			ok = false;
		}
		int kategoriNummer = GUI.katc.map.get(combobox.getSelectedItem());

		if (ok){
			try {
				vdao.createVare(new VareDTO(null, vareNavnText.getText(), pris, kategoriNummer, beskrivelseText.getText(), vægt, bredde, dybde, højde));
				GUI.popupTilføjet();
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			GUI.popupBogstavFejl();
		}
		int vareNummer = -1;
		try {
			vareNummer = vdao.getLastInsertId();
		} catch (DALException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String[] billeder = billederText.getText().replaceAll("\\s+","").split(",");
		for (int i=0; i<billeder.length; i++){
			try {
				bdao.createBillede(new BilledeDTO(null, vareNummer, billeder[i]));
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateList(TilføjVare tv) {
		GUI.tilføjVare.combobox.removeAllItems();
		GUI.tilføjVare.combobox.setModel(new DefaultComboBoxModel<String>(GUI.katc.hentKategoriNavne()));
	}

	public void updateList(OversigtVare seVare) {
		GUI.seVare.listVare.setListData(hentVareNavne());
	}

	public void updateList(RedigerVare redigerVare) {
		GUI.redigerVare.combobox.removeAllItems();
		GUI.redigerVare.combobox.setModel(new DefaultComboBoxModel<String>(GUI.katc.hentKategoriNavne()));		
	}

	public void visVare(String selectedValue) {
		int x = map.get(selectedValue);
		System.out.println(x);

		try {
			dto = vdao.getVare(x);
		} catch (DALException e) {
			e.printStackTrace();
		}
		GUI.redigerVare.VareNavnText.setText(dto.getVareNavn());
		GUI.redigerVare.PrisText.setText(Double.toString(dto.getPris()));
		try {
			GUI.redigerVare.combobox.setSelectedItem(kdao.getKategori(dto.getKategoriNummer()).getKategoriNavn());
		} catch (DALException e) {
			e.printStackTrace();
			// Should not happen
		}
		GUI.redigerVare.VægtText.setText(Double.toString(dto.getVægt()));
		GUI.redigerVare.BreddeText.setText(Double.toString(dto.getBredde()));
		GUI.redigerVare.DybdeText.setText(Double.toString(dto.getDybde()));
		GUI.redigerVare.HøjdeText.setText(Double.toString(dto.getHøjde()));
		GUI.redigerVare.BeskrivelseText.setText(dto.getBeskrivelse());

		List<BilledeDTO> billeder = null;
		try {
			billeder = bdao.getBilledeList(dto.getVareNummer());
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String billedString = "";
		for (BilledeDTO b: billeder){
			billedString = billedString + b.getBilledeSti() + ",";
		}
		// remove last comma
		if (!billedString.isEmpty()){
			billedString =billedString.substring(0, billedString.length()-1);
		}
		GUI.redigerVare.billederText.setText(billedString);
		GUI.cardLayout.show(GUI.cards, "redigerVare");
	}

	public void updateVare(JTextField vareNavnText, JTextField prisText,
			JComboBox<String> combobox, JTextField vægtText,
			JTextField breddeText, JTextField dybdeText, JTextField højdeText,
			JTextPane beskrivelseText, JTextField billederText) {
		boolean ok = true;
		double pris = -1;
		try {
			pris = Double.parseDouble(prisText.getText());
		} catch (Exception e) {
			ok = false;
		}
		double vægt = -1;
		try {
			vægt = Double.parseDouble(vægtText.getText());
		} catch (Exception e) {
			ok = false;
		}
		double bredde = -1;
		try {
			bredde = Double.parseDouble(breddeText.getText());
		} catch (Exception e) {
			ok = false;
		}
		double dybde = -1;
		try {
			dybde = Double.parseDouble(dybdeText.getText());
		} catch (Exception e) {
			ok = false;
		}
		double højde = -1;
		try {
			højde = Double.parseDouble(højdeText.getText());
		} catch (Exception e) {
			ok = false;
		}
		int kategoriNummer = GUI.katc.map.get(combobox.getSelectedItem());
		int vareNummer = dto.getVareNummer();
		if (ok){
			try {
				vdao.updateVare(new VareDTO(vareNummer, vareNavnText.getText(), pris, kategoriNummer, beskrivelseText.getText(), vægt, bredde, dybde, højde));
				GUI.popupÆndret();
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Varens billeder hentes
		List<BilledeDTO> billeder = null;
		try {
			billeder = bdao.getBilledeList(vareNummer);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String> gamle = new ArrayList<String>();
		for (BilledeDTO b:  billeder){
			gamle.add(b.getBilledeSti());
		}

		String[] nye = billederText.getText().replaceAll("\\s+","").split(",");


		for(int i=0; i<nye.length; i++){
			if (!gamle.contains(nye[i])){
				try {
					bdao.createBillede(new BilledeDTO(null, vareNummer, nye[i]));
				} catch (DALException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}

		for (int i=0; i<gamle.size(); i++){
			if (!Arrays.asList(nye).contains(gamle.get(i))){
				try {
					bdao.deleteBillede(vareNummer, gamle.get(i));
				} catch (DALException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void slet() {
		try {
			vdao.deleteVare(dto.getVareNummer());
			GUI.popupSlettet();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
