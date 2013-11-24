package controller;

import presentation.GUI;
import presentation.RedigerLeveringsmetode;
import presentation.TilføjLeveringsmetode;
import data.dao.MySQLLeveringsmetodeDAO;

public class LeveringsmetodeController {
	
	MySQLLeveringsmetodeDAO lmdao;
	
	public LeveringsmetodeController(){
		this.lmdao = new MySQLLeveringsmetodeDAO();
		GUI.tilføjLeveringsmetode.setController(this);
		GUI.redigerLeveringsmetode.setController(this);
		GUI.seLeveringsmetode.setController(this);
	}

}
