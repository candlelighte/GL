package com.gui;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelFlyChooser extends JPanel {

	private static final long serialVersionUID = 1L;

	private FlyLister flyLister = new FlyLister();

	public PanelFlyChooser() {

		setBackground(Color.LIGHT_GRAY);
		setBounds(266, 0, 725, 591);
		setLayout(null);

		initializeComponent();

		add(flyLister);

	}

	private void initializeComponent() {

	}

}
