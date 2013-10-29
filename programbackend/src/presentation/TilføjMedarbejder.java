package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;



public class TilføjMedarbejder extends JPanel {


	private JTable Mtable;
	private JTable Mtable1;


	public TilføjMedarbejder() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel MedarbejderLabel = new JLabel("Tilføj Medarbejder");
		MedarbejderLabel.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/addM.png")));
		MedarbejderLabel.setFont(new Font("sansserif", Font.BOLD, 24));
		MedarbejderLabel.setForeground(Color.black);
		MedarbejderLabel.setBounds(30, 30, 260, 30);
		this.add(MedarbejderLabel);

		JLabel MedarbejderNr = new JLabel("Tilføj MedarbejderNr.:");
		MedarbejderNr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderNr.setBounds(30, 90, 150, 20);
		MedarbejderNr.setForeground(Color.black);
		add(MedarbejderNr);

		JTextField MedarbejderNrText = new JTextField();
		MedarbejderNrText.setBounds(190, 90, 300, 20);
		add(MedarbejderNrText);

		JLabel MedarbejderNavn = new JLabel("Tilføj Medarbejdernavn:");
		MedarbejderNavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderNavn.setBounds(30, 120, 160, 20);
		MedarbejderNavn.setForeground(Color.black);
		add(MedarbejderNavn);

		JTextField MedarbejderNavnText = new JTextField();
		MedarbejderNavnText.setBounds(190, 120, 300, 20);
		add(MedarbejderNavnText);

		JLabel MedarbejderAdresse = new JLabel("Tilføj Medarbejderadresse:");
		MedarbejderAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderAdresse.setBounds(30, 150, 160, 20);
		MedarbejderAdresse.setForeground(Color.black);
		add(MedarbejderAdresse);

		JTextField MedarbejderAdresseText = new JTextField();
		MedarbejderAdresseText.setBounds(190, 150, 300, 20);
		add(MedarbejderAdresseText);

		JLabel Medarbejderland = new JLabel("Tilføj Medarbejderland:");
		Medarbejderland.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Medarbejderland.setBounds(30, 180, 160, 20);
		Medarbejderland.setForeground(Color.black);
		add(Medarbejderland);

		JTextField MedarbejderlandText = new JTextField();
		MedarbejderlandText.setBounds(190, 180, 300, 20);
		add(MedarbejderlandText);

		JLabel MedarbejderPostNr= new JLabel("Tilføj Medarbejderpostnr:");
		MedarbejderPostNr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderPostNr.setBounds(30, 210, 160, 20);
		MedarbejderPostNr.setForeground(Color.black);
		add(MedarbejderPostNr);

		JTextField MedarbejderPostNrText = new JTextField();
		MedarbejderPostNrText.setBounds(190, 210, 300, 20);
		add(MedarbejderPostNrText);
		
		JLabel MedarbejderEmail= new JLabel("Tilføj MedarbejderEmail:");
		MedarbejderEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderEmail.setBounds(30, 240, 160, 20);
		MedarbejderEmail.setForeground(Color.black);
		add(MedarbejderEmail);

		JTextField MedarbejderEmailText = new JTextField();
		MedarbejderEmailText.setBounds(190, 240, 300, 20);
		add(MedarbejderEmailText);
		
		JLabel MedarbejderPassword = new JLabel("Tilføj Medarbejderpassword:");
		MedarbejderPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderPassword.setBounds(30, 270, 160, 20);
		MedarbejderPassword.setForeground(Color.black);
		add(MedarbejderPassword);

		JTextField MedarbejderPasswordText = new JTextField();
		MedarbejderPasswordText.setBounds(190, 270, 300, 20);
		add(MedarbejderPasswordText);
		
		JLabel MedarbejderLøn = new JLabel("Tilføj Medarbejderløn:");
		MedarbejderLøn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderLøn.setBounds(30, 300, 160, 20);
		MedarbejderLøn.setForeground(Color.black);
		add(MedarbejderLøn);

		JTextField MedarbejderLønText= new JTextField();
		MedarbejderLønText.setBounds(190, 300, 300, 20);
		add(MedarbejderLønText);
		
		JLabel MedarbejderLønType = new JLabel("Tilføj Medarbejderløntype:");
		MedarbejderLønType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderLønType.setBounds(30, 330, 160, 20);
		MedarbejderLønType.setForeground(Color.black);
		add(MedarbejderLønType);

		JTextField MedarbejderLønTypeText= new JTextField();
		MedarbejderLønTypeText.setBounds(190, 330, 300, 20);
		add(MedarbejderLønTypeText);
		
		JLabel MedarbejderCpr = new JLabel("Tilføj MedarbejderCpr.:");
		MedarbejderCpr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderCpr.setBounds(30, 360, 160, 20);
		MedarbejderCpr.setForeground(Color.black);
		add(MedarbejderCpr);

		JTextField MedarbejderCprText= new JTextField();
		MedarbejderCprText.setBounds(190, 360, 300, 20);
		add(MedarbejderCprText);
		
		JLabel MedarbejderStilling = new JLabel("Tilføj Medarbejderstilling:");
		MedarbejderStilling.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderStilling.setBounds(30, 390, 160, 20);
		MedarbejderStilling.setForeground(Color.black);
		add(MedarbejderStilling);

		JTextField MedarbejderStillingText= new JTextField();
		MedarbejderStillingText.setBounds(190, 390, 300, 20);
		add(MedarbejderStillingText);
		
		
		Button TilføjMedarbejder = new Button("Tilføj");
		TilføjMedarbejder.setBackground(new Color(255,215,10));;
		TilføjMedarbejder.setBounds(627, 28, 70, 22);
		TilføjMedarbejder.setForeground(Color.black);
		add(TilføjMedarbejder);

		Mtable1 = new JTable();
		Mtable1.setBounds(12, 10, 710, 57);
		Mtable1.setBackground(new Color(238, 238, 238));
		add(Mtable1);

		Mtable = new JTable();
		Mtable.setBounds(12, 71, 710, 405);
		Mtable.setBackground(new Color(238, 238, 238));
		add(Mtable);


	}

}
