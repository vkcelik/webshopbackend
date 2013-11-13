package controller;

import data.dao.MySQLVarehusDAO;
import presentation.SeSletVarehus;
import presentation.TilføjVarehus;

public class VarehusController {
	TilføjVarehus tvhPanel;
	SeSletVarehus sPanel;
	MySQLVarehusDAO vhdao;
	public VarehusController(TilføjVarehus tvhPanel, SeSletVarehus sPanel) {
		this.tvhPanel = tvhPanel;
		this.sPanel = sPanel;
		this.vhdao = new MySQLVarehusDAO();
		tvhPanel.setController(this);
		sPanel.setController(this);
	}
	
	
	
	

}
