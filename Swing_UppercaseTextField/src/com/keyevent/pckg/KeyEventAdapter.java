package com.keyevent.pckg;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class KeyEventAdapter implements KeyListener {
	
	
	public KeyEventAdapter( JTextField field ) {
		
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {
		String character = String.valueOf( keyEvent.getKeyChar() );
		System.out.println( character );
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
