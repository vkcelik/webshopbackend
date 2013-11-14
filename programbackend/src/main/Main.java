package main;

import java.awt.EventQueue;
import java.sql.SQLException;

import data.connect.Connector;
import controller.IndstillingerController;
import controller.KategoriController;
import controller.KundeController;
import controller.LogindController;


import controller.VareController;
import presentation.Indstillinger;
import presentation.LogInd;
import presentation.RedigerSletKategori;
import presentation.RedigerSletKunde;
import presentation.RedigerSletVare;
import presentation.TilføjKategori;
import presentation.TilføjKunde;
import presentation.TilføjVare;


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
					
					loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
