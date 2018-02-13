package com.swing.pckg;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 5008029295020349784L;
	
	private static final String TITLE_FRAME = "Uppercase JTextField";
	private static final int WIDTH = 380;
	private static final int HEIGHT = 150;
	
	private MainPanel mainPanel;
	
	public MainFrame() {
		
		/** Setting up some default actions for frame */
		defaultActionOnFrame();
		
		/** Set layout manager */
		setLayout( new BorderLayout() );
		
		
		/** create swing component */
		mainPanel = new MainPanel();
		
		/** add swing component to content panel*/
		Container container = getContentPane();
		
		container.add( mainPanel, BorderLayout.CENTER );

	}
	
	
	
	private void defaultActionOnFrame() {
		setTitle( TITLE_FRAME );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// get dimension of my screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setLocation( (int)screenSize.getWidth() / 3, (int)screenSize.getHeight() / 3 );
		
		setSize( WIDTH, HEIGHT );
		setVisible( true );
	}
	
	
}
