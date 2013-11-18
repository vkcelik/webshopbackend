package controller;

import data.dao.MySQLOrdreDAO;
import data.dao.MySQLOrdreLinieDAO;
import presentation.RedigerOrdre;

public class OrdreController {
	RedigerOrdre oPanel;
	MySQLOrdreDAO odao;
	MySQLOrdreLinieDAO oldao; 

	public OrdreController(RedigerOrdre oPanel) {
		this.oPanel = oPanel;
		this.odao = new MySQLOrdreDAO();
		this.oldao = new MySQLOrdreLinieDAO();
		oPanel.setController(this);
	}	
	
	
}
