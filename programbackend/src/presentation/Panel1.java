package presentation;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Panel1 extends JPanel {

	public Panel1() {
		
		
		this.setBackground(Color.red);
		this.setLayout(new BorderLayout(0, 0));
		
		JTextField text1 = new JTextField(30);
		add(text1, BorderLayout.PAGE_START);
		 
	}

}
