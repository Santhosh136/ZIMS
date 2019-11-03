package library;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Details extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details frame = new Details(null, null, null, null, null, null);
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
	public Details(String name,String regno,String branch,String book,String author,String due) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(50, 47, 94, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblname = new JLabel("");
		lblname.setBounds(215, 47, 94, 17);
		contentPane.add(lblname);
		
		JLabel lblRegNo = new JLabel("Reg No");
		lblRegNo.setBounds(50, 90, 94, 20);
		contentPane.add(lblRegNo);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(50, 133, 94, 20);
		contentPane.add(lblBranch);
		
		JLabel lblBook = new JLabel("Book");
		lblBook.setBounds(50, 175, 94, 20);
		contentPane.add(lblBook);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(50, 218, 94, 20);
		contentPane.add(lblAuthor);
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setBounds(50, 260, 94, 20);
		contentPane.add(lblDueDate);
		
		JLabel lblregno = new JLabel("");
		lblregno.setBounds(215, 93, 94, 17);
		contentPane.add(lblregno);
		
		JLabel lblbranch = new JLabel("");
		lblbranch.setBounds(215, 136, 94, 17);
		contentPane.add(lblbranch);
		
		JLabel lblbook = new JLabel("");
		lblbook.setBounds(215, 178, 151, 17);
		contentPane.add(lblbook);
		
		JLabel lblauthor = new JLabel("");
		lblauthor.setBounds(215, 221, 94, 17);
		contentPane.add(lblauthor);
		
		JLabel lbldue = new JLabel("");
		lbldue.setBounds(215, 263, 94, 17);
		contentPane.add(lbldue);
		
		lblname.setText(name);
		lblregno.setText(regno);
		lblbranch.setText(branch);
		lblbook.setText(book);
		lblauthor.setText(author);
		lbldue.setText(due);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
			}
		});
		btnOk.setBounds(166, 300, 89, 23);
		contentPane.add(btnOk);
		
		
	}

}
