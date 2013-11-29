package controller;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import logic.dto.KundeDTO;
import logic.dto.OrdreLinieDTO;
import data.dao.MySQLStatestikDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.Statestik;


/**
* @author    Ayhan Erman 
*/

public class StatestikController {

	MySQLStatestikDAO sdao;

	public StatestikController() {
		this.sdao = new MySQLStatestikDAO();
		GUI.seStatestik.setController(this);
	}

	private String[] hentStatistik() {

		List<String[]> top = null;
		MySQLStatestikDAO ol = new MySQLStatestikDAO();

		try {top = ol.getTop10Vare("År");}
		catch (DALException e) { System.out.println(e.getMessage()); }

		//printArray(top);

		for (int i = 0; i<top.size(); i++){
			String[] linje = top.get(i);
			for (int j=0; j<linje.length; j++){
				System.out.print(linje[j] + "\t");
			}
			System.out.println();
		}

		return null;
	}

	public void update(String periode) {
		try {
			GUI.seStatestik.antalLabel.setText(sdao.getAntalOrdre(periode));
			GUI.seStatestik.omsætningLabel.setText(sdao.getOmsætning(periode));

			String[] columnNames = {"Varenummer", "Varenavn", "Antal"};
			String[][] data = null;
			List<String[]> stats = null;

			try {
				stats = sdao.getTop10Vare(periode);
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			data = new String[stats.size()][columnNames.length];
			for (int i=0; i<stats.size(); i++){
				data[i][0]=stats.get(i)[0];
				data[i][1]=stats.get(i)[1];
				data[i][2]=stats.get(i)[2];
			}

			GUI.seStatestik.varer.removeAll();
			GUI.seStatestik.varer.setModel(new DefaultTableModel(data, columnNames));
			GUI.cardLayout.show(GUI.cards, "seStatestik");
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}


