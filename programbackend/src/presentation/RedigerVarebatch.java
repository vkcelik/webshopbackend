package presentation;

import javax.swing.JPanel;

import controller.KategoriController;
import controller.VarebatchController;

public class RedigerVarebatch extends JPanel{
	private VarebatchController controller;
	
	
	public void setController(VarebatchController controller){
		this.controller = controller;
	}

}
