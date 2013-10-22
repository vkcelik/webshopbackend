package presentation;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BackEndSystem extends JFrame {

	
	private JPanel contentPane;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BackEndSystem frame = new BackEndSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BackEndSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Backend System");
		setBounds(100, 100, 662, 483);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane); 
		contentPane.setBackground(new Color(29, 160, 169));
		
		
		JLabel Label = new JLabel("Velkommen til Backend System", JLabel.CENTER);
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		contentPane.add(Label, BorderLayout.PAGE_START);
		
		 
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Varekatalog");
		menuBar.add(mnNewMenu);
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Opret varer");
		mntmNewMenuItem.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/catalog-icon (1).png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel1());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
	

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Se/Rediger Varer");
		mntmNewMenuItem_4.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel2());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
	
		
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Slet varer");
		mntmNewMenuItem_2.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431140_150.png")));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel3());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		
		JMenu mnNewMenu_1 = new JMenu("Varerhus");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Se varerhus");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel4());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tilføj varehus");
		mntmNewMenuItem_1.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel5());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Redigere varehus");
		mntmNewMenuItem_7.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel6());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Slet varehus");
		mntmNewMenuItem_6.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431140_150.png")));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel7());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenu mnNewMenu_2 = new JMenu("Kategorier");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Se kategori");
		mntmNewMenuItem_9.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/category-icon.png")));
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel8());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Tilføj kategori");
		mntmNewMenuItem_10.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel9());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Rediger kategori");
		mntmNewMenuItem_8.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu_2.add(mntmNewMenuItem_8);

		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelA());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Slet kategori");
		mntmNewMenuItem_11.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431140_150.png")));
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelB());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenu mnNewMenu_3 = new JMenu("Ordre");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Se ordre");
		mnNewMenu_3.add(mntmNewMenuItem_14);
		
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelC());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Rediger ordre");
		mntmNewMenuItem_12.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu_3.add(mntmNewMenuItem_12);
		
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelD());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Slette ordre");
		mntmNewMenuItem_16.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431140_150.png")));
		mnNewMenu_3.add(mntmNewMenuItem_16);
		
		mntmNewMenuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelE());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenu mnNewMenu_4 = new JMenu("Medarbejder");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Se medarbejder");
		mntmNewMenuItem_13.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/users-icon.png")));
		mnNewMenu_4.add(mntmNewMenuItem_13);
		
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelF());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Tilføj medarbejder");
		mntmNewMenuItem_18.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431095_103.png")));
		mnNewMenu_4.add(mntmNewMenuItem_18);
		
		mntmNewMenuItem_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelG());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Rediger medarbjeder");
		mntmNewMenuItem_17.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/Start-Menu-Run-icon (1).png")));
		mnNewMenu_4.add(mntmNewMenuItem_17);
		
		mntmNewMenuItem_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelH());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Slette medarbejeder");
		mntmNewMenuItem_19.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/1380431140_150.png")));
		mnNewMenu_4.add(mntmNewMenuItem_19);
		
		mntmNewMenuItem_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new PanelI());//Adding to content pane, not to Frame
	                repaint();
	                printAll(getGraphics());
				
			}
		});
		
		JMenu mnNewMenu_8 = new JMenu("Statistik");
		menuBar.add(mnNewMenu_8);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Se Statistik");
		mntmNewMenuItem_20.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/statistics-icon.png")));
		mnNewMenu_8.add(mntmNewMenuItem_20);
		
		JMenu mnNewMenu_5 = new JMenu("Instillinger");
		menuBar.add(mnNewMenu_5);
		
		
		
		
		
	}
	

}
