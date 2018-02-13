package com.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlyLister extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblDepart = new JLabel("Depart");
	private JLabel lblDestination = new JLabel("Destination");
	private JLabel lblDateDeDepart = new JLabel("Date de depart");
	private JLabel lblDateDarriv = new JLabel("Date d'arrivee");

	private JTextField textField = new JTextField("Casablanca");;
	private JTextField textField_1 = new JTextField("London");
	private JTextField textField_2 = new JTextField("07/06/2018");
	private JTextField textField_3 = new JTextField("08/06/2018");

	private JButton btnChoisir = new JButton("Choisir");

	private JPanel jPanelContainer = new JPanel();
	
	public FlyLister() {

		setBackground(Color.WHITE);
		setBounds(122, 0, 639, 462);
		setLayout(null);

		initializeComponent();

		add(lblDepart);
		add(textField);
		add(lblDestination);
		add(textField_1);
		add(lblDateDeDepart);
		add(textField_2);
		add(lblDateDarriv);
		add(textField_3);
		add(btnChoisir);
		add(jPanelContainer);
	}

	private void initializeComponent() {

		lblDepart.setBounds(21, 32, 43, 14);

		textField.setBounds(66, 29, 86, 20);
		textField.setColumns(10);

		lblDestination.setBounds(162, 32, 72, 14);

		textField_1.setBounds(237, 29, 86, 20);
		textField_1.setColumns(10);

		lblDateDeDepart.setBounds(20, 63, 102, 14);

		textField_2.setBounds(120, 62, 86, 20);
		textField_2.setColumns(10);

		lblDateDarriv.setBounds(252, 62, 86, 14);

		textField_3.setBounds(348, 60, 86, 20);
		textField_3.setColumns(10);

		btnChoisir.setBackground(new Color(102, 0, 102));
		btnChoisir.setBounds(499, 32, 85, 48);
		btnChoisir.setForeground(Color.WHITE);

		jPanelContainer.setBounds(5, 11, 600, 81);
	}

}
