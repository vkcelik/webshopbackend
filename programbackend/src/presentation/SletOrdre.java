package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SletOrdre extends JPanel {

	
	private JTable SOtable;
	private JTable SOtable1;

	public SletOrdre() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SletOrdre = new JLabel("Slet Ordre");
		SletOrdre.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/delete.png")));
		SletOrdre.setFont(new Font("sansserif", Font.BOLD, 24));
		SletOrdre.setForeground(Color.black);
		SletOrdre.setBounds(30, 30, 200, 30);
		this.add(SletOrdre);

		SOtable = new JTable();
		SOtable.setBounds(12, 71, 710, 405);
		SOtable.setBackground(new Color(238, 238, 238));
		add(SOtable);
		
		
		SOtable1 = new JTable();
		SOtable1.setBounds(12, 10, 710, 57);
		SOtable1.setBackground(new Color(238, 238, 238));
		add(SOtable1);
		


	}

}
