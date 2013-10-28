package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;



public class SeRedigerMedarbejder extends JPanel {
	
	private JTable table;
	
	public SeRedigerMedarbejder() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
	
		JLabel Label = new JLabel("Se/Rediger Medarbejder");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		Label.setBounds(26, 30, 300, 30);
		add(Label);
		
		JLabel Medarbejdernavn1 = new JLabel("MedarbejderId");
		Medarbejdernavn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Medarbejdernavn1.setBounds(35, 90, 130, 14);
		add(Medarbejdernavn1);
		
		table = new JTable();
		table.setBounds(26, 71, 596, 333);
		table.setBackground(new Color(238, 238, 238));
		add(table);
	
		

		
		
	}

}
