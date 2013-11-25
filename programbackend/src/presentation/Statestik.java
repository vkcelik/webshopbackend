package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;

import controller.StatestikController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Statestik extends JPanel {

	private static final long serialVersionUID = -2730404141010399074L;
	
	private JTable Vtable;
	private JTable Vtable1;
	private StatestikController controller;
	
	public Statestik() {
		
		// Start
			
		this.setBounds(100, 100, 735, 493);
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);
		JLabel Label1 = new JLabel("Velkommen til Backend System", JLabel.CENTER);
		Label1.setBounds(190, 21, 360, 32);
		Label1.setFont(new Font("sansserif", Font.BOLD, 24));
		Label1.setForeground(new Color(0, 153, 204));
		add(Label1);
		
		JLabel statistik = new JLabel("Statistik");
		statistik.setFont(new Font("Tahoma", Font.BOLD, 16));
		statistik.setForeground(new Color(0, 153, 204));
		statistik.setBounds(40, 90, 130, 14);
		add(statistik);
		
		JLabel Interval = new JLabel("Interval:");
		Interval.setFont(new Font("Tahoma", Font.BOLD, 14));
		Interval.setBounds(40, 150, 60, 27);
		Interval.setForeground(Color.black);
		add(Interval);
		
		JLabel Top = new JLabel("Top 10 over ordrelinie:");
		Top.setFont(new Font("Tahoma", Font.BOLD, 14));
		Top.setBounds(40, 210, 200, 27);
		Top.setForeground(Color.black);
		add(Top);
		
		
		Button knap1 = new Button("Dag");
		knap1.setBounds(150, 150, 100, 27);
		knap1.setBackground(new Color(255,215,10));
		add(knap1);
		
		knap1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				JList<String> list = new JList<String>();
				add(list);
				list.setBounds(40, 250, 400, 200);
				list.setBackground(Color.ORANGE);
				
			}
		});
		
		Button knap2 = new Button("Uge");
		knap2.setBounds(300, 150, 84, 27);
		knap2.setBackground(new Color(255,215,10));
		add(knap2);
		
		knap2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JList<String> list1 = new JList<String>();
				add(list1);
				list1.setBounds(40, 250, 400, 200);
				list1.setBackground(Color.BLUE);
				
				
			}
		});
		
		Button knap3 = new Button("Måned");
		knap3.setBounds(450, 150, 84, 27);
		knap3.setBackground(new Color(255,215,10));
		add(knap3);
		
		knap3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				JList<String> list2 = new JList<String>();
				add(list2);
				list2.setBounds(40, 250, 400, 200);
				list2.setBackground(Color.RED);
				
			}
		});
		
		
		
		Button knap4 = new Button("År");
		knap4.setBounds(600, 150, 84, 27);
		knap4.setBackground(new Color(255,215,10));
		add(knap4);
		
		knap4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JList<String> list3 = new JList<String>();
				add(list3);
				list3.setBounds(40, 250, 400, 200);
				list3.setBackground(Color.GREEN);
				
				
			}
		});
		
		
		
		
		
		Button Logud = new Button("Log ud");
		Logud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				LogInd Logud =new LogInd();
				Logud.setVisible(true);
				System.exit(0);
				
			}
		});
		Logud.setBackground(new Color(255,215,10));
		Logud.setBounds(632, 27, 70, 20);
		Logud.setForeground(Color.black);
		add(Logud);
		
		
		Vtable = new JTable();
		Vtable.setBounds(12, 71, 710, 405);
		Vtable.setBackground(new Color(238, 238, 238));
		add(Vtable);
		
		Vtable1 = new JTable();
		Vtable1.setBounds(12, 10, 710, 57);
		Vtable1.setAutoResizeMode(HEIGHT);
		Vtable1.setBackground(new Color(238, 238, 238));
		add(Vtable1);
		
	
		
		
		
		
		
				
		// SLut

	}

	public void setController(StatestikController statestikController) {
		this.controller = statestikController;
	}
}
