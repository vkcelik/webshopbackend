package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SletKategori extends JPanel {

	
	private JTable SKtable;
	private JTable SKtable1;

	public SletKategori() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SletKategori = new JLabel("Slet Kategori");
		SletKategori.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/delete.png")));
		SletKategori.setFont(new Font("sansserif", Font.BOLD, 24));
		SletKategori.setForeground(Color.black);
		SletKategori.setBounds(30, 30, 200, 30);
		this.add(SletKategori);

		SKtable = new JTable();
		SKtable.setBounds(12, 71, 710, 405);
		SKtable.setBackground(new Color(238, 238, 238));
		add(SKtable);
		
		
		SKtable1 = new JTable();
		SKtable1.setBounds(12, 10, 710, 57);
		SKtable1.setBackground(new Color(238, 238, 238));
		add(SKtable1);


	}

}
