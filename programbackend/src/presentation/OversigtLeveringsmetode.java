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

import controller.KategoriController;
import controller.LeveringsmetodeController;

/**
* @author  Veli Kerim Celik  
*/

public class OversigtLeveringsmetode extends JPanel {
	
	private LeveringsmetodeController controller;
	private JTable table;
	private JTable table1;
	public JList<String> list;
	private MouseListener mouseListener; 
	
	public OversigtLeveringsmetode(){
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel lab1 = new JLabel("Se leveringsmetode");
		lab1.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		lab1.setFont(new Font("sansserif", Font.BOLD, 24));
		lab1.setForeground(Color.black);
		lab1.setBounds(30, 30, 350, 30);
		add(lab1);

		JLabel lab2= new JLabel("Leveringsmetodeliste");
		lab2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lab2.setBounds(30, 90, 150, 14);
		add(lab2);

		// Opretter en liste //
		list = new JList<String>();
		add(list);
		list.setBounds(30, 120, 130, 200);
		list.setBackground(new Color(240,240,240));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFixedCellHeight(30);

		mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					controller.visLeveringsmetode(list.getSelectedValue());
				}
			}
		};
		
		list.addMouseListener(mouseListener);

		table = new JTable();
		table.setBounds(12, 71, 710, 405);
		table.setBackground(new Color(238, 238, 238));
		add(table);

		table1 = new JTable();
		table1.setBounds(12, 10, 710, 57);
		table1.setBackground(new Color(238, 238, 238));
		add(table1);
	}
	
	public void setController(LeveringsmetodeController controller){
		this.controller = controller;
	}

}
