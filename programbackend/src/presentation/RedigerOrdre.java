package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.OrdreController;

public class RedigerOrdre extends JPanel{

	OrdreController controller;
	private JTable Mtable;
	private JTable Mtable1;
	
	
	public RedigerOrdre() {


		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

		JLabel MedarbejderLabel = new JLabel("Rediger Medarbejder");
		MedarbejderLabel.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/addM.png")));
		MedarbejderLabel.setFont(new Font("sansserif", Font.BOLD, 24));
		MedarbejderLabel.setForeground(Color.black);
		MedarbejderLabel.setBounds(30, 30, 260, 30);
		this.add(MedarbejderLabel);


		JLabel MedarbejderNavn = new JLabel("Navn:");
		MedarbejderNavn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MedarbejderNavn.setBounds(150, 90, 160, 20);
		MedarbejderNavn.setForeground(Color.black);
		add(MedarbejderNavn);

//		medarbejderNavnText = new JTextField();
//		medarbejderNavnText.setBounds(230, 90, 300, 20);
//		add(medarbejderNavnText);

		
		Button TilføjMedarbejder = new Button("Gem");
		TilføjMedarbejder.setBackground(new Color(255,215,10));;
		TilføjMedarbejder.setBounds(457, 445, 70, 22);
		TilføjMedarbejder.setForeground(Color.black);
		add(TilføjMedarbejder);
		TilføjMedarbejder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				controller.updateMedarbejder(medarbejderNavnText, medarbejderAdresseText, medarbejderlandText, medarbejderPostNrText, medarbejderEmailText, medarbejderPasswordText, medarbejderLønText, medarbejderLønTypeText, medarbejderRegNrText, medarbejderKontonrText, medarbejderCprText, LagerMedarbejder, HRMedarbejder, IndkøbMedarbejder);
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
