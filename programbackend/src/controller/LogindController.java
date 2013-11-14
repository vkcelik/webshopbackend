package controller;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import data.dao.MySQLMedarbejderDAO;

import presentation.BackEndSystem;
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
		
	//	mdao.getMedarbejder(medarbejderId, password);
		if(usernameField.getText().trim().length()== 0 || passwordField.getPassword().length==0){
			JOptionPane.showMessageDialog(null, "Udfyld Brugernavn og adgangskode");
		} 
		else {
			if(usernameField.getText().equals("assaad") && new String(passwordField.getPassword()).equals("kerim")) {
				BackEndSystem Logind =new BackEndSystem();
				Logind.setVisible(true);
				frame.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Ugyldigt Brugernavn eller adgangskode", "Fejl Meddelse", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
//
}

