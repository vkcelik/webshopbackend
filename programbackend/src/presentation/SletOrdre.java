package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class SletOrdre extends JPanel {

	public SletOrdre() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
		
		JLabel Label = new JLabel("Slette Ordre");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		Label.setBounds(26, 30, 200, 30);
		this.add(Label);
		
	}

}
