package swingex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newpass extends JFrame {
	private JLabel lbl;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lblEmail;
	private JPanel contentPane;
	private JTextField tFieldemail;
	private	JButton btnCancel;
	private	JButton btnSend;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newpass frame = new newpass();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	public newpass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 426);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("Forgot your password");
		lbl.setBounds(214, 33, 216, 51);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lbl);
		
		lbl1 = new JLabel("Please enter your email address to send the forgot");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl1.setBounds(148, 80, 347, 51);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("password link for your account.");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl2.setBounds(148, 104, 226, 51);
		contentPane.add(lbl2);
		
		tFieldemail = new JTextField();
		tFieldemail.setBounds(204, 188, 291, 45);
		contentPane.add(tFieldemail);
		tFieldemail.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(148, 198, 58, 20);
		contentPane.add(lblEmail);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnCancel, "CANCELLED");
			}
			
		});
		btnCancel.setFont(new Font("Dialog", Font.BOLD, 13));
		btnCancel.setBackground(new Color(233, 233, 233));
		btnCancel.setBounds(289, 275, 98, 38);
		contentPane.add(btnCancel);
		
		btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			Pass bago = new Pass();
			bago.setVisible(true);
				
			}
		});
		btnSend.setForeground(new Color(255, 255, 255));
		btnSend.setBackground(new Color(0, 128, 255));
		btnSend.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnSend.setBounds(397, 275, 98, 38);
		contentPane.add(btnSend);
	}

}
