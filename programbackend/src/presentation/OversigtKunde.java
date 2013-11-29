package presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import controller.KundeController;

/**
* @author  Veli Kerim Celik  
*/

public class OversigtKunde extends JPanel {

	
	private JTable RSKtable;
	private JTable RSKtable1;
	private KundeController controller;
	private MouseListener mouseListener; 
	public JList<String> list1; 

	

	private static final long serialVersionUID = 5429893899549656494L;

	public OversigtKunde() {
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel SeRedigerKunde= new JLabel("Se Kunde");
		SeRedigerKunde.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeRedigerKunde.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerKunde.setForeground(Color.black);
		SeRedigerKunde.setBounds(30, 30, 330, 30);
		add(SeRedigerKunde);
		
		JLabel KundeListe = new JLabel("Kundeliste");
		KundeListe.setFont(new Font("Tahoma", Font.BOLD, 14));
		KundeListe.setBounds(30, 90, 130, 14);
		add(KundeListe);
		
		list1 = new JList<String>();
		add(list1);
		list1.setBounds(30, 120, 130, 200);
		list1.setBackground(new Color(240,240,240));
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list1.setFixedCellHeight(30);
		

		mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					controller.visKunde(list1.getSelectedValue());
				}
			}
		};
		list1.addMouseListener(mouseListener);
		
		
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