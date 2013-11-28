package controller;

import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import logic.dto.KategoriDTO;
import presentation.GUI;
import presentation.OversigtKategori;
import presentation.RedigerKategori;
import presentation.TilføjKategori;
import data.dao.MySQLKategoriDAO;
import data.idao.DALException;

public class KategoriController {

	MySQLKategoriDAO kdao;
	public HashMap<String,Integer> map = new HashMap<String, Integer>();
	KategoriDTO dto;

	public KategoriController(){
		this.kdao = new MySQLKategoriDAO();
		GUI.tilføjKategori.setController(this);
		GUI.seKategori.setController(this);
		GUI.redigerKategori.setController(this);
	}

	public void visKategori(String selectedValue) {
		int x = map.get(selectedValue);
		System.out.println(x);

		try {
			dto = kdao.getKategori(x);
		} catch (DALException e) {
			e.printStackTrace();
		}
		GUI.redigerKategori.kategorinavnText.setText(dto.getKategoriNavn());
		try {
			GUI.redigerKategori.combobox1.setSelectedItem(kdao.getKategori(dto.getParent()).getKategoriNavn());
		} catch (DALException e) {
			e.printStackTrace();
			// Should not happen
		}
		GUI.cardLayout.show(GUI.cards, "redigerKategori");
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

	public void tilføjKategori(JTextField navn, JComboBox overKategori){
		String knavn = navn.getText();
		String key = (String)overKategori.getSelectedItem();

		try {
			System.out.println(key);
			kdao.createKategori(new KategoriDTO(null, knavn, map.get(key)));
		} catch (DALException e) {
			e.printStackTrace();
		}
	}

	public void updateKategori(JTextField navn, JComboBox<String> parentNavn){
		String knavn = navn.getText();
		Integer parentNr = map.get(parentNavn.getSelectedItem());

		try {
			kdao.updateKategori(new KategoriDTO(dto.getKategoriNummer(), knavn, parentNr));
		} catch (DALException e) {
			e.printStackTrace();
		}
		

	}

	public void updateList(TilføjKategori tk) {
		GUI.tilføjKategori.combobox1.removeAllItems();
		GUI.tilføjKategori.combobox1.setModel(new DefaultComboBoxModel<String>(hentKategoriNavne()));
	}

	public void updateList(OversigtKategori ok) {
		GUI.seKategori.listKategori.setListData(hentKategoriNavne());
	}

	public void updateList(RedigerKategori rk) {
		GUI.redigerKategori.combobox1.removeAllItems();
		GUI.redigerKategori.combobox1.setModel(new DefaultComboBoxModel<String>(hentKategoriNavne()));
	}

	public void slet() {
		try {
			kdao.deleteKategori(dto.getKategoriNummer());
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
