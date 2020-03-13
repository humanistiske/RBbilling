package com.gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroLetter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroLetter frame = new IntroLetter();
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
	public IntroLetter() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 753, 361);
		setTitle("Send Introduction Letter");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblToEmailAddress = new JLabel("To Email Address :");
		lblToEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblToEmailAddress.setBounds(10, 33, 123, 14);
		contentPane.add(lblToEmailAddress);
		
		textField = new JTextField();
		textField.setBounds(143, 32, 529, 61);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBcc = new JLabel("BCC  :");
		lblBcc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBcc.setBounds(10, 112, 46, 14);
		contentPane.add(lblBcc);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 111, 529, 49);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCcOurEmail = new JLabel("CC Our Email ID  :");
		lblCcOurEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCcOurEmail.setBounds(10, 172, 123, 14);
		contentPane.add(lblCcOurEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 171, 529, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmailSubject = new JLabel("Email Subject  :");
		lblEmailSubject.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmailSubject.setBounds(10, 214, 123, 14);
		contentPane.add(lblEmailSubject);
		
		textField_3 = new JTextField();
		textField_3.setBounds(143, 213, 529, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblLetterPath = new JLabel("Letter Path  :");
		lblLetterPath.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLetterPath.setBounds(10, 258, 123, 14);
		contentPane.add(lblLetterPath);
		
		textField_4 = new JTextField();
		textField_4.setBounds(143, 257, 529, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSend = new JButton("SEND");
		btnSend.setBounds(236, 294, 89, 23);
		contentPane.add(btnSend);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage frame = new homepage();
				frame.setVisible(true);
				dispose();
				}
		});
		btnCancel.setBounds(347, 294, 89, 23);
		contentPane.add(btnCancel);
	}

}
