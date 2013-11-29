package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.OrdreController;

public class RedigerOrdre extends JPanel{

	OrdreController controller;
	private JTable Mtable;
	private JTable Mtable1;

	public JLabel ordreNummer;
	public JLabel kundeNavn;
	public JLabel kundeAdresse;
	public JLabel kundePostnummer;
	public JLabel bestillingsDato;
	public JLabel total;
	public JLabel leveringsPris;
	public JLabel leveringsMetode;
	public JComboBox<String> combobox1;	
	public JLabel leveringsAdresse;
	public JLabel leveringsPostnummer;
	public JLabel faktureringsAdresse;
	public JLabel faktureringsPostnummer;
	public JTable linjer;
	
	public RedigerOrdre() {
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel MedarbejderLabel = new JLabel("Rediger Ordre");
		MedarbejderLabel.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/addM.png")));
		MedarbejderLabel.setFont(new Font("sansserif", Font.BOLD, 24));
		MedarbejderLabel.setForeground(Color.black);
		MedarbejderLabel.setBounds(30, 30, 260, 30);
		this.add(MedarbejderLabel);
		
		ordreNummer = new JLabel();
		ordreNummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ordreNummer.setBounds(20, 80, 250, 20);
		ordreNummer.setForeground(Color.black);
		add(ordreNummer);
		
		kundeNavn = new JLabel();
		kundeNavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kundeNavn.setBounds(20, 100, 250, 20);
		kundeNavn.setForeground(Color.black);
		add(kundeNavn);
		
		kundeAdresse = new JLabel();
		kundeAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kundeAdresse.setBounds(20, 120, 250, 20);
		kundeAdresse.setForeground(Color.black);
		add(kundeAdresse);
		
		kundePostnummer = new JLabel();
		kundePostnummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kundePostnummer.setBounds(20, 140, 250, 20);
		kundePostnummer.setForeground(Color.black);
		add(kundePostnummer);
		
		bestillingsDato = new JLabel();
		bestillingsDato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bestillingsDato.setBounds(20, 160, 250, 20);
		bestillingsDato.setForeground(Color.black);
		add(bestillingsDato);
		
		total = new JLabel();
		total.setFont(new Font("Tahoma", Font.PLAIN, 12));
		total.setBounds(20, 180, 250, 20);
		total.setForeground(Color.black);
		add(total);
		
		leveringsPris = new JLabel();
		leveringsPris.setFont(new Font("Tahoma", Font.PLAIN, 12));
		leveringsPris.setBounds(20, 200, 250, 20);
		leveringsPris.setForeground(Color.black);
		add(leveringsPris);
		
		leveringsMetode = new JLabel();
		leveringsMetode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		leveringsMetode.setBounds(20, 220, 250, 20);
		leveringsMetode.setForeground(Color.black);
		add(leveringsMetode);
		
		JLabel status = new JLabel("Status:");
		status.setFont(new Font("Tahoma", Font.PLAIN, 12));
		status.setBounds(340, 80, 250, 20);
		status.setForeground(Color.black);
		add(status);

		// Opretter comboxen
		String[] statuser = {"Afventer betaling","Betalingsfejl", "Betaling accepteret", "I restordre", "Anulleret", "Forberedes til afsending", "Afsendt", "Afleveret" };
		combobox1 = new JComboBox<String>(statuser);
		combobox1.setBounds(410, 80, 300, 20);
		add(combobox1);

		leveringsAdresse = new JLabel();
		leveringsAdresse.setBounds(270, 110, 300, 20);
		add(leveringsAdresse);

		leveringsPostnummer = new JLabel();
		leveringsPostnummer.setBounds(270, 140, 300, 20);
		add(leveringsPostnummer);

		faktureringsAdresse = new JLabel();
		faktureringsAdresse.setBounds(270, 170, 300, 20);
		add(faktureringsAdresse);
	
		faktureringsPostnummer = new JLabel();
		faktureringsPostnummer.setBounds(270, 200, 300, 20);
		add(faktureringsPostnummer);
		
		linjer = new JTable();
		linjer.setBounds(30, 245, 600, 220);
		linjer.setBackground(Color.WHITE);
		add(linjer);
		
		
		
		Button gem = new Button("Gem");
		gem.setBackground(new Color(255,215,10));;
		gem.setBounds(640, 445, 70, 22);
		gem.setForeground(Color.black);
		add(gem);
		gem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.updateMedarbejder(combobox1);
			}
		});
		
		Mtable1 = new JTable();
		Mtable1.setBounds(12, 10, 710, 57);
		Mtable1.setBackground(new Color(238, 238, 238));
		add(Mtable1);

		Mtable = new JTable();
		Mtable.setBounds(12, 71, 710, 405);
		Mtable.setBackground(new Color(238, 238, 238));
		add(Mtable);
	}
	
	public void setController(OrdreController ordreController) {
		this.controller = ordreController;
		
	}

}
