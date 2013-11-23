package controller;

import data.dao.MySQLOrdreDAO;
import data.dao.MySQLOrdreLinieDAO;
import presentation.GUI;
import presentation.OversigtOrdre;

public class OrdreController {
	MySQLOrdreDAO odao;
	MySQLOrdreLinieDAO oldao; 

	public OrdreController() {
		this.odao = new MySQLOrdreDAO();
		this.oldao = new MySQLOrdreLinieDAO();
		GUI.seOrdre.setController(this);
		GUI.redigerOrdre.setController(this);
	}	
	
}
