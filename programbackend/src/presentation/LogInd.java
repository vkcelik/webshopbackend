package presentation;


import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class LogInd extends JFrame {
	

	private JPanel LogIndPanel;
	private JPasswordField password;
	private JTextField Username;

	
	public LogInd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 570);
		setTitle("Backend System");
		LogIndPanel = new JPanel();
		setContentPane(LogIndPanel);
		getContentPane().setLayout(null);
		
		password = new JPasswordField();
		password.setToolTipText("Adgangskode");
		password.setBounds(217, 228, 316, 20);
		getContentPane().add(password);
		
		Username = new JTextField();
		Username.setToolTipText("Brugernavn");
		Username.setForeground(SystemColor.desktop);
		Username.setBounds(217, 197, 316, 20);
		getContentPane().add(Username);
		
		JButton LogInd1 = new JButton("Log Ind");
		LogInd1.setBackground(new Color(240,240,240));
		LogInd1.setBounds(217, 279, 316, 23);
		getContentPane().add(LogInd1);
		
		
		LogInd1.registerKeyboardAction(LogInd1.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);
		
		LogInd1.registerKeyboardAction(LogInd1.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
		
		LogInd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Username.getText().trim().length()== 0 || password.getText().length()==0){
					JOptionPane.showMessageDialog(null, "Udfyld Brugernavn og adgangskode");
				
				} 
				else {
					if(Username.getText().equals("Ayhan") && password.getText().equals("Fadi"))
						
					
					{
						
						BackEndSystem Logind =new BackEndSystem();
						Logind.setVisible(true);
						dispose();
					}
					
				
					
					else {
						JOptionPane.showMessageDialog(null, "Ugyldigt Brugernavn eller adgangskode", "Fejl Meddelse", JOptionPane.ERROR_MESSAGE);
					
						
						
								
							}}}});
		
		
		JLabel LogIndPanel = new JLabel("");
		LogIndPanel.setIcon(new ImageIcon(LogInd.class.getResource("/presentation/resources/Background.jpg")));
		LogIndPanel.setBounds(0, 0, 735, 535);
		getContentPane().add(LogIndPanel);
		
		
	}

}
