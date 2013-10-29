package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SeOrdre extends JPanel {

	private static final long serialVersionUID = -4220041822384340454L;
	private JTable SOtable;
	private JTable SOtable1;

	public SeOrdre() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeOrdre = new JLabel("Se Ordre");
		SeOrdre.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/Run.png")));
		SeOrdre.setFont(new Font("sansserif", Font.BOLD, 24));
		SeOrdre.setForeground(Color.black);
		SeOrdre.setBounds(30, 30, 200, 30);
		this.add(SeOrdre);

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