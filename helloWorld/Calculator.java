package helloWorld;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField resultField;

	/**
	 * Launch the application.
	 */
	static double value1=0;
	static double value2=0;
	char operator;
	boolean operatorClicked = false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 262, 271);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		resultField = new JTextField();
		resultField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(153, 153, 204), new Color(153, 153, 153), null, null));
		resultField.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		resultField.setBounds(10, 32, 236, 45);
		frmCalculator.getContentPane().add(resultField);
		resultField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn1.getText());
					value1 = 1;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn1.getText());
						value1 = answer + 1;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn1.getText());
						value2 = 1;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn1.getText());
						value2 = answer + 1;
					}
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn1.setBounds(10, 104, 51, 23);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn2.getText());
					value1 = 2;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn2.getText());
						value1 = answer + 2;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn2.getText());
						value2 = 2;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn2.getText());
						value2 = answer + 2;
					}
				}
			}
			
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn2.setBounds(71, 104, 51, 23);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn3.getText());
					value1 = 3;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn3.getText());
						value1 = answer + 3;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn3.getText());
						value2 = 3;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn3.getText());
						value2 = answer + 3;
					}
				}
			}
		});
		btn3.setBounds(132, 104, 51, 23);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn_division = new JButton("/");
		btn_division.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_division.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!(resultField.getText().isEmpty()))
				{
					operator = '/';
					operatorClicked = true;
					resultField.setText("");
				}
			}
		});
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_division.setBounds(193, 104, 51, 23);
		frmCalculator.getContentPane().add(btn_division);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn4.getText());
					value1 = 4;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn4.getText());
						value1 = answer + 4;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn4.getText());
						value2 = 4;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn4.getText());
						value2 = answer + 4;
					}
				}
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn4.setBounds(10, 138, 51, 23);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn5.getText());
					value1 = 5;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn5.getText());
						value1 = answer + 5;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn5.getText());
						value2 = 5;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn5.getText());
						value2 = answer + 5;
					}
				}
			}
		});
		btn5.setBounds(71, 138, 51, 23);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn6.getText());
					value1 = 6;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn6.getText());
						value1 = answer + 6;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn6.getText());
						value2 = 6;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn6.getText());
						value2 = answer + 6;
					}
				}
			}
		});
		btn6.setBounds(132, 138, 51, 23);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn_product = new JButton("x");
		btn_product.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_product.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!(resultField.getText().isEmpty()))
				{
					operator = 'x';
					operatorClicked = true;
					resultField.setText("");
				}
			}
		});
		btn_product.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_product.setBounds(193, 138, 51, 23);
		frmCalculator.getContentPane().add(btn_product);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn7.getText());
					value1 = 7;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn7.getText());
						value1 = answer + 7;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn7.getText());
						value2 = 7;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn7.getText());
						value2 = answer + 7;
					}
				}
			}
		});
		btn7.setBounds(10, 172, 51, 23);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn8.getText());
					value1 = 8;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn8.getText());
						value1 = answer + 8;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn8.getText());
						value2 = 8;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn8.getText());
						value2 = answer + 8;
					}
				}
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn8.setBounds(71, 172, 51, 23);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn9.getText());
					value1 = 9;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn9.getText());
						value1 = answer + 9;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn9.getText());
						value2 = 9;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn9.getText());
						value2 = answer + 9;
					}
				}
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn9.setBounds(132, 172, 51, 23);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn_minus = new JButton("-");
		btn_minus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!(resultField.getText().isEmpty()))
				{
					operator = '-';
					operatorClicked = true;
					resultField.setText("");
				}
			}
		});
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_minus.setBounds(193, 172, 51, 23);
		frmCalculator.getContentPane().add(btn_minus);
		
		JButton btn_clear = new JButton("CE");
		btn_clear.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				resultField.setText("");
			}
		});
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_clear.setBounds(10, 206, 51, 23);
		frmCalculator.getContentPane().add(btn_clear);
		
		JButton btn_equal = new JButton("=");
		btn_equal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_equal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double answer = 0;
				switch(operator)
				{
				case '+' : answer = value1 + value2;break;
				case '-' : answer = value1 - value2;break;
				case 'x' : answer = value1 * value2;break;
				case '/' : answer = value1 / value2;break;
				case '%' : answer = value1 % value2;break;
				}
				
				String result = Double.toString(answer);
				resultField.setText(result);
				operatorClicked = false;
				
			}
		});
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_equal.setBounds(71, 206, 51, 23);
		frmCalculator.getContentPane().add(btn_equal);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(resultField.getText().isEmpty() && !operatorClicked)
				{
					resultField.setText(btn0.getText());
					value1 = 0;
				}
				else
				{
					if(!operatorClicked)
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn0.getText());
						value1 = answer + 0;
					}
					else if(resultField.getText().isEmpty() && operatorClicked ){
						resultField.setText(resultField.getText()+btn0.getText());
						value2 = 1;
					}
					else
					{
						double answer = Double.valueOf(resultField.getText());
						answer = answer * 10;
						resultField.setText(resultField.getText()+btn0.getText());
						value2 = answer + 0;
					}
				}
			}
		});
		btn0.setBounds(132, 206, 51, 23);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn_plus = new JButton("+");
		btn_plus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!(resultField.getText().isEmpty()))
				{
					operator = '+';
					operatorClicked = true;
					resultField.setText("");
				}
			}
		});
		btn_plus.setBounds(193, 206, 51, 23);
		frmCalculator.getContentPane().add(btn_plus);
	}
}
