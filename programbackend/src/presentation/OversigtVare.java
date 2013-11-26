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

import controller.VareController;



public class OversigtVare extends JPanel {

	private static final long serialVersionUID = 3093153771109800762L;
	private JTable SEVtable;
	private JTable SEVtable1;
	private VareController controller;
	public JList<String> listVare; 
	private MouseListener mouseListener1; 


	public OversigtVare() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerVare = new JLabel("Se Vare");
		SeRedigerVare.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeRedigerVare.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerVare.setForeground(Color.black);
		SeRedigerVare.setBounds(30, 30, 230, 30);
		this.add(SeRedigerVare);
		
		JLabel vareId = new JLabel("vareId");
		vareId.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareId.setBounds(30, 90, 130, 20);
		add(vareId);
		
		

		// Opretter en liste //
		listVare = new JList<String>();
		add(listVare);
		listVare.setBounds(30, 120, 100, 250);
		listVare.setForeground(Color.BLACK);
		listVare.setBackground(new Color(240,240,240));
		listVare.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listVare.setFixedCellHeight(30);

		mouseListener1 = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) { 
					controller.updateList(GUI.redigerVare);
					controller.visVare(listVare.getSelectedValue());
				}
			}
		};

		listVare.addMouseListener(mouseListener1);



		SEVtable = new JTable();
		SEVtable.setBounds(12, 71, 710, 405);
		SEVtable.setBackground(new Color(238, 238, 238));
		add(SEVtable);
		
		SEVtable1 = new JTable();
		SEVtable1.setBounds(12, 10, 710, 57);
		SEVtable1.setBackground(new Color(238, 238, 238));
		add(SEVtable1);
		
	}
	
	public void setController (VareController controller){
		this.controller = controller;
	}

}
