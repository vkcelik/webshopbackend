package presentation;

import java.awt.Color;

import javax.swing.JPanel;

import controller.IndstillingerController;

public class Indstillinger extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4449413241907178775L;
	private IndstillingerController controller;

	public Indstillinger() {
		
		this.setBackground(new Color(51, 161, 201));
		setLayout(null);

	}

	public void setController(IndstillingerController indstillingerController) {
		this.controller = indstillingerController;
	}

}
