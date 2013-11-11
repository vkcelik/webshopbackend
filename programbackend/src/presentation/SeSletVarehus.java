package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class SeSletVarehus extends JPanel {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8489392455577731305L;
	private JTable SEVHtable;
	private JTable SEVHtable1;

	public SeSletVarehus() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerVarehus = new JLabel("Se/Rediger Varerhus");
		SeRedigerVarehus.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/Run.png")));
		SeRedigerVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerVarehus.setForeground(Color.black);
		SeRedigerVarehus.setBounds(30, 30, 280, 30);
		this.add(SeRedigerVarehus);
		

		SEVHtable = new JTable();
		SEVHtable.setBounds(12, 71, 710, 405);
		SEVHtable.setBackground(new Color(238, 238, 238));
		add(SEVHtable);
		
		
		SEVHtable1 = new JTable();
		SEVHtable1.setBounds(12, 10, 710, 57);
		SEVHtable1.setBackground(new Color(238, 238, 238));
		add(SEVHtable1);
		
	}

}
