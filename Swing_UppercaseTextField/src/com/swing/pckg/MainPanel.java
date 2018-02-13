package com.swing.pckg;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = -6713864780490721206L;
	
	private static final String BORDER_TITLE = "Insert texte";
	
	private final JTextField textField;
	
	public MainPanel() {
		
		defaultOperationOnPanel();
		
		/** set Layout */
		setLayout( new BorderLayout() );
		
		
		/** create swing component */
		textField = new JTextField();
		textField.setSize( new Dimension( 250, 24));
		textField.setBorder( BorderFactory.createTitledBorder( "" ));
		textField.addKeyListener( new KeyAdapter() {
			

			@Override
			public void keyReleased(KeyEvent keyEvent) {
				SwingUtilities.invokeLater( new Runnable() {
					
					@Override
					public void run() {
						String toWrite = textField.getText();
						textField.setText("");
						textField.setText( toWrite.toUpperCase() );								
					}
				});		
			}
			
		} );
		
		
		/** add component to layout manager */
		add( textField  );
		
	}
	
	private void defaultOperationOnPanel() {
		setBorder( BorderFactory.createTitledBorder( BORDER_TITLE) );
	}
	
}
