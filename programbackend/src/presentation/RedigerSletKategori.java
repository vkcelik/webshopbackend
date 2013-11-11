package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;



public class RedigerSletKategori extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3751582900083047274L;
	private JTable SERtable;
	private JTable SERtable1;

	public RedigerSletKategori() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerKategori = new JLabel("Se/Rediger Kategori");
		SeRedigerKategori.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/Run.png")));
		SeRedigerKategori.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerKategori.setForeground(Color.black);
		SeRedigerKategori.setBounds(30, 30, 280, 30);
		this.add(SeRedigerKategori);

		SERtable = new JTable();
		SERtable.setBounds(12, 71, 710, 405);
		SERtable.setBackground(new Color(238, 238, 238));
		add(SERtable);
		
		
		SERtable1 = new JTable();
		SERtable1.setBounds(12, 10, 710, 57);
		SERtable1.setBackground(new Color(238, 238, 238));
		add(SERtable1);
		
		
		
	}

}
