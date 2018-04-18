package calculatorGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CalculatorGuI {

	private JFrame frmCalculator;
	private JTextField result;
	private JTextField fnum;

	double var1;
	int op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGuI window = new CalculatorGuI();
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
	public CalculatorGuI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 516, 386);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				var1=Double.parseDouble(result.getText());
				 result.setText("+");
				  op=1;
			}
		});
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				var1=Double.parseDouble(result.getText());
				 result.setText("-");
				  op=2;
			}
		});
		button.setFont(new Font("Stencil", Font.BOLD, 15));
		
		JButton button_1 = new JButton(" *");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				var1=Double.parseDouble(result.getText());
				 result.setText("*");
				  op=3;
			
			}
		});
		button_1.setFont(new Font("Stencil", Font.BOLD, 15));
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.setFont(new Font("Snap ITC", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				var1=Double.parseDouble(result.getText());
				 result.setText("/");
				  op=4;
			}
		});
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CalOperation co=new CalOperation();
			
				int x=op;
				double y=var1;
				double z=Double.parseDouble(result.getText());
			
				
				switch(x) {
				
				case 1:
		
					
					String s1=Double.toString(co.add(y,z));
					result.setText(s1)   ;
					result.getText();
					
				   break;
				case 2:    String s2=Double.toString(co.sub(y,z));
				result.setText(s2)  ;
				   break;
				case 3:   	String s3=Double.toString(co.mul(y,z));
				result.setText(s3)   ;
				result.getText();;
				   break;
				case 4: 
					try {
						if(z==0) {
							throw new ArithmeticException();
						}else {
							String s4=Double.toString(co.div(y,z));
							result.setText(s4)  ;
						}
					}catch(ArithmeticException e) {
						JOptionPane.showMessageDialog(null, " unknown value ");
					}
				
				   break;
				}
				
				
			}
		});
		equal.setFont(new Font("Stencil", Font.BOLD, 13));
		
		result = new JTextField();
		result.setColumns(10);
		
		JLabel lblReasult = new JLabel("Result :");
		lblReasult.setFont(new Font("Sitka Text", Font.BOLD, 14));
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			   result.setText("1.0");
					
			
			}
		});
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 result.setText("2.0");
				
			}
		});
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("3.0");
			}
		});
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("4.0");
			}
		});
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("5.0");
			}
		});
		
		JButton sex = new JButton("6");
		sex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("6.0");
			}
		});
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText("7.0");
			}
		});
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("8.0");
			}
		});
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText("9.0");
			}
		});
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText("0.0");
			}
		});
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				result.setText(" ");
				result.getText();
			}
		});
		
		fnum = new JTextField();
		fnum.setColumns(10);
		
		
		GroupLayout groupLayout = new GroupLayout(frmCalculator.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(four)
							.addComponent(seven)
							.addComponent(one))
						.addComponent(lblReasult))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(eight)
										.addComponent(five)
										.addComponent(two))
									.addGap(30)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(sex)
										.addComponent(three)
										.addComponent(nine)))
								.addComponent(zero)))
						.addComponent(result, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(equal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(clear, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
						.addComponent(button_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						
						.addComponent(fnum, 0, 0, Short.MAX_VALUE))
					.addGap(197))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(one)
						.addComponent(two, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(three, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(four)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(five)
						.addComponent(sex))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(seven)
								.addComponent(eight)
								.addComponent(nine))
							.addGap(30)
							.addComponent(zero))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(button_1)
							.addGap(18)
							.addComponent(btnNewButton_1)
							.addGap(18)
							.addComponent(equal, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(result, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblReasult, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addComponent(clear))
					.addGap(42))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(67)
					.addComponent(fnum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					
					.addContainerGap(229, Short.MAX_VALUE))
		);
		frmCalculator.getContentPane().setLayout(groupLayout);
	}
}
