package controller;

import java.util.List;

import javax.swing.JTextField;

import logic.dto.MedarbejderDTO;
import data.dao.MySQLMedarbejderDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.OversigtMedarbejder;
import presentation.TilføjMedarbejder;

public class MedarbejderController {
	MySQLMedarbejderDAO mdao;
	
	public MedarbejderController() {
		this.mdao = new MySQLMedarbejderDAO();
		GUI.tilføjMedarbejder.setController(this);
		GUI.redigerMedarbejder.setController(this);
		GUI.seMedarbejder.setController(this);
	}

	public void visMedarbejder(String selectedValue) {
		int x = 0;
		// fjerne ", navn" og lave det om til int
		try {
			x = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(",")));
		} catch (Exception e) {
			// exception should never be catched
		}
		
		MedarbejderDTO dto = null;
		try {
			dto = mdao.getMedarbejder(x);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GUI.tilføjMedarbejder.MedarbejderNavnText.setText(dto.getMedarbejderNavn());
		GUI.tilføjMedarbejder.MedarbejderAdresseText.setText(dto.getMedarbejderAdresse());
		GUI.tilføjMedarbejder.MedarbejderlandText.setText(dto.getMedarbejderLand());
		GUI.tilføjMedarbejder.MedarbejderPasswordText.setText(dto.getMedarbejderPassword());
		GUI.tilføjMedarbejder.MedarbejderLønTypeText.setText(dto.getMedarbejderLønType());
		GUI.tilføjMedarbejder.MedarbejderCprText.setText(dto.getMedarbejderCpr());

		GUI.cardLayout.show(GUI.cards, "redigerMedarbejder");
		
	}
	
	public String[] hentMedarbejderNavne(){
		String Redigermedarbejder[];
		List<MedarbejderDTO> kats = null;
		
		try {kats = mdao.getMedarbejderList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		Redigermedarbejder = new String[kats.size()];
		for (int i=0; i < kats.size(); i++){
			Redigermedarbejder[i]=kats.get(i).getMedarbejderNummer()+", " + kats.get(i).getMedarbejderNavn();
		}
		
		return Redigermedarbejder;
	}

	public void opdaterMedarbejder(JTextField medarbejderNavnText,
			JTextField medarbejderAdresseText, JTextField medarbejderlandText,
			JTextField medarbejderPostNrText, JTextField medarbejderEmailText,
			JTextField medarbejderPasswordText, JTextField medarbejderLønText,
			JTextField medarbejderLønTypeText, JTextField medarbejderCprText) {
		String navn = medarbejderNavnText.getText();
		String adresse = medarbejderAdresseText.getText();
		String land = medarbejderlandText.getText();
		int postNr = Integer.parseInt(medarbejderPostNrText.getText());
		String email = medarbejderEmailText.getText();
		String password = medarbejderPasswordText.getText();
		double løn = Integer.parseInt(medarbejderLønText.getText());
		String lønType = medarbejderLønTypeText.getText();
		String cpr = medarbejderCprText.getText();
		
		try {
			mdao.updateMedarbejder(null);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

}
