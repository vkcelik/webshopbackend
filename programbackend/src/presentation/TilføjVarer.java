package presentation;



import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.UIManager;




public class TilføjVarer extends JPanel {
	
	
		private JTable table;
		private JTable table1;
	
		public TilføjVarer() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel Label = new JLabel("Tilføj Varer");
		Label.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/add32.png")));
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.black);
		Label.setBounds(30, 28, 180, 32);
		this.add(Label);
		
		JLabel vare = new JLabel("Tilføj varenummer:");
		vare.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare.setBounds(30, 90, 120, 20);
		vare.setForeground(Color.black);
		add(vare);
		
		JTextField textField = new JTextField();
		textField.setBounds(160, 90, 300, 20);
		add(textField);
		
		JLabel vare1 = new JLabel("Tilføj varenavn:");
		vare1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare1.setBounds(30, 120, 110, 20);
		vare1.setForeground(Color.black);
		add(vare1);
		
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(160, 120, 300, 20);
		add(textField1);
		
		JLabel vare2 = new JLabel("Tilføj pris:");
		vare2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare2.setBounds(30, 150, 110, 20);
		vare2.setForeground(Color.black);
		add(vare2);
		
		JTextField textField2 = new JTextField();
		textField2.setBounds(160, 150, 300, 20);
		add(textField2);
		
		JLabel vare3 = new JLabel("Tilføj kategorinummer:");
		vare3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare3.setBounds(30, 180, 130, 20);
		vare3.setForeground(Color.black);
		add(vare3);
		
		JTextField textField3 = new JTextField();
		textField3.setBounds(160, 180, 300, 20);
		add(textField3);
		
		JLabel vare31231 = new JLabel("Tilføj vægt:");
		vare31231.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare31231.setBounds(30, 210, 110, 20);
		vare31231.setForeground(Color.black);
		add(vare31231);
		
		JTextField textField32 = new JTextField();
		textField32.setBounds(160, 210, 300, 20);
		add(textField32);
		
		JLabel vare312314 = new JLabel("Tilføj bredde:");
		vare312314.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare312314.setBounds(30, 240, 110, 20);
		vare312314.setForeground(Color.black);
		add(vare312314);
		
		JTextField textField323 = new JTextField();
		textField323.setBounds(160, 240, 300, 20);
		add(textField323);
		
		JLabel vare3123146 = new JLabel("Tilføj dybde:");
		vare3123146.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare3123146.setBounds(30, 270, 110, 20);
		vare3123146.setForeground(Color.black);
		add(vare3123146);
		
		JTextField textField3223 = new JTextField();
		textField3223.setBounds(160, 270, 300, 20);
		add(textField3223);
		
		JLabel vare31231461 = new JLabel("Tilføj højde:");
		vare31231461.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare31231461.setBounds(30, 300, 110, 20);
		vare31231461.setForeground(Color.black);
		add(vare31231461);
		
		JTextField textField32231 = new JTextField();
		textField32231.setBounds(160, 300, 300, 20);
		add(textField32231);
		
		JLabel vare312314612 = new JLabel("Tilføj Beskrivelse:");
		vare312314612.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare312314612.setBounds(30, 345, 110, 20);
		vare312314612.setForeground(Color.black);
		add(vare312314612);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(UIManager.getColor("TextPane.background"));
		textPane.setBounds(160, 345, 400, 100);
		add(textPane);
		
		
		Button TilføjVarer = new Button("Tilføj");
		TilføjVarer.setBackground(new Color(255,215,10));
		TilføjVarer.setBounds(627, 28, 70, 22);
		TilføjVarer.setForeground(Color.black);
		add(TilføjVarer);
		
		table = new JTable();
		table.setBounds(12, 71, 710, 405);
		table.setBackground(new Color(238, 238, 238));
		add(table);
		
		
		table1 = new JTable();
		table1.setBounds(12, 10, 710, 57);
		table1.setBackground(new Color(238, 238, 238));
		add(table1);
		
		
		 
	}
}
