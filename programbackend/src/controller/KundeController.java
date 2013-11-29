package controller;

import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import logic.dto.KundeDTO;
import logic.dto.MedarbejderDTO;
import data.dao.MySQLKundeDAO;
import data.idao.DALException;
import presentation.GUI;

/**
* @author     Veli Kerim Celik  
*/

public class KundeController {

	MySQLKundeDAO kdao;
	KundeDTO dto;

	public KundeController() {
		this.kdao = new MySQLKundeDAO();
		GUI.tilføjKunde.setController(this);
		GUI.redigerKunde.setController(this);
		GUI.seKunde.setController(this);
	}


	public void tilføjkunde(JTextField navn, JTextField adresse, JTextField email,JTextField land, JTextField Postnr, JTextField Tlf ){
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
				GUI.popupTilføjet();
			} catch (DALException e) {
				e.printStackTrace();
			}
		} catch (NumberFormatException e) {
			GUI.popupBogstavFejl();
		}
	}


	public void visKunde(String selectedValue) {

		int x = 0;
		// fjerne ", navn" og lave det om til int
		try {
			x = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(",")));
		} catch (Exception e) {
			// exception should never be catched
		}

		dto = null;
		try {
			dto = kdao.getKunde(x);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		GUI.redigerKunde.KundeNavnText.setText(dto.getKundeNavn());
		GUI.redigerKunde.KundeEmailText.setText(dto.getKundeEmail());
		GUI.redigerKunde.KundeAdresseText.setText(dto.getKundeAdresse());
		GUI.redigerKunde.KundelandText.setText(dto.getKundeLand());
		GUI.redigerKunde.kundePostNrText.setText(String.valueOf(dto.getKundePostnummer()));
		GUI.redigerKunde.KundeTelefonText.setText(String.valueOf(dto.getKundeTelefon()));


		GUI.cardLayout.show(GUI.cards, "redigerKunde");

	}


	public String[] hentKundeNavne() {

		String RedigerKunde[];
		List<KundeDTO> kats = null;

		try {kats = kdao.getKundeList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		RedigerKunde = new String[kats.size()];
		for (int i=0; i < kats.size(); i++){
			RedigerKunde[i]=kats.get(i).getKundeNummer()+", " + kats.get(i).getKundeNavn();
		}

		return RedigerKunde;



	}

	public void updateKunde(JTextField KundeNavnText,
			JTextField KundeEmailText, JTextField KundeAdresseText,
			JTextField KundelandText, JTextField kundePostNrText,
			JTextField KundeTelefonText) {

		String kundenavn = KundeNavnText.getText();
		String kundeemail= KundeEmailText.getText();
		String kundeadresse = KundeAdresseText.getText();
		String kundeland = KundelandText.getText();

		int postnr = 0;
		int Tlf = 0;

		try {
			postnr = Integer.parseInt(kundePostNrText.getText());
			Tlf = Integer.parseInt(KundeTelefonText.getText());
		} catch (Exception e) {
			GUI.popupBogstavFejl();
		}


		try {
			kdao.updateKunde(new KundeDTO(dto.getKundeNummer(), kundenavn, kundeemail, kundeadresse, kundeland, postnr, Tlf ));
			GUI.popupÆndret();
		} catch (DALException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void updateList() {
		GUI.seKunde.list1.setListData(hentKundeNavne());
	}



}


