package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SletVarerhus extends JPanel {


	private static final long serialVersionUID = 3321074126667336365L;
	private JTable table;
	private JTable table1;

	public SletVarerhus() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel Label = new JLabel("Slet varerhus");
		Label.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/delete.png")));
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.black);
		Label.setBounds(30, 30, 200, 30);
		this.add(Label);


		table = new JTable();
		table.setBounds(12, 71, 710, 405);
		table.setBackground(new Color(238, 238, 238));
		add(table);
		
		
		table1 = new JTable();
		table1.setBounds(12, 10, 710, 57);
		table1.setBackground(new Color(238, 238, 238));
		add(table1);
		
		
	}

}
