package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class tut implements ActionListener{
	
	private static JLabel userLabel; 
	private static JTextField userText; 
	private static JLabel passwordLabel; 
	private static JTextField passwordText;
	private static JButton button; 
	private static JLabel successful;
	private static  JLabel unsuccessful;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25); //x, y, width, height
		panel.add(userLabel);
				
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);

		
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new tut());
		panel.add(button);
		
		
		successful = new JLabel();
		successful.setBounds(10, 110, 300, 25);
		panel.add(successful);
		
		
		unsuccessful = new JLabel();
		unsuccessful.setBounds(10, 110, 300, 25);
		panel.add(unsuccessful);
		frame.setVisible(true);
		
				

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userText.getText(); 
		String password = passwordText.getText();
		
		if(user.equals("Shalia") && password.equals("Shalia")) {
		
			successful.setText("Successful Login");
			System.out.println(successful);
			
		} else { 
			
			unsuccessful.setText("Inccorrect User or Password");
			System.out.println(unsuccessful);
		}
		//doesn't clear message if retry
	} 
	


}
