package presentation;

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


import controller.MedarbejderController;
import controller.OrdreController;
import controller.StatestikController;
import controller.VareController;
import controller.VarehusController;


public class GUI {
	static LogInd logindFrame;
	static Indstillinger seIndstillinger;
	static Statestik seStatestik;
	static SeOrdre seOrdre;
	static RedigerSletKunde seKunde;
	static TilføjKunde tilføjKunde;
	static TilføjMedarbejder tilføjMedarbejder;
	static RedigerSletMedarbejder seMedarbejder;
	static TilføjKategori tilføjKategori;
	static RedigerSletKategori seKategori;
	static TilføjVare tilføjVare;
	static RedigerSletVare seVare;
	static TilføjVarehus tilføjVarehus;
	static SeSletVarehus seVarehus;

	public void run() {
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
				createAndShowLogind();
			}
		});

	}

	private void createAndShowLogind(){
		logindFrame = new LogInd();
		LogindController lc = new LogindController(logindFrame);
		logindFrame.setMinimumSize(new Dimension(750, 550));
		logindFrame.pack();
		logindFrame.setVisible(true);
	}

	public static void createAndShowBackend(){
		logindFrame.dispose();

		JFrame frame = new JFrame("Webshop backend");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(750, 550));

		// Create the cards
		seIndstillinger = new Indstillinger();
		seStatestik = new Statestik();
		seOrdre = new SeOrdre();
		seKunde = new RedigerSletKunde();
		tilføjKunde = new TilføjKunde();
		tilføjMedarbejder = new TilføjMedarbejder();
		seMedarbejder = new RedigerSletMedarbejder();
		tilføjKategori = new TilføjKategori();
		seKategori = new RedigerSletKategori();
		tilføjVare = new TilføjVare();
		seVare = new RedigerSletVare();
		tilføjVarehus = new TilføjVarehus();
		seVarehus = new SeSletVarehus();

		KategoriController katc = new KategoriController(tilføjKategori, seKategori);
		IndstillingerController ic = new IndstillingerController(seIndstillinger);
		KundeController kunc = new KundeController(tilføjKunde, seKunde);
		VareController vc = new VareController(tilføjVare, seVare);
		StatestikController sc = new StatestikController(seStatestik);
		OrdreController oc = new OrdreController(seOrdre);
		VarehusController vhc = new VarehusController(tilføjVarehus, seVarehus);
		MedarbejderController mc = new MedarbejderController(tilføjMedarbejder, seMedarbejder);

		BackEndSystem bes = new BackEndSystem();
		bes.addComponentToPane(frame, frame.getContentPane());

		// Display the window
		frame.pack();
		frame.setVisible(true);
	}
}
