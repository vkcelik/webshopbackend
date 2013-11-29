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

import controller.KategoriController;
import controller.LeveringsmetodeController;

/**
* @author  Fadi abdul halim  
*/

public class TilføjLeveringsmetode extends JPanel {
	private LeveringsmetodeController controller;
	public JTextField metodeNavn;
	public JTextField metodePris;
	private JTable table;
	private JTable table1;

	public TilføjLeveringsmetode(){

		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel TilføjVarehus = new JLabel("Tilføj Leveringmetode");
		TilføjVarehus.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/add32.png")));
		TilføjVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjVarehus.setForeground(Color.black);
		TilføjVarehus.setBounds(30, 30, 300, 30);
		this.add(TilføjVarehus);

		JLabel lab1 = new JLabel("Metodenavn:");
		lab1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lab1.setBounds(160, 120, 130, 20);
		lab1.setForeground(Color.black);
		add(lab1);

		metodeNavn = new JTextField();
		metodeNavn.setBounds(240, 120, 300, 20);
		add(metodeNavn);

		JLabel lab2 = new JLabel("Metodepris:");
		lab2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lab2.setBounds(160, 150, 130, 20);
		lab2.setForeground(Color.black);
		add(lab2);

		metodePris = new JTextField();
		metodePris.setBounds(240, 150, 300, 20);
		add(metodePris);

		Button tilfoej = new Button("Tilføj");
		tilfoej.setBackground(new Color(255,215,10));
		tilfoej.setBounds(468, 190, 70, 22);
		tilfoej.setForeground(Color.black);
		add(tilfoej);

		tilfoej.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.tilføjLeveringsmetode(metodeNavn, metodePris);
			}
		});

		table1 = new JTable();
		table1.setBounds(12, 10, 710, 57);
		table1.setBackground(new Color(238, 238, 238));
		add(table1);

		table = new JTable();
		table.setBounds(12, 71, 710, 405);
		table.setBackground(new Color(238, 238, 238));
		add(table);

	}

	public void setController(LeveringsmetodeController controller){
		this.controller = controller;
	}
}
