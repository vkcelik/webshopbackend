package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TilføjMedarbejder extends JPanel {

	public TilføjMedarbejder() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
	
		JLabel Label = new JLabel("Tilføj Medarbejder");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		Label.setBounds(26, 30, 240, 30);
		this.add(Label);
		
		JLabel Fornavn = new JLabel("Tilføj Fornavn:");
		Fornavn.setBounds(26, 90, 130, 20);
		Fornavn.setForeground(Color.white);
		add(Fornavn);
		
		JTextField FornavnText = new JTextField();
		FornavnText.setBounds(140, 90, 300, 20);
		add(FornavnText);
		
		JLabel Efternavn = new JLabel("Tilføj Efternavn:");
		Efternavn.setBounds(26, 120, 130, 20);
		Efternavn.setForeground(Color.white);
		add(Efternavn);
		
		JTextField EfternavnText = new JTextField();
		EfternavnText.setBounds(140, 120, 300, 20);
		add(EfternavnText);
		
		JLabel Jobtitel = new JLabel("Tilføj Jobtitel:");
		Jobtitel.setBounds(26, 150, 130, 20);
		Jobtitel.setForeground(Color.white);
		add(Jobtitel);
		
		JTextField JobtitelText = new JTextField();
		JobtitelText.setBounds(140, 150, 300, 20);
		add(JobtitelText);
		
		JLabel Telefon = new JLabel("Tilføj Telefon:");
		Telefon.setBounds(26, 180, 130, 20);
		Telefon.setForeground(Color.white);
		add(Telefon);
		
		JTextField TelefonText = new JTextField();
		TelefonText.setBounds(140, 180, 300, 20);
		add(TelefonText);
		
		JLabel Email = new JLabel("Tilføj Email:");
		Email.setBounds(26, 210, 130, 20);
		Email.setForeground(Color.white);
		add(Email);
		
		JTextField EmailText = new JTextField();
		EmailText.setBounds(140, 210, 300, 20);
		add(EmailText);
		
		Button TilføjMedarbejder = new Button("Tilføj");
		TilføjMedarbejder.setBackground(Color.lightGray);
		TilføjMedarbejder.setBounds(140, 245, 70, 22);
		TilføjMedarbejder.setForeground(Color.black);
		add(TilføjMedarbejder);
		
		
		
		
		
	}

}
