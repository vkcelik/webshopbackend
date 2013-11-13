package controller;

import data.dao.MySQLIndstillingDAO;
import presentation.Indstillinger;

public class IndstillingerController {
	
	Indstillinger iPanel;
	MySQLIndstillingDAO idao;
	

	public IndstillingerController(Indstillinger iPanel) {
		this.iPanel = iPanel;
		this.idao = new MySQLIndstillingDAO();
		iPanel.setController(this);
	}
	

}
