package presentation;

import javax.swing.JPanel;

import controller.KategoriController;
import controller.LeveringsmetodeController;

public class OversigtLeveringsmetode extends JPanel {
	
	private LeveringsmetodeController controller;
	
	public void setController(LeveringsmetodeController controller){
		this.controller = controller;
	}

}
