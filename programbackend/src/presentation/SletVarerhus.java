package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SletVarerhus extends JPanel {



	private JTable SVHtable;
	private JTable SVHtable1;

	public SletVarerhus() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SletVarehus = new JLabel("Slet varerhus");
		SletVarehus.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/delete.png")));
		SletVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		SletVarehus.setForeground(Color.black);
		SletVarehus.setBounds(30, 30, 200, 30);
		this.add(SletVarehus);


		SVHtable = new JTable();
		SVHtable.setBounds(12, 71, 710, 405);
		SVHtable.setBackground(new Color(238, 238, 238));
		add(SVHtable);
		
		
		SVHtable1 = new JTable();
		SVHtable1.setBounds(12, 10, 710, 57);
		SVHtable1.setBackground(new Color(238, 238, 238));
		add(SVHtable1);
		
		
	}

}
