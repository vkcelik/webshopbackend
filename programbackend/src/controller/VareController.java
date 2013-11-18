package controller;

import javax.swing.JPanel;

import data.dao.MySQLVareBatchDAO;
import data.dao.MySQLVareDAO;
import presentation.OversigtVare;
import presentation.TilføjVare;

public class VareController {
	TilføjVare tvPanel;
	OversigtVare rsvPanel;
	MySQLVareDAO vdao;
	MySQLVareBatchDAO vbdao;
	
	public VareController(TilføjVare tvPanel, OversigtVare rsvPanel) {
		this.tvPanel = tvPanel;
		this.rsvPanel = rsvPanel;
		this.vdao = new MySQLVareDAO();
		this.vbdao = new MySQLVareBatchDAO();
		tvPanel.setController(this);
		rsvPanel.setController(this);
	}

	public void tilføjVarer(JPanel panel){
		
	}
}
