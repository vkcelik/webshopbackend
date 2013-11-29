package controller;

import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import logic.dto.KundeDTO;
import logic.dto.MedarbejderDTO;
import logic.dto.OrdreDTO;
import logic.dto.OrdreLinieDTO;
import data.dao.MySQLKategoriDAO;
import data.dao.MySQLKundeDAO;
import data.dao.MySQLLeveringsmetodeDAO;
import data.dao.MySQLOrdreDAO;
import data.dao.MySQLOrdreLinieDAO;
import data.dao.MySQLVareDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.OversigtOrdre;


/**
* @author  Assaad kassem  
*/

public class OrdreController {
	MySQLOrdreDAO odao;
	MySQLKundeDAO kdao;
	MySQLOrdreLinieDAO oldao; 
	MySQLLeveringsmetodeDAO ldao;
	MySQLVareDAO vdao;
	private OrdreDTO dto;
	HashMap<String,Integer> map = new HashMap<String, Integer>();

	public OrdreController() {
		this.odao = new MySQLOrdreDAO();
		this.oldao = new MySQLOrdreLinieDAO();
		this.kdao = new MySQLKundeDAO();
		this.ldao = new MySQLLeveringsmetodeDAO();
		this.vdao = new MySQLVareDAO();
		GUI.seOrdre.setController(this);
		GUI.redigerOrdre.setController(this);
	}

	public void updateList() {
		GUI.seOrdre.list.setListData(hentOrdreInfo());
	}

	private String[] hentOrdreInfo() {
		String info[];
		List<OrdreDTO> ords = null;

		try {ords = odao.getOrdreList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		info = new String[ords.size()];
		for (int i=0; i < ords.size(); i++){
			info[i]=ords.get(i).getOrdreNummer()+", " + ords.get(i).getBestillingsDato()+", " + ords.get(i).getOrdreStatus();
		}

		return info;
	}

	public void visOrdre(String selectedValue) {
		int x = 0;
		// fjerne ", navn" og lave det om til int
		try {
			x = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(",")));
		} catch (Exception e) {
			// exception should never be catched
		}

		dto = null;
		try {
			dto = odao.getOrdre(x);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GUI.redigerOrdre.combobox1.setSelectedItem(dto.getOrdreNummer());
		GUI.redigerOrdre.ordreNummer.setText("Ordrenummer: " +Integer.toString(dto.getOrdreNummer()));
		KundeDTO kunde = null;
		try {
			kunde = kdao.getKunde(dto.getKundeNummer());
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GUI.redigerOrdre.kundeNavn.setText("Kundenavn: " +kunde.getKundeNavn());
		GUI.redigerOrdre.kundeAdresse.setText("Kundeadresse: " +kunde.getKundeAdresse());
		GUI.redigerOrdre.kundePostnummer.setText("Kundepostnummer: " +Integer.toString(kunde.getKundePostnummer()));
		GUI.redigerOrdre.bestillingsDato.setText("Bestillingstidspunkt: " +dto.getBestillingsDato().toString());
		GUI.redigerOrdre.total.setText("Ordrelinietotal: " + Double.toString(dto.getTotal()));
		GUI.redigerOrdre.leveringsPris.setText("Leveringspris: " +Double.toString(dto.getLeveringsPris()));
		try {
			GUI.redigerOrdre.leveringsMetode.setText("Leveringsmetode: "+ ldao.getLeveringsmetode(dto.getLeveringsMetode()).getLeveringsmetodeNavn());
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GUI.redigerOrdre.combobox1.setSelectedItem(dto.getOrdreStatus());
		GUI.redigerOrdre.leveringsAdresse.setText("Leveringsadresse: " +dto.getLeveringsAdresse());
		GUI.redigerOrdre.leveringsPostnummer.setText("Leveringspostnummer: " +dto.getLeveringsPostnummer());
		GUI.redigerOrdre.faktureringsAdresse.setText("Faktureringsadresse: "+dto.getFaktureringsAdresse());
		GUI.redigerOrdre.faktureringsPostnummer.setText("Faktureringspostnummer: " + dto.getFaktureringsPostnummer());
		
		String[] columnNames = {"Vare", "Stykpris", "Antal", "Total", "erGave"};
		String[][] data = null;
		List<OrdreLinieDTO> ols = null;
		
		try {
			ols = oldao.getOrdrelinieList(dto.getOrdreNummer());
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		data = new String[ols.size()][columnNames.length];
		for (int i=0; i<ols.size(); i++){
			try {
				data[i][0]=vdao.getVare(ols.get(i).getVareNummer()).getVareNavn();
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			data[i][1]=Double.toString(ols.get(i).getStykPris());
			data[i][2]=Integer.toString(ols.get(i).getAntal());
			data[i][3]=Double.toString(ols.get(i).getLinieTotal());
			data[i][4]=Boolean.toString(ols.get(i).isErGave());
		}

		GUI.redigerOrdre.linjer.removeAll();
		GUI.redigerOrdre.linjer.setModel(new DefaultTableModel(data, columnNames));
		GUI.cardLayout.show(GUI.cards, "redigerOrdre");

	}

	public void updateMedarbejder(JComboBox<String> combobox) {
		dto.setOrdreStatus((String) combobox.getSelectedItem());
		try {
			odao.updateOrdre(dto);
			GUI.popupÆndret();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
