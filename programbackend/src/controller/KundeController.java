package controller;

import data.dao.MySQLKundeDAO;
import presentation.RedigerKunde;
import presentation.TilføjKunde;

public class KundeController {
	
	TilføjKunde tkunPanel;
	RedigerKunde rskunPanel;
	MySQLKundeDAO kdao;

	public KundeController(TilføjKunde tkunPanel, RedigerKunde rskunPanel) {
		this.tkunPanel = tkunPanel;
		this.rskunPanel = rskunPanel;
		this.kdao = new MySQLKundeDAO();
		tkunPanel.setController(this);
		rskunPanel.setController(this);
	}

}
