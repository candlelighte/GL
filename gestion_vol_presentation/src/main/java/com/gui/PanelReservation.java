package com.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bo.Aeroport;
import com.bo.Client;
import com.bo.Reservation;
import com.services.AeoroportService;
import com.services.ReservationService;
import com.services.impl.AeroportServiceImpl;
import com.services.impl.ReservationServiceImpl;
import com.toedter.calendar.JDateChooser;

public class PanelReservation extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblNom = new JLabel("Nom : ");
	private JLabel lblPrenom = new JLabel("Prenom : ");
	private JLabel lblFixDepart = new JLabel("De : ");
	private JLabel lblFixDestination = new JLabel("Â :");
	private JLabel lblFixDateDep = new JLabel("Date Départ : ");
	private JLabel lblFixDateRet = new JLabel("Date Retour : ");
	private JTextField jTextFieldNom = new JTextField();
	private JTextField jTextFieldPrenom = new JTextField();
	private JComboBox<String> comboBoxDepart = new JComboBox<String>();
	private JComboBox<String> comboBoxArrivee = new JComboBox<String>();
	private JDateChooser dateAlleeChosser = new JDateChooser();
	private JDateChooser dateRetourChosser = new JDateChooser();
	private JButton btnValidation = new JButton("Valider");
	private JLabel lblRservationVol = new JLabel("Réservation Vol");
	private JSeparator separator = new JSeparator();

	private ValidationFormReservtion validationFormReservtion = new ValidationFormReservtion();

	private static final AnnotationConfigApplicationContext APP_CONTEXT = new AnnotationConfigApplicationContext();
	@Autowired
	private AeoroportService aeoroportService;
	@Autowired
	private ReservationService reservationService;
	
	List<Aeroport> list;
	
	

	public PanelReservation() {

		initBeans();

		setBounds(266, 0, 725, 591);
		setBorder(null);
		setBackground(SystemColor.controlHighlight);

		initializeComponent();

		initActionOnBtn();

		setLayout(null);
		add(lblNom);
		add(lblPrenom);
		add(jTextFieldNom);
		add(jTextFieldPrenom);
		add(lblFixDateDep);
		add(lblFixDateRet);
		add(dateAlleeChosser);
		add(dateRetourChosser);
		add(btnValidation);
		add(lblFixDepart);
		add(comboBoxDepart);
		add(lblFixDestination);
		add(comboBoxArrivee);
		add(separator);
		add(lblRservationVol);
	}

	private void initializeComponent() {

		
		lblFixDepart.setBounds(24, 222, 60, 36);
		lblFixDepart.setFont(new Font("Noto Sans CJK JP Medium", Font.BOLD, 16));

		
		lblFixDestination.setBounds(356, 222, 39, 36);
		lblFixDestination.setFont(new Font("Noto Sans CJK JP Medium", Font.BOLD, 16));

		lblFixDateDep.setBounds(196, 349, 118, 50);
		lblFixDateDep.setFont(new Font("Noto Sans CJK JP Medium", Font.BOLD, 16));

		lblFixDateRet.setBounds(196, 400, 118, 50);
		lblFixDateRet.setFont(new Font("Noto Sans CJK JP Medium", Font.BOLD, 16));
				
		comboBoxDepart.setBounds(96, 219, 196, 43);
		initComboBox(list, comboBoxDepart);

		comboBoxArrivee.setBounds(413, 219, 190, 43);
		initComboBox(list, comboBoxArrivee);

		dateAlleeChosser.setBounds(332, 349, 202, 50);
		dateRetourChosser.setBounds(332, 400, 202, 50);

		btnValidation.setBounds(534, 481, 164, 50);

		lblRservationVol.setBounds(118, 66, 491, 36);
		lblRservationVol.setHorizontalAlignment(SwingConstants.CENTER);
		lblRservationVol.setForeground(Color.BLACK);
		lblRservationVol.setFont(new Font("Dialog", Font.BOLD, 30));
		
		
		lblNom.setBounds(300, 130, 202, 50);
		lblNom.setFont(new Font("Noto Sans CJK JP Medium", Font.BOLD, 16));
		jTextFieldNom.setBounds(350, 130, 202, 50);

		lblPrenom.setBounds(300, 160, 202, 50);
		lblPrenom.setFont(new Font("Noto Sans CJK JP Medium", Font.BOLD, 16));
		jTextFieldPrenom.setBounds(350, 160, 202, 50);




		separator.setBounds(163, 114, 463, 2);

	}

	private void initActionOnBtn() {

		getBtnValidation().addActionListener(validationFormReservtion);

	}

	private void initBeans() {
		APP_CONTEXT.scan("com.genericdao");
		APP_CONTEXT.scan("com.dao");
		APP_CONTEXT.scan("com.services");
		APP_CONTEXT.refresh();

		setAeoroportService(APP_CONTEXT.getBean(AeroportServiceImpl.class));
		setReservationService(APP_CONTEXT.getBean(ReservationServiceImpl.class));
		

		list = aeoroportService.getAllAerport();

	}

	class ValidationFormReservtion implements ActionListener {
		
		JButton btn;
		
		public ValidationFormReservtion() {}
		
		public ValidationFormReservtion( JButton btn ) {

		this.btn = btn;
		btn.setEnabled(true);
		
		}

		public void actionPerformed(ActionEvent e) {

			suplyForm();

		}

	}

	private void suplyForm() {

		Client client = new Client();
		client.setIdClient(1L);
		client.setNom( jTextFieldNom.getName() );
		client.setPrenom(jTextFieldPrenom.getText() );
		
		Reservation reservation = new Reservation();
		reservation.setClient(client);
		
		java.sql.Date sqldateAllee = new java.sql.Date(dateAlleeChosser.getDate().getTime());
		reservation.setDateAllee(sqldateAllee);
		
		java.sql.Date sqldateRetour = new java.sql.Date(dateRetourChosser.getDate().getTime());
		reservation.setDateRetour(sqldateRetour);
		
		reservation.setNumeroReservation( (int)( Math.random() * ( 100 - 10 ) ) );
		
		
		
		reservationService.addReservation(reservation);

	}

	public JButton getBtnValidation() {
		return btnValidation;
	}

	public AeoroportService getAeoroportService() {
		return aeoroportService;
	}

	public void setAeoroportService(AeoroportService aeoroportService) {
		this.aeoroportService = aeoroportService;
	}
	
	public void setReservationService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	private void initComboBox(List<Aeroport> list, JComboBox<String> box) {
		for (Aeroport aeroport : list) {
			box.addItem(aeroport.getNom());
		}
	}

}
