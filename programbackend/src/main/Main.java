package main;

import java.awt.EventQueue;
import java.sql.SQLException;

import data.connect.Connector;
import controller.LogindController;


import presentation.LogInd;


public class Main {

	public static void main(String[] args) {
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInd frame = new LogInd();
					frame.setVisible(true);
					LogindController kc = new LogindController(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
