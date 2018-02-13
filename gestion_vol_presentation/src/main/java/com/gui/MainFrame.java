package com.gui;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private PanelConsultation panelConsultation = new PanelConsultation();
	private PanelReservation panelReservation = new PanelReservation();
	private PanelValidation panelValidation = new PanelValidation();
	private PanelFlyChooser panelFlyChooser = new PanelFlyChooser();

	private LeftPanelWindow leftPanelWindow = new LeftPanelWindow();

	private ConsultationListener consultationListener = new ConsultationListener();
	private ReservationListener reservationListener = new ReservationListener();
	private ValidationListener validationListener = new ValidationListener(  );
	private FlyChooserListener flyChooserListener = new FlyChooserListener();

	public MainFrame() {

		initialize();

		getContentPane().setLayout(null);
		getContentPane().add(leftPanelWindow);
		getContentPane().add(panelReservation);

	}

	private void initialize() {

		setUndecorated(true);
		setResizable(false);
		getContentPane().setBackground(SystemColor.controlHighlight);
		setBounds(100, 100, 981, 591);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		leftPanelWindow.getBtnConsultation().addActionListener(consultationListener);
		leftPanelWindow.getBtnReservation().addActionListener(reservationListener);
		leftPanelWindow.getBtnValidation().addActionListener(validationListener);
		leftPanelWindow.getBtnFlychoose().addActionListener(flyChooserListener);

	}

	class ConsultationListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			if (event.getSource().getClass().getName().equals("javax.swing.JButton")) {

				if (event.getSource() == leftPanelWindow.getBtnConsultation()) {

					SwingUtilities.invokeLater(new Runnable() {

						@Override
						public void run() {
							
						}
					});

					getContentPane().remove(panelReservation);
					getContentPane().remove(panelValidation);
					getContentPane().remove(panelFlyChooser);
					getContentPane().add(panelConsultation);
					repaint();

				}

			}
		}

	}

	class ReservationListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			if (event.getSource().getClass().getName().equals("javax.swing.JButton")) {

				if (event.getSource() == leftPanelWindow.getBtnReservation()) {

					getContentPane().remove(panelConsultation);
					getContentPane().remove(panelValidation);
					getContentPane().add(panelReservation);
					repaint();

				}
			}

		}

	}

	class ValidationListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			if (event.getSource().getClass().getName().equals("javax.swing.JButton")) {

				if (event.getSource() == leftPanelWindow.getBtnValidation()) {

					getContentPane().remove(panelConsultation);
					getContentPane().remove(panelReservation);
					getContentPane().remove(panelFlyChooser);
					getContentPane().add(panelValidation);
					repaint();

				}
			}

		}

	}

	class FlyChooserListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			if (event.getSource().getClass().getName().equals("javax.swing.JButton")) {

				if (event.getSource() == leftPanelWindow.getBtnFlychoose()) {

					getContentPane().remove(panelConsultation);
					getContentPane().remove(panelValidation);
					getContentPane().remove(panelReservation);
					getContentPane().add(panelFlyChooser);
					repaint();

				}
			}

		}

	}

}