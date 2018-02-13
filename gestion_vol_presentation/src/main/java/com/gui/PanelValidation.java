package com.gui;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class PanelValidation extends JPanel {

	private static final long serialVersionUID = 1L;

	private Button btnAnnulReservation = new Button("ANNULER RESERVATION");
	private JLabel lblReservation = new JLabel("RESERVATION");
	private JLabel lblDepart = new JLabel("DEPART");
	private JLabel lblDepHoceima = new JLabel("HOCEIMA");
	private JSeparator separator = new JSeparator();
	private JLabel lblArrivee = new JLabel("ARRIVEE");
	private JLabel lblArrivee_2 = new JLabel("ARRIVEE");
	private JSeparator separator_1 = new JSeparator();
	private JLabel lblDateDepart = new JLabel("DATE DEPART");
	private JLabel lblDateDepart2 = new JLabel("DATEDEPART");
	private JSeparator separator_2 = new JSeparator();
	private JLabel lblDateArrivee = new JLabel("DATE ARRIVEE");
	private JLabel lblDateArrivee2 = new JLabel("DATEARRIVEE");
	private JSeparator separator_3 = new JSeparator();

	public PanelValidation() {

		setBackground(Color.WHITE);
		setBounds(266, 0, 725, 591);
		setLayout(null);

		initializeComponent();

		add(btnAnnulReservation);
		add(lblReservation);
		add(lblDepart);
		add(lblDepHoceima);
		add(separator);
		add(lblArrivee);
		add(lblArrivee_2);
		add(separator_1);
		add(lblDateDepart);
		add(lblDateDepart2);
		add(separator_2);
		add(lblDateArrivee);
		add(lblDateArrivee2);
		add(separator_3);
	}

	private void initializeComponent() {

		btnAnnulReservation.setBounds(425, 404, 166, 48);
		btnAnnulReservation.setForeground(Color.WHITE);
		btnAnnulReservation.setBackground(new Color(102, 0, 102));

		lblReservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservation.setForeground(new Color(51, 0, 51));
		lblReservation.setBackground(Color.PINK);
		lblReservation.setBounds(10, 56, 127, 36);

		lblDepart.setForeground(Color.BLACK);
		lblDepart.setBounds(86, 131, 61, 27);

		lblDepHoceima.setBounds(228, 126, 245, 36);

		separator.setBounds(231, 162, 226, 2);

		lblArrivee.setForeground(Color.BLACK);
		lblArrivee.setBounds(86, 186, 61, 27);

		lblArrivee_2.setBounds(228, 192, 245, 36);

		separator_1.setBounds(231, 226, 226, 2);

		lblDateDepart.setForeground(Color.BLACK);
		lblDateDepart.setBounds(86, 249, 87, 27);

		lblDateDepart2.setBounds(228, 255, 245, 36);

		separator_2.setBounds(228, 289, 226, 2);

		lblDateArrivee.setForeground(Color.BLACK);
		lblDateArrivee.setBounds(86, 313, 87, 27);

		lblDateArrivee2.setBounds(228, 319, 245, 36);

		separator_3.setBounds(228, 353, 226, 2);

	}

}
