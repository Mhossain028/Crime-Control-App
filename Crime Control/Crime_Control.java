package Crime_Control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Crime_Control {

	private JFrame frame;
	private JTextField txtCrimeControl;

	/**
	 * Launch the application.
	 */
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crime_Control window = new Crime_Control();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Crime_Control() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCrimeControl = new JTextField();
		txtCrimeControl.setForeground(Color.RED);
		txtCrimeControl.setBackground(Color.BLACK);
		txtCrimeControl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		txtCrimeControl.setText("Crime Control Application ");
		txtCrimeControl.setBounds(12, 52, 258, 80);
		frame.getContentPane().add(txtCrimeControl);
		txtCrimeControl.setColumns(10);
		
		JButton btnEmergencyCall = new JButton("Emergency call");
		btnEmergencyCall.setBackground(Color.RED);
		btnEmergencyCall.setForeground(Color.WHITE);
		btnEmergencyCall.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEmergencyCall.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			CallButton X=new CallButton();
			X.NewScreenCall();
			}
		});
		btnEmergencyCall.setBounds(56, 167, 177, 56);
		frame.getContentPane().add(btnEmergencyCall);
		
		JButton btnShareLocation = new JButton("Share Location");
		btnShareLocation.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnShareLocation.setForeground(Color.WHITE);
		btnShareLocation.setBackground(new Color(255, 255, 0));
		btnShareLocation.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				Fifthpage D=new Fifthpage();
				try {
					Fifthpage.New();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Cli1 X=new Cli1();
				try {
					Cli1.C();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   }
		});
		btnShareLocation.setBounds(56, 250, 177, 56);
		frame.getContentPane().add(btnShareLocation);
		
		JButton btnReport = new JButton("Report Crime");
		btnReport.setForeground(Color.WHITE);
		btnReport.setBackground(Color.BLUE);
		btnReport.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnReport.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			secondpage nw=new secondpage();
			nw.Newscreen();
			}
		});
		btnReport.setBounds(56, 335, 177, 56);
		frame.getContentPane().add(btnReport);
	}
}
