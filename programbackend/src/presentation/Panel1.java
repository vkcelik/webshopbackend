package presentation;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Button;



public class Panel1 extends JPanel {
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;


	public Panel1() {
		
		
		this.setBackground(new Color(29, 160, 169));
		setLayout(null);
		
		JLabel Label = new JLabel("Opret Varer");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		Label.setBounds(26, 30, 140, 30);
		this.add(Label);
		
		JLabel vare = new JLabel("Tilføj Varenavn:");
		vare.setBounds(26, 90, 90, 20);
		vare.setForeground(Color.white);
		add(vare);
		
		textField = new JTextField();
		textField.setBounds(140, 90, 300, 20);
		add(textField);
		
		JLabel vare1 = new JLabel("Tilføj Varenummer:");
		vare1.setBounds(26, 120, 110, 20);
		vare1.setForeground(Color.white);
		add(vare1);
		
		
		textField1 = new JTextField();
		textField1.setBounds(140, 120, 300, 20);
		add(textField1);
		
		JLabel vare2 = new JLabel("Tilføj Kategori:");
		vare2.setBounds(26, 150, 110, 20);
		vare2.setForeground(Color.white);
		add(vare2);
		
		textField2 = new JTextField();
		textField2.setBounds(140, 150, 300, 20);
		add(textField2);
		
		JLabel vare3 = new JLabel("Tilføj Pris:");
		vare3.setBounds(26, 180, 110, 20);
		vare3.setForeground(Color.white);
		add(vare3);
		
		textField3 = new JTextField();
		textField3.setBounds(140, 180, 300, 20);
		add(textField3);
		
		Button button = new Button("Opret");
		button.setBackground(Color.lightGray);
		button.setBounds(140, 220, 70, 22);
		button.setForeground(Color.black);
		add(button);
		
		
		
		
		
		
		 
	}
}
