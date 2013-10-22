package presentation;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Panel1 extends JPanel {
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;


	public Panel1() {
		
		
		this.setBackground(new Color(29, 160, 169));
		setLayout(null);
		
		JLabel vare = new JLabel("Tilf�j Varenavn:");
		vare.setBounds(26, 30, 90, 20);
		vare.setForeground(Color.white);
		add(vare);
		
		textField = new JTextField();
		textField.setBounds(120, 30, 300, 20);
		add(textField);
		
		
		textField1 = new JTextField();
		textField1.setBounds(120, 60, 300, 20);
		add(textField1);
		
		textField2 = new JTextField();
		textField2.setBounds(120, 90, 300, 20);
		add(textField2);
		
		textField3 = new JTextField();
		textField3.setBounds(120, 120, 300, 20);
		add(textField3);
		
		
		
		
		
		 
	}

}
