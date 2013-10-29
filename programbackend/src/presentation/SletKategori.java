package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SletKategori extends JPanel {

	private static final long serialVersionUID = -7332325133089964895L;
	private JTable table;
	private JTable table1;

	public SletKategori() {


		this.setBackground(new Color(0, 145, 255));
		setLayout(null);

		JLabel Label = new JLabel("Slet Kategori");
		Label.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/delete.png")));
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.black);
		Label.setBounds(30, 30, 200, 30);
		this.add(Label);

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
