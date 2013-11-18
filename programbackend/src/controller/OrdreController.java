package controller;

import data.dao.MySQLOrdreDAO;
import data.dao.MySQLOrdreLinieDAO;
import presentation.Ordre;

public class OrdreController {
	Ordre oPanel;
	MySQLOrdreDAO odao;
	MySQLOrdreLinieDAO oldao; 

	public OrdreController(Ordre oPanel) {
		this.oPanel = oPanel;
		this.odao = new MySQLOrdreDAO();
		this.oldao = new MySQLOrdreLinieDAO();
		oPanel.setController(this);
	}	
	
	
}
