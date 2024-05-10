import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.border.BevelBorder;

public class Media extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media frame = new Media();
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
	public Media() {
		setTitle("Media System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 934, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TV");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(215, 326, 90, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblRadio = new JLabel("Radio");
		lblRadio.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadio.setForeground(Color.MAGENTA);
		lblRadio.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblRadio.setBounds(541, 326, 152, 57);
		contentPane.add(lblRadio);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\Devices-video-television-icon.png"));
		lblNewLabel_1.setBounds(79, 299, 139, 115);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\62807-radio-icon.png"));
		lblNewLabel_2.setBounds(403, 286, 128, 128);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Switch ON TV");
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchMedia(" TV Successfully Switched On ");
			}
		});
		btnNewButton.setBounds(79, 425, 122, 33);
		contentPane.add(btnNewButton);
		
		JButton btnSwitchOffTv = new JButton("Switch OFF TV");
		btnSwitchOffTv.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSwitchOffTv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchMedia(" TV Successfully Switched OFF ");
			}
		});
		btnSwitchOffTv.setBounds(79, 498, 122, 33);
		contentPane.add(btnSwitchOffTv);
		
		JButton btnPlayMusic = new JButton("Play Music");
		btnPlayMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchMedia(" Radio Succesfully playing Music ");
			}
		});
		btnPlayMusic.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnPlayMusic.setBounds(405, 425, 122, 33);
		contentPane.add(btnPlayMusic);
		
		JButton btnSwitchOffRadio = new JButton("Switch OFF Radio");
		btnSwitchOffRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchMedia(" Radio Successfully Switched OFF ");
			}
		});
		btnSwitchOffRadio.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSwitchOffRadio.setBounds(409, 498, 122, 33);
		contentPane.add(btnSwitchOffRadio);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Thasneem2\\eclipse-workspace\\SmartHomeAutomatedSystem\\Images\\ES-Popover-AdobeStock_132290171-38945470.jpeg"));
		lblNewLabel_3.setBounds(0, 0, 921, 580);
		contentPane.add(lblNewLabel_3);
	}
	
	public void switchMedia(String str) 
	{
		JOptionPane.showMessageDialog(null, str);
	}

}
