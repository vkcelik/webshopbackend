package controller;

import data.dao.MySQLKundeDAO;
import presentation.RedigerSletKunde;
import presentation.TilføjKunde;

public class KundeController {
	
	TilføjKunde tkunPanel;
	RedigerSletKunde rskunPanel;
	MySQLKundeDAO kdao;

	public KundeController(TilføjKunde tkunPanel, RedigerSletKunde rskunPanel) {
		this.tkunPanel = tkunPanel;
		this.rskunPanel = rskunPanel;
		this.kdao = new MySQLKundeDAO();
		tkunPanel.setController(this);
		rskunPanel.setController(this);
	}

}
