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
import controller.VarebatchController;

public class OversigtVarebatch extends JPanel {

	private static final long serialVersionUID = -6592130543777646172L;
	private JTable OVBtable;
	private JTable OVBtable1;
	private VarebatchController controller;
	public JList<String> list; 
	private MouseListener mouseListener1; 	

	public OversigtVarebatch(){

		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerVare = new JLabel("Oversigt");
		SeRedigerVare.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeRedigerVare.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerVare.setForeground(Color.black);
		SeRedigerVare.setBounds(30, 30, 230, 30);
		this.add(SeRedigerVare);

		JLabel vareId = new JLabel("Varebatchliste");
		vareId.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareId.setBounds(30, 90, 130, 20);
		add(vareId);

		// Opretter en liste //
		list = new JList<String>();
		add(list);
		list.setBounds(30, 120, 100, 250);
		list.setForeground(Color.BLACK);
		list.setBackground(new Color(240,240,240));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFixedCellHeight(30);

		mouseListener1 = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) { 
					controller.updateComboboxes(GUI.redigerVarebatch);
					controller.visVarebatch(list.getSelectedValue());
				}
			}
		};

		list.addMouseListener(mouseListener1);

		OVBtable1 = new JTable();
		OVBtable1.setBounds(12, 10, 710, 57);
		OVBtable1.setBackground(new Color(238, 238, 238));
		add(OVBtable1);

		OVBtable = new JTable();
		OVBtable.setBounds(12, 71, 710, 405);
		OVBtable.setBackground(new Color(238, 238, 238));
		add(OVBtable);

	}

	public void setController(VarebatchController controller){
		this.controller = controller;
	}

}
