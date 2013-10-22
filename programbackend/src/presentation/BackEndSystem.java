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
		contentPane.setBackground(new Color(0, 145, 255));
		
		
		JLabel Label = new JLabel("Velkommen til Backend System", JLabel.CENTER);
		Label.setFont(new Font("sansserif", Font.BOLD, 24));
		Label.setForeground(Color.white);
		contentPane.add(Label, BorderLayout.PAGE_START);
		
		 
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Varekatalog");
		menuBar.add(mnNewMenu);
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Tilføj varer");
		mntmNewMenuItem.setIcon(new ImageIcon(BackEndSystem.class.getResource("/presentation/resources/catalog-icon (1).png")));
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
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					getContentPane().removeAll();
	                getContentPane().add(new Panel4());//Adding to content pane, not to Frame
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
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Se/Rediger kategori");
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
		
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Se/Rediger ordre");
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
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Se/Rediger medarbejder");
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
