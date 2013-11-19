package controller;

import java.util.HashMap;
import java.util.List;

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
		// fjerne ", navn" og lave det om til int
		try {
			x = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(",")));
		} catch (Exception e) {
			// should not happen
		}
		KategoriDTO dto = null;
		try {
			dto = kdao.getKategori(x);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		
		return redigerkategori;
	}
	
	public void tilføjKategori(JTextField navn, JComboBox overKategori){
		
		String knavn = navn.getText();
		String key = (String)overKategori.getSelectedItem();
		
		try {
			kdao.createKategori(new KategoriDTO(null, knavn, map.get(key)));
		} catch (DALException e) {
			e.printStackTrace();
		}
		
	}
}
