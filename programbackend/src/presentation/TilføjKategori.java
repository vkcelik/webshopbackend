package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;



public class TilføjKategori extends JPanel {
	
		private JTable table;
		private JTable table1;
		
		public TilføjKategori() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel TilføjKategori = new JLabel("Tilføj Kategori");
		TilføjKategori.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/add32.png")));
		TilføjKategori.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjKategori.setForeground(Color.black);
		TilføjKategori.setBounds(30, 30, 200, 30);
		this.add(TilføjKategori);
		
		JLabel TilføjKategorinavn = new JLabel("Tilføj Kategorinavn:");
		TilføjKategorinavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TilføjKategorinavn.setBounds(30, 90, 140, 20);
		TilføjKategorinavn.setForeground(Color.black);
		add(TilføjKategorinavn);
		
		JTextField kattegorinavnText = new JTextField();
		kattegorinavnText.setBounds(155, 92, 300, 20);
		add(kattegorinavnText);
		
		
		Button TilføjKategori1 = new Button("Tilføj");
		TilføjKategori1.setBackground(Color.lightGray);
		TilføjKategori1.setBounds(155, 150, 70, 22);
		TilføjKategori1.setForeground(Color.black);
		add(TilføjKategori1);
		
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
