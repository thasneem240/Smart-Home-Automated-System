import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateProfile extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtNewPass1;
	private JTextField txtNewUser;
	private JPasswordField txtNewPass2;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel;
	private SmartHome smartHome;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_1;
	private JFrame frmUpdateSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProfile frame = new UpdateProfile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateProfile() {
		setResizable(false);
		setTitle("Update User Name, Password");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 986, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CHANGE USER NAME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				changeUserName();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setBounds(192, 167, 215, 34);
		contentPane.add(btnNewButton);
		
		txtNewPass1 = new JPasswordField();
		txtNewPass1.setBorder(new TitledBorder(null, "New Password", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtNewPass1.setBounds(539, 240, 230, 43);
		contentPane.add(txtNewPass1);
		
		JButton btnNewButton_1 = new JButton("CHANGE PASSWORD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePassword();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(192, 240, 215, 34);
		contentPane.add(btnNewButton_1);
		
		txtNewUser = new JTextField();
		txtNewUser.setBorder(new TitledBorder(null, "New User Name", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtNewUser.setBounds(539, 167, 230, 43);
		contentPane.add(txtNewUser);
		txtNewUser.setColumns(10);
		
		txtNewPass2 = new JPasswordField();
		txtNewPass2.setBorder(new TitledBorder(null, "Re Enter the Password", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtNewPass2.setBounds(539, 310, 230, 43);
		contentPane.add(txtNewPass2);
		
		btnNewButton_2 = new JButton("OK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doOk();
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(192, 455, 180, 49);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel = new JLabel("Update Profile");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(326, 43, 318, 61);
		contentPane.add(lblNewLabel);
		
		btnNewButton_3 = new JButton("RESET THE PROFILE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetTheProfile();
			}
		});
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(539, 455, 230, 49);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\SSHT-KV.jpg"));
		lblNewLabel_1.setBounds(0, 0, 970, 558);
		contentPane.add(lblNewLabel_1);
		
		smartHome = new SmartHome();
	}
	
	
	public void changeUserName() 
	{
		if(!txtNewUser.getText().isEmpty()) 
		{
			String newUserName = txtNewUser.getText();
			
			SmartHome.setUserName(newUserName);
			
			JOptionPane.showMessageDialog(null, "Successfully Updated the User Name");
			clearField();
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Please input the new UserName in the textbox");
		}
	}
	
	
	@SuppressWarnings("deprecation")
	public void changePassword() 
	{
		if(!( txtNewPass1.getText().isEmpty() || txtNewPass2.getText().isEmpty() ) )
		{
			String newPass1 = txtNewPass1.getText();
			String newPass2 = txtNewPass2.getText();
			
			if(newPass1.equals(newPass2)) 
			{
				SmartHome.setPassword(newPass1);
				JOptionPane.showMessageDialog(null, "Successfully Updated the Password");
				clearField();
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "New Password and Confirm Password Field do not match","ERROR",JOptionPane.ERROR_MESSAGE);
				clearField();
			}
			
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Please input new Password and confirm password fields");
		}
	}
	
	
	public void clearField() 
	{
		txtNewUser.setText("");
		txtNewPass1.setText("");
		txtNewPass2.setText("");
	}
	
	
	public void doOk() 
	{
		frmUpdateSystem = new JFrame();
		if(JOptionPane.showConfirmDialog(frmUpdateSystem,"Confirm if you want to exit from this Menu","Update Profile System"
				, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) 
		{
			this.dispose();
			
			smartHome.setTheVisible(true);
		}
	}
	
	
	public void resetTheProfile() 
	{
		SmartHome.setUserName(SmartHome.getDefaultUserName());
		SmartHome.setPassword(SmartHome.getDefaultPassword());
		
		JOptionPane.showMessageDialog(null, "Successfully reset the profile with Default username and password");
		clearField();
	}
	
}
