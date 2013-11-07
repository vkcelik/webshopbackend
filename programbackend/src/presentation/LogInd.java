package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;


public class LogInd extends JPanel {
	
	
	private JPasswordField passwordField;
	private JTextField Username;

	
	public LogInd() {

		
		setBounds(100, 100, 735, 535);
		setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(220, 256, 313, 20);
		add(passwordField);
		
		Username = new JTextField();
		Username.setForeground(SystemColor.desktop);
		Username.setBounds(220, 225, 313, 20);
		add(Username);
		
		
		
		JLabel velkom = new JLabel("Backend System");
		velkom.setFont(new Font("sansserif", Font.BOLD, 24));
		velkom.setForeground(Color.white);
		velkom.setBounds(277, 160, 199, 47);
		add(velkom);
		
		JButton LogInd = new JButton("Log Ind");
		LogInd.setBackground(new Color(240,240,240));
		LogInd.setBounds(220, 304, 313, 23);
		add(LogInd);
		
			
			JLabel LogIndPanel = new JLabel("");
			LogIndPanel.setIcon(new ImageIcon(LogInd.class.getResource("/presentation/resources/Background1.jpg")));
			
			
			
			LogIndPanel.setBounds(0, 0, 735, 535);
			add(LogIndPanel);
		
		
		
		
	}
}
