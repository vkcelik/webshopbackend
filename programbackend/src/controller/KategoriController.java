package controller;

import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import logic.dto.KategoriDTO;
import logic.dto.MedarbejderDTO;
import presentation.GUI;
import presentation.OversigtKategori;
import presentation.TilføjKategori;
import data.dao.MySQLKategoriDAO;
import data.idao.DALException;

public class KategoriController {

	MySQLKategoriDAO kdao;
	HashMap<String,Integer> map = new HashMap<String, Integer>();

	public KategoriController(){
		this.kdao = new MySQLKategoriDAO();
		GUI.tilføjKategori.setController(this);
		GUI.seKategori.setController(this);
		GUI.redigerKategori.setController(this);
	}

	public void visKategori(String selectedValue) {
		int x = 0;
		
		x = map.get(selectedValue);
		System.out.println(x);
		
		KategoriDTO dto = null;
		try {
			dto = kdao.getKategori(x);
		} catch (DALException e) {
			e.printStackTrace();
		}
		GUI.redigerKategori.kategorinavnText.setText(dto.getKategoriNavn());
		try {
			GUI.redigerKategori.combobox1.setSelectedItem(kdao.getKategori(dto.getParent()).getKategoriNavn());
		} catch (DALException e) {
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

	public void updateList(TilføjKategori tk) {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(hentKategoriNavne());
		GUI.tilføjKategori.combobox1.removeAllItems();
		GUI.tilføjKategori.combobox1.setModel(model);
	}
	
	public void updateList(OversigtKategori tk) {
		GUI.seKategori.listKategori.setListData(hentKategoriNavne());
	}
}
