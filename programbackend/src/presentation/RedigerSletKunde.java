package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import controller.KundeController;

public class RedigerSletKunde extends JPanel {

	
	private JTable RSKtable;
	private JTable RSKtable1;
	private KundeController controller;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5429893899549656494L;

	public RedigerSletKunde() {
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel SeRedigerKunde= new JLabel("Se/Rediger Kunde");
		SeRedigerKunde.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeRedigerKunde.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerKunde.setForeground(Color.black);
		SeRedigerKunde.setBounds(30, 30, 330, 30);
		add(SeRedigerKunde);

		RSKtable = new JTable();
		RSKtable.setBounds(12, 71, 710, 405);
		RSKtable.setBackground(new Color(238, 238, 238));
		add(RSKtable);
		
		
		RSKtable1 = new JTable();
		RSKtable1.setBounds(12, 10, 710, 57);
		RSKtable1.setBackground(new Color(238, 238, 238));
		add(RSKtable1);

	}

	public void setController(KundeController kundeController) {
		this.controller = kundeController;
		
	}

}
