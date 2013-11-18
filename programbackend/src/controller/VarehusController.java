package controller;

import data.dao.MySQLVarehusDAO;
import presentation.RedigerVarehus;
import presentation.TilføjVarehus;

public class VarehusController {
	TilføjVarehus tvhPanel;
	RedigerVarehus sPanel;
	MySQLVarehusDAO vhdao;
	public VarehusController(TilføjVarehus tvhPanel, RedigerVarehus sPanel) {
		this.tvhPanel = tvhPanel;
		this.sPanel = sPanel;
		this.vhdao = new MySQLVarehusDAO();
		tvhPanel.setController(this);
		sPanel.setController(this);
	}
	
	
	
	

}
