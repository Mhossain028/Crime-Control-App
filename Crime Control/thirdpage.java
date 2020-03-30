package Crime_Control;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class thirdpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextUs;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void Newscreen1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thirdpage frame = new thirdpage();
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
	public thirdpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthpage B=new fourthpage();
				B.NewScreen2();
			}
		});
		btnNewButton.setBounds(98, 378, 81, 41);
		contentPane.add(btnNewButton);
		
		JButton btnUploadPhoto = new JButton("Upload Photo");
		btnUploadPhoto.setHorizontalAlignment(SwingConstants.LEFT);
		btnUploadPhoto.setBackground(Color.BLUE);
		btnUploadPhoto.setForeground(Color.WHITE);
		btnUploadPhoto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnUploadPhoto.addActionListener(new ActionListener() {
			
			public ImageIcon ResizeImage(String ImagePath) {
				
				ImageIcon MyImage=new ImageIcon(ImagePath);
				Image img=MyImage.getImage();
				Image newImg=img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image=new ImageIcon(newImg);
				return image;
			}

			
			public void actionPerformed(ActionEvent e) {
				JFileChooser file=new JFileChooser();
				file.setCurrentDirectory(new File(System.getProperty("user.name")));
				FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images","jpg","gif","png");
				file.addChoosableFileFilter(filter);
				int result=file.showSaveDialog(null);
				if(result==JFileChooser.APPROVE_OPTION) {
					File selectedFile= file.getSelectedFile();
					String path= selectedFile.getAbsolutePath();
					lblNewLabel.setIcon(ResizeImage(path));
				}
				
				else if(result==JFileChooser.CANCEL_OPTION) {
					System.out.println("No File Selected");
				}
				
			}
		});
		btnUploadPhoto.setBounds(50, 232, 175, 38);
		contentPane.add(btnUploadPhoto);
		
		txtTextUs = new JTextField();
		txtTextUs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTextUs.setText("Text Us Information");
		txtTextUs.setBounds(12, 283, 257, 66);
		contentPane.add(txtTextUs);
		txtTextUs.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(12, 13, 257, 195);
		contentPane.add(lblNewLabel);
	}
}
