package controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import data.dao.MySQLMedarbejderDAO;
import data.idao.DALException;
import presentation.GUI;
import presentation.LogInd;

public class LogindController {

	LogInd frame;
	MySQLMedarbejderDAO mdao;

	public LogindController(LogInd frame){
		this.frame = frame;
		this.mdao = new MySQLMedarbejderDAO();
		frame.setController(this);
	}

	public void login(JTextField usernameField, JPasswordField passwordField) {		
		String idString;
		int id = -1;
		String password;

		idString = usernameField.getText();
		password = new String(passwordField.getPassword());

		if(idString.length() == 0 || password.length() == 0){
			frame.popupManglende();
		} 
		else {
			// try convert entered id text to int
			try {
				id = Integer.parseInt(usernameField.getText());
			} catch (NumberFormatException e) {
				frame.popupIndtastTal();
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
				frame.popupForkertLogin();
			}
		}
	}
}

