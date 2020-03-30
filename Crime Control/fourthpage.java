package Crime_Control;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
public class fourthpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextUs;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fourthpage frame = new fourthpage();
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
	public fourthpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTextUs = new JTextField();
		txtTextUs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTextUs.setText("Text Us Your Location");
		txtTextUs.setBounds(12, 122, 258, 139);
		contentPane.add(txtTextUs);
		txtTextUs.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crime_Control.main(new String[0]);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(12, 311, 104, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Send");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cli A= new Cli();
				try {
					Cli.B();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(166, 311, 104, 51);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrLocationInfo = new JTextArea();
		txtrLocationInfo.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 28));
		txtrLocationInfo.setForeground(Color.WHITE);
		txtrLocationInfo.setBackground(Color.BLUE);
		txtrLocationInfo.setText(" Location info");
		txtrLocationInfo.setBounds(12, 34, 258, 43);
		contentPane.add(txtrLocationInfo);
	}
}
