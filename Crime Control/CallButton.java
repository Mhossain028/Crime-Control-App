package Crime_Control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class CallButton {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreenCall() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CallButton window = new CallButton();
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
	public CallButton() {
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
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setForeground(new Color(0, 0, 0));
		textArea_1.setTabSize(5);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(12, 13, 258, 42);
		frame.getContentPane().add(textArea_1);
		
		JButton button = new JButton("1");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				String EnterNumbe=textArea_1.getText() + button.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		button.setBounds(12, 68, 61, 42);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				String EnterNumbe=textArea_1.getText() + btnNewButton.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton.setBounds(110, 68, 61, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + btnNewButton_1.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton_1.setBounds(209, 68, 61, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + btnNewButton_2.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton_2.setBounds(12, 123, 61, 42);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button_1 = new JButton("5");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + button_1.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		button_1.setBounds(110, 123, 61, 42);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("6");
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + button_2.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		button_2.setBounds(209, 123, 61, 42);
		frame.getContentPane().add(button_2);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + btnNewButton_3.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton_3.setBounds(12, 182, 61, 42);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + btnNewButton_4.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton_4.setBounds(110, 182, 61, 42);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + btnNewButton_5.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton_5.setBounds(209, 178, 61, 42);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("*");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(Color.DARK_GRAY);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + btnNewButton_6.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton_6.setBounds(12, 237, 61, 42);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + btnNewButton_7.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton_7.setBounds(110, 237, 61, 42);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("#");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(Color.DARK_GRAY);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumbe=textArea_1.getText() + btnNewButton_8.getText();
				textArea_1.setText(EnterNumbe);
			}
		});
		btnNewButton_8.setBounds(209, 233, 61, 42);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Call");
		btnNewButton_9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				Cli2 Y=new Cli2();
				try {
					Cli2.D();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_9.setBackground(Color.GREEN);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton_9.setBounds(12, 302, 99, 47);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Dec");
		btnNewButton_10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 Cli3 Z= new Cli3();
			 try {
				Cli3.E();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_10.setBackground(Color.RED);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton_10.setBounds(171, 302, 99, 47);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("<");
		btnNewButton_11.setForeground(Color.WHITE);
		btnNewButton_11.setBackground(Color.GRAY);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crime_Control.main(new String[0]);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		btnNewButton_11.setBounds(12, 378, 61, 41);
		frame.getContentPane().add(btnNewButton_11);
	}
}
