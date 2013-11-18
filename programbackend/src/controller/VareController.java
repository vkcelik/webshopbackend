package controller;

import javax.swing.JPanel;

import data.dao.MySQLVareBatchDAO;
import data.dao.MySQLVareDAO;
import presentation.GUI;
import presentation.OversigtVare;
import presentation.TilføjVare;

public class VareController {
	MySQLVareDAO vdao;
	MySQLVareBatchDAO vbdao;
	
	public VareController() {
		this.vdao = new MySQLVareDAO();
		this.vbdao = new MySQLVareBatchDAO();
		GUI.redigerVare.setController(this);
		GUI.seVare.setController(this);
		GUI.tilføjVare.setController(this);
	}

	public void tilføjVarer(JPanel panel){
		
	}
}
