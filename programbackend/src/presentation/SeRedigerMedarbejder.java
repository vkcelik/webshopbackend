package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class SeRedigerMedarbejder extends JPanel {

	public SeRedigerMedarbejder() {
		
		
		this.setBackground(new Color(0, 145, 255));
		setLayout(null);
		
		JLabel Label = new JLabel("Se/Rediger Medarbejder");
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		Label.setBounds(26, 30, 300, 30);
		this.add(Label);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 71, 596, 333);
		panel.setLayout(null);
		add(panel);
		
		Button GemMedarbejder = new Button("Gem");
		GemMedarbejder.setBackground(new Color(230,228,220));
		GemMedarbejder.setBounds(551, 38, 70, 22);
		GemMedarbejder.setForeground(Color.black);
		add(GemMedarbejder);
		
		JLabel Medarbejdernavn1 = new JLabel("Medarbejdernavn:");
		Medarbejdernavn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Medarbejdernavn1.setBounds(10, 24, 110, 14);
		panel.add(Medarbejdernavn1);
		
		JLabel Medarbejderid1 = new JLabel("MedarbejderId:");
		Medarbejderid1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Medarbejderid1.setBounds(215, 24, 110, 14);
		panel.add(Medarbejderid1);
		
		JLabel Stilling1 = new JLabel("Stilling:");
		Stilling1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Stilling1.setBounds(380, 24, 110, 14);
		panel.add(Stilling1);
		
		JLabel Løn1 = new JLabel("Løn:");
		Løn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Løn1.setBounds(505, 24, 81, 14);
		panel.add(Løn1);
		
		JTextField MedarbejdernavnText = new JTextField();
		MedarbejdernavnText.setBounds(10, 49, 184, 20);
		panel.add(MedarbejdernavnText);
		
		JTextField MedarbejderIdText = new JTextField();
		MedarbejderIdText.setBounds(215, 49, 137, 20);
		panel.add(MedarbejderIdText);
		
		JTextField StillingText = new JTextField();
		StillingText.setBounds(380, 49, 94, 20);
		panel.add(StillingText);
		
		JTextField LønText = new JTextField();
		LønText.setBounds(506, 49, 80, 20);
		panel.add(LønText);
		
		JTextField MedarbejdernavnText1 = new JTextField();
		MedarbejdernavnText1.setBounds(10, 80, 184, 20);
		panel.add(MedarbejdernavnText1);
		
		JTextField MedarbejderIdText1 = new JTextField();
		MedarbejderIdText1.setBounds(215, 80, 137, 20);
		panel.add(MedarbejderIdText1);
		
		JTextField StillingText1 = new JTextField();
		StillingText1.setBounds(380, 80, 94, 20);
		panel.add(StillingText1);
		
		JTextField LønTex1 = new JTextField();
		LønTex1.setBounds(506, 80, 80, 20);
		panel.add(LønTex1);
		
		JTextField MedarbejdernavnText2 = new JTextField();
		MedarbejdernavnText2.setBounds(10, 110, 184, 20);
		panel.add(MedarbejdernavnText2);
		
		JTextField MedarbejderIdText2 = new JTextField();
		MedarbejderIdText2.setBounds(215, 110, 137, 20);
		panel.add(MedarbejderIdText2);
		
		JTextField StillingText2 = new JTextField();
		StillingText2.setBounds(380, 110, 94, 20);
		panel.add(StillingText2);
		
		JTextField LønText2 = new JTextField();
		LønText2.setBounds(506, 110, 80, 20);
		panel.add(LønText2);
		

		JTextField MedarbejdernavnText3 = new JTextField();
		MedarbejdernavnText3.setBounds(10, 140, 184, 20);
		panel.add(MedarbejdernavnText3);
		
		JTextField MedarbejderIdText3 = new JTextField();
		MedarbejderIdText3.setBounds(215, 140, 137, 20);
		panel.add(MedarbejderIdText3);
		
		JTextField StillingText3 = new JTextField();
		StillingText3.setBounds(380, 140, 94, 20);
		panel.add(StillingText3);
		
		JTextField LønText3 = new JTextField();
		LønText3.setBounds(506, 140, 80, 20);
		panel.add(LønText3);
		
		
		JTextField MedarbejdernavnText4 = new JTextField();
		MedarbejdernavnText4.setBounds(10, 170, 184, 20);
		panel.add(MedarbejdernavnText4);
		
		JTextField MedarbejderIdText4 = new JTextField();
		MedarbejderIdText4.setBounds(215, 170, 137, 20);
		panel.add(MedarbejderIdText4);
		
		JTextField StillingText4 = new JTextField();
		StillingText4.setBounds(380, 170, 94, 20);
		panel.add(StillingText4);
		
		JTextField LønText4 = new JTextField();
		LønText4.setBounds(506, 170, 80, 20);
		panel.add(LønText4);
	
		
	}

}
