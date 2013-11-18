package controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import data.dao.MySQLMedarbejderDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.LogInd;

public class LogindController {

	MySQLMedarbejderDAO mdao;

	public LogindController(){
		this.mdao = new MySQLMedarbejderDAO();
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

