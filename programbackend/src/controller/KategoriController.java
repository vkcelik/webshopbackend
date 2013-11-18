package controller;

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

	TilføjKategori tilføj;
	OversigtKategori se;
	MySQLKategoriDAO kdao;

	public KategoriController(TilføjKategori tilføj, OversigtKategori se){
		this.tilføj = tilføj;
		this.se = se;
		this.kdao = new MySQLKategoriDAO();
		tilføj.setController(this);
		se.setController(this);
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
		tilføj.kategorinavnText.setText(dto.getKategoriNavn());
		
	
		GUI.cardLayout.show(GUI.cards, "tilføjKategori");
}
	
	public String[] hentKategoriNavne(){
		String redigerkategori[];
		List<KategoriDTO> kats = null;
		
		try {kats = kdao.getKategoriList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		redigerkategori = new String[kats.size()];
		for (int i=0; i < kats.size(); i++){
			redigerkategori[i]=kats.get(i).getKategoriNavn();
		}
		
		return redigerkategori;
	}
	
	public void tilføjKategori(JTextField navn, JComboBox overKategori){
		
		String knavn = navn.getText();
		
		kdao.createKategori(new KategoriDTO(null, knavn, koverKategori));
		
	}
}