package presentation;


import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LogInd extends JFrame {
	

	private JPanel LogIndPanel;
	private JPasswordField passwordField;
	private JTextField Username;

	
	public LogInd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 535);
		setTitle("Backend System");
		LogIndPanel = new JPanel();
		setContentPane(LogIndPanel);
		getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Adgangskode");
		passwordField.setBounds(217, 228, 316, 20);
		getContentPane().add(passwordField);
		
		Username = new JTextField();
		Username.setToolTipText("Brugernavn");
		Username.setForeground(SystemColor.desktop);
		Username.setBounds(217, 197, 316, 20);
		getContentPane().add(Username);
		
		
		JButton LogInd = new JButton("Log Ind");
		LogInd.setBackground(new Color(240,240,240));
		LogInd.setBounds(217, 279, 316, 23);
		getContentPane().add(LogInd);
		
			
		JLabel LogIndPanel = new JLabel("");
		LogIndPanel.setIcon(new ImageIcon(LogInd.class.getResource("/presentation/resources/Background.jpg")));
		LogIndPanel.setBounds(0, 0, 735, 535);
		getContentPane().add(LogIndPanel);
		
		
	}

}
