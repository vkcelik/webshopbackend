package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import logic.dto.KategoriDTO;



public class TilføjKategori extends JPanel {


	
	private JTable Ktable;
	private JTable Ktable1;
	JComboBox<String> combobox1;

	public TilføjKategori() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel TilføjKategori = new JLabel("Tilføj Kategori");
		TilføjKategori.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/add32.png")));
		TilføjKategori.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjKategori.setForeground(Color.black);
		TilføjKategori.setBounds(30, 30, 200, 30);
		this.add(TilføjKategori);

		JLabel TilføjKategorinavn = new JLabel("Kategorinavn:");
		TilføjKategorinavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TilføjKategorinavn.setBounds(30, 90, 140, 20);
		TilføjKategorinavn.setForeground(Color.black);
		add(TilføjKategorinavn);

		JTextField kattegorinavnText = new JTextField();
		kattegorinavnText.setBounds(160, 90, 300, 20);
		add(kattegorinavnText);
		

		Button TilføjKategori1 = new Button("Tilføj");
		TilføjKategori1.setBackground(new Color(255,215,10));
		TilføjKategori1.setBounds(391, 160, 70, 22);
		TilføjKategori1.setForeground(Color.black);
		add(TilføjKategori1);

		Ktable1 = new JTable();
		Ktable1.setBounds(12, 10, 710, 57);
		Ktable1.setBackground(new Color(238, 238, 238));
		add(Ktable1);
		
		JLabel TilføjOverKategori = new JLabel("Over kategori:");
		TilføjOverKategori.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TilføjOverKategori.setBounds(30, 120, 140, 20);
		TilføjOverKategori.setForeground(Color.black);
		add(TilføjOverKategori);
		
		String Kategori1[] = {"Vælg kategori","Assaad","Fadi","Ziad","Ayhan","Kerim"};
		combobox1 = new JComboBox<String>(Kategori1);
		combobox1.setBounds(160, 120, 300, 20);
		add(combobox1);
		
		
		Ktable = new JTable();
		Ktable.setBounds(12, 71, 710, 405);
		Ktable.setBackground(new Color(238, 238, 238));
		add(Ktable);


	}

}
