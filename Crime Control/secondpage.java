package Crime_Control;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class secondpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtTerroist;

	/**
	 * Launch the application.
	 */
	public static void Newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondpage frame = new secondpage();
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
	public secondpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTerroist = new JTextField();
		txtTerroist.setForeground(Color.WHITE);
		txtTerroist.setBackground(Color.BLACK);
		txtTerroist.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		txtTerroist.setText(" Crime Information");
		txtTerroist.setBounds(12, 13, 258, 38);
		contentPane.add(txtTerroist);
		txtTerroist.setColumns(10);
		
		JButton btnCyberCrime = new JButton("Terrorism");
		btnCyberCrime.setForeground(Color.WHITE);
		btnCyberCrime.setBackground(Color.BLUE);
		btnCyberCrime.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnCyberCrime.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			thirdpage A=new thirdpage();
			A.Newscreen1();
			}
		});
		btnCyberCrime.setBounds(57, 76, 161, 37);
		contentPane.add(btnCyberCrime);
		
		JButton btnRobbery = new JButton("Robbery");
		btnRobbery.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnRobbery.setForeground(Color.WHITE);
		btnRobbery.setBackground(Color.BLUE);
		btnRobbery.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			thirdpage A=new thirdpage();
			A.Newscreen1();
			}
		});
		btnRobbery.setBounds(57, 177, 161, 37);
		contentPane.add(btnRobbery);
		
		JButton btnKidnap = new JButton("Kidnap");
		btnKidnap.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnKidnap.setForeground(Color.WHITE);
		btnKidnap.setBackground(Color.BLUE);
		btnKidnap.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			thirdpage A=new thirdpage();
			A.Newscreen1();
			}
		});
		btnKidnap.setBounds(57, 227, 161, 37);
		contentPane.add(btnKidnap);
		
		JButton btnMurder = new JButton("Murder");
		btnMurder.setForeground(Color.WHITE);
		btnMurder.setBackground(Color.BLUE);
		btnMurder.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnMurder.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			thirdpage A=new thirdpage();
			A.Newscreen1();
			
			}
		});
		btnMurder.setBounds(57, 126, 161, 38);
		contentPane.add(btnMurder);
		
		JButton btnNewButton = new JButton("Drug");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			thirdpage A=new thirdpage();
			A.Newscreen1();
			}
		});
		btnNewButton.setBounds(57, 277, 161, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Teasing");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			thirdpage A=new thirdpage();
			A.Newscreen1();
			}
		});
		btnNewButton_1.setBounds(57, 327, 161, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Others");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			thirdpage A=new thirdpage();
			A.Newscreen1();
			}
		});
		btnNewButton_2.setBounds(57, 377, 161, 37);
		contentPane.add(btnNewButton_2);
	}
}
