package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.MedarbejderController;



public class TilføjMedarbejder extends JPanel {

	public enum Mode{
		REDIGER, TILFØJ
	}
	
	private static final long serialVersionUID = 6340894832099128364L;
	private JTable Mtable;
	private JTable Mtable1;
	private MedarbejderController controller;
	public JTextField medarbejderNavnText;
	public JTextField medarbejderAdresseText;
	public JTextField medarbejderlandText;
	public JTextField medarbejderPostNrText;
	public JTextField medarbejderEmailText;
	public JTextField medarbejderPasswordText;
	public JTextField medarbejderLønText;
	public JTextField medarbejderLønTypeText;
	public JTextField medarbejderCprText;
	public JTextField medarbejderRegNrText;
	public JTextField medarbejderKontonrText;
	public JCheckBox LagerMedarbejder;
	public JCheckBox HRMedarbejder;
	public JCheckBox IndkøbsMedarbejder;
	private Mode tilstand; 
	
	public TilføjMedarbejder() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel MedarbejderLabel = new JLabel("Tilføj Medarbejder");
		MedarbejderLabel.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/addM.png")));
		MedarbejderLabel.setFont(new Font("sansserif", Font.BOLD, 24));
		MedarbejderLabel.setForeground(Color.black);
		MedarbejderLabel.setBounds(30, 30, 260, 30);
		this.add(MedarbejderLabel);


		JLabel MedarbejderNavn = new JLabel("Navn:");
		MedarbejderNavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderNavn.setBounds(150, 90, 160, 20);
		MedarbejderNavn.setForeground(Color.black);
		add(MedarbejderNavn);

		medarbejderNavnText = new JTextField();
		medarbejderNavnText.setBounds(230, 90, 300, 20);
		add(medarbejderNavnText);

		JLabel MedarbejderAdresse = new JLabel("Adresse:");
		MedarbejderAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderAdresse.setBounds(150, 120, 160, 20);
		MedarbejderAdresse.setForeground(Color.black);
		add(MedarbejderAdresse);

		medarbejderAdresseText = new JTextField();
		medarbejderAdresseText.setBounds(230, 120, 300, 20);
		add(medarbejderAdresseText);

		JLabel Medarbejderland = new JLabel("Land:");
		Medarbejderland.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Medarbejderland.setBounds(150, 150, 160, 20);
		Medarbejderland.setForeground(Color.black);
		add(Medarbejderland);

		medarbejderlandText = new JTextField();
		medarbejderlandText.setBounds(230, 150, 300, 20);
		add(medarbejderlandText);

		JLabel MedarbejderPostNr= new JLabel("Postnr:");
		MedarbejderPostNr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderPostNr.setBounds(150, 180, 160, 20);
		MedarbejderPostNr.setForeground(Color.black);
		add(MedarbejderPostNr);

		medarbejderPostNrText = new JTextField();
		medarbejderPostNrText.setBounds(230, 180, 300, 20);
		add(medarbejderPostNrText);
		
		JLabel MedarbejderEmail= new JLabel("Email:");
		MedarbejderEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderEmail.setBounds(150, 210, 160, 20);
		MedarbejderEmail.setForeground(Color.black);
		add(MedarbejderEmail);

		medarbejderEmailText = new JTextField();
		medarbejderEmailText.setBounds(230, 210, 300, 20);
		add(medarbejderEmailText);
		
		JLabel MedarbejderPassword = new JLabel("Password:");
		MedarbejderPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderPassword.setBounds(150, 240, 160, 20);
		MedarbejderPassword.setForeground(Color.black);
		add(MedarbejderPassword);

		medarbejderPasswordText = new JTextField();
		medarbejderPasswordText.setBounds(230, 240, 300, 20);
		add(medarbejderPasswordText);
		
		JLabel MedarbejderLøn = new JLabel("Løn:");
		MedarbejderLøn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderLøn.setBounds(150, 270, 160, 20);
		MedarbejderLøn.setForeground(Color.black);
		add(MedarbejderLøn);

