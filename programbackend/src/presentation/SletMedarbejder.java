package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SletMedarbejder extends JPanel {

	
	private JTable SMtable;
	private JTable SMtable1;

	public SletMedarbejder() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SletMedarbejder = new JLabel("Slet Medarbejder");
		SletMedarbejder.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/delete.png")));
		SletMedarbejder.setFont(new Font("sansserif", Font.BOLD, 24));
		SletMedarbejder.setForeground(Color.black);
		SletMedarbejder.setBounds(30, 30,300, 30);
		this.add(SletMedarbejder);

		SMtable = new JTable();
		SMtable.setBounds(12, 71, 710, 405);
		SMtable.setBackground(new Color(238, 238, 238));
		add(SMtable);
		
		
		SMtable1 = new JTable();
		SMtable1.setBounds(12, 10, 710, 57);
		SMtable1.setBackground(new Color(238, 238, 238));
		add(SMtable1);
		
	}

}
