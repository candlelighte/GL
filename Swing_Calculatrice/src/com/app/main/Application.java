package com.app.main;

import javax.swing.SwingUtilities;

import com.swing.componenent.MainFrame;


public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater( new Runnable() {
			
			public void run() {
				new MainFrame();				
			}
		});
	}

}
