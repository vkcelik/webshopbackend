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
	private JTable table1;
	
	public SeRedigerMedarbejder() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
	
		JLabel Label = new JLabel("Se/Rediger Medarbejder");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.black);
		Label.setBounds(30, 30, 300, 30);
		add(Label);
		
		JLabel Medarbejdernavn1 = new JLabel("MedarbejderId");
		Medarbejdernavn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Medarbejdernavn1.setBounds(30, 90, 130, 14);
		add(Medarbejdernavn1);
		
		table1 = new JTable();
		table1.setBounds(12, 10, 622, 57);
		table1.setBackground(new Color(238, 238, 238));
		add(table1);
		
		table = new JTable();
		table.setBounds(12, 71, 622, 340);
		table.setBackground(new Color(238, 238, 238));
		add(table);
		

		
		
	}

}
