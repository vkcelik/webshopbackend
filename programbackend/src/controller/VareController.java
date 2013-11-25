package controller;

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
import presentation.TilføjVare;

public class VareController {
	MySQLVareDAO vdao;
	MySQLVareBatchDAO vbdao;
	MySQLKategoriDAO kdao;
	MySQLBilledeDAO bdao;
	
	HashMap<String,Integer> map = new HashMap<String, Integer>();

	public VareController() {
		this.vdao = new MySQLVareDAO();
		this.vbdao = new MySQLVareBatchDAO();
		this.kdao = new MySQLKategoriDAO();
		this.bdao = new MySQLBilledeDAO();
		GUI.redigerVare.setController(this);
		GUI.seVare.setController(this);
		GUI.tilføjVare.setController(this);
	}

	public String[] hentKategoriNavne(){
		String redigerkategori[];
		List<KategoriDTO> kats = null;
		map = new HashMap<String, Integer>();

		try {kats = kdao.getKategoriList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		redigerkategori = new String[kats.size()];
		for (int i=0; i < kats.size(); i++){
			redigerkategori[i]=kats.get(i).getKategoriNavn();
			map.put(kats.get(i).getKategoriNavn(), kats.get(i).getKategoriNummer());
		}
		System.out.println(map);
		return redigerkategori;
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
		int kategoriNummer = map.get(combobox.getSelectedItem());

		if (ok){
			try {
				vdao.createVare(new VareDTO(null, vareNavnText.getText(), pris, kategoriNummer, beskrivelseText.getText(), vægt, bredde, dybde, højde));
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int vareNummer = -1;
		try {
			vareNummer = vdao.getLastInsertId();
		} catch (DALException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String[] billeder = billederText.getText().replaceAll(" ", "").split(",");
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
		GUI.tilføjVare.combobox.setModel(new DefaultComboBoxModel<String>(hentKategoriNavne()));
	}

	public void updateList(OversigtVare seVare) {
		
	}
}
