package presentation;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class BackEndSystem {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = -8393533657049762354L;

	public void addComponentToPane(JFrame theFrame, Container pane) {
		GUI.cardLayout = new CardLayout();
		// Create the things which will always show
		JMenuBar menuBar = new JMenuBar();

		if (GUI.isIndkøb){
			JMenu mnNewMenu = new JMenu("Varekatalog");
			menuBar.add(mnNewMenu);

			JMenuItem mntmNewMenuItem = new JMenuItem("Tilføj varer");
			mntmNewMenuItem.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
			mnNewMenu.add(mntmNewMenuItem);
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.vc.updateList(GUI.tilføjVare);
					GUI.cardLayout.show(GUI.cards, "tilføjVare");
				}
			});

			JMenuItem mntmNewMenuItem_4 = new JMenuItem("Se/Rediger Varer");
			mntmNewMenuItem_4.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
			mnNewMenu.add(mntmNewMenuItem_4);
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.vc.updateList(GUI.seVare);
					GUI.cardLayout.show(GUI.cards, "seVare");
				}
			});
		}

		if(GUI.isLager || GUI.isIndkøb){

			JMenu mnNewMenu_1 = new JMenu("Lager");
			menuBar.add(mnNewMenu_1);

			JMenuItem mntmNewMenuItem_11 = new JMenuItem("Tilføj varebatch");
			mntmNewMenuItem_11.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
			mnNewMenu_1.add(mntmNewMenuItem_11);
			mntmNewMenuItem_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.katc.updateList(GUI.tilføjKategori);
					GUI.cardLayout.show(GUI.cards, "tilføjVarebatch");
				}
			});

			JMenuItem mntmNewMenuItem_51 = new JMenuItem("Se/Rediger varebatch");
			mntmNewMenuItem_51.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Box.png")));
			mnNewMenu_1.add(mntmNewMenuItem_51);
			mntmNewMenuItem_51.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.katc.updateList(GUI.tilføjKategori);
					GUI.cardLayout.show(GUI.cards, "seVarebatch");
				}
			});

			if (GUI.isLager){

				JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tilføj varehus");
				mntmNewMenuItem_1.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
				mnNewMenu_1.add(mntmNewMenuItem_1);
				mntmNewMenuItem_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GUI.cardLayout.show(GUI.cards, "tilføjVarehus");
					}
				});

				JMenuItem mntmNewMenuItem_5 = new JMenuItem("Se/Rediger varehus");
				mntmNewMenuItem_5.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
				mnNewMenu_1.add(mntmNewMenuItem_5);
				mntmNewMenuItem_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GUI.cardLayout.show(GUI.cards, "seVarehus");
					}
				});
			}
		}

		if(GUI.isIndkøb){
			JMenu mnNewMenu_2 = new JMenu("Kategorier");
			menuBar.add(mnNewMenu_2);

			JMenuItem mntmNewMenuItem_10 = new JMenuItem("Tilføj kategori");
			mntmNewMenuItem_10.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
			mnNewMenu_2.add(mntmNewMenuItem_10);
			mntmNewMenuItem_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.katc.updateList(GUI.tilføjKategori);
					GUI.cardLayout.show(GUI.cards, "tilføjKategori");
				}
			});

			JMenuItem mntmNewMenuItem_9 = new JMenuItem("Se/Rediger kategori");
			mntmNewMenuItem_9.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
			mnNewMenu_2.add(mntmNewMenuItem_9);
			mntmNewMenuItem_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.katc.updateList(GUI.seKategori);
					GUI.cardLayout.show(GUI.cards, "seKategori");
				}
			});
		}

		if(GUI.isHr){

			JMenu mnNewMenu_4 = new JMenu("Medarbejder");
			menuBar.add(mnNewMenu_4);

			JMenuItem mntmNewMenuItem_18 = new JMenuItem("Tilføj medarbejder");
			mntmNewMenuItem_18.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
			mnNewMenu_4.add(mntmNewMenuItem_18);
			mntmNewMenuItem_18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.cardLayout.show(GUI.cards, "tilføjMedarbejder");
				}
			});

			JMenuItem mntmNewMenuItem_13 = new JMenuItem("Se/Rediger medarbejder");
			mntmNewMenuItem_13.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/users-icon.png")));
			mnNewMenu_4.add(mntmNewMenuItem_13);
			mntmNewMenuItem_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.mc.updateList();
					GUI.cardLayout.show(GUI.cards, "seMedarbejder");
				}
			});
		}

		if (GUI.isHr){
			JMenu mnNewMenu_32 = new JMenu("Kunde");
			menuBar.add(mnNewMenu_32);

			JMenuItem mntmNewMenuItem_32 = new JMenuItem("Tilføj Kunde");
			mntmNewMenuItem_32.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
			mnNewMenu_32.add(mntmNewMenuItem_32);
			mntmNewMenuItem_32.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.cardLayout.show(GUI.cards, "tilføjKunde");
				}
			});

			JMenuItem mntmNewMenuItem_323 = new JMenuItem("Rediger Kunde");
			mntmNewMenuItem_323.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
			mnNewMenu_32.add(mntmNewMenuItem_323);
			mntmNewMenuItem_323.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.kunc.updateList();
					GUI.cardLayout.show(GUI.cards, "seKunde");
				}
			});
		}

		if (GUI.isAdmin){
			JMenu mnNewMenu_7 = new JMenu("Leveringsmetode");
			menuBar.add(mnNewMenu_7);

			JMenuItem mntmNewMenuItem_71 = new JMenuItem("Tilføj leveringsmetoder");
			mntmNewMenuItem_71.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
			mnNewMenu_7.add(mntmNewMenuItem_71);
			mntmNewMenuItem_71.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});

			JMenuItem mntmNewMenuItem_72 = new JMenuItem("Se/rediger leveringsmetoder");
			mntmNewMenuItem_72.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/truck.png")));
			mnNewMenu_7.add(mntmNewMenuItem_72);
			mntmNewMenuItem_72.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		}

		if (GUI.isLager){
			JMenu mnNewMenu_3 = new JMenu("Ordre");
			menuBar.add(mnNewMenu_3);

			JMenuItem mntmNewMenuItem_12 = new JMenuItem("Se ordre");
			mntmNewMenuItem_12.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
			mnNewMenu_3.add(mntmNewMenuItem_12);
			mntmNewMenuItem_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.oc.updateList();
					GUI.cardLayout.show(GUI.cards, "seOrdre");
				}
			});
		}

		JMenu mnNewMenu_8 = new JMenu("Statistik");
		menuBar.add(mnNewMenu_8);

		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Se Statistik");
		mntmNewMenuItem_20.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/statistics-icon.png")));
		mnNewMenu_8.add(mntmNewMenuItem_20);
		mntmNewMenuItem_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.cardLayout.show(GUI.cards, "seStatestik");
			}
		});

		if (GUI.isAdmin){
			JMenu mnNewMenu_5 = new JMenu("Instillinger");
			menuBar.add(mnNewMenu_5);

			JMenuItem mnNewMenu_51 = new JMenuItem("Se instillinger");
			mnNewMenu_51.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
			mnNewMenu_5.add(mnNewMenu_51);
			mnNewMenu_51.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUI.ic.visIndstillinger();
					GUI.cardLayout.show(GUI.cards, "seIndstillinger");
				}
			});
		}

		// Create the panel that contains the cards
		GUI.cards = new JPanel(GUI.cardLayout);

		GUI.cards.add(GUI.tilføjKunde, "tilføjKunde");
		GUI.cards.add(GUI.tilføjMedarbejder, "tilføjMedarbejder");
		GUI.cards.add(GUI.tilføjKategori, "tilføjKategori");
		GUI.cards.add(GUI.tilføjVare,"tilføjVare");
		GUI.cards.add(GUI.tilføjVarehus, "tilføjVarehus");
		GUI.cards.add(GUI.tilføjVarebatch, "tilføjVarebatch");
		GUI.cards.add(GUI.tilføjLeveringsmetode, "tilføjLeveringsmetode");

		GUI.cards.add(GUI.seIndstillinger, "seIndstillinger");
		GUI.cards.add(GUI.seStatestik, "seStatestik");
		GUI.cards.add(GUI.seOrdre, "seOrdre");
		GUI.cards.add(GUI.seKunde, "seKunde");
		GUI.cards.add(GUI.seMedarbejder, "seMedarbejder");
		GUI.cards.add(GUI.seKategori, "seKategori");
		GUI.cards.add(GUI.seVarehus, "seVarehus");
		GUI.cards.add(GUI.seVare, "seVare");
		GUI.cards.add(GUI.seVarebatch, "seVarebatch");
		GUI.cards.add(GUI.seLeveringsmetode, "seLeveringsmetode");

		GUI.cards.add(GUI.redigerKunde, "redigerKunde");
		GUI.cards.add(GUI.redigerMedarbejder, "redigerMedarbejder");
		GUI.cards.add(GUI.redigerKategori, "redigerKategori");
		GUI.cards.add(GUI.redigerVarehus, "redigerVarehus");
		GUI.cards.add(GUI.redigerVare, "redigerVare");
		GUI.cards.add(GUI.redigerOrdre, "redigerOrdre");
		GUI.cards.add(GUI.redigerVarebatch, "redigerVarebatch");
		GUI.cards.add(GUI.redigerLeveringsmetode, "redigerLeveringsmetode");


		GUI.cardLayout.show(GUI.cards, "seStatestik");

		// Add everything
		theFrame.setJMenuBar(menuBar);
		pane.add(GUI.cards, BorderLayout.CENTER);
	}

}
