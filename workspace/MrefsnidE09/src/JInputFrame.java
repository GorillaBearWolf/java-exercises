
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JInputFrame extends JFrame {
	
	/**
	 * Input form for email account
	 */
	
	private static final long serialVersionUID = 5092615815281161689L;
	
	JLabel firstNameLabel;
	JLabel lastNameLabel;
	JLabel emailLabel;
	JLabel passwordLabel;

	JTextField firstNameField;
	JTextField lastNameField;
	JTextField emailField;
	
	JPasswordField passwordField;
	
	JButton submitButton;
	
	public JInputFrame() {
		
		super("Verify Your Email Account");
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 1440, 10)); // (alignment, hgap, vgap)
		
		TextFieldHandler handler = new TextFieldHandler();
		
		firstNameLabel = new JLabel("First Name");
		add(firstNameLabel);
		
		firstNameField = new JTextField(40); // # = length of field
		firstNameField.addActionListener(handler);
		add(firstNameField);
		
		lastNameLabel = new JLabel("Last Name");
		add(lastNameLabel);
		
		lastNameField = new JTextField(40);
		lastNameField.addActionListener(handler);
		add(lastNameField);
		
		emailLabel = new JLabel("Email Address");
		add(emailLabel);
		
		emailField = new JTextField(40);
		emailField.addActionListener(handler);
		add(emailField);
		
		passwordLabel = new JLabel("Password");
		add(passwordLabel);
		
		passwordField = new JPasswordField(24);
		add(passwordField);
		
		submitButton = new JButton("Submit Form");
		add(submitButton);
		submitButton.addActionListener(handler);
		
	}
	
	private class TextFieldHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent action) {
			
			if(action.getSource() == submitButton) {
				
				@SuppressWarnings("deprecation")
				String securePW = passwordField.getText().replaceAll(".", "•");
								
				JOptionPane.showMessageDialog(null, "FORM SUBMITTED" +
						"\n\nFirst name: " + firstNameField.getText() + 
						"\nLast name: " + lastNameField.getText() +
						"\nEmail address: " + emailField.getText() +
						"\nPassword: " + securePW, "User Information",
						JOptionPane.PLAIN_MESSAGE);
				
			} else {
				
				System.out.println(action.getSource().getClass().toString());
				System.out.println(action.getActionCommand());
				JOptionPane.showMessageDialog(null, action.getActionCommand(),
						null, JOptionPane.PLAIN_MESSAGE);
			
			}
		
		}
		
	}

}
