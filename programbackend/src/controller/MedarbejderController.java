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



/**
* @author  Veli Kerim Celik  
*/

public class MedarbejderController {
	MySQLMedarbejderDAO mdao;
	MySQLRolleDAO rdao;
	MedarbejderDTO dto;

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

		dto = null;
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
		
		String navn = null;
		String adresse = null;
		String land = null;
		int postNr = 0;
		String email= null;
		String password= null;
		double løn = 0;
		String lønType= null;
		int regnr = 0;
		String konto= null;
		String cpr= null;
		try {
			navn = medarbejderNavnText.getText();
			adresse = medarbejderAdresseText.getText();
			land = medarbejderlandText.getText();
			postNr = Integer.parseInt(medarbejderPostNrText.getText());
			email = medarbejderEmailText.getText();
			password = medarbejderPasswordText.getText();
			løn = Integer.parseInt(medarbejderLønText.getText());
			lønType = medarbejderLønTypeText.getText();
			regnr = Integer.parseInt(medarbejderRegnr.getText());
			konto = medarbejderKontonr.getText();
			cpr = medarbejderCprText.getText();
		} catch (Exception e) {
			GUI.popupBogstavFejl();
		}
		


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
			GUI.popupTilføjet();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void updateMedarbejder(JTextField medarbejderNavnText,
			JTextField medarbejderAdresseText, JTextField medarbejderlandText,
			JTextField medarbejderPostNrText, JTextField medarbejderEmailText,
			JTextField medarbejderPasswordText, JTextField medarbejderLønText,
			JTextField medarbejderLønTypeText, JTextField medarbejderRegNrText,
			JTextField medarbejderKontonrText, JTextField medarbejderCprText,
			JCheckBox lagerMedarbejder, JCheckBox hRMedarbejder,
			JCheckBox indkøbMedarbejder) {
		
		String navn = medarbejderNavnText.getText();
		String adresse = medarbejderAdresseText.getText();
		String land = medarbejderlandText.getText();
		int postnr = 0;
		try {
			postnr = Integer.parseInt(medarbejderPostNrText.getText());
		} catch (Exception e) {
			GUI.popupBogstavFejl();
		}
		String email = medarbejderEmailText.getText();
		String password = medarbejderPasswordText.getText();
		double løn = 0.0;
		try {
			løn = Double.parseDouble(medarbejderLønText.getText());
		} catch (Exception e) {
			GUI.popupBogstavFejl();
		}
		String løntype = medarbejderLønTypeText.getText();
		int regnr = 0;
		try {
			regnr = Integer.parseInt(medarbejderPostNrText.getText());
		} catch (Exception e) {
			GUI.popupBogstavFejl();
		}
		String kontonr = medarbejderKontonrText.getText();
		String cpr = medarbejderCprText.getText();
		
		try {
			mdao.updateMedarbejder(new MedarbejderDTO(dto.getMedarbejderNummer(), navn, adresse, land, postnr, email, password, løntype, løn, regnr, kontonr, cpr));
			GUI.popupÆndret();
		} catch (DALException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(lagerMedarbejder.isSelected() && !dto.isLager()){
			try {
				rdao.createRolle(new RolleDTO(3, dto.getMedarbejderNummer()));
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(!lagerMedarbejder.isSelected() && dto.isLager()){
			try {
				rdao.deleteRolle(new RolleDTO(3, dto.getMedarbejderNummer()));
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (hRMedarbejder.isSelected() && !dto.isHr()){
			try {
				rdao.createRolle(new RolleDTO(1, dto.getMedarbejderNummer()));
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (!hRMedarbejder.isSelected() && dto.isHr()){
			try {
				rdao.deleteRolle(new RolleDTO(1, dto.getMedarbejderNummer()));
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (indkøbMedarbejder.isSelected() && !dto.isIndkøb()){
			try {
				rdao.createRolle(new RolleDTO(2, dto.getMedarbejderNummer()));
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (!indkøbMedarbejder.isSelected() && dto.isIndkøb()){
			try {
				rdao.deleteRolle(new RolleDTO(2, dto.getMedarbejderNummer()));
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void updateList(){
		GUI.seMedarbejder.listmedarbejder.setListData(hentMedarbejderNavne());
	}

	public void slet() {
		try {
			mdao.deleteMedarbejder(dto.getMedarbejderNummer());
			GUI.popupSlettet();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


		
		
	}



