package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SeRedigerVare extends JPanel {


	private JTable SEVtable;
	private JTable SEVtable1;

	public SeRedigerVare() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerVare = new JLabel("Se/Rediger Varer");
		SeRedigerVare.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/Run.png")));
		SeRedigerVare.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerVare.setForeground(Color.black);
		SeRedigerVare.setBounds(30, 30, 230, 30);
		this.add(SeRedigerVare);


		SEVtable = new JTable();
		SEVtable.setBounds(12, 71, 710, 405);
		SEVtable.setBackground(new Color(238, 238, 238));
		add(SEVtable);
		
		
		SEVtable1 = new JTable();
		SEVtable1.setBounds(12, 10, 710, 57);
		SEVtable1.setBackground(new Color(238, 238, 238));
		add(SEVtable1);
		
	}

}
