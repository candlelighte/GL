package swing.component.pckg;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class LoginPanel extends JPanel {

	private static final long serialVersionUID = -1051066821732945387L;

	public LoginPanel() {

		defaultOperationOnPanel();

		setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		add(loginButton);

		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 80, 80, 25);
		add(registerButton);

	}
	
	public JMenuBar constructJmenuBar() {
	     JMenu menu = new JMenu("Look and Feel");
	        UIManager.LookAndFeelInfo[] lookAndFeels = UIManager.getInstalledLookAndFeels();
	        for (UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeels) {
	            JMenuItem item = new JMenuItem(lookAndFeelInfo.getName());
	            item.addActionListener(event -> {
	            	try {
	                    UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
	                    SwingUtilities.updateComponentTreeUI(this);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            });
	            menu.add(item);
	        }
	        JMenuBar menuBar = new JMenuBar();
	        menuBar.add(menu);
	        
	        return menuBar;
	}

	private void defaultOperationOnPanel() {
	}
}
