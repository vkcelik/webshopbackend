package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SletOrdre extends JPanel {
	
		private JTable table;

		public SletOrdre() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
		
		JLabel Label = new JLabel("Slette Ordre");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		Label.setBounds(26, 30, 200, 30);
		this.add(Label);
		
		table = new JTable();
		table.setBounds(26, 71, 596, 333);
		table.setBackground(new Color(238, 238, 238));
		add(table);
		
	}

}
