package controller;

import java.util.List;

import logic.dto.MedarbejderDTO;
import logic.dto.VareDTO;
import logic.dto.VarebatchDTO;
import logic.dto.VarehusDTO;
import presentation.GUI;
import data.dao.MySQLVareBatchDAO;
import data.dao.MySQLVareDAO;
import data.dao.MySQLVarehusDAO;
import data.idao.DALException;

public class VarebatchController {
	
	MySQLVareBatchDAO vbdao;
	MySQLVareDAO vdao;
	MySQLVarehusDAO vhdao;
	
	public VarebatchController() {
		this.vbdao = new MySQLVareBatchDAO();
		this.vdao = new MySQLVareDAO();
		this.vhdao = new MySQLVarehusDAO();
		GUI.tilføjVarebatch.setController(this);
		GUI.redigerVarebatch.setController(this);
		GUI.seVarebatch.setController(this);
	}
	
	public String[] hentVarebatchInfo(){
		String info[];
		List<VarebatchDTO> vbs = null;

		try {vbs = vbdao.getVareBatchList();}
		catch (DALException e) { System.out.println(e.getMessage()); }

		info = new String[vbs.size()];
		for (int i=0; i < vbs.size(); i++){
			try {
				info[i]=vbs.get(i).getVareBatchNummer()+": " + vbdao.getVareNavn(vbs.get(i).getVareBatchNummer());
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return info;
	}
	
	public String[] hentVareInfo(){
		String info[];
		List<VareDTO> varer = null;
		
		try {
			varer = vdao.getVareList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		info = new String[varer.size()];
		for (int i=0; i<varer.size(); i++){
			info[i]=varer.get(i).getVareNummer()+": " + varer.get(i).getVareNavn();
		}
		return info;
	}
	
	public String[] hentVarehusInfo(){
		String info[];
		List<VarehusDTO> vhs = null;
		
		try {
			vhs = vhdao.getVarehusList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		info = new String[vhs.size()];
		for (int i=0; i<vhs.size(); i++){
			info[i]=vhs.get(i).getVarehusNummer()+": " + vhs.get(i).getAdresse();
		}
		return info;
	}
	
	
	

}
