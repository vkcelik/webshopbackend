package controller;

import data.dao.MySQLMedarbejderDAO;
import presentation.RedigerSletMedarbejder;
import presentation.TilføjMedarbejder;

public class MedarbejderController {
	TilføjMedarbejder tm;
	RedigerSletMedarbejder rsm;
	MySQLMedarbejderDAO mdao;
	
	public MedarbejderController(TilføjMedarbejder tm, RedigerSletMedarbejder rsm) {
		this.tm = tm;
		this.rsm = rsm;
		this.mdao = new MySQLMedarbejderDAO();
		tm.setController(this);
		rsm.setController(this);
	}
	
	

}
