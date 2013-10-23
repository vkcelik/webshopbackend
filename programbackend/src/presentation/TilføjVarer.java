package presentation;



import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;



public class TilføjVarer extends JPanel {
	
	


	private JLabel jLabel;

	public TilføjVarer() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
		
		JLabel Label = new JLabel("Tilføj Varer");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		Label.setBounds(26, 30, 140, 30);
		this.add(Label);
		
		JLabel vare = new JLabel("Tilføj Varenavn:");
		vare.setBounds(26, 90, 90, 20);
		vare.setForeground(Color.white);
		add(vare);
		
		JTextField textField = new JTextField();
		textField.setBounds(140, 90, 300, 20);
		add(textField);
		
		JLabel vare1 = new JLabel("Tilføj Varenummer:");
		vare1.setBounds(26, 120, 110, 20);
		vare1.setForeground(Color.white);
		add(vare1);
		
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(140, 120, 300, 20);
		add(textField1);
		
		JLabel vare2 = new JLabel("Tilføj Kategori:");
		vare2.setBounds(26, 150, 110, 20);
		vare2.setForeground(Color.white);
		add(vare2);
		
		JTextField textField2 = new JTextField();
		textField2.setBounds(140, 150, 300, 20);
		add(textField2);
		
		JLabel vare3 = new JLabel("Tilføj Pris:");
		vare3.setBounds(26, 180, 110, 20);
		vare3.setForeground(Color.white);
		add(vare3);
		
		JTextField textField3 = new JTextField();
		textField3.setBounds(140, 180, 300, 20);
		add(textField3);
		
		Button TilføjVarer = new Button("Tilføj");
		TilføjVarer.setBackground(Color.lightGray);
		TilføjVarer.setBounds(140, 215, 70, 22);
		TilføjVarer.setForeground(Color.black);
		add(TilføjVarer);
		
		JButton Home = new JButton();
		Home.setBounds(600, 10, 40, 23);
		Home.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/home.png")));
		Home.setBackground(new Color(0, 145, 255));
		add(Home);
		
		
		
		
		 
	}
}
