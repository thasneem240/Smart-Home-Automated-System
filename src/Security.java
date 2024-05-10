import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Security extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Security frame = new Security();
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
	public Security() {
		setTitle("Security System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 915, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Security Cameras");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(52, 63, 180, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\Security-Camera-icon.png"));
		lblNewLabel_1.setBounds(79, 102, 163, 105);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Switch On Cameras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchSecurity("Successfully Switched ON All Security Cameras");
			}
		});
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setBorder(new CompoundBorder());
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(52, 248, 180, 32);
		contentPane.add(btnNewButton);
		
		JButton btnSwitchOffCameras = new JButton("Switch OFF Cameras");
		btnSwitchOffCameras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchSecurity("Successfully Switched OFF All Security Cameras");
			}
		});
		btnSwitchOffCameras.setBackground(new Color(138, 43, 226));
		btnSwitchOffCameras.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSwitchOffCameras.setBorder(new CompoundBorder());
		btnSwitchOffCameras.setBounds(52, 312, 180, 32);
		contentPane.add(btnSwitchOffCameras);
		
		JLabel lblLockDoors = new JLabel("Lock Doors");
		lblLockDoors.setHorizontalAlignment(SwingConstants.CENTER);
		lblLockDoors.setForeground(Color.BLACK);
		lblLockDoors.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLockDoors.setBounds(346, 63, 180, 32);
		contentPane.add(lblLockDoors);
		
		JButton btnUnlockAllDoors = new JButton("Unlock All Doors");
		btnUnlockAllDoors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchSecurity("Successfully Unlocked All the Doors");
			}
		});
		btnUnlockAllDoors.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUnlockAllDoors.setBorder(new CompoundBorder());
		btnUnlockAllDoors.setBackground(new Color(135, 206, 250));
		btnUnlockAllDoors.setBounds(361, 248, 180, 32);
		contentPane.add(btnUnlockAllDoors);
		
		JButton btnLockAllDoors = new JButton("Lock All Doors");
		btnLockAllDoors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchSecurity("Successfully Locked All the Doors");
			}
		});
		btnLockAllDoors.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLockAllDoors.setBorder(new CompoundBorder());
		btnLockAllDoors.setBackground(new Color(224, 255, 255));
		btnLockAllDoors.setBounds(361, 312, 180, 32);
		contentPane.add(btnLockAllDoors);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\62991-door-icon.png"));
		lblNewLabel_2.setBounds(382, 87, 103, 137);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\top-benefits-of-a-smart-home-security-system.jpg"));
		lblNewLabel_3.setBounds(0, 0, 899, 597);
		contentPane.add(lblNewLabel_3);
	}
	
	public void switchSecurity(String str) 
	{
		JOptionPane.showMessageDialog(null, str);
	}

}
