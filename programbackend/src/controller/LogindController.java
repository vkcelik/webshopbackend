package controller;

import java.util.List;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import data.dao.MySQLMedarbejderDAO;
import data.dao.MySQLRolleDAO;
import data.idao.DALException;
import presentation.GUI;


public class LogindController {

	MySQLMedarbejderDAO mdao;
	MySQLRolleDAO rdao;

	public LogindController(){
		this.mdao = new MySQLMedarbejderDAO();
		this.rdao = new MySQLRolleDAO();
		GUI.logindFrame.setController(this);
	}

	public void login(JTextField usernameField, JPasswordField passwordField) {		
		String idString;
		int id = -1;
		String password;

		idString = usernameField.getText();
		password = new String(passwordField.getPassword());

		if(idString.length() == 0 || password.length() == 0){
			GUI.logindFrame.popupManglende();
		} 
		else {
			// try convert entered id text to int
			try {
				id = Integer.parseInt(usernameField.getText());
			} catch (NumberFormatException e) {
				GUI.logindFrame.popupIndtastTal();
			}
			// find employee with entered information
			try {
				mdao.getMedarbejder(id, password);
				List<Integer> roller = rdao.getRolleList(id);
				if (roller.contains(1))
					GUI.isHr = true;
				if (roller.contains(2))
					GUI.isIndkøb = true;
				if (roller.contains(3))
					GUI.isLager = true;
				if (GUI.isLager && GUI.isHr && GUI.isIndkøb)
					GUI.isAdmin = true;
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						GUI.createAndShowBackend();
					}
				});
			} catch (DALException e) {
				GUI.logindFrame.popupForkertLogin();
			}
		}
	}
}

