package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SeRedigerKategori extends JPanel {

	private static final long serialVersionUID = -995287522422891917L;
	private JTable table;

	public SeRedigerKategori() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel Label = new JLabel("Se/Rediger Kategori");
		Label.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/Edit.png")));
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		Label.setBounds(26, 30, 280, 30);
		this.add(Label);

		table = new JTable();
		table.setBounds(26, 71, 596, 333);
		table.setBackground(new Color(238, 238, 238));
		add(table);

	}

}
