package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import controller.VarehusController;



public class TilføjVarehus extends JPanel {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5911075244950799116L;
	private JTable VHtable;
	private JTable VHtable1;
	private VarehusController controller;
	
	public TilføjVarehus() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel TilføjVarehus = new JLabel("Tilføj Varerhus");
		TilføjVarehus.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/add32.png")));
		TilføjVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjVarehus.setForeground(Color.black);
		TilføjVarehus.setBounds(30, 30, 200, 30);
		this.add(TilføjVarehus);
		
		JLabel varehusnavn = new JLabel("Navn:");
		varehusnavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		varehusnavn.setBounds(160, 90, 120, 20);
		varehusnavn.setForeground(Color.black);
		add(varehusnavn);
		
		JTextField varehusnavnText = new JTextField();
		varehusnavnText.setBounds(240, 90, 300, 20);
		add(varehusnavnText);
		
		
		JLabel varehusadresse = new JLabel("Adresse:");
		varehusadresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		varehusadresse.setBounds(160, 120, 130, 20);
		varehusadresse.setForeground(Color.black);
		add(varehusadresse);
		
		JTextField varehusadresseText = new JTextField();
		varehusadresseText.setBounds(240, 120, 300, 20);
		add(varehusadresseText);
		
		JLabel PostVarehus = new JLabel("Postnr.:");
		PostVarehus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PostVarehus.setBounds(160, 150, 110, 20);
		PostVarehus.setForeground(Color.black);
		add(PostVarehus);
		
		JTextField PostVarehusText = new JTextField();
		PostVarehusText.setBounds(240, 150, 300, 20);
		add(PostVarehusText);
		
		JLabel Leveringstid = new JLabel("Leveringstid:");
		Leveringstid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Leveringstid.setBounds(160, 180, 110, 20);
		Leveringstid.setForeground(Color.black);
		add(Leveringstid);
		
		JTextField LeveringstidText = new JTextField();
		LeveringstidText.setBounds(240, 180, 300, 20);
		add(LeveringstidText);
		
		Button TilføjVarerhus = new Button("Tilføj");
		TilføjVarerhus.setBackground(new Color(255,215,10));
		TilføjVarerhus.setBounds(468, 215, 70, 22);
		TilføjVarerhus.setForeground(Color.black);
		add(TilføjVarerhus);
		
		VHtable1 = new JTable();
		VHtable1.setBounds(12, 10, 710, 57);
		VHtable1.setBackground(new Color(238, 238, 238));
		add(VHtable1);

		VHtable = new JTable();
		VHtable.setBounds(12, 71, 710, 405);
		VHtable.setBackground(new Color(238, 238, 238));
		add(VHtable);


	
		
	}

	public void setController(VarehusController varehusController) {
		this.controller = varehusController;
	}

}
