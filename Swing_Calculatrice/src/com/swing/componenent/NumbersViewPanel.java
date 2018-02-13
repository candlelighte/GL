package com.swing.componenent;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NumbersViewPanel extends JPanel {
	
	private static final long serialVersionUID = -7951336041790522817L;

	public NumbersViewPanel() {
		
		// set default operation on the panel
		setDefaultOperationt();
		
		
		// create swing component
			
		// generating buttons of numbers 
		List<JButton> buttonsNumbers = new ArrayList<JButton>();
		generateValuesOfNumbers( buttonsNumbers );
		
		// generating buttons of expression 
		List<JButton> buttonsExpression = new ArrayList<JButton>();
		generateValuesOfExpression( buttonsExpression );
	
		
		// set Layout 
		setLayout( new GridBagLayout() );
		
		GridBagConstraints bagConstraints = new GridBagConstraints();
		
		bagConstraints.fill = GridBagConstraints.BOTH;
		bagConstraints.insets = new Insets(4, 4, 4, 4);
		bagConstraints.ipady = bagConstraints.anchor = GridBagConstraints.CENTER;
		
		
		bagConstraints.weightx = 6;
		bagConstraints.weighty = 4;
		
		int k = 0;
		
		bagConstraints.gridx = 0;
		bagConstraints.gridy = 0;
		
		
		for( int i = 0; i < 3; i ++ ) {
			for( int j = 0; j < 4; j++) {
				bagConstraints.gridx = i;
				bagConstraints.gridy = j;
				
				if( k <= 9 )
					add( buttonsNumbers.get( k ), bagConstraints );
				
				k++;
			}
		}
		
		
		k = 0;
		
		bagConstraints.gridx = 3;
		bagConstraints.gridy = 0;
		
		for( int i = 0; i < 1; i ++ ) {			
			for( int j = 0; j < 3; j++) {
				
				if( k <= 6 )
					add( buttonsExpression.get( k ), bagConstraints );
				
				k++;
				 System.out.println(  bagConstraints.gridy);

				bagConstraints.gridy++;
			}
			
			 bagConstraints.gridx++; 
		}
		
		
		
	}
	
	
	
	
	private void setDefaultOperationt() {
		Dimension dimension = getPreferredSize();
		dimension.height = (int) (350 / 2);
		setPreferredSize(dimension);
	}
	
	private void generateValuesOfNumbers( List<JButton> list ) {
		Font f_btn = new Font("Monospaced", Font.PLAIN, 12 );
		for (int i = 0; i < 10; i++) {
			list.add( new JButton( "" + i ) );
			list.get(i).setFont( f_btn );
		}
	}
	
	private void generateValuesOfExpression( List<JButton> list ) {
		
		Font f_btn = new Font("Monospaced", Font.PLAIN, 12 );

		list.add( new JButton( "=" ));
		list.add( new JButton( "+" ));
		list.add( new JButton( "-" ));
		list.add( new JButton( "*" ));
		list.add( new JButton( "/" ));
		list.add( new JButton( "%" ));
		list.add( new JButton( "," ));
		
		for (int i = 0; i < 7; i++) {
			list.get(i).setFont( f_btn );
		}
	}

}
