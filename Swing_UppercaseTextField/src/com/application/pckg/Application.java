package com.application.pckg;

import javax.swing.SwingUtilities;

import com.swing.pckg.MainFrame;

public class Application {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater( new Runnable() {
			
			@Override
			public void run() {
				
				new MainFrame();
				
			}
		});
	}

}
