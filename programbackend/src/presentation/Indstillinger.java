package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import controller.IndstillingerController;
import controller.VareController;

public class Indstillinger extends JPanel {
	
	private static final long serialVersionUID = -4449413241907178775L;
	private IndstillingerController controller;
	private JTable SEItable;
	private JTable SEItable1;

	public Indstillinger() {
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel indstillinger = new JLabel("Indstillinger");
		indstillinger.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		indstillinger.setFont(new Font("sansserif", Font.BOLD, 24));
		indstillinger.setForeground(Color.black);
		indstillinger.setBounds(30, 30, 200, 30);
		this.add(indstillinger);

		SEItable = new JTable();
		SEItable.setBounds(12, 71, 710, 405);
		SEItable.setBackground(new Color(238, 238, 238));
		add(SEItable);
		
		
		SEItable1 = new JTable();
		SEItable1.setBounds(12, 10, 710, 57);
		SEItable1.setBackground(new Color(238, 238, 238));
		add(SEItable1);
		
	}

	public void setController(IndstillingerController indstillingerController) {
		this.controller = indstillingerController;
	}

}
