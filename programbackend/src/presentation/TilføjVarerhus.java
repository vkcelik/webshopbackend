package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;



public class TilføjVarerhus extends JPanel {
	

	private JTable VHtable;
	private JTable VHtable1;
	
	public TilføjVarerhus() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel TilføjVarehus = new JLabel("Tilføj Varerhus");
		TilføjVarehus.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/add32.png")));
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
		varehusnavnText.setBounds(230, 90, 300, 20);
		add(varehusnavnText);
		
		
		JLabel varehusadresse = new JLabel("Adresse:");
		varehusadresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		varehusadresse.setBounds(160, 120, 130, 20);
		varehusadresse.setForeground(Color.black);
		add(varehusadresse);
		
		JTextField varehusadresseText = new JTextField();
		varehusadresseText.setBounds(230, 120, 300, 20);
		add(varehusadresseText);
		
		JLabel BeskrivelseVarehus = new JLabel("Beskrivelse:");
		BeskrivelseVarehus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		BeskrivelseVarehus.setBounds(160, 150, 110, 20);
		BeskrivelseVarehus.setForeground(Color.black);
		add(BeskrivelseVarehus);
		
		JTextPane BeskrivelseVarehusText = new JTextPane();
		BeskrivelseVarehusText.setBackground(UIManager.getColor("TextPane.background"));
		BeskrivelseVarehusText.setBounds(230, 155, 300, 150);
		add(BeskrivelseVarehusText);
		
		Button TilføjVarerhus = new Button("Tilføj");
		TilføjVarerhus.setBackground(new Color(255,215,10));
		TilføjVarerhus.setBounds(460, 320, 70, 22);
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

}
