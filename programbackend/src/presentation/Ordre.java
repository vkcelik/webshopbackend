package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import controller.OrdreController;



public class Ordre extends JPanel {

	private static final long serialVersionUID = 807936107106094470L;
	private JTable SOtable;
	private JTable SOtable1;
	private OrdreController controller;

	public Ordre() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeOrdre = new JLabel("Se Ordre");
		SeOrdre.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
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

	public void setController(OrdreController ordreController) {
		this.controller = ordreController;
	}

}
