package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class RedigerSletMedarbejder extends JPanel {
	
	
	private JTable SEMtable;
	private JTable SEMtable1;
	
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
