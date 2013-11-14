package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import logic.dto.KategoriDTO;
import logic.dto.MedarbejderDTO;
import data.connect.Connector;
import data.dao.MySQLKategoriDAO;
import data.dao.MySQLMedarbejderDAO;
import data.idao.DALException;

public class RedigerSletMedarbejder extends JPanel {
	
	
	/**
	 * 
	 */

	private JTable SEMtable;
	private JTable SEMtable1;
	private JList list;
	
	
	public RedigerSletMedarbejder() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
	
		JLabel SeRedigerMedarbejder = new JLabel("Se/Rediger Medarbejder");
		SeRedigerMedarbejder.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/Run.png")));
		SeRedigerMedarbejder.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerMedarbejder.setForeground(Color.black);
		SeRedigerMedarbejder.setBounds(30, 30, 330, 30);
		add(SeRedigerMedarbejder);
		
		JLabel MedarbejderId = new JLabel("MedarbejderId");
		MedarbejderId.setFont(new Font("Tahoma", Font.BOLD, 14));
		MedarbejderId.setBounds(30, 90, 130, 14);
		add(MedarbejderId);
		
		// Henter fra database informationer //
		
		String Redigermedarbejder[];
		List<MedarbejderDTO> kats = null;
		
		try { new Connector(); }
		catch (InstantiationException e){ e.printStackTrace(); }
		catch (IllegalAccessException e){ e.printStackTrace(); }
		catch (ClassNotFoundException e){ e.printStackTrace(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		MySQLMedarbejderDAO kaDd = new MySQLMedarbejderDAO();
		try {kats = kaDd.getMedarbejderList();}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		Redigermedarbejder = new String[kats.size()];
		for (int i=0; i < kats.size(); i++){
			Redigermedarbejder[i]=kats.get(i).getMedarbejderNavn();
		}
		
		// Opretter en liste //
		JList<String> list = new JList<String>(Redigermedarbejder);
		add(list);
		list.setBounds(30, 120, 70, 200);
		list.setBackground(new Color(240,240,240));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFixedCellHeight(30);
		
		
		SEMtable = new JTable();
		SEMtable.setBounds(12, 71, 710, 405);
		SEMtable.setBackground(new Color(238, 238, 238));
		add(SEMtable);
		
		
		SEMtable1 = new JTable();
		SEMtable1.setBounds(12, 10, 710, 57);
		SEMtable1.setBackground(new Color(238, 238, 238));
		add(SEMtable1);
		
		

		
		
	}

}
