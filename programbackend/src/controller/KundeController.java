package controller;

import data.dao.MySQLKundeDAO;
import presentation.OversigtKunde;
import presentation.TilføjKunde;

public class KundeController {
	
	TilføjKunde tkunPanel;
	OversigtKunde rskunPanel;
	MySQLKundeDAO kdao;

	public KundeController(TilføjKunde tkunPanel, OversigtKunde rskunPanel) {
		this.tkunPanel = tkunPanel;
		this.rskunPanel = rskunPanel;
		this.kdao = new MySQLKundeDAO();
		tkunPanel.setController(this);
		rskunPanel.setController(this);
	}

}
