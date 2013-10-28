package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;



public class TilføjVarerhus extends JPanel {
	
	private JTable table;
	
	public TilføjVarerhus() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
		
		JLabel TilføjVarehus = new JLabel("Tilføj Varerhus");
		TilføjVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjVarehus.setForeground(Color.white);
		TilføjVarehus.setBounds(26, 30, 200, 30);
		this.add(TilføjVarehus);
		
		JLabel varehusnavn = new JLabel("Tilføj Varerhusnavn:");
		varehusnavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		varehusnavn.setBounds(30, 90, 120, 20);
		varehusnavn.setForeground(Color.black);
		add(varehusnavn);
		
		JTextField varehusnavnText = new JTextField();
		varehusnavnText.setBounds(170, 90, 300, 20);
		add(varehusnavnText);
		
		JLabel varehusnr = new JLabel("Tilføj Varerhusnummer:");
		varehusnr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		varehusnr.setBounds(30, 120, 130, 20);
		varehusnr.setForeground(Color.black);
		add(varehusnr);
		
		JTextField varehusnrText = new JTextField();
		varehusnrText.setBounds(170, 120, 300, 20);
		add(varehusnrText);
		
		JLabel varehusadresse = new JLabel("Tilføj Varerhusadresse:");
		varehusadresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		varehusadresse.setBounds(30, 150, 130, 20);
		varehusadresse.setForeground(Color.black);
		add(varehusadresse);
		
		JTextField varehusadresseText = new JTextField();
		varehusadresseText.setBounds(170, 150, 300, 20);
		add(varehusadresseText);
		
		Button TilføjVarerhus = new Button("Tilføj");
		TilføjVarerhus.setBackground(Color.lightGray);
		TilføjVarerhus.setBounds(170, 185, 70, 22);
		TilføjVarerhus.setForeground(Color.black);
		add(TilføjVarerhus);
		
		table = new JTable();
		table.setBounds(26, 71, 596, 333);
		table.setBackground(new Color(238, 238, 238));
		add(table);

	
		
	}

}
