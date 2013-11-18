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
	public JTextField MedarbejderNavnText;
	public JTextField MedarbejderAdresseText;
	public JTextField MedarbejderlandText;
	public JTextField MedarbejderPostNrText;
	public JTextField MedarbejderEmailText;
	public JTextField MedarbejderPasswordText;
	public JTextField MedarbejderLønText;
	public JTextField MedarbejderLønTypeText;
	public JTextField MedarbejderCprText;
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

		MedarbejderNavnText = new JTextField();
		MedarbejderNavnText.setBounds(230, 90, 300, 20);
		add(MedarbejderNavnText);

		JLabel MedarbejderAdresse = new JLabel("Adresse:");
		MedarbejderAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderAdresse.setBounds(150, 120, 160, 20);
		MedarbejderAdresse.setForeground(Color.black);
		add(MedarbejderAdresse);

		MedarbejderAdresseText = new JTextField();
		MedarbejderAdresseText.setBounds(230, 120, 300, 20);
		add(MedarbejderAdresseText);

		JLabel Medarbejderland = new JLabel("Land:");
		Medarbejderland.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Medarbejderland.setBounds(150, 150, 160, 20);
		Medarbejderland.setForeground(Color.black);
		add(Medarbejderland);

		MedarbejderlandText = new JTextField();
		MedarbejderlandText.setBounds(230, 150, 300, 20);
		add(MedarbejderlandText);

		JLabel MedarbejderPostNr= new JLabel("Postnr:");
		MedarbejderPostNr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderPostNr.setBounds(150, 180, 160, 20);
		MedarbejderPostNr.setForeground(Color.black);
		add(MedarbejderPostNr);

		MedarbejderPostNrText = new JTextField();
		MedarbejderPostNrText.setBounds(230, 180, 300, 20);
		add(MedarbejderPostNrText);
		
		JLabel MedarbejderEmail= new JLabel("Email:");
		MedarbejderEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderEmail.setBounds(150, 210, 160, 20);
		MedarbejderEmail.setForeground(Color.black);
		add(MedarbejderEmail);

		MedarbejderEmailText = new JTextField();
		MedarbejderEmailText.setBounds(230, 210, 300, 20);
		add(MedarbejderEmailText);
		
		JLabel MedarbejderPassword = new JLabel("Password:");
		MedarbejderPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderPassword.setBounds(150, 240, 160, 20);
		MedarbejderPassword.setForeground(Color.black);
		add(MedarbejderPassword);

		MedarbejderPasswordText = new JTextField();
		MedarbejderPasswordText.setBounds(230, 240, 300, 20);
		add(MedarbejderPasswordText);
		
		JLabel MedarbejderLøn = new JLabel("Løn:");
		MedarbejderLøn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderLøn.setBounds(150, 270, 160, 20);
		MedarbejderLøn.setForeground(Color.black);
		add(MedarbejderLøn);

		MedarbejderLønText= new JTextField();
		MedarbejderLønText.setBounds(230, 270, 300, 20);
		add(MedarbejderLønText);
		
		JLabel MedarbejderLønType = new JLabel("Løntype:");
		MedarbejderLønType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderLønType.setBounds(150, 300, 160, 20);
		MedarbejderLønType.setForeground(Color.black);
		add(MedarbejderLønType);

		MedarbejderLønTypeText= new JTextField();
		MedarbejderLønTypeText.setBounds(230, 300, 300, 20);
		add(MedarbejderLønTypeText);
		
		JLabel MedarbejderCpr = new JLabel("Cpr.:");
		MedarbejderCpr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderCpr.setBounds(150, 330, 160, 20);
		MedarbejderCpr.setForeground(Color.black);
		add(MedarbejderCpr);

		MedarbejderCprText= new JTextField();
		MedarbejderCprText.setBounds(230, 330, 300, 20);
		add(MedarbejderCprText);
		
		JLabel MedarbejderStilling = new JLabel("Stilling:");
		MedarbejderStilling.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderStilling.setBounds(150, 360, 160, 20);
		MedarbejderStilling.setForeground(Color.black);
		add(MedarbejderStilling);

		JCheckBox LagerMedarbejder = new JCheckBox("LagerMedarbejder");
		LagerMedarbejder.setBounds(225, 360, 130, 20);
		add(LagerMedarbejder);
		
		JCheckBox HRMedarbejder = new JCheckBox("HRMedarbejder");
		HRMedarbejder.setBounds(360, 360, 120, 20);
		add(HRMedarbejder);
		
		JCheckBox SalgsMedarbejder = new JCheckBox("IndkøbMedarbejder");
		SalgsMedarbejder.setBounds(485, 360, 150, 20);
		add(SalgsMedarbejder);
		
		Button TilføjMedarbejder = new Button("Tilføj");
		TilføjMedarbejder.setBackground(new Color(255,215,10));;
		TilføjMedarbejder.setBounds(457, 395, 70, 22);
		TilføjMedarbejder.setForeground(Color.black);
		add(TilføjMedarbejder);
		TilføjMedarbejder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
