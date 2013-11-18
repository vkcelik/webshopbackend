package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.KundeController;

public class RedigerKunde extends JPanel {
	
	private static final long serialVersionUID = -7740794442244469219L;
	private JTable Vtable;
	private JTable Vtable1;
	private KundeController controller;


	public RedigerKunde() {
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel kundeLabel = new JLabel("Rediger Kunde");
		kundeLabel.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/add32.png")));
		kundeLabel.setFont(new Font("sansserif", Font.BOLD, 24));
		kundeLabel.setForeground(Color.black);
		kundeLabel.setBounds(30, 28, 180, 32);
		this.add(kundeLabel);
		
		
		JLabel KundeNavn = new JLabel("Navn:");
		KundeNavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundeNavn.setBounds(150, 90, 160, 20);
		KundeNavn.setForeground(Color.black);
		add(KundeNavn);

		JTextField KundeNavnText = new JTextField();
		KundeNavnText.setBounds(230, 90, 300, 20);
		add(KundeNavnText);
		

		JLabel KundeAdresse = new JLabel("Adresse:");
		KundeAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundeAdresse.setBounds(150, 120, 160, 20);
		KundeAdresse.setForeground(Color.black);
		add(KundeAdresse);

		JTextField KundeAdresseText = new JTextField();
		KundeAdresseText.setBounds(230, 120, 300, 20);
		add(KundeAdresseText);
		
		JLabel KundeEmail= new JLabel("Email:");
		KundeEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundeEmail.setBounds(150, 150, 160, 20);
		KundeEmail.setForeground(Color.black);
		add(KundeEmail);

		JTextField KundeEmailText = new JTextField();
		KundeEmailText.setBounds(230, 150, 300, 20);
		add(KundeEmailText);
		
		JLabel	Kundeland = new JLabel("Land:");
		Kundeland.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Kundeland.setBounds(150, 180, 160, 20);
		Kundeland.setForeground(Color.black);
		add(Kundeland);

		JTextField KundelandText = new JTextField();
		KundelandText.setBounds(230, 180, 300, 20);
		add(KundelandText);
		
		JLabel KundePostNr= new JLabel("Postnr:");
		KundePostNr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundePostNr.setBounds(150, 210, 160, 20);
		KundePostNr.setForeground(Color.black);
		add(KundePostNr);

		JTextField KundePostNrText = new JTextField();
		KundePostNrText.setBounds(230, 210, 300, 20);
		add(KundePostNrText);
		
		JLabel KundeTelefon = new JLabel("Telefon:");
		KundeTelefon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundeTelefon.setBounds(150, 240, 160, 20);
		KundeTelefon.setForeground(Color.black);
		add(KundeTelefon);

		JTextField KundeTelefonText = new JTextField();
		KundeTelefonText.setBounds(230, 240, 300, 20);
		add(KundeTelefonText);
		
		Button TilføjKunde= new Button("Gem");
		TilføjKunde.setBackground(new Color(255,215,10));;
		TilføjKunde.setBounds(460, 275, 70, 22);
		TilføjKunde.setForeground(Color.black);
		add(TilføjKunde);
		
		Vtable1 = new JTable();
		Vtable1.setBounds(12, 10, 710, 57);
		Vtable1.setAutoResizeMode(HEIGHT);
		Vtable1.setBackground(new Color(238, 238, 238));
		add(Vtable1);
		
		
		Vtable = new JTable();
		Vtable.setBounds(12, 71, 710, 405);
		Vtable.setBackground(new Color(238, 238, 238));
		add(Vtable);

	}


	public void setController(KundeController kundeController) {
		this.controller = kundeController;
		
	}

}
