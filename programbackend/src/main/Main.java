package main;

import java.awt.EventQueue;

import controller.LogindController;


import presentation.LogInd;


public class Main {

	public static void main(String[] args) {
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
