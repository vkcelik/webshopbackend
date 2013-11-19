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



public class OversigtKategori extends JPanel {

	private static final long serialVersionUID = 3751582900083047274L;
	private JTable SERtable;
	private JTable SERtable1;
	private KategoriController controller;
	JList<String> listKategori; 
	private MouseListener mouseListener1; 
	public OversigtKategori() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel SeRedigerKategori = new JLabel("Se Kategori");
		SeRedigerKategori.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/Run.png")));
		SeRedigerKategori.setFont(new Font("sansserif", Font.BOLD, 24));
		SeRedigerKategori.setForeground(Color.black);
		SeRedigerKategori.setBounds(30, 30, 280, 30);
		this.add(SeRedigerKategori);

		JLabel KategoriId = new JLabel("KategoriId");
		KategoriId.setFont(new Font("Tahoma", Font.BOLD, 14));
		KategoriId.setBounds(30, 90, 130, 20);
		add(KategoriId);
		
		

		// Opretter en liste //
		listKategori = new JList<String>();
		add(listKategori);
		listKategori.setBounds(30, 120, 70, 200);
		listKategori.setForeground(Color.BLACK);
		listKategori.setBackground(new Color(240,240,240));
		listKategori.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listKategori.setFixedCellHeight(30);

		mouseListener1 = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					controller.visKategori(listKategori.getSelectedValue());
				}
			}
		};

		listKategori.addMouseListener(mouseListener1);


		SERtable = new JTable();
		SERtable.setBounds(12, 71, 710, 405);
		SERtable.setBackground(new Color(238, 238, 238));
		add(SERtable);


		SERtable1 = new JTable();
		SERtable1.setBounds(12, 10, 710, 57);
		SERtable1.setBackground(new Color(238, 238, 238));
		add(SERtable1);



	}

	public void setController(KategoriController controller){
		this.controller = controller;

	}

	public void updateList(){
		listKategori.setListData(controller.hentKategoriNavne());
	}
}
