package controller;

import java.util.List;

import logic.dto.KundeDTO;
import data.dao.MySQLStatestikDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.Statestik;

public class StatestikController {

	MySQLStatestikDAO sdao;

	public StatestikController() {
		this.sdao = new MySQLStatestikDAO();
		GUI.seStatestik.setController(this);

	}
	
}


