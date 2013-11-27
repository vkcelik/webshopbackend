package presentation;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;

import controller.KategoriController;
import controller.VarebatchController;

public class OversigtVarebatch extends JPanel {
	
	private VarebatchController controller;
	private JTable OVBtable;
	private JTable OVBtable1;
	
	
	public void setController(VarebatchController controller){
		this.controller = controller;
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		
		OVBtable1 = new JTable();
		OVBtable1.setBounds(12, 10, 710, 57);
		OVBtable1.setBackground(new Color(238, 238, 238));
		add(OVBtable1);

		OVBtable = new JTable();
		OVBtable.setBounds(12, 71, 710, 405);
		OVBtable.setBackground(new Color(238, 238, 238));
		add(OVBtable);
		
	}

}
