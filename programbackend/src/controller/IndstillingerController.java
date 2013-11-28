package controller;

import java.util.List;

import javax.swing.JTextField;

import logic.dto.IndstillingDTO;
import data.dao.MySQLIndstillingDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.Indstillinger;

public class IndstillingerController {
	MySQLIndstillingDAO idao;

	public IndstillingerController() {
		this.idao = new MySQLIndstillingDAO();
		GUI.seIndstillinger.setController(this);
	}



	public void updateIndstillinger(JTextField antal, JTextField ikkePåLager, JTextField moms, JTextField godkend) {
		try {
			idao.updateIndstilling(new IndstillingDTO(1, antal.getText()));
			idao.updateIndstilling(new IndstillingDTO(2, ikkePåLager.getText()));
			idao.updateIndstilling(new IndstillingDTO(3, moms.getText()));
			idao.updateIndstilling(new IndstillingDTO(4, godkend.getText()));
			GUI.popupÆndret();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	public void visIndstillinger() {
		List<IndstillingDTO> inds = null;
		try {
			inds = idao.getIndstillingList();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (IndstillingDTO i: inds){
			switch (i.getIndstillingNummer()) {
			case 1:
				GUI.seIndstillinger.antal.setText(i.getIndstillingVærdi());
				break;
			case 2:
				GUI.seIndstillinger.ikkePåLager.setText(i.getIndstillingVærdi());
				break;
			case 3:
				GUI.seIndstillinger.moms.setText(i.getIndstillingVærdi());
				break;
			case 4:
				GUI.seIndstillinger.godkend.setText(i.getIndstillingVærdi());
				break;
			default:
				break;
			}
		}
		
	}
}
