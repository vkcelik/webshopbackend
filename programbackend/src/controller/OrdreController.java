package controller;

import data.dao.MySQLOrdreDAO;
import data.dao.MySQLOrdreLinieDAO;
import presentation.SeOrdre;

public class OrdreController {
	SeOrdre oPanel;
	MySQLOrdreDAO odao;
	MySQLOrdreLinieDAO oldao; 

	public OrdreController(SeOrdre oPanel) {
		this.oPanel = oPanel;
		this.odao = new MySQLOrdreDAO();
		this.oldao = new MySQLOrdreLinieDAO();
		oPanel.setController(this);
	}	
	
	
}
