package com.swing.componenent;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class OperationViewPanel extends JPanel {

	private static final long serialVersionUID = -7710546885585342160L;

	private static final String BORDER_TITLE = "";

	public OperationViewPanel() {

		// set default operation on the panel
		setDefaultOperationt();

		// set border to the panel
		setBorder(BorderFactory.createTitledBorder(BORDER_TITLE));

		// create swing component
		
			// where to save done operation
		JTextField operations = new JTextField();
		operations.setEditable(false);

			// where to write current operation
		JTextField operationField = new JTextField();
		operationField.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
		operationField.setPreferredSize( new Dimension(WIDTH, 60));
		
		Font f_opfield = new Font("Monospaced", Font.PLAIN, 20 );
		operationField.setFont( f_opfield );
		
		
		// set Layout
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);

		// add component to panel
		add(operations, BorderLayout.CENTER);
		add(operationField, BorderLayout.SOUTH);

	}

	private void setDefaultOperationt() {

		Dimension dimension = getPreferredSize();
		dimension.height = (int) (350 / 2);
		setPreferredSize(dimension);
	}

}
