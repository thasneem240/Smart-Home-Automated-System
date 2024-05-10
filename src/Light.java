import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Light extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Light frame = new Light();
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
	public Light() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Ligting System");
		setResizable(false);
		setBounds(100, 100, 959, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Dining Room");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 11, 210, 56);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("1 Device");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(71, 66, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\light-bulb-icon.png"));
		lblNewLabel_2.setBounds(51, 66, 96, 118);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("ON");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-ON the Device in Dining Room");
			}
		});
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(10, 195, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OFF");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				switchLight(" Successfully Switched-OFF the Device in Dining Room");
			}
		});
		btnNewButton_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(131, 195, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Entrance");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(10, 260, 210, 56);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("1 Device");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(71, 311, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\light-bulb-icon.png"));
		lblNewLabel_2_1.setBounds(51, 327, 96, 118);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Bed Room");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(362, 11, 210, 56);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("1 Device");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(423, 66, 75, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\light-bulb-icon.png"));
		lblNewLabel_2_2.setBounds(403, 66, 96, 118);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Kitchen");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1.setBounds(706, 11, 210, 56);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\light-bulb-icon.png"));
		lblNewLabel_2_2_1.setBounds(747, 66, 96, 118);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("1 Device");
		lblNewLabel_4_1.setForeground(Color.BLUE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(767, 66, 75, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JButton btnNewButton_2 = new JButton("ON");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-ON the Device in Bed Room");
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(362, 195, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("OFF");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-OFF the Device in Bed Room");
			}
		});
		btnNewButton_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(483, 195, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("ON");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-ON the Device in Kitchen");
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setBounds(723, 195, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("OFF");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-OFF the Device in Kitchen");
			}
		});
		btnNewButton_1_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1_2.setBackground(Color.RED);
		btnNewButton_1_2.setBounds(844, 195, 89, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton("ON");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-ON the Device in Entrance");
			}
		});
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setBounds(10, 456, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("OFF");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-OFF the Device in Entrance");
			}
		});
		btnNewButton_1_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1_3.setBackground(Color.RED);
		btnNewButton_1_3.setBounds(131, 456, 89, 23);
		contentPane.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Living Room");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(534, 260, 210, 56);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("2 Device");
		lblNewLabel_3_1.setForeground(Color.BLUE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(607, 311, 75, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\light-bulb-icon.png"));
		lblNewLabel_2_1_1.setBounds(403, 327, 96, 118);
		contentPane.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_4_1 = new JButton("ON");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-ON the Device 1 in Living Room");
			}
		});
		btnNewButton_4_1.setForeground(Color.BLACK);
		btnNewButton_4_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_4_1.setBackground(Color.GREEN);
		btnNewButton_4_1.setBounds(362, 456, 89, 23);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_1_3_1 = new JButton("OFF");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-OFF the Device 1 in Living Room");
			}
		});
		btnNewButton_1_3_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1_3_1.setBackground(Color.RED);
		btnNewButton_1_3_1.setBounds(483, 456, 89, 23);
		contentPane.add(btnNewButton_1_3_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\light-bulb-icon.png"));
		lblNewLabel_2_1_1_1.setBounds(764, 327, 96, 118);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JButton btnNewButton_4_1_1 = new JButton("ON");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-ON the Device 2 in Living Room");
			}
		});
		btnNewButton_4_1_1.setForeground(Color.BLACK);
		btnNewButton_4_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_4_1_1.setBackground(Color.GREEN);
		btnNewButton_4_1_1.setBounds(723, 456, 89, 23);
		contentPane.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_1_3_1_1 = new JButton("OFF");
		btnNewButton_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchLight(" Successfully Switched-OFF the Device 2 in Living Room");
			}
		});
		btnNewButton_1_3_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1_3_1_1.setBackground(Color.RED);
		btnNewButton_1_3_1_1.setBounds(844, 456, 89, 23);
		contentPane.add(btnNewButton_1_3_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 11, 255, 233);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(341, 11, 255, 233);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(688, 11, 255, 233);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(0, 267, 255, 233);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.CYAN);
		panel_4.setBounds(341, 267, 602, 233);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\large.jpg"));
		lblNewLabel_5.setBounds(0, 0, 943, 648);
		contentPane.add(lblNewLabel_5);
	}
	
	public void switchLight(String str) 
	{
		JOptionPane.showMessageDialog(null, str);
	}
}
