package com.swing.componenent;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2730896922526447375L;
	
	
	
	private final static int PREFERED_WIDTH = 330 ; 
	private final static int PREFERED_HEIGHT = 350 ; 
	private final static String WINDOW_TITLE = "Swing Calculator Java";
	
	private OperationViewPanel operationViewPanel;
	private NumbersViewPanel numbersViewPanel;
	

	public MainFrame() {
		
		// set some important parameters 
		defaultActionForFrame();
		
		// set layout manager 
		setLayout( new BorderLayout() );
		
		// create swing component 
		operationViewPanel = new OperationViewPanel();
		operationViewPanel.setBorder( BorderFactory.createEmptyBorder(4, 4, 4, 4) );
		
		numbersViewPanel = new NumbersViewPanel();
		numbersViewPanel.setBorder( BorderFactory.createEmptyBorder(4, 4, 4, 4) );
		
		// add swing component to content pane 
		Container container = getContentPane();
		
		container.add( operationViewPanel, BorderLayout.NORTH  );
		container.add( numbersViewPanel, BorderLayout.CENTER );
		
	}
	
	private void defaultActionForFrame() {
		setTitle( WINDOW_TITLE );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setResizable( false );
		setVisible( true );
		setSize(PREFERED_WIDTH, PREFERED_HEIGHT);
	}
	
}
