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
import controller.VarehusController;



public class RedigerVarehus extends JPanel {

	private static final long serialVersionUID = 5911075244950799116L;
	private JTable VHtable;
	private JTable VHtable1;
	public JTextField varehusadresseText;
	public JTextField PostVarehusText;
	public JTextField LeveringstidText;
	private VarehusController controller;
	
	public RedigerVarehus() {
		
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		JLabel TilføjVarehus = new JLabel("Rediger Varerhus");
		TilføjVarehus.setIcon(new ImageIcon(TilføjVare.class.getResource("/presentation/resources/add32.png")));
		TilføjVarehus.setFont(new Font("sansserif", Font.BOLD, 24));
		TilføjVarehus.setForeground(Color.black);
		TilføjVarehus.setBounds(30, 30, 250, 30);
		this.add(TilføjVarehus);
		
		JLabel varehusadresse = new JLabel("Adresse:");
		varehusadresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		varehusadresse.setBounds(160, 120, 130, 20);
		varehusadresse.setForeground(Color.black);
		add(varehusadresse);
		
		varehusadresseText = new JTextField();
		varehusadresseText.setBounds(240, 120, 300, 20);
		add(varehusadresseText);
		
		JLabel PostVarehus = new JLabel("Postnr.:");
		PostVarehus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PostVarehus.setBounds(160, 150, 110, 20);
		PostVarehus.setForeground(Color.black);
		add(PostVarehus);
		
		PostVarehusText = new JTextField();
		PostVarehusText.setBounds(240, 150, 300, 20);
		add(PostVarehusText);
		
		JLabel Leveringstid = new JLabel("Leveringstid:");
		Leveringstid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Leveringstid.setBounds(160, 180, 110, 20);
		Leveringstid.setForeground(Color.black);
		add(Leveringstid);
		
		LeveringstidText = new JTextField();
		LeveringstidText.setBounds(240, 180, 300, 20);
		add(LeveringstidText);
		
		Button OpdaterVarerhus = new Button("Gem");
		OpdaterVarerhus.setBackground(new Color(255,215,10));
		OpdaterVarerhus.setBounds(468, 215, 70, 22);
		OpdaterVarerhus.setForeground(Color.black);
		add(OpdaterVarerhus);
		
		OpdaterVarerhus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.updateVarehus(varehusadresseText, PostVarehusText, LeveringstidText);
			}
		});
		
		VHtable1 = new JTable();
		VHtable1.setBounds(12, 10, 710, 57);
		VHtable1.setBackground(new Color(238, 238, 238));
		add(VHtable1);

		VHtable = new JTable();
		VHtable.setBounds(12, 71, 710, 405);
		VHtable.setBackground(new Color(238, 238, 238));
		add(VHtable);


	
		
	}

	public void setController(VarehusController varehusController) {
		this.controller = varehusController;
	}

}
