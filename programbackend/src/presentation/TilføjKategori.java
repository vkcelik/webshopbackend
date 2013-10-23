package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TilføjKategori extends JPanel {

	public TilføjKategori() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
		
		JLabel TilføjKategori = new JLabel("Tilføj Kategori");
		TilføjKategori.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjKategori.setForeground(Color.white);
		TilføjKategori.setBounds(26, 30, 200, 30);
		this.add(TilføjKategori);
		
		JLabel TilføjKategorinavn = new JLabel("Tilføj Kategorinavn:");
		TilføjKategorinavn.setBounds(26, 90, 140, 20);
		TilføjKategorinavn.setForeground(Color.white);
		add(TilføjKategorinavn);
		
		JTextField kattegorinavnText = new JTextField();
		kattegorinavnText.setBounds(150, 90, 300, 20);
		add(kattegorinavnText);
		
		
		Button TilføjKategori1 = new Button("Tilføj");
		TilføjKategori1.setBackground(Color.lightGray);
		TilføjKategori1.setBounds(150, 150, 70, 22);
		TilføjKategori1.setForeground(Color.black);
		add(TilføjKategori1);
		
	}

}
