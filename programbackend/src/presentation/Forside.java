package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;


public class Forside extends JPanel {


	private JTable Vtable;
	
	public Forside() {
		
		// Start
				
		
		this.setBackground(new Color(51, 161, 201));
		this.setLayout(new BorderLayout(0, 0));
		JLabel Label1 = new JLabel("Velkommen til Backend System", JLabel.CENTER);
		Label1.setFont(new Font("sansserif", Font.BOLD, 24));
		Label1.setForeground(Color.white);
		add(Label1, BorderLayout.PAGE_START);
		
		
	
		
		
		
		
		
				
		// SLut

	}

}
