package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.KategoriController;
import data.connect.Connector;
import data.dao.MySQLKategoriDAO;
import data.idao.DALException;
import logic.dto.KategoriDTO;

/**
* @author  Veli Kerim Celik  
*/

public class TilføjKategori extends JPanel {

	private static final long serialVersionUID = 1541797465235551941L;
	private JTable Ktable;
	private JTable Ktable1;
	public JComboBox<String> combobox1;
	private KategoriController controller;
	private JTextField kategorinavnText;

	public TilføjKategori() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel TilføjKategori = new JLabel("Tilføj Kategori");
		TilføjKategori.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/add32.png")));
		TilføjKategori.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjKategori.setForeground(Color.black);
		TilføjKategori.setBounds(30, 30, 200, 30);
		this.add(TilføjKategori);

		JLabel TilføjKategorinavn = new JLabel("Kategorinavn:");
		TilføjKategorinavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TilføjKategorinavn.setBounds(140, 90, 140, 20);
		TilføjKategorinavn.setForeground(Color.black);
		add(TilføjKategorinavn);

		kategorinavnText = new JTextField();
		kategorinavnText.setBounds(230, 90, 300, 20);
		add(kategorinavnText);


		Button TilføjKategori1 = new Button("Tilføj");
		TilføjKategori1.setBackground(new Color(255,215,10));
		TilføjKategori1.setBounds(460, 160, 70, 22);
		TilføjKategori1.setForeground(Color.black);
		add(TilføjKategori1);

		TilføjKategori1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(controller);
				controller.tilføjKategori(kategorinavnText, combobox1);
			}
		});

		Ktable1 = new JTable();
		Ktable1.setBounds(12, 10, 710, 57);
		Ktable1.setBackground(new Color(238, 238, 238));
		add(Ktable1);



		JLabel TilføjOverKategori = new JLabel("Over kategori:");
		TilføjOverKategori.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TilføjOverKategori.setBounds(140, 120, 140, 20);
		TilføjOverKategori.setForeground(Color.black);
		add(TilføjOverKategori);

		combobox1 = new JComboBox<String>();
		combobox1.setBounds(230, 120, 300, 20);
		add(combobox1);


		Ktable = new JTable();
		Ktable.setBounds(12, 71, 710, 405);
		Ktable.setBackground(new Color(238, 238, 238));
		add(Ktable);
	}

	public void setController(KategoriController controller){
		this.controller = controller;
	}

}
