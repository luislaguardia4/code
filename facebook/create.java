package swingex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;

public class create extends JFrame {

	private JPanel contentPane;
	private JTextField tFieldFirstName;
	private JTextField tFieldLastName;
	private JTextField tFieldEmail;
	private JTextField tFieldPassword;
	private JLabel lblFirstName;
	private JLabel lblSignUp;
	private JLabel lblLastName;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JLabel lblGender;
	private JButton btnSignUp;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JLabel lbltext;
	private JLabel lblText111;
	private JLabel lbltext1;
	private JLabel lbltext2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create frame = new create();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public create() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\L O N O V O\\Downloads\\LOGO.jpg"));
		setTitle("https://facebook.com/signup");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tFieldFirstName = new JTextField();
		tFieldFirstName.setBounds(96, 98, 153, 34);
		contentPane.add(tFieldFirstName);
		tFieldFirstName.setColumns(10);
		
		tFieldLastName = new JTextField();
		tFieldLastName.setColumns(10);
		tFieldLastName.setBounds(340, 98, 153, 34);
		contentPane.add(tFieldLastName);
		
		tFieldEmail = new JTextField();
		tFieldEmail.setColumns(10);
		tFieldEmail.setBounds(176, 162, 321, 34);
		contentPane.add(tFieldEmail);
		
		lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstName.setBounds(10, 103, 90, 19);
		contentPane.add(lblFirstName);
		
		lblSignUp = new JLabel("SIGN UP TO FACEBOOK");
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSignUp.setBounds(106, 23, 294, 43);
		contentPane.add(lblSignUp);
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(259, 103, 90, 19);
		contentPane.add(lblLastName);
		
		lblEmail = new JLabel("Mobile number or email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(10, 162, 165, 29);
		contentPane.add(lblEmail);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 222, 73, 29);
		contentPane.add(lblPassword);
		
		tFieldPassword = new JTextField();
		tFieldPassword.setColumns(10);
		tFieldPassword.setBounds(82, 222, 267, 34);
		contentPane.add(tFieldPassword);
		
		lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGender.setBounds(10, 279, 60, 29);
		contentPane.add(lblGender);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnMale.setBounds(82, 283, 60, 21);
		contentPane.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnFemale.setBounds(144, 282, 73, 21);
		contentPane.add(rdbtnFemale);
		
		lbltext = new JLabel("People who use our service may have uploaded your contact");
		lbltext.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbltext.setBounds(12, 347, 399, 34);
		contentPane.add(lbltext);
		
		lblText111 = new JLabel(" information to Facebook.");
		lblText111.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblText111.setBounds(10, 370, 258, 34);
		contentPane.add(lblText111);
		
		lbltext1 = new JLabel("By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. ");
		lbltext1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbltext1.setBounds(12, 404, 509, 43);
		contentPane.add(lbltext1);
		
		lbltext2 = new JLabel("You may receive SMS Notifications from us and can opt out any time.");
		lbltext2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbltext2.setBounds(10, 428, 546, 43);
		contentPane.add(lbltext2);
		
		btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnSignUp.setSelected(true);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnSignUp, "WELCOME USER!");
			}
		});
		btnSignUp.setBackground(new Color(0, 255, 128));
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnSignUp.setBounds(139, 508, 221, 64);
		contentPane.add(btnSignUp);
	}
}
