package swingex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.Toolkit;

public class success extends JFrame {

	private JPanel contentPane;
	private final Panel panel = new Panel();
	private JLabel lblNewLabel;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					success frame = new success();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public success() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\L O N O V O\\Downloads\\LOGO.jpg"));
		setTitle("https://facebook.com/home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1039, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(0, 46, 635, 427);
		contentPane.add(panel);
		
		lblNewLabel = new JLabel("WELCOME USER");
		lblNewLabel.setBounds(255, 10, 140, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel);
	}

}
