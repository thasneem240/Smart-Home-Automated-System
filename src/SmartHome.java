import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class SmartHome {

	private JFrame smartHomeMain;
	private JTextField txtName;
	private JTextField txtPassword;
	private static final String DEFAULT_USER_NAME ="user";
	private static final String DEFAULT_PASSWORD ="password";
	private static String userName;
	private static String password;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JFrame frmLoginSystem;
	private JLabel backGroundImage;
	
	

	public static String getUserName() 
	{
		return userName;
	}

	public static void setUserName(String pUserName) {
		userName = pUserName;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String pPassword) {
		password = pPassword;
	}
	
	public static String getDefaultUserName() {
		return DEFAULT_USER_NAME;
	}

	public static String getDefaultPassword() {
		return DEFAULT_PASSWORD;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartHome window = new SmartHome();
					window.smartHomeMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SmartHome() {
		initialize();
		userName = DEFAULT_USER_NAME;
		password = DEFAULT_PASSWORD;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		smartHomeMain = new JFrame();
		smartHomeMain.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thasneem2\\OneDrive\\Desktop\\automated-home.jpg"));
		smartHomeMain.setResizable(false);
		smartHomeMain.setFont(new Font("Dialog", Font.BOLD, 12));
		smartHomeMain.setTitle("Smart Home Automated System");
		smartHomeMain.setBounds(100, 100, 833, 746);
		smartHomeMain.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		smartHomeMain.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		lblNewLabel.setBounds(22, 11, 294, 59);
		smartHomeMain.getContentPane().add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(290, 168, 217, 26);
		smartHomeMain.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(290, 229, 217, 28);
		smartHomeMain.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(130, 165, 136, 28);
		smartHomeMain.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(130, 227, 136, 28);
		smartHomeMain.getContentPane().add(lblNewLabel_2);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\Ok.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnNewButton.setBackground(new Color(0, 250, 154));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setBounds(291, 309, 136, 53);
		smartHomeMain.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setBackground(new Color(255, 20, 147));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(84, 309, 136, 53);
		smartHomeMain.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				exit();
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_2.setBounds(483, 309, 136, 53);
		smartHomeMain.getContentPane().add(btnNewButton_2);
		
		backGroundImage = new JLabel("");
		backGroundImage.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\hom.png"));
		backGroundImage.setBounds(0, 0, 817, 707);
		smartHomeMain.getContentPane().add(backGroundImage);
		
	}
	
	public void clearFields() 
	{
		txtName.setText("");
		txtPassword.setText("");
		
	}
	
	public void login()
	{
		// Check the text field is empty or not
		if( !(txtName.getText().isEmpty() || txtPassword.getText().isEmpty()))
		{
			if(txtName.getText().equals(userName) && txtPassword.getText().equals(password)) 
			{
				JOptionPane.showMessageDialog(null, "Login Successfull");
				clearFields();
				
				SmartHomeAccess homeAccess = new SmartHomeAccess();
				
				setTheVisible(false);
				homeAccess.setVisible(true);
				
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid User Name or Password","ERROR",JOptionPane.ERROR_MESSAGE);
				clearFields();
			}
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Please input userName, Password!!");
		}
	}
	
	public void setTheVisible(boolean bool) 
	{
		smartHomeMain.setVisible(bool);
	}
	
	public void exit() 
	{
		frmLoginSystem = new JFrame();
		if(JOptionPane.showConfirmDialog(frmLoginSystem,"Confirm if you want to exit","Login System"
				, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) 
		{
			System.exit(0);
		}
	}
}
