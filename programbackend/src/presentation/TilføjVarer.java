package presentation;



import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;



public class TilføjVarer extends JPanel {
	
		private JTable table;
		private JTable table1;
	
		public TilføjVarer() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel Label = new JLabel("Tilføj Varer");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.black);
		Label.setBounds(30, 30, 140, 30);
		this.add(Label);
		
		JLabel vare = new JLabel("Tilføj Varenavn:");
		vare.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare.setBounds(30, 90, 90, 20);
		vare.setForeground(Color.black);
		add(vare);
		
		JTextField textField = new JTextField();
		textField.setBounds(145, 90, 300, 20);
		add(textField);
		
		JLabel vare1 = new JLabel("Tilføj Varenummer:");
		vare1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare1.setBounds(30, 120, 110, 20);
		vare1.setForeground(Color.black);
		add(vare1);
		
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(145, 120, 300, 20);
		add(textField1);
		
		JLabel vare2 = new JLabel("Tilføj Kategori:");
		vare2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare2.setBounds(30, 150, 110, 20);
		vare2.setForeground(Color.black);
		add(vare2);
		
		JTextField textField2 = new JTextField();
		textField2.setBounds(145, 150, 300, 20);
		add(textField2);
		
		JLabel vare3 = new JLabel("Tilføj Pris:");
		vare3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vare3.setBounds(30, 180, 110, 20);
		vare3.setForeground(Color.black);
		add(vare3);
		
		JTextField textField3 = new JTextField();
		textField3.setBounds(145, 180, 300, 20);
		add(textField3);
		
		Button TilføjVarer = new Button("Tilføj");
		TilføjVarer.setBackground(Color.lightGray);
		TilføjVarer.setBounds(140, 215, 70, 22);
		TilføjVarer.setForeground(Color.black);
		add(TilføjVarer);
		
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
