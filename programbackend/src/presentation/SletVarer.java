package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SletVarer extends JPanel {

	
	private JTable SVtable;
	private JTable SVtable1;

	public SletVarer() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SletVare = new JLabel("Slet Varer");
		SletVare.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/delete.png")));
		SletVare.setFont(new Font("sansserif", Font.BOLD, 24));
		SletVare.setForeground(Color.black);
		SletVare.setBounds(30, 30, 200, 30);
		this.add(SletVare);

		SVtable = new JTable();
		SVtable.setBounds(12, 71, 710, 405);
		SVtable.setBackground(new Color(238, 238, 238));
		add(SVtable);
		
		
		SVtable1 = new JTable();
		SVtable1.setBounds(12, 10, 710, 57);
		SVtable1.setBackground(new Color(238, 238, 238));
		add(SVtable1);
		


	}

}
