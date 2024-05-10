import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AC extends JFrame {

	private JPanel contentPane;
	private JTextField txtTemp;
	private JLabel lblNewLabel_1;
	private JTextField txtNewTemp;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AC frame = new AC();
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
	public AC() {
		setResizable(false);
		setTitle("AC System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 862, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current Temperature = ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(428, 204, 226, 32);
		contentPane.add(lblNewLabel);
		
		txtTemp = new JTextField();
		txtTemp.setEditable(false);
		txtTemp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTemp.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtTemp.setBounds(670, 206, 112, 29);
		contentPane.add(txtTemp);
		txtTemp.setColumns(10);
		String str = String.valueOf(SmartHomeAccess.currentTemp);
		txtTemp.setText("  " + str + "°C");
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\AC.png"));
		lblNewLabel_1.setBounds(479, 152, 103, 57);
		contentPane.add(lblNewLabel_1);
		
		txtNewTemp = new JTextField();
		txtNewTemp.setBounds(700, 467, 112, 39);
		contentPane.add(txtNewTemp);
		txtNewTemp.setColumns(10);
		
		btnNewButton = new JButton("Adjust Temperature");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				adjustTemp();
			}
		});
		btnNewButton.setBounds(428, 467, 248, 40);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\Make-AC-Smart-With-Cielo-Breez.jpg"));
		lblNewLabel_2.setBounds(0, 0, 846, 562);
		contentPane.add(lblNewLabel_2);
	}
	
	
	public void adjustTemp() 
	{
		if(!txtNewTemp.getText().isEmpty() ) 
		{
			int newTemp = Integer.parseInt(txtNewTemp.getText());
			
			txtTemp.setText("  " + txtNewTemp.getText() + "°C");
			
			SmartHomeAccess.currentTemp = newTemp;
			txtNewTemp.setText("");
			
			JOptionPane.showMessageDialog(null, "Successfully Adjusted the Temperature");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Empty Field!! Please input the new Temperature in the specific Field");
		}
	}
}
