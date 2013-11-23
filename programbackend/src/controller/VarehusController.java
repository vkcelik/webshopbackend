package controller;

import java.util.HashMap;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import logic.dto.KategoriDTO;
import logic.dto.VarehusDTO;
import data.dao.MySQLVarehusDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.OversigtVarehus;
import presentation.RedigerVarehus;
import presentation.TilføjVarehus;

public class VarehusController {
	HashMap<String,Integer> map = new HashMap<String, Integer>();
	MySQLVarehusDAO vhdao;
	public VarehusController() {
		this.vhdao = new MySQLVarehusDAO();
		GUI.redigerVarehus.setController(this);
		GUI.seVarehus.setController(this);
		GUI.tilføjVarehus.setController(this);
		
	}
	
	public void tilføjVarehus(JTextField adresse, JTextField Postnr, JTextField Leveringstid){
		
		String vhadresse = adresse.getText();
		String key = (String) Postnr.getText();
		String vhLeveringstid = Leveringstid.getText();
		try {
			System.out.println(key);
			vhdao.createVarehus(new VarehusDTO(null, vhadresse, map.get(key), vhLeveringstid));
		} catch (DALException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
