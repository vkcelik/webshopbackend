package controller;

import data.dao.MySQLVarehusDAO;
import presentation.GUI;
import presentation.OversigtVarehus;
import presentation.RedigerVarehus;
import presentation.TilføjVarehus;

public class VarehusController {
	MySQLVarehusDAO vhdao;
	public VarehusController() {
		this.vhdao = new MySQLVarehusDAO();
		GUI.redigerVarehus.setController(this);
		GUI.seVarehus.setController(this);
		GUI.tilføjVarehus.setController(this);
	}
	
	
	
	

}
