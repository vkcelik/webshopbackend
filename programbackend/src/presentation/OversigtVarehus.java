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

import controller.VarehusController;



public class OversigtVarehus extends JPanel {

	private static final long serialVersionUID = -8489392455577731305L;
	private JTable SEVHtable;
	private JTable SEVHtable1;
	private MouseListener mouseListener;
	private VarehusController controller;
	public JList<String> list; 

	public OversigtVarehus() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerVarehus = new JLabel("Se Varerhus");
		SeRedigerVarehus.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeRedigerVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerVarehus.setForeground(Color.black);
		SeRedigerVarehus.setBounds(30, 30, 280, 30);
		this.add(SeRedigerVarehus);
		
		JLabel KundeListe = new JLabel("Varehusliste");
		KundeListe.setFont(new Font("Tahoma", Font.BOLD, 14));
		KundeListe.setBounds(30, 90, 130, 14);
		add(KundeListe);
		
		
		list = new JList<String>();
		add(list);
		list.setBounds(30, 120, 130, 200);
		list.setBackground(new Color(240,240,240));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFixedCellHeight(30);
		
		mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					controller.visVarehus(list.getSelectedValue());
				}
			}
		};
		list.addMouseListener(mouseListener);
		

		SEVHtable = new JTable();
		SEVHtable.setBounds(12, 71, 710, 405);
		SEVHtable.setBackground(new Color(238, 238, 238));
		add(SEVHtable);
		
		
		SEVHtable1 = new JTable();
		SEVHtable1.setBounds(12, 10, 710, 57);
		SEVHtable1.setBackground(new Color(238, 238, 238));
		add(SEVHtable1);
		
	}

	public void setController(VarehusController varehusController) {
		this.controller = varehusController;
	}

}
