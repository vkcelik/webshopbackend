package controller;

import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import logic.dto.MedarbejderDTO;
import logic.dto.RolleDTO;
import data.dao.MySQLMedarbejderDAO;
import data.dao.MySQLRolleDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.OversigtMedarbejder;
import presentation.TilføjMedarbejder;

public class MedarbejderController {
	MySQLMedarbejderDAO mdao;
	MySQLRolleDAO rdao;

	public MedarbejderController() {
		this.mdao = new MySQLMedarbejderDAO();
		this.rdao = new MySQLRolleDAO();
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
			List<Integer> roller = rdao.getRolleList(dto.getMedarbejderNummer());
			if (roller.contains(1))
				dto.setHr(true);
			if (roller.contains(2))
				dto.setIndkøb(true);
			if (roller.contains(3))
				dto.setLager(true);

		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GUI.redigerMedarbejder.medarbejderNavnText.setText(dto.getMedarbejderNavn());
		GUI.redigerMedarbejder.medarbejderAdresseText.setText(dto.getMedarbejderAdresse());
		GUI.redigerMedarbejder.medarbejderlandText.setText(dto.getMedarbejderLand());
		GUI.redigerMedarbejder.medarbejderPostNrText.setText(String.valueOf(dto.getMedarbejderPostnummer()));
		GUI.redigerMedarbejder.medarbejderEmailText.setText(dto.getMedarbejderEmail());
		GUI.redigerMedarbejder.medarbejderPasswordText.setText(dto.getMedarbejderPassword());
		GUI.redigerMedarbejder.medarbejderLønText.setText(String.valueOf(dto.getMedarbejderLøn()));
		GUI.redigerMedarbejder.medarbejderLønTypeText.setText(dto.getMedarbejderLønType());
		GUI.redigerMedarbejder.medarbejderKontonrText.setText(dto.getMedarbejderKonto());
		GUI.redigerMedarbejder.medarbejderRegNrText.setText(String.valueOf(dto.getMedarbejderRegnr()));
		GUI.redigerMedarbejder.medarbejderCprText.setText(dto.getMedarbejderCpr());
		GUI.redigerMedarbejder.LagerMedarbejder.setSelected(dto.isLager());
		GUI.redigerMedarbejder.IndkøbMedarbejder.setSelected(dto.isIndkøb());
		GUI.redigerMedarbejder.HRMedarbejder.setSelected(dto.isHr());

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

	public void tilføjMedarbejder(JTextField medarbejderNavnText,
			JTextField medarbejderAdresseText, JTextField medarbejderlandText,
			JTextField medarbejderPostNrText, JTextField medarbejderEmailText,
			JTextField medarbejderPasswordText, JTextField medarbejderLønText,
			JTextField medarbejderLønTypeText, JTextField medarbejderRegnr, 
			JTextField medarbejderKontonr, JTextField medarbejderCprText, 
			JCheckBox lagerMedarbejder, JCheckBox hRMedarbejder, 
			JCheckBox indkøbsMedarbejder) {

		String navn = medarbejderNavnText.getText();
		String adresse = medarbejderAdresseText.getText();
		String land = medarbejderlandText.getText();
		int postNr = Integer.parseInt(medarbejderPostNrText.getText());
		String email = medarbejderEmailText.getText();
		String password = medarbejderPasswordText.getText();
		double løn = Integer.parseInt(medarbejderLønText.getText());
		String lønType = medarbejderLønTypeText.getText();
		int regnr = Integer.parseInt(medarbejderRegnr.getText());
		String konto = medarbejderKontonr.getText();
		String cpr = medarbejderCprText.getText();


		try {
			mdao.createMedarbejder((new MedarbejderDTO(null, navn, adresse, land, postNr, email, password, lønType, løn, regnr, konto, cpr)));
			int id = mdao.getLastInsertId();
			if (lagerMedarbejder.isSelected()){
				rdao.createRolle(new RolleDTO(3, id));
			}
			if (hRMedarbejder.isSelected()){
				rdao.createRolle(new RolleDTO(1, id));
			}
			if (indkøbsMedarbejder.isSelected()){
				rdao.createRolle(new RolleDTO(2, id));
			}
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
