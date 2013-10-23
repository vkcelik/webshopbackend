package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TilføjVarerhus extends JPanel {

	public TilføjVarerhus() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
		
		JLabel TilføjVarehus = new JLabel("Tilføj Varerhus");
		TilføjVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjVarehus.setForeground(Color.white);
		TilføjVarehus.setBounds(26, 30, 200, 30);
		this.add(TilføjVarehus);
		
		JLabel varehusnavn = new JLabel("Tilføj Varehusnavn:");
		varehusnavn.setBounds(26, 90, 120, 20);
		varehusnavn.setForeground(Color.white);
		add(varehusnavn);
		
		JTextField varehusnavnText = new JTextField();
		varehusnavnText.setBounds(165, 90, 300, 20);
		add(varehusnavnText);
		
		JLabel varehusnr = new JLabel("Tilføj Varehusnummer:");
		varehusnr.setBounds(26, 120, 130, 20);
		varehusnr.setForeground(Color.white);
		add(varehusnr);
		
		JTextField varehusnrText = new JTextField();
		varehusnrText.setBounds(165, 120, 300, 20);
		add(varehusnrText);
		
		JLabel varehusadresse = new JLabel("Tilføj Varehusadresse:");
		varehusadresse.setBounds(26, 150, 130, 20);
		varehusadresse.setForeground(Color.white);
		add(varehusadresse);
		
		JTextField varehusadresseText = new JTextField();
		varehusadresseText.setBounds(165, 150, 300, 20);
		add(varehusadresseText);
		
		Button TilføjVarerhus = new Button("Tilføj");
		TilføjVarerhus.setBackground(Color.lightGray);
		TilføjVarerhus.setBounds(165, 185, 70, 22);
		TilføjVarerhus.setForeground(Color.black);
		add(TilføjVarerhus);
		
		

	
		
	}

}
