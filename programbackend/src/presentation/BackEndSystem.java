package presentation;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class BackEndSystem extends JFrame {

	
	
	private JPanel contentPane;
	
	
	public BackEndSystem() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Backend System");
		setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane); 
		contentPane.add(new Forside());
		contentPane.setBackground(new Color(51, 161, 201));
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Varekatalog");
		menuBar.add(mnNewMenu);


		JMenuItem mntmNewMenuItem = new JMenuItem("Tilføj varer");
		mntmNewMenuItem.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu.add(mntmNewMenuItem);

		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new TilføjVarer());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});


		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Se/Rediger Varer");
		mntmNewMenuItem_4.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
		mnNewMenu.add(mntmNewMenuItem_4);

		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new RedigerSletVare());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});



		JMenu mnNewMenu_1 = new JMenu("Varerhus");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tilføj varehus");
		mntmNewMenuItem_1.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_1.add(mntmNewMenuItem_1);

		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new TilføjVarerhus());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Se/Rediger varerhus");
		mntmNewMenuItem_5.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
		mnNewMenu_1.add(mntmNewMenuItem_5);

		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new SeSletVarehus());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});


		JMenu mnNewMenu_2 = new JMenu("Kategorier");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Tilføj kategori");
		mntmNewMenuItem_10.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_2.add(mntmNewMenuItem_10);

		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new TilføjKategori());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Se/Rediger kategori");
		mntmNewMenuItem_9.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
		mnNewMenu_2.add(mntmNewMenuItem_9);

		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new RedigerSletKategori());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});



		JMenu mnNewMenu_4 = new JMenu("Medarbejder");
		menuBar.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Tilføj medarbejder");
		mntmNewMenuItem_18.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_4.add(mntmNewMenuItem_18);

		mntmNewMenuItem_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new TilføjMedarbejder());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Se/Rediger medarbejder");
		mntmNewMenuItem_13.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/users-icon.png")));
		mnNewMenu_4.add(mntmNewMenuItem_13);

		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new RedigerSletMedarbejder());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});
		
		JMenu mnNewMenu_32 = new JMenu("Kunde");
		menuBar.add(mnNewMenu_32);
		
		JMenuItem mntmNewMenuItem_32 = new JMenuItem("Tilføj Kunde");
		mntmNewMenuItem_32.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_32.add(mntmNewMenuItem_32);

		mntmNewMenuItem_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new TilføjKunde());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});
		
		JMenuItem mntmNewMenuItem_323 = new JMenuItem("Rediger Kunde");
		mntmNewMenuItem_13.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/users-icon.png")));
		mnNewMenu_32.add(mntmNewMenuItem_323);

		mntmNewMenuItem_323.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new RedigerSletKunde());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});
		
		


		JMenu mnNewMenu_3 = new JMenu("Ordre");
		menuBar.add(mnNewMenu_3);


		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Se ordre");
		mntmNewMenuItem_12.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu_3.add(mntmNewMenuItem_12);

		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				getContentPane().removeAll();
				getContentPane().add(new SeOrdre());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});



		JMenu mnNewMenu_8 = new JMenu("Statistik");
		menuBar.add(mnNewMenu_8);

		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Se Statistik");
		mntmNewMenuItem_20.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/statistics-icon.png")));
		mnNewMenu_8.add(mntmNewMenuItem_20);
		mntmNewMenuItem_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				getContentPane().removeAll();
				getContentPane().add(new Forside());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});
	



		JMenu mnNewMenu_5 = new JMenu("Instillinger");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mnNewMenu_51 = new JMenuItem("Se instillinger");
		mnNewMenu_51.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu_5.add(mnNewMenu_51);
		
		
		mnNewMenu_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				getContentPane().removeAll();
				getContentPane().add(new Indstillinger());//Adding to content pane, not to Frame
				repaint();
				printAll(getGraphics());

			}
		});


	}


}
