package presentation;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import controller.MedarbejderController;
import logic.dto.MedarbejderDTO;
import data.connect.Connector;
import data.dao.MySQLMedarbejderDAO;
import data.idao.DALException;

public class OversigtMedarbejder extends JPanel {

	private static final long serialVersionUID = -3146818100262099845L;	
	private JTable SEMtable;
	private JTable SEMtable1;
	private MedarbejderController controller;
	private MouseListener mouseListener; 
	public JList<String> list; 

	public OversigtMedarbejder() {

		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerMedarbejder = new JLabel("Se Medarbejder");
		SeRedigerMedarbejder.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeRedigerMedarbejder.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerMedarbejder.setForeground(Color.black);
		SeRedigerMedarbejder.setBounds(30, 30, 330, 30);
		add(SeRedigerMedarbejder);

		JLabel MedarbejderId = new JLabel("MedarbejderId");
		MedarbejderId.setFont(new Font("Tahoma", Font.BOLD, 14));
		MedarbejderId.setBounds(30, 90, 130, 14);
		add(MedarbejderId);

		// Opretter en liste //
		list = new JList<String>();
		add(list);
		list.setBounds(30, 120, 70, 200);
		list.setBackground(new Color(240,240,240));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFixedCellHeight(30);

		mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					controller.visMedarbejder(list.getSelectedValue());
				}
			}
		};
		
		list.addMouseListener(mouseListener);

		SEMtable = new JTable();
		SEMtable.setBounds(12, 71, 710, 405);
		SEMtable.setBackground(new Color(238, 238, 238));
		add(SEMtable);

		SEMtable1 = new JTable();
		SEMtable1.setBounds(12, 10, 710, 57);
		SEMtable1.setBackground(new Color(238, 238, 238));
		add(SEMtable1);

	}

	public void setController(MedarbejderController medarbejderController) {
		this.controller = medarbejderController;
	}
	
}
