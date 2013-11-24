package controller;

import presentation.GUI;
import data.dao.MySQLVareBatchDAO;

public class VarebatchController {
	
	MySQLVareBatchDAO vbdao;
	
	
	public VarebatchController() {
		this.vbdao = new MySQLVareBatchDAO();
		GUI.tilføjVarebatch.setController(this);
		GUI.redigerVarebatch.setController(this);
		GUI.seVarebatch.setController(this);
	}

}
