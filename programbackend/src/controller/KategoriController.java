package controller;

import java.util.List;

import logic.dto.KategoriDTO;
import logic.dto.MedarbejderDTO;
import presentation.GUI;
import presentation.OversigtKategori;
import presentation.TilføjKategori;
import data.dao.MySQLKategoriDAO;
import data.idao.DALException;

public class KategoriController {

	MySQLKategoriDAO kdao;

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
		GUI.redigerKategori.kategorinavnText.setText(dto.getKategoriNavn());
		
	
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
}