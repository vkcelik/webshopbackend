package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.IndstillingerController;
import controller.VareController;

public class Indstillinger extends JPanel {
	
	private static final long serialVersionUID = -4449413241907178775L;
	private IndstillingerController controller;
	private JTable SEItable;
	private JTable SEItable1;
	public JTextField antal;
	public JTextField ikkePåLager;
	public JTextField moms;
	public JTextField godkend;
	
	public Indstillinger() {
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel indstillinger = new JLabel("Indstillinger");
		indstillinger.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		indstillinger.setFont(new Font("sansserif", Font.BOLD, 24));
		indstillinger.setForeground(Color.black);
		indstillinger.setBounds(30, 30, 200, 30);
		this.add(indstillinger);

		JLabel ind1 = new JLabel("Antal per side:");
		ind1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ind1.setBounds(140, 90, 140, 20);
		ind1.setForeground(Color.black);
		add(ind1);

		antal = new JTextField();
		antal.setBounds(230, 90, 300, 20);
		add(antal);

		JLabel ind2 = new JLabel("Bestilling af varer som ikke er lager:");
		ind2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ind2.setBounds(30, 120, 200, 20);
		ind2.setForeground(Color.black);
		add(ind2);

		ikkePåLager = new JTextField();
		ikkePåLager.setBounds(230, 120, 300, 20);
		add(ikkePåLager);
		
		JLabel ind3 = new JLabel("Momsprocent:");
		ind3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ind3.setBounds(140, 150, 200, 20);
		ind3.setForeground(Color.black);
		add(ind3);

		moms = new JTextField();
		moms.setBounds(230, 150, 300, 20);
		add(moms);
		
		JLabel ind4 = new JLabel("Godkend ordre automatisk:");
		ind4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ind4.setBounds(70, 180, 200, 20);
		ind4.setForeground(Color.black);
		add(ind4);

		godkend = new JTextField();
		godkend.setBounds(230, 180, 300, 20);
		add(godkend);
		
		Button gem = new Button("Gem");
		gem.setBackground(new Color(255,215,10));
		gem.setBounds(460, 205, 70, 22);
		gem.setForeground(Color.black);
		add(gem);

		gem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(controller);
				controller.updateIndstillinger(antal, ikkePåLager, moms, godkend);
			}
		});
		
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
