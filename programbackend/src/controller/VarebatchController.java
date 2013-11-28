package controller;

import java.util.List;

import logic.dto.MedarbejderDTO;
import logic.dto.VarebatchDTO;
import presentation.GUI;
import data.dao.MySQLVareBatchDAO;
import data.idao.DALException;

public class VarebatchController {
	
	MySQLVareBatchDAO vbdao;
	
	public String[] hentVarebatchInfo(){
		String info[];
		List<VarebatchDTO> vbs = null;

		try {vbs = vbdao.getVareBatchList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		info = new String[vbs.size()];
		for (int i=0; i < vbs.size(); i++){
			info[i]=vbs.get(i).getMedarbejderNummer()+", " + vbs.get(i).getMedarbejderNavn();
		}

		return info;
	}
	
	public VarebatchController() {
		this.vbdao = new MySQLVareBatchDAO();
		GUI.tilføjVarebatch.setController(this);
		GUI.redigerVarebatch.setController(this);
		GUI.seVarebatch.setController(this);
	}

}
