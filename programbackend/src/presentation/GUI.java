package presentation;

import java.awt.CardLayout;
import java.awt.Dimension;
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
	public static LogInd logindFrame;
	// tilføj
	public static TilføjKunde tilføjKunde;
	public static TilføjMedarbejder tilføjMedarbejder;
	public static TilføjKategori tilføjKategori;
	public static TilføjVare tilføjVare;
	public static TilføjVarehus tilføjVarehus;
	// se 
	public static OversigtVare seVare;
	public static OversigtVarehus seVarehus;
	public static OversigtKategori seKategori;
	public static OversigtMedarbejder seMedarbejder;
	public static OversigtKunde seKunde;
	public static OversigtOrdre seOrdre;
	public static Statestik seStatestik;
	public static Indstillinger seIndstillinger;
	// rediger
	public static RedigerKategori redigerKategori;
	public static RedigerKunde redigerKunde;
	public static RedigerMedarbejder redigerMedarbejder;
	public static RedigerVare redigerVare;
	public static RedigerVarehus redigerVarehus;
	public static RedigerOrdre redigerOrdre;
	
	public static KategoriController katc; 
	public static IndstillingerController ic;
	public static KundeController kunc;
	public static VareController vc;
	public static StatestikController sc;
	public static OrdreController oc;
	public static VarehusController vhc;
	public static MedarbejderController mc;
	
	public static CardLayout cardLayout;
	public static JPanel cards;

	
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
		LogindController lc = new LogindController();
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
		tilføjKunde = new TilføjKunde();
		tilføjMedarbejder = new TilføjMedarbejder();
		tilføjKategori = new TilføjKategori();
		tilføjVare = new TilføjVare();
		tilføjVarehus = new TilføjVarehus();

		seIndstillinger = new Indstillinger();
		seStatestik = new Statestik();
		seOrdre = new OversigtOrdre();
		seKunde = new OversigtKunde();
		seMedarbejder = new OversigtMedarbejder();
		seKategori = new OversigtKategori();
		seVare = new OversigtVare();
		seVarehus = new OversigtVarehus();
		
		redigerKunde = new RedigerKunde();
		redigerMedarbejder = new RedigerMedarbejder();
		redigerKategori = new RedigerKategori();
		redigerVarehus = new RedigerVarehus();
		redigerVare = new RedigerVare();
		redigerOrdre = new RedigerOrdre();
		
		katc = new KategoriController();
		ic = new IndstillingerController();
		kunc = new KundeController();
		vc = new VareController();
		sc = new StatestikController();
		oc = new OrdreController();
		vhc = new VarehusController();
		mc = new MedarbejderController();

		BackEndSystem bes = new BackEndSystem();
		bes.addComponentToPane(frame, frame.getContentPane());

		// Display the window
		frame.pack();
		frame.setVisible(true);
	}
}
