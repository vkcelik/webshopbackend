package main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import data.connect.Connector;
import controller.IndstillingerController;
import controller.KategoriController;
import controller.KundeController;
import controller.LogindController;


import controller.VareController;
import presentation.BackEndSystem;
import presentation.Indstillinger;
import presentation.LogInd;
import presentation.RedigerSletKategori;
import presentation.RedigerSletKunde;
import presentation.RedigerSletVare;
import presentation.SeSletVarehus;
import presentation.Statestik;
import presentation.TilføjKategori;
import presentation.TilføjKunde;
import presentation.TilføjVare;
import presentation.TilføjVarehus;


public class Main {

	public static void main(String[] args) {
		// Create connector for application to connect to database
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }

		/* Use an appropriate Look and Feel */
		try{
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	private static void createAndShowGUI(){
		JFrame frame = new JFrame("Webshop backend");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(750, 550));
		
		BackEndSystem bes = new BackEndSystem();
		bes.addComponentToPane(frame, frame.getContentPane());
		
		// Display the window
		frame.pack();
		frame.setVisible(true);

	}

	public void assembleGUI(){
		LogInd loginFrame = new LogInd();
		LogindController lc = new LogindController(loginFrame);

		TilføjKategori tkatPanel = new TilføjKategori();
		RedigerSletKategori rskatPanel = new RedigerSletKategori();
		KategoriController katc = new KategoriController(tkatPanel, rskatPanel);

		Indstillinger iPanel = new Indstillinger();
		IndstillingerController ic = new IndstillingerController(iPanel);

		TilføjKunde tkunPanel = new TilføjKunde();
		RedigerSletKunde rskunPanel = new RedigerSletKunde();
		KundeController kunc = new KundeController(tkunPanel, rskunPanel);

		TilføjVare tvPanel = new TilføjVare();
		RedigerSletVare rsvPanel = new RedigerSletVare();
		VareController vc = new VareController(tvPanel, rsvPanel);

		TilføjVarehus tvhPanel = new TilføjVarehus();
		SeSletVarehus ssvPanel = new SeSletVarehus();
	}

}
