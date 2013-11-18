package controller;

import data.dao.MySQLVarehusDAO;
import presentation.OversigtVarehus;
import presentation.TilføjVarehus;

public class VarehusController {
	TilføjVarehus tvhPanel;
	OversigtVarehus sPanel;
	MySQLVarehusDAO vhdao;
	public VarehusController(TilføjVarehus tvhPanel, OversigtVarehus sPanel) {
		this.tvhPanel = tvhPanel;
		this.sPanel = sPanel;
		this.vhdao = new MySQLVarehusDAO();
		tvhPanel.setController(this);
		sPanel.setController(this);
	}
	
	
	
	

}
