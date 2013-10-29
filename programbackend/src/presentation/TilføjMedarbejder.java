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

		JLabel Fornavn = new JLabel("Tilføj Fornavn:");
		Fornavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Fornavn.setBounds(30, 90, 130, 20);
		Fornavn.setForeground(Color.black);
		add(Fornavn);

		JTextField FornavnText = new JTextField();
		FornavnText.setBounds(145, 90, 300, 20);
		add(FornavnText);

		JLabel Efternavn = new JLabel("Tilføj Efternavn:");
		Efternavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Efternavn.setBounds(30, 120, 130, 20);
		Efternavn.setForeground(Color.black);
		add(Efternavn);

		JTextField EfternavnText = new JTextField();
		EfternavnText.setBounds(145, 120, 300, 20);
		add(EfternavnText);

		JLabel Jobtitel = new JLabel("Tilføj Jobtitel:");
		Jobtitel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Jobtitel.setBounds(30, 150, 130, 20);
		Jobtitel.setForeground(Color.black);
		add(Jobtitel);

		JTextField JobtitelText = new JTextField();
		JobtitelText.setBounds(145, 150, 300, 20);
		add(JobtitelText);

		JLabel Telefon = new JLabel("Tilføj Telefon:");
		Telefon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Telefon.setBounds(30, 180, 130, 20);
		Telefon.setForeground(Color.black);
		add(Telefon);

		JTextField TelefonText = new JTextField();
		TelefonText.setBounds(145, 180, 300, 20);
		add(TelefonText);

		JLabel Email = new JLabel("Tilføj Email:");
		Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email.setBounds(30, 210, 130, 20);
		Email.setForeground(Color.black);
		add(Email);

		JTextField EmailText = new JTextField();
		EmailText.setBounds(145, 210, 300, 20);
		add(EmailText);

		Button TilføjMedarbejder = new Button("Tilføj");
		TilføjMedarbejder.setBackground(Color.lightGray);
		TilføjMedarbejder.setBounds(140, 245, 70, 22);
		TilføjMedarbejder.setForeground(Color.black);
		add(TilføjMedarbejder);

		table1 = new JTable();
		table1.setBounds(12, 10, 622, 57);
		table1.setBackground(new Color(238, 238, 238));
		add(table1);

		table = new JTable();
		table.setBounds(12, 71, 622, 340);
		table.setBackground(new Color(238, 238, 238));
		add(table);


	}

}
