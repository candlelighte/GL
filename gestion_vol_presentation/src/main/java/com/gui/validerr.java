package com.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class validerr extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel pan;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					validerr fram = new validerr();
					fram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public validerr() {
//		//cnx � la bdd
		valider2();
		//affichage;
	}
//	public void affichage(){
//		try{
//		  String request="select * from vol_table";	
//		  //ps= conn.prepareStatement(request);
//			//rs=ps.executeQuery();
//		}catch(Exception e){
//			System.out.println("Exception");
//		}
//		
//		
//		
//		
//		
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void valider2() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 505);
		
		pan = new JPanel();
		pan.setBackground(Color.LIGHT_GRAY);
		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(122, 0, 639, 462);
		pan.add(panel);
		panel.setLayout(null);
		
	
		
		JLabel lblDepart = new JLabel("Depart");
		lblDepart.setBounds(21, 32, 43, 14);
		panel.add(lblDepart);
		
		textField = new JTextField("Casablanca");
		textField.setBounds(66, 29, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setBounds(162, 32, 72, 14);
		panel.add(lblDestination);
		
		textField_1 = new JTextField("London");
		textField_1.setBounds(237, 29, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDateDeDepart = new JLabel("Date de depart");
		lblDateDeDepart.setBounds(20, 63, 102, 14);
		panel.add(lblDateDeDepart);
		
		textField_2 = new JTextField("07/06/2018");
		textField_2.setBounds(120, 62, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDateDarriv = new JLabel("Date d'arriv�e");
		lblDateDarriv.setBounds(252, 62, 86, 14);
		panel.add(lblDateDarriv);
		
		textField_3 = new JTextField("08/06/2018");
		textField_3.setBounds(348, 60, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnChoisir = new JButton("Choisir");
		btnChoisir.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent arg0){
		    	 // ici on doit ajouter le vol choisi � la reservation
		    	 
		     }});
		btnChoisir.setBackground(new Color(102, 0, 102));
		btnChoisir.setBounds(499, 32, 85, 48);
		btnChoisir.setForeground(Color.WHITE);

		panel.add(btnChoisir);
		
		
		//Ce pannel doit se multiplier pr afficher tous les vols
		JPanel panell = new JPanel();
		panell.setBounds(5, 11, 600, 81);
		panel.add(panell);

		
	}
}



