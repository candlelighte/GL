package com.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.services.VolService;
import com.services.impl.VolServiceImpl;

public class PanelConsultation extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton btnValider = new JButton("Valider");
	private JLabel lblRservationVol = new JLabel("Consultation vol");
	private JSeparator separator = new JSeparator();
	private JLabel lblIdRservation = new JLabel("ID réservation :");
	private JTextField textField = new JTextField();

	private static final AnnotationConfigApplicationContext APP_CONTEXT = new AnnotationConfigApplicationContext();

	private ValidationFormConsultation validationFormConslatation = new ValidationFormConsultation();
		
	@Autowired
	private VolService volService;
	
	public PanelConsultation() {

		initBeans();
		
		setBounds(266, 0, 725, 591);
		setBorder(null);
		setBackground(SystemColor.controlHighlight);
		setLayout(null);


		initializeComponent();

		add(btnValider);
		add(separator);
		add(lblRservationVol);
		add(lblIdRservation);
		add(textField);

	}

	private void initializeComponent() {

		btnValider.setBounds(521, 469, 164, 50);

		lblRservationVol.setBounds(146, 66, 491, 36);
		lblRservationVol.setHorizontalAlignment(SwingConstants.CENTER);
		lblRservationVol.setForeground(Color.BLACK);
		lblRservationVol.setFont(new Font("Dialog", Font.BOLD, 30));

		separator.setBounds(163, 114, 446, 2);

		lblIdRservation.setFont(new Font("Noto Sans CJK JP Medium", Font.BOLD, 20));
		lblIdRservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdRservation.setBounds(95, 222, 164, 57);
		
		textField.setBounds(304, 235, 269, 36);
		textField.setColumns(10);
		
		initActionOnBtn();

	}
	
	private void initActionOnBtn() {

		getBtnValider().addActionListener(validationFormConslatation);

	}
	
	private void initBeans() {
		APP_CONTEXT.scan("com.genericdao");
		APP_CONTEXT.scan("com.dao");
		APP_CONTEXT.scan("com.services");
		APP_CONTEXT.refresh();

		setVolService(APP_CONTEXT.getBean(VolServiceImpl.class));

	}

	class ValidationFormConsultation implements ActionListener {
		
		
		public void actionPerformed(ActionEvent e) {

			suplyForm();

		}

	}

	@SuppressWarnings("deprecation")
	private void suplyForm() {
		
		textField.getText();
		volService.getAllVolsBetweenDate(new Date(2018, 04, 20), new Date(2018, 8, 20));
		
	}
	
	public void setVolService(VolService volService) {
		this.volService = volService;
	}
	
	public JButton getBtnValider() {
		return btnValider;
	}


}
