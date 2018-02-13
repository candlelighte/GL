package app.cpkg;

import javax.swing.SwingUtilities;
import swing.component.pckg.MainFrame;

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
