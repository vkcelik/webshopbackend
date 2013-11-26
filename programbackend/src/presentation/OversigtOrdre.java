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

import controller.OrdreController;



public class OversigtOrdre extends JPanel {

	private static final long serialVersionUID = 807936107106094470L;
	private JTable SOtable;
	private JTable SOtable1;
	private OrdreController controller;
	public JList<String> list; 
	private MouseListener mouseListener; 
	
	public OversigtOrdre() {
		
		// Opretter en liste //
		list = new JList<String>();
		add(list);
		list.setBounds(30, 120, 200, 200);
		list.setBackground(new Color(240,240,240));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFixedCellHeight(30);
		
		mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					controller.visOrdre(list.getSelectedValue());
				}
			}
		};
		
		list.addMouseListener(mouseListener);

		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeOrdre = new JLabel("Se Ordre");
		SeOrdre.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeOrdre.setFont(new Font("sansserif", Font.BOLD, 24));
		SeOrdre.setForeground(Color.black);
		SeOrdre.setBounds(30, 30, 200, 30);
		this.add(SeOrdre);

		SOtable = new JTable();
		SOtable.setBounds(12, 71, 710, 405);
		SOtable.setBackground(new Color(238, 238, 238));
		add(SOtable);


		SOtable1 = new JTable();
		SOtable1.setBounds(12, 10, 710, 57);
		SOtable1.setBackground(new Color(238, 238, 238));
		add(SOtable1);



	}

	public void setController(OrdreController ordreController) {
		this.controller = ordreController;
	}

}
