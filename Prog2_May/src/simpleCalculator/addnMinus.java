package simpleCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class addnMinus {

	private JFrame frame;
	private JTextField num1TextField;
	private JTextField num2TextField;
	private JTextField ansTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addnMinus window = new addnMinus();
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
	public addnMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setForeground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 424, 299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel num1 = new JLabel("Number 1");
		num1.setForeground(new Color(255, 255, 255));
		num1.setFont(new Font("Arial", Font.PLAIN, 12));
		num1.setBounds(95, 53, 89, 14);
		frame.getContentPane().add(num1);
		
		JLabel num2 = new JLabel("Number 2");
		num2.setForeground(new Color(255, 255, 255));
		num2.setFont(new Font("Arial", Font.PLAIN, 12));
		num2.setBounds(95, 102, 89, 14);
		frame.getContentPane().add(num2);
		
		num1TextField = new JTextField();
		num1TextField.setBounds(221, 50, 96, 20);
		frame.getContentPane().add(num1TextField);
		num1TextField.setColumns(10);
		
		num2TextField = new JTextField();
		num2TextField.setBounds(221, 99, 96, 20);
		frame.getContentPane().add(num2TextField);
		num2TextField.setColumns(10);
		
		ansTextField = new JTextField();
		ansTextField.setBounds(221, 212, 96, 20);
		frame.getContentPane().add(ansTextField);
		ansTextField.setColumns(10);
		
		JLabel ansLabel = new JLabel("Answer");
		ansLabel.setForeground(new Color(255, 255, 255));
		ansLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		ansLabel.setBounds(106, 215, 89, 14);
		frame.getContentPane().add(ansLabel);
		
		JButton addButton = new JButton("Add");
		addButton.setBackground(Color.WHITE);
		addButton.setForeground(Color.BLACK);
		addButton.setFont(new Font("Arial", Font.PLAIN, 12));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1= Integer.parseInt(num1TextField.getText());
					int n2= Integer.parseInt(num2TextField.getText());	
					int sum=n1+n2;
					ansTextField.setText(String.valueOf(sum));
				}
				catch(Exception e1) {	//show error message for non-integer input
					JOptionPane.showMessageDialog(null, "Invalid input.");
				}
			}
		});
		addButton.setBounds(81, 153, 89, 23);
		frame.getContentPane().add(addButton);
		
		JButton minusButton = new JButton("Substract");
		minusButton.setFont(new Font("Arial", Font.PLAIN, 12));
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1= Integer.parseInt(num1TextField.getText());
					int n2= Integer.parseInt(num2TextField.getText());	
					int diff;
					if(n1>=n2)
						diff=n1-n2;
					else
						diff=n2-n1;
					ansTextField.setText(String.valueOf(diff));
				}
				catch(Exception e1){	//show error message for non-integer input
					JOptionPane.showMessageDialog(null, "Invalid input.");
				}
			}
		});
		minusButton.setBounds(221, 153, 89, 23);
		frame.getContentPane().add(minusButton);
	}

}
