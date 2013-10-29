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


	private static final long serialVersionUID = 5071882250822418125L;
	private JTable table;
	private JTable table1;


	public TilføjMedarbejder() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel Label = new JLabel("Tilføj Medarbejder");
		Label.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/addM.png")));
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.black);
		Label.setBounds(30, 30, 260, 30);
		this.add(Label);

		JLabel Fornavn = new JLabel("Tilføj MedarbejderNr.:");
		Fornavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Fornavn.setBounds(30, 90, 150, 20);
		Fornavn.setForeground(Color.black);
		add(Fornavn);

		JTextField FornavnText = new JTextField();
		FornavnText.setBounds(190, 90, 300, 20);
		add(FornavnText);

		JLabel Efternavn = new JLabel("Tilføj Medarbejdernavn:");
		Efternavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Efternavn.setBounds(30, 120, 160, 20);
		Efternavn.setForeground(Color.black);
		add(Efternavn);

		JTextField EfternavnText = new JTextField();
		EfternavnText.setBounds(190, 120, 300, 20);
		add(EfternavnText);

		JLabel Jobtitel = new JLabel("Tilføj Medarbejderadresse:");
		Jobtitel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Jobtitel.setBounds(30, 150, 160, 20);
		Jobtitel.setForeground(Color.black);
		add(Jobtitel);

		JTextField JobtitelText = new JTextField();
		JobtitelText.setBounds(190, 150, 300, 20);
		add(JobtitelText);

		JLabel Telefon = new JLabel("Tilføj Medarbejderland:");
		Telefon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Telefon.setBounds(30, 180, 160, 20);
		Telefon.setForeground(Color.black);
		add(Telefon);

		JTextField TelefonText = new JTextField();
		TelefonText.setBounds(190, 180, 300, 20);
		add(TelefonText);

		JLabel Email = new JLabel("Tilføj Medarbejderpostnr.:");
		Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email.setBounds(30, 210, 160, 20);
		Email.setForeground(Color.black);
		add(Email);

		JTextField EmailText = new JTextField();
		EmailText.setBounds(190, 210, 300, 20);
		add(EmailText);
		
		JLabel Email1 = new JLabel("Tilføj MedarbejderEmail:");
		Email1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email1.setBounds(30, 240, 160, 20);
		Email1.setForeground(Color.black);
		add(Email1);

		JTextField EmailText1 = new JTextField();
		EmailText1.setBounds(190, 240, 300, 20);
		add(EmailText1);
		
		JLabel Email12 = new JLabel("Tilføj Medarbejderpassword:");
		Email12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email12.setBounds(30, 270, 160, 20);
		Email12.setForeground(Color.black);
		add(Email12);

		JTextField EmailText12 = new JTextField();
		EmailText12.setBounds(190, 270, 300, 20);
		add(EmailText12);
		
		JLabel Email123 = new JLabel("Tilføj Medarbejderløn:");
		Email123.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email123.setBounds(30, 300, 160, 20);
		Email123.setForeground(Color.black);
		add(Email123);

		JTextField Emaitext12= new JTextField();
		Emaitext12.setBounds(190, 300, 300, 20);
		add(Emaitext12);
		
		JLabel Email1234 = new JLabel("Tilføj Medarbejderløntype.:");
		Email1234.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email1234.setBounds(30, 330, 160, 20);
		Email1234.setForeground(Color.black);
		add(Email1234);

		JTextField Emaitext1245= new JTextField();
		Emaitext1245.setBounds(190, 330, 300, 20);
		add(Emaitext1245);
		
		JLabel Email12345 = new JLabel("Tilføj MedarbejderCpr.:");
		Email12345.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email12345.setBounds(30, 360, 160, 20);
		Email12345.setForeground(Color.black);
		add(Email12345);

		JTextField Emaitext12455= new JTextField();
		Emaitext12455.setBounds(190, 360, 300, 20);
		add(Emaitext12455);
		
		JLabel Email1234567 = new JLabel("Tilføj Medarbejderstilling:");
		Email1234567.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email1234567.setBounds(30, 390, 160, 20);
		Email1234567.setForeground(Color.black);
		add(Email1234567);

		JTextField Emaitext124525= new JTextField();
		Emaitext124525.setBounds(190, 390, 300, 20);
		add(Emaitext124525);
		
		
		

		Button TilføjMedarbejder = new Button("Tilføj");
		TilføjMedarbejder.setBackground(new Color(255,215,10));;
		TilføjMedarbejder.setBounds(627, 28, 70, 22);
		TilføjMedarbejder.setForeground(Color.black);
		add(TilføjMedarbejder);

		table1 = new JTable();
		table1.setBounds(12, 10, 710, 57);
		table1.setBackground(new Color(238, 238, 238));
		add(table1);

		table = new JTable();
		table.setBounds(12, 71, 710, 405);
		table.setBackground(new Color(238, 238, 238));
		add(table);


	}

}
