package presentation;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import presentation.BackEndSystem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Forside extends JPanel {


	private JTable Vtable;
	private JTable Vtable1;
	
	public Forside() {
		
		// Start
			
		this.setBounds(100, 100, 735, 493);
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		JLabel Label1 = new JLabel("Velkommen til Backend System", JLabel.CENTER);
		Label1.setBounds(190, 21, 360, 32);
		Label1.setFont(new Font("sansserif", Font.BOLD, 24));
		Label1.setForeground(new Color(0, 153, 204));
		add(Label1);
		
		Button Logud = new Button("Log ud");
		Logud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				LogInd Logud =new LogInd();
				Logud.setVisible(true);
				System.exit(0);
				
			}
		});
		Logud.setBackground(new Color(255,215,10));
		Logud.setBounds(632, 27, 70, 22);
		Logud.setForeground(Color.black);
		add(Logud);
		
		
		
		Vtable = new JTable();
		Vtable.setBounds(12, 71, 710, 405);
		Vtable.setBackground(new Color(238, 238, 238));
		add(Vtable);
		
		Vtable1 = new JTable();
		Vtable1.setBounds(12, 10, 710, 57);
		Vtable1.setAutoResizeMode(HEIGHT);
		Vtable1.setBackground(new Color(238, 238, 238));
		add(Vtable1);
		
	
		
		
		
		
		
				
		// SLut

	}
}
