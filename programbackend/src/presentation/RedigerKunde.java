package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import presentation.RedigerMedarbejder.Mode;

import controller.KundeController;

public class RedigerKunde extends JPanel {
	
	public enum Mode{
		REDIGER, TILFØJ
	}

	private static final long serialVersionUID = -7740794442244469219L;
	private JTable Vtable;
	private JTable Vtable1;
	private KundeController controller;
	public JTextField KundeNavnText;
	public JTextField KundeAdresseText;
	public JTextField KundeEmailText;
	public JTextField KundelandText;
	public JTextField kundePostNrText;
	public JTextField KundeTelefonText;
	private Mode tilstand;

	public RedigerKunde() {

		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel kundeLabel = new JLabel("Rediger Kunde");
		kundeLabel.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/add32.png")));
		kundeLabel.setFont(new Font("sansserif", Font.BOLD, 24));
		kundeLabel.setForeground(Color.black);
		kundeLabel.setBounds(30, 28, 200, 32);
		this.add(kundeLabel);


		JLabel KundeNavn = new JLabel("Navn:");
		KundeNavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundeNavn.setBounds(150, 90, 160, 20);
		KundeNavn.setForeground(Color.black);
		add(KundeNavn);

		KundeNavnText = new JTextField();
		KundeNavnText.setBounds(230, 90, 300, 20);
		add(KundeNavnText);


		JLabel KundeEmail = new JLabel("Email:");
		KundeEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundeEmail.setBounds(150, 120, 160, 20);
		KundeEmail.setForeground(Color.black);
		add(KundeEmail);

		KundeEmailText = new JTextField();
		KundeEmailText.setBounds(230, 120, 300, 20);
		add(KundeEmailText);

		JLabel KundeAdresse = new JLabel("Adresse:");
		KundeAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundeAdresse.setBounds(150, 150, 160, 20);
		KundeAdresse.setForeground(Color.black);
		add(KundeAdresse);

		KundeAdresseText = new JTextField();
		KundeAdresseText.setBounds(230, 150, 300, 20);
		add(KundeAdresseText);

		JLabel	Kundeland = new JLabel("Land:");
		Kundeland.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Kundeland.setBounds(150, 180, 160, 20);
		Kundeland.setForeground(Color.black);
		add(Kundeland);

		KundelandText = new JTextField();
		KundelandText.setBounds(230, 180, 300, 20);
		add(KundelandText);

		JLabel KundePostNr= new JLabel("Postnr:");
		KundePostNr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundePostNr.setBounds(150, 210, 160, 20);
		KundePostNr.setForeground(Color.black);
		add(KundePostNr);

		kundePostNrText = new JTextField();
		kundePostNrText.setBounds(230, 210, 300, 20);
		add(kundePostNrText);

		JLabel KundeTelefon = new JLabel("Telefon:");
		KundeTelefon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KundeTelefon.setBounds(150, 240, 160, 20);
		KundeTelefon.setForeground(Color.black);
		add(KundeTelefon);

		KundeTelefonText = new JTextField();
		KundeTelefonText.setBounds(230, 240, 300, 20);
		add(KundeTelefonText);
		
		

		Button OpdaterKunde= new Button("Gem");
		OpdaterKunde.setBackground(new Color(255,215,10));;
		OpdaterKunde.setBounds(460, 275, 70, 22);
		OpdaterKunde.setForeground(Color.black);
		add(OpdaterKunde);
		
		OpdaterKunde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.updateKunde(KundeNavnText, KundeEmailText, KundeAdresseText, KundelandText, kundePostNrText, KundeTelefonText);
			}
		});


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

	public void makeEditMode(){
		this.tilstand = Mode.REDIGER;
	
	}
	
	public void makeAddMode(){
		
		this.tilstand = Mode.TILFØJ;
	}
	
	public void setController(KundeController kundeController) {
		this.controller = kundeController;

	}


}

