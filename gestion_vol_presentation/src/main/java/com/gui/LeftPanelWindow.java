package com.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LeftPanelWindow extends JPanel {

	private static final long serialVersionUID = 1L;

	private static JButton btnConsultation = new JButton("Consultation");
	private static JButton btnReservation = new JButton("Réservation");
	private static JButton btnValidation = new JButton("Validation");
	private static JButton btnFlychoose = new JButton("Choisir");

	private JLabel lblAirways = new JLabel("Airways");
	private JLabel logo = new JLabel("");

	private static final String LOGO = "plan.png";

	public LeftPanelWindow() {

		setBounds(0, 0, 260, 591);
		setBorder(null);
		setBackground(new Color(51, 0, 51));

		initializeComponent();

		setLayout(null);
		add(logo);
		add(lblAirways);
		add(btnConsultation);
		add(btnValidation);
		add(btnReservation);
		add(btnFlychoose);
	}

	private void initializeComponent() {

		btnConsultation.setBounds(12, 365, 236, 46);
		btnConsultation.setForeground(Color.WHITE);
		btnConsultation.setFont(new Font("Arial", Font.PLAIN, 17));
		btnConsultation.setContentAreaFilled(false);
		//btnConsultation.setEnabled(false);

		btnValidation.setBounds(12, 312, 236, 46);
		btnValidation.setForeground(Color.WHITE);
		btnValidation.setFont(new Font("Arial", Font.PLAIN, 17));
		btnValidation.setContentAreaFilled(false);
		//btnValidation.setEnabled(false);
		
		lblAirways.setBounds(12, 122, 236, 36);
		lblAirways.setHorizontalAlignment(SwingConstants.CENTER);
		lblAirways.setForeground(Color.WHITE);
		lblAirways.setFont(new Font("Arial", Font.BOLD, 30));
		
		btnReservation.setBounds(12, 208, 236, 46);
		btnReservation.setForeground(Color.WHITE);
		btnReservation.setFont(new Font("Arial", Font.PLAIN, 17));
		btnReservation.setContentAreaFilled(false);
		//btnReservation.setEnabled(true);
		
		logo.setBounds(12, 0, 236, 116);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon(LOGO));
		logo.setForeground(Color.WHITE);

		btnFlychoose.setBounds(12, 260, 236, 46);
		btnFlychoose.setForeground(Color.WHITE);
		btnFlychoose.setFont(new Font("Arial", Font.PLAIN, 17));
		btnFlychoose.setContentAreaFilled(false);
		//btnFlychoose.setEnabled(false);

	}

	public JButton getBtnConsultation() {
		return btnConsultation;
	}

	public JButton getBtnReservation() {
		return btnReservation;
	}

	public JButton getBtnValidation() {
		return btnValidation;
	}
	
	public JButton getBtnFlychoose() {
		return btnFlychoose;
	}

}
