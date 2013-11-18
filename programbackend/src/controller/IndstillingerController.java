package controller;

import data.dao.MySQLIndstillingDAO;
import presentation.GUI;
import presentation.Indstillinger;

public class IndstillingerController {
	MySQLIndstillingDAO idao;
	
	public IndstillingerController() {
		this.idao = new MySQLIndstillingDAO();
		GUI.seIndstillinger.setController(this);
	}
	

}
