package presentation;



import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JComboBox;




public class TilføjVarer extends JPanel {
	
	
		private JTable Vtable;
		private JTable Vtable1;
		JComboBox<String> combobox;
	
	
		public TilføjVarer() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel VareLabel = new JLabel("Tilføj Varer");
		VareLabel.setIcon(new ImageIcon(TilføjVarer.class.getResource("/presentation/resources/add32.png")));
		VareLabel.setFont(new Font("sansserif", Font.BOLD, 24));
		VareLabel.setForeground(Color.black);
		VareLabel.setBounds(30, 28, 180, 32);
		this.add(VareLabel);
		
		
		JLabel VareNavn = new JLabel("Varenavn:");
		VareNavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		VareNavn.setBounds(150, 90, 120, 20);
		VareNavn.setForeground(Color.black);
		add(VareNavn);
		
		
		JTextField VareNavnText = new JTextField();
		VareNavnText.setBounds(230, 90, 300, 20);
		add(VareNavnText);
		
		JLabel Pris = new JLabel("Pris:");
		Pris.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Pris.setBounds(150, 120, 110, 20);
		Pris.setForeground(Color.black);
		add(Pris);
		
		JTextField PrisText = new JTextField();
		PrisText.setBounds(230, 120, 300, 20);
		add(PrisText);
		
		JLabel KategoriNummer = new JLabel("Kategori:");
		KategoriNummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		KategoriNummer.setBounds(150, 150, 130, 20);
		KategoriNummer.setForeground(Color.black);
		add(KategoriNummer);
		
		JLabel Vægt = new JLabel("Vægt:");
		Vægt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Vægt.setBounds(150, 180, 110, 20);
		Vægt.setForeground(Color.black);
		add(Vægt);
		
		JTextField VægtText = new JTextField();
		VægtText.setBounds(230, 180, 300, 20);
		add(VægtText);
		
		JLabel Bredde = new JLabel("Bredde:");
		Bredde.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Bredde.setBounds(150, 210, 110, 20);
		Bredde.setForeground(Color.black);
		add(Bredde);
		
		JTextField BreddeText = new JTextField();
		BreddeText.setBounds(230, 210, 300, 20);
		add(BreddeText);
		
		JLabel Dybde = new JLabel("Dybde:");
		Dybde.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Dybde.setBounds(150, 240, 110, 20);
		Dybde.setForeground(Color.black);
		add(Dybde);
		
		JTextField DybdeText = new JTextField();
		DybdeText.setBounds(230, 240, 300, 20);
		add(DybdeText);
		
		JLabel Højde = new JLabel("Højde:");
		Højde.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Højde.setBounds(150, 270, 110, 20);
		Højde.setForeground(Color.black);
		add(Højde);
		
		JTextField HøjdeText = new JTextField();
		HøjdeText.setBounds(230, 270, 300, 20);
		add(HøjdeText);
		
		JLabel Beskrivelse = new JLabel("Beskrivelse:");
		Beskrivelse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Beskrivelse.setBounds(150, 300, 110, 20);
		Beskrivelse.setForeground(Color.black);
		add(Beskrivelse);
		
		JTextPane BeskrivelseText = new JTextPane();
		BeskrivelseText.setBackground(UIManager.getColor("TextPane.background"));
		BeskrivelseText.setBounds(230, 305, 300, 100);
		add(BeskrivelseText);
		
		
		Button TilføjVarer = new Button("Tilføj");
		TilføjVarer.setBackground(new Color(255,215,10));
		TilføjVarer.setBounds(460, 420, 70, 22);
		TilføjVarer.setForeground(Color.black);
		add(TilføjVarer);
		
		
		Vtable1 = new JTable();
		Vtable1.setBounds(12, 10, 710, 57);
		Vtable1.setBackground(new Color(238, 238, 238));
		add(Vtable1);
		
		String KategoriDropdown[] = {"Vælg kategori","Assaad","Fadi","Ziad","Ayhan","Kerim"};
		combobox = new JComboBox<String>(KategoriDropdown);
		combobox.setBounds(230, 151, 300, 20);
		add(combobox);
		
		Vtable = new JTable();
		Vtable.setBounds(12, 71, 710, 405);
		Vtable.setBackground(new Color(238, 238, 238));
		add(Vtable);
		
		
		
		
		 
	}
}
