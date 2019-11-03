package library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddEntry extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtuname;
	private JTextField txtpasswd;
	private JTextField txtname;
	private JTextField txtregno;
	private JTextField txtbranch;
	private JTextField txtbook;
	private JTextField txtauthor;
	private JTextField txtdue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEntry frame = new AddEntry();
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
	public AddEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewEntry = new JLabel("New Entry");
		lblNewEntry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewEntry.setBounds(26, 28, 128, 27);
		contentPane.add(lblNewEntry);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(26, 87, 82, 21);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(26, 119, 82, 21);
		contentPane.add(lblPassword);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(26, 151, 82, 21);
		contentPane.add(lblName);
		
		JLabel lblRegNo = new JLabel("Reg No");
		lblRegNo.setBounds(26, 183, 82, 21);
		contentPane.add(lblRegNo);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(26, 216, 82, 21);
		contentPane.add(lblBranch);
		
		JLabel lblBook = new JLabel("Book");
		lblBook.setBounds(26, 249, 82, 21);
		contentPane.add(lblBook);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(26, 281, 82, 21);
		contentPane.add(lblAuthor);
		
		JLabel lblDueDate = new JLabel("Due date");
		lblDueDate.setBounds(26, 313, 82, 21);
		contentPane.add(lblDueDate);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String uname = txtuname.getText();
				String passwd = txtpasswd.getText();
				String name= txtname.getText();
				String regno = txtregno.getText();
				String branch = txtbranch.getText();
				String book = txtbook.getText();
				String author = txtauthor.getText();
				String due = txtdue.getText();
				
				String url = "jdbc:mysql://localhost/student";;
				try {
					Connection con = DriverManager.getConnection(url,"root","student");
					Statement st = con.createStatement();
					String sql= "insert into login values('"+uname+"','"+passwd+"','"+name+"','"+regno+"','"+branch+"','"+book+"','"+author+"','"+due+"')";
					st.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "Addede successfully");
					contentPane.setVisible(false);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnOk.setBounds(160, 347, 89, 23);
		contentPane.add(btnOk);
		
		txtuname = new JTextField();
		txtuname.setBounds(179, 87, 140, 20);
		contentPane.add(txtuname);
		txtuname.setColumns(10);
		
		txtpasswd = new JTextField();
		txtpasswd.setColumns(10);
		txtpasswd.setBounds(179, 119, 140, 20);
		contentPane.add(txtpasswd);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(179, 151, 140, 20);
		contentPane.add(txtname);
		
		txtregno = new JTextField();
		txtregno.setColumns(10);
		txtregno.setBounds(179, 183, 140, 20);
		contentPane.add(txtregno);
		
		txtbranch = new JTextField();
		txtbranch.setColumns(10);
		txtbranch.setBounds(179, 216, 140, 20);
		contentPane.add(txtbranch);
		
		txtbook = new JTextField();
		txtbook.setColumns(10);
		txtbook.setBounds(179, 249, 140, 20);
		contentPane.add(txtbook);
		
		txtauthor = new JTextField();
		txtauthor.setColumns(10);
		txtauthor.setBounds(179, 281, 140, 20);
		contentPane.add(txtauthor);
		
		txtdue = new JTextField();
		txtdue.setColumns(10);
		txtdue.setBounds(179, 313, 140, 20);
		contentPane.add(txtdue);
	}

}
