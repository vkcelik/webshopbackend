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

/**
* @author  Veli Kerim Celik  
*/

public class OversigtMedarbejder extends JPanel {

	private static final long serialVersionUID = -3146818100262099845L;	
	private JTable SEMtable;
	private JTable SEMtable1;
	private MedarbejderController controller;
	private MouseListener mouseListener; 
	public JList<String> listmedarbejder; 

	public OversigtMedarbejder() {

		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerMedarbejder = new JLabel("Se Medarbejder");
		SeRedigerMedarbejder.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeRedigerMedarbejder.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerMedarbejder.setForeground(Color.black);
		SeRedigerMedarbejder.setBounds(30, 30, 330, 30);
		add(SeRedigerMedarbejder);

		JLabel MedarbejderListe= new JLabel("Medarbejderliste");
		MedarbejderListe.setFont(new Font("Tahoma", Font.BOLD, 14));
		MedarbejderListe.setBounds(30, 90, 130, 14);
		add(MedarbejderListe);

		// Opretter en liste //
		listmedarbejder = new JList<String>();
		add(listmedarbejder);
		listmedarbejder.setBounds(30, 120, 130, 200);
		listmedarbejder.setBackground(new Color(240,240,240));
		listmedarbejder.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listmedarbejder.setFixedCellHeight(30);

		mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					controller.visMedarbejder(listmedarbejder.getSelectedValue());
				}
			}
		};
		
		listmedarbejder.addMouseListener(mouseListener);

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
