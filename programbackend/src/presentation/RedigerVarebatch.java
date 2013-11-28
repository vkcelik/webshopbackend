package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.KategoriController;
import controller.VarebatchController;

public class RedigerVarebatch extends JPanel {
	
	private VarebatchController controller;
	private JTable VBtable;
	private JTable VBtable1;
	public JComboBox<String> combobox1;
	public JComboBox<String> combobox2;
	public JTextField lagerPlaceringText;
	public JTextField mængdeText;
	
	public RedigerVarebatch(){
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel TilføjVarebatch = new JLabel("Tilføj Varebatch");
		TilføjVarebatch.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/add32.png")));
		TilføjVarebatch.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjVarebatch.setForeground(Color.black);
		TilføjVarebatch.setBounds(30, 30, 250, 30);
		this.add(TilføjVarebatch);
		
		JLabel TilføjvareNummer = new JLabel("vareNummer:");
		TilføjvareNummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TilføjvareNummer.setBounds(140, 90, 140, 20);
		TilføjvareNummer.setForeground(Color.black);
		add(TilføjvareNummer);

		combobox1 = new JComboBox<String>();
		combobox1.setBounds(230, 90, 300, 20);
		add(combobox1);
		
		JLabel TilføjvareLager = new JLabel("vareLager:");
		TilføjvareLager.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TilføjvareLager.setBounds(140, 125, 140, 20);
		TilføjvareLager.setForeground(Color.black);
		add(TilføjvareLager);

		combobox2 = new JComboBox<String>();
		combobox2.setBounds(230, 125, 300, 20);
		add(combobox2);
		
		JLabel TilføjlagerPlacering= new JLabel("lagerPlacering:");
		TilføjlagerPlacering.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TilføjlagerPlacering.setBounds(140, 155, 140, 20);
		TilføjlagerPlacering.setForeground(Color.black);
		add(TilføjlagerPlacering);
		
		lagerPlaceringText = new JTextField();
		lagerPlaceringText.setBounds(230, 155, 303, 20);
		add(lagerPlaceringText);
		
		JLabel Tilføjmængde= new JLabel("Mængde:");
		Tilføjmængde.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Tilføjmængde.setBounds(140, 185, 140, 20);
		Tilføjmængde.setForeground(Color.black);
		add(Tilføjmængde);
		
		mængdeText = new JTextField();
		mængdeText.setBounds(230, 185, 303, 20);
		add(mængdeText);
		
		Button TilføjVarebatch1 = new Button("Tilføj");
		TilføjVarebatch1.setBackground(new Color(255,215,10));
		TilføjVarebatch1.setBounds(460, 220, 70, 22);
		TilføjVarebatch1.setForeground(Color.black);
		add(TilføjVarebatch1);
		
		TilføjVarebatch1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.updateVarebatch(combobox1, combobox2, lagerPlaceringText, mængdeText);
			}
		});
		
		VBtable1 = new JTable();
		VBtable1.setBounds(12, 10, 710, 57);
		VBtable1.setBackground(new Color(238, 238, 238));
		add(VBtable1);

		VBtable = new JTable();
		VBtable.setBounds(12, 71, 710, 405);
		VBtable.setBackground(new Color(238, 238, 238));
		add(VBtable);
	}

	public void setController(VarebatchController controller){
		this.controller = controller;
	}
}
