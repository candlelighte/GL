package swing.component.pckg;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -6841710956059652773L;
	
	private static final String TITLE_FRAME = "Look & Feel";
	private static final int WIDTH = 300;
	private static final int HEIGHT = 180;
	
	private LoginPanel loginPanel;

	
	public MainFrame() {
		
		defaultActionOnFrame();
		
		loginPanel = new LoginPanel();
					
		this.add( loginPanel );
		
		setJMenuBar( loginPanel.constructJmenuBar() );

	}

	private void defaultActionOnFrame() {
		setTitle( TITLE_FRAME );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// get dimension of my screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setLocation( (int)screenSize.getWidth() / 3, (int)screenSize.getHeight() / 3 );
		
		setSize( WIDTH, HEIGHT );
		setVisible( true );
	}
	
}
