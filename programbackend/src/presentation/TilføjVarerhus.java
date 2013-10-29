package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;



public class TilføjVarerhus extends JPanel {
	
	private static final long serialVersionUID = 5458623455865113615L;
	private JTable table;
	private JTable table1;
	
	public TilføjVarerhus() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel TilføjVarehus = new JLabel("Tilføj Varerhus");
		TilføjVarehus.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/add32.png")));
		TilføjVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjVarehus.setForeground(Color.black);
		TilføjVarehus.setBounds(30, 30, 200, 30);
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
		
		table1 = new JTable();
		table1.setBounds(12, 10, 622, 57);
		table1.setBackground(new Color(238, 238, 238));
		add(table1);
		
		table = new JTable();
		table.setBounds(12, 71, 622, 340);
		table.setBackground(new Color(238, 238, 238));
		add(table);

	
		
	}

}
