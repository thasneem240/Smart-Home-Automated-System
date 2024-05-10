import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class SmartHomeAccess extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	//public static SmartHome smartHome;
	private JLabel lblNewLabel_1;
	private JButton txtLight;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JPanel panel;
	private JPanel panel_1;
	private JButton buttonLogout;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	public static int currentTemp = 73;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartHomeAccess frame = new SmartHomeAccess();
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
	public SmartHomeAccess() {
		setResizable(false);
		
		setTitle("Zeus Smart Automated Home System");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 904, 631);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Update Profile");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateProfile();
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(720, 47, 158, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\man-icon.png"));
		lblNewLabel.setBounds(21, 11, 69, 60);
		contentPane.add(lblNewLabel);
		
		txtUser = new JTextField();
		txtUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtUser.setBackground(Color.WHITE);
		txtUser.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtUser.setEditable(false);
		txtUser.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtUser.setBounds(10, 72, 101, 28);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\istockphoto-1094152938-612x612.jpg"));
		lblNewLabel_1.setBounds(0, 0, 612, 408);
		contentPane.add(lblNewLabel_1);
		
		txtLight = new JButton("LIGHT");
		txtLight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Light light = new Light();
				light.setVisible(true);
			}
		});
		txtLight.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtLight.setBackground(Color.YELLOW);
		txtLight.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtLight.setBounds(21, 499, 135, 35);
		contentPane.add(txtLight);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\update.png"));
		lblNewLabel_2.setBounds(622, 11, 101, 96);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\light-bulb-icon.png"));
		lblNewLabel_3.setBounds(36, 417, 90, 81);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\Media.png"));
		lblNewLabel_4.setBounds(247, 403, 100, 96);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\AC2.png"));
		lblNewLabel_5.setBounds(457, 438, 106, 49);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\Security.png"));
		lblNewLabel_6.setBounds(671, 380, 90, 111);
		contentPane.add(lblNewLabel_6);
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 407, 612, 185);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton_1 = new JButton("MEDIA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Media media = new Media();
				media.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(218, 93, 145, 34);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("AC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				AC ac = new AC();
				
				ac.setVisible(true);
			}
		});
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_2.setBackground(new Color(238, 130, 238));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(436, 93, 145, 31);
		panel.add(btnNewButton_2);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.info);
		panel_1.setBounds(604, 0, 284, 592);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		buttonLogout = new JButton("LOGOUT");
		buttonLogout.setBackground(new Color(30, 144, 255));
		buttonLogout.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 250, 154), new Color(255, 0, 0), null, null));
		buttonLogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logOut();
			}
		});
		buttonLogout.setBounds(151, 235, 123, 44);
		panel_1.add(buttonLogout);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\logout.png"));
		lblNewLabel_7.setBounds(29, 197, 146, 146);
		panel_1.add(lblNewLabel_7);
		
		btnNewButton_3 = new JButton("SECURITY");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Security security = new Security();
				security.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(new Color(255, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_3.setBounds(53, 500, 133, 35);
		panel_1.add(btnNewButton_3);
		
		setUserName();
	}
	
	public void setUserName() 
	{
		String userName = SmartHome.getUserName();
		txtUser.setText(userName);
	}
	
	public void updateProfile() 
	{
		this.dispose();
		
		UpdateProfile updateProfile = new UpdateProfile();
		updateProfile.setVisible(true);
	}
	
	public void logOut() 
	{
		JOptionPane.showMessageDialog(null, "Successfully Logout.");
		String currUsername = SmartHome.getUserName();
		String currPass = SmartHome.getPassword();
		
		SmartHome smartHome = new SmartHome();
		
		smartHome.setUserName(currUsername);
		smartHome.setPassword(currPass);
		this.dispose();
		
		smartHome.setTheVisible(true);
		
	}
	
}
