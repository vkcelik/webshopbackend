package controller;

import data.dao.MySQLStatestikDAO;
import presentation.GUI;
import presentation.Statestik;

public class StatestikController {

	MySQLStatestikDAO sdao;
	
	public StatestikController() {
		this.sdao = new MySQLStatestikDAO();
		GUI.seStatestik.setController(this);
	}

}
