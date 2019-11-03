package library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login {
	
	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 378, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 339, 274);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(26, 28, 105, 31);
		panel.add(lblLogin);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(26, 86, 115, 23);
		panel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(26, 135, 115, 23);
		panel.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(165, 89, 124, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(165, 138, 124, 20);
		panel.add(txtPassword);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String url = "jdbc:mysql://localhost/student";
				try {
					Connection con = DriverManager.getConnection(url,"root","student");
					Statement st = con.createStatement();
					String uname = txtUsername.getText();
					String pass = txtPassword.getText();
					ResultSet rs = st.executeQuery("select * from login where uname='"+uname+"' and passwd='"+pass+"' ;");
					rs.next();
					if (uname.equals(rs.getString(1)) && pass.equals(rs.getString(2)))
					{
						frame.dispose();
						JOptionPane.showMessageDialog(null, "Login successfully");
						
						Details d = new Details(rs.getString(3), rs.getString(4), rs.getString("brach"), rs.getString(6), rs.getString(7), rs.getString(8));
						d.setVisible(true);
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnOk.setBounds(62, 188, 89, 23);
		panel.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnCancel.setBounds(200, 188, 89, 23);
		panel.add(btnCancel);
		
		JLabel lblClickHereFor = new JLabel("Click here for add a new entry");
		lblClickHereFor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblClickHereFor.setBounds(26, 234, 175, 14);
		panel.add(lblClickHereFor);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddEntry add = new AddEntry();
				frame.setVisible(false);
				add.setVisible(true);
				
				
			}
		});
		btnAdd.setBounds(240, 231, 57, 23);
		panel.add(btnAdd);
	}
}
