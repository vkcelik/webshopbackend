package controller;

import javax.swing.JTextField;

import logic.dto.MedarbejderDTO;
import data.dao.MySQLMedarbejderDAO;
import data.idao.DALException;
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

	public void visMedarbejder(String selectedValue) {
		int x = 0;
		// fjerne ", navn" og lave det om til int
		try {
			x = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(",")));
		} catch (Exception e) {
			// should not happen
		}
		
		MedarbejderDTO dto = null;
		try {
			dto = mdao.getMedarbejder(x);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tm.MedarbejderNavnText.setText(dto.getMedarbejderNavn());
		tm.MedarbejderAdresseText.setText(dto.getMedarbejderAdresse());
		tm.MedarbejderlandText.setText(dto.getMedarbejderLand());
		tm.MedarbejderPasswordText.setText(dto.getMedarbejderPassword());
		tm.MedarbejderLønTypeText.setText(dto.getMedarbejderLønType());
		tm.MedarbejderCprText.setText(dto.getMedarbejderCpr());
		
		
		
	}
	
	

}
