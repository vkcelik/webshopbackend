package controller;

import javax.swing.JTextField;

import logic.dto.KundeDTO;
import logic.dto.VarehusDTO;
import data.dao.MySQLKundeDAO;
import data.idao.DALException;
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


	public void tilføjkunde(JTextField navn, JTextField adresse, JTextField email,JTextField land, JTextField Postnr, JTextField Tlf  ){
		String knavn = navn.getText();
		String kemail = email.getText();
		String kadresse = adresse.getText();
		String Kland = land.getText();
		int postnr1 = 0;
		int tlf = 0;

		try {
			tlf = Integer.parseInt(Tlf.getText());	
			postnr1 = Integer.parseInt(Postnr.getText());	
			try {
				kdao.createKunde(new KundeDTO(null, knavn, kemail, kadresse,Kland, postnr1,tlf));
			} catch (DALException e) {
				e.printStackTrace();
			}
		} catch (NumberFormatException e) {
		
			// TODO: handle exception
		}}}