		medarbejderLønText= new JTextField();
		medarbejderLønText.setBounds(230, 270, 300, 20);
		add(medarbejderLønText);
		
		JLabel MedarbejderLønType = new JLabel("Løntype:");
		MedarbejderLønType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderLønType.setBounds(150, 300, 160, 20);
		MedarbejderLønType.setForeground(Color.black);
		add(MedarbejderLønType);

		medarbejderLønTypeText = new JTextField();
		medarbejderLønTypeText.setBounds(230, 300, 300, 20);
		add(medarbejderLønTypeText);
		
		JLabel regnr = new JLabel("Reg.nr.:");
		regnr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		regnr.setBounds(150, 330, 160, 20);
		regnr.setForeground(Color.black);
		add(regnr);

		medarbejderRegNrText = new JTextField();
		medarbejderRegNrText.setBounds(230, 330, 300, 20);
		add(medarbejderRegNrText);
		
		JLabel medarbejderKontonr = new JLabel("Konto:");
		medarbejderKontonr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		medarbejderKontonr.setBounds(150, 360, 160, 20);
		medarbejderKontonr.setForeground(Color.black);
		add(medarbejderKontonr);

		medarbejderKontonrText= new JTextField();
		medarbejderKontonrText.setBounds(230, 360, 300, 20);
		add(medarbejderKontonrText);
		
		JLabel MedarbejderCpr = new JLabel("Cpr.:");
		MedarbejderCpr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderCpr.setBounds(150, 390, 160, 20);
		MedarbejderCpr.setForeground(Color.black);
		add(MedarbejderCpr);

		medarbejderCprText= new JTextField();
		medarbejderCprText.setBounds(230, 390, 300, 20);
		add(medarbejderCprText);
		
		JLabel MedarbejderStilling = new JLabel("Stilling:");
		MedarbejderStilling.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderStilling.setBounds(150, 420, 160, 20);
		MedarbejderStilling.setForeground(Color.black);
		add(MedarbejderStilling);

		LagerMedarbejder = new JCheckBox("LagerMedarbejder");
		LagerMedarbejder.setBounds(225, 420, 130, 20);
		add(LagerMedarbejder);
		
		HRMedarbejder = new JCheckBox("HRMedarbejder");
		HRMedarbejder.setBounds(360, 420, 120, 20);
		add(HRMedarbejder);
		
		IndkøbsMedarbejder = new JCheckBox("IndkøbMedarbejder");
		IndkøbsMedarbejder.setBounds(485, 420, 150, 20);
		add(IndkøbsMedarbejder);
		
		Button TilføjMedarbejder = new Button("Tilføj");
		TilføjMedarbejder.setBackground(new Color(255,215,10));;
		TilføjMedarbejder.setBounds(457, 445, 70, 22);
		TilføjMedarbejder.setForeground(Color.black);
		add(TilføjMedarbejder);
		TilføjMedarbejder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.tilføjMedarbejder(medarbejderNavnText, medarbejderAdresseText, medarbejderlandText, medarbejderPostNrText, medarbejderEmailText, medarbejderPasswordText, medarbejderLønText, medarbejderLønTypeText, medarbejderRegNrText, medarbejderKontonrText, medarbejderCprText, LagerMedarbejder, HRMedarbejder, IndkøbsMedarbejder);
			}
		});
		
		
		
		

		Mtable1 = new JTable();
		Mtable1.setBounds(12, 10, 710, 57);
		Mtable1.setBackground(new Color(238, 238, 238));
		add(Mtable1);

		Mtable = new JTable();
		Mtable.setBounds(12, 71, 710, 405);
		Mtable.setBackground(new Color(238, 238, 238));
		add(Mtable);
		
	

	}

	public void makeEditMode(){
		this.tilstand = Mode.REDIGER;
	}
	
	public void makeAddMode(){
		this.tilstand = Mode.TILFØJ;
	}
	
	public void setController(MedarbejderController medarbejderController) {
		this.controller = medarbejderController;
	}

}
