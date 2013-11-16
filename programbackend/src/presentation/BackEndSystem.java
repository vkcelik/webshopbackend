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
	private JPanel cards;
	private CardLayout cardLayout;

	public void addComponentToPane(JFrame theFrame, Container pane) {
		cardLayout = new CardLayout();
		// Create the things which will always show
		JMenuBar menuBar = new JMenuBar();

		JMenu mnNewMenu = new JMenu("Varekatalog");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Tilføj varer");
		mntmNewMenuItem.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "tilføjVare");
			}
		});

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Se/Rediger Varer");
		mntmNewMenuItem_4.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
		mnNewMenu.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "seVare");
			}
		});

		JMenu mnNewMenu_1 = new JMenu("Varerhus");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tilføj varehus");
		mntmNewMenuItem_1.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "tilføjVarehus");
			}
		});

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Se/Rediger varerhus");
		mntmNewMenuItem_5.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "seVarehus");
			}
		});

		JMenu mnNewMenu_2 = new JMenu("Kategorier");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Tilføj kategori");
		mntmNewMenuItem_10.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_2.add(mntmNewMenuItem_10);
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "tilføjKategori");
			}
		});

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Se/Rediger kategori");
		mntmNewMenuItem_9.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
		mnNewMenu_2.add(mntmNewMenuItem_9);
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "seKategori");
			}
		});



		JMenu mnNewMenu_4 = new JMenu("Medarbejder");
		menuBar.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Tilføj medarbejder");
		mntmNewMenuItem_18.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_4.add(mntmNewMenuItem_18);
		mntmNewMenuItem_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "tilføjMedarbejder");
			}
		});

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Se/Rediger medarbejder");
		mntmNewMenuItem_13.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/users-icon.png")));
		mnNewMenu_4.add(mntmNewMenuItem_13);
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "seMedarbejder");
			}
		});

		JMenu mnNewMenu_32 = new JMenu("Kunde");
		menuBar.add(mnNewMenu_32);

		JMenuItem mntmNewMenuItem_32 = new JMenuItem("Tilføj Kunde");
		mntmNewMenuItem_32.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_32.add(mntmNewMenuItem_32);
		mntmNewMenuItem_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "tilføjKunde");
			}
		});

		JMenuItem mntmNewMenuItem_323 = new JMenuItem("Rediger Kunde");
		mntmNewMenuItem_323.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
		mnNewMenu_32.add(mntmNewMenuItem_323);
		mntmNewMenuItem_323.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "seKunde");
			}
		});

		JMenu mnNewMenu_3 = new JMenu("Ordre");
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Se ordre");
		mntmNewMenuItem_12.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu_3.add(mntmNewMenuItem_12);
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "seOrdre");
			}
		});

		JMenu mnNewMenu_8 = new JMenu("Statistik");
		menuBar.add(mnNewMenu_8);

		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Se Statistik");
		mntmNewMenuItem_20.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/statistics-icon.png")));
		mnNewMenu_8.add(mntmNewMenuItem_20);
		mntmNewMenuItem_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "seStatestik");
			}
		});

		JMenu mnNewMenu_5 = new JMenu("Instillinger");
		menuBar.add(mnNewMenu_5);

		JMenuItem mnNewMenu_51 = new JMenuItem("Se instillinger");
		mnNewMenu_51.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu_5.add(mnNewMenu_51);
		mnNewMenu_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "seIndstillinger");
			}
		});

		// Create the panel that contains the cards
		cards = new JPanel(cardLayout);
		cards.add(GUI.seIndstillinger, "seIndstillinger");
		cards.add(GUI.seStatestik, "seStatestik");
		cards.add(GUI.seOrdre, "seOrdre");
		cards.add(GUI.seKunde, "seKunde");
		cards.add(GUI.tilføjKunde, "tilføjKunde");
		cards.add(GUI.tilføjMedarbejder, "tilføjMedarbejder");
		cards.add(GUI.seMedarbejder, "seMedarbejder");
		cards.add(GUI.tilføjKategori, "tilføjKategori");
		cards.add(GUI.seKategori, "seKategori");
		cards.add(GUI.tilføjVare,"tilføjVare");
		cards.add(GUI.seVare, "seVare");
		cards.add(GUI.tilføjVarehus, "tilføjVarehus");
		cards.add(GUI.seVarehus, "seVarehus");
		
		cardLayout.show(cards, "seStatestik");

		// Add everything
		theFrame.setJMenuBar(menuBar);
		pane.add(cards, BorderLayout.CENTER);
	}

}
