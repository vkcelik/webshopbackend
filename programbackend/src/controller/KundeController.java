package controller;

import data.dao.MySQLKundeDAO;
import presentation.GUI;
import presentation.OversigtKunde;
import presentation.TilføjKunde;

public class KundeController {
	
	MySQLKundeDAO kdao;

	public KundeController() {
		this.kdao = new MySQLKundeDAO();
		GUI.tilføjKunde.setController(this);
		GUI.redigerKunde.setController(this);
		GUI.seKunde.setController(this);
	}

}
