package presentation;



import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Button;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JComboBox;

import controller.VareController;
import logic.dto.KategoriDTO;
import data.connect.Connector;
import data.dao.MySQLKategoriDAO;
import data.idao.DALException;




public class TilføjVare extends JPanel {

	private static final long serialVersionUID = -2533980648166217598L;
	private JTable Vtable;
	private JTable Vtable1;
	JComboBox<String> combobox;
	private VareController controller;


	public TilføjVare() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel VareLabel = new JLabel("Tilføj Varer");
		VareLabel.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/add32.png")));
		VareLabel.setFont(new Font("sansserif", Font.BOLD, 24));
		VareLabel.setForeground(Color.black);
		VareLabel.setBounds(30, 28, 180, 32);
		this.add(VareLabel);


		JLabel VareNavn = new JLabel("Varenavn:");
		VareNavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		VareNavn.setBounds(150, 90, 120, 20);
		VareNavn.setForeground(Color.black);
		add(VareNavn);


		JTextField VareNavnText = new JTextField();
		VareNavnText.setBounds(230, 90, 300, 20);
		add(VareNavnText);

		JLabel Pris = new JLabel("Pris:");
		Pris.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Pris.setBounds(150, 120, 110, 20);
		Pris.setForeground(Color.black);
		add(Pris);

		JTextField PrisText = new JTextField();
		PrisText.setBounds(230, 120, 300, 20);
		add(PrisText);

		JLabel KategoriNummer = new JLabel("Kategori:");
		KategoriNummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KategoriNummer.setBounds(150, 150, 130, 20);
		KategoriNummer.setForeground(Color.black);
		add(KategoriNummer);

		JLabel Vægt = new JLabel("Vægt:");
		Vægt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Vægt.setBounds(150, 180, 110, 20);
		Vægt.setForeground(Color.black);
		add(Vægt);

		JTextField VægtText = new JTextField();
		VægtText.setBounds(230, 180, 300, 20);
		add(VægtText);

		JLabel Bredde = new JLabel("Bredde:");
		Bredde.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Bredde.setBounds(150, 210, 110, 20);
		Bredde.setForeground(Color.black);
		add(Bredde);

		JTextField BreddeText = new JTextField();
		BreddeText.setBounds(230, 210, 300, 20);
		add(BreddeText);

		JLabel Dybde = new JLabel("Dybde:");
		Dybde.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Dybde.setBounds(150, 240, 110, 20);
		Dybde.setForeground(Color.black);
		add(Dybde);

		JTextField DybdeText = new JTextField();
		DybdeText.setBounds(230, 240, 300, 20);
		add(DybdeText);

		JLabel Højde = new JLabel("Højde:");
		Højde.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Højde.setBounds(150, 270, 110, 20);
		Højde.setForeground(Color.black);
		add(Højde);

		JTextField HøjdeText = new JTextField();
		HøjdeText.setBounds(230, 270, 300, 20);
		add(HøjdeText);

		JLabel Beskrivelse = new JLabel("Beskrivelse:");
		Beskrivelse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Beskrivelse.setBounds(150, 300, 110, 20);
		Beskrivelse.setForeground(Color.black);
		add(Beskrivelse);

		JTextPane BeskrivelseText = new JTextPane();
		BeskrivelseText.setBackground(UIManager.getColor("TextPane.background"));
		BeskrivelseText.setBounds(230, 305, 300, 100);
		add(BeskrivelseText);

		JLabel billeder = new JLabel("Billeder");
		billeder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		billeder.setBounds(150, 420, 110, 20);
		billeder.setForeground(Color.black);
		add(billeder);
		
		JTextField billederText = new JTextField();
		billederText.setBounds(230, 420, 300, 20);
		add(billederText);
		
		Button TilføjVarer = new Button("Tilføj");
		TilføjVarer.setBackground(new Color(255,215,10));
		TilføjVarer.setBounds(460, 445, 70, 22);
		TilføjVarer.setForeground(Color.black);
		add(TilføjVarer);


		Vtable1 = new JTable();
		Vtable1.setBounds(12, 10, 710, 57);
		Vtable1.setAutoResizeMode(HEIGHT);
		Vtable1.setBackground(new Color(238, 238, 238));
		add(Vtable1);

		// Opretter comboxen med navnene fra herover
		combobox = new JComboBox<String>();
		combobox.setBounds(230, 151, 300, 20);
		add(combobox);

		Vtable = new JTable();
		Vtable.setBounds(12, 71, 710, 405);
		Vtable.setBackground(new Color(238, 238, 238));
		add(Vtable);

	}


	public void setController(VareController vareController) {
		this.controller = vareController;
	}
}
