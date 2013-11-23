package controller;

import java.util.HashMap;
import java.util.List;

import javax.swing.JPanel;

import logic.dto.KategoriDTO;
import data.dao.MySQLKategoriDAO;
import data.dao.MySQLVareBatchDAO;
import data.dao.MySQLVareDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.OversigtVare;
import presentation.TilføjVare;

public class VareController {
	MySQLVareDAO vdao;
	MySQLVareBatchDAO vbdao;
	MySQLKategoriDAO kdao;
	HashMap<String,Integer> map = new HashMap<String, Integer>();
	
	public VareController() {
		this.vdao = new MySQLVareDAO();
		this.vbdao = new MySQLVareBatchDAO();
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

	public void tilføjVarer(JPanel panel){
		
	}
}
