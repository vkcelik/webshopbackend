package controller;

import presentation.Statestik;

public class StatestikController {

	Statestik panel;
	MySQLStatestikDAO sdao;
	
	public StatestikController(Statestik seStatestik) {
		this.panel = seStatestik;
		this.sdao = new MySQLStatestikDAO();
		seStatestik.setController(this);
	}

}
