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

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setTitle("RB Private Limited-Payment");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 714, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayment = new JLabel("PAYMENT");
		lblPayment.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPayment.setBounds(306, 0, 118, 31);
		contentPane.add(lblPayment);
		
		JLabel lblPurchase = new JLabel("Purchase");
		lblPurchase.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPurchase.setBounds(635, 21, 77, 14);
		contentPane.add(lblPurchase);
		
		JLabel lblRecdDate = new JLabel("Recd Date.");
		lblRecdDate.setBounds(252, 42, 71, 14);
		contentPane.add(lblRecdDate);
		
		textField = new JTextField();
		textField.setBounds(316, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblConame = new JLabel("Co.Name");
		lblConame.setBounds(10, 70, 46, 14);
		contentPane.add(lblConame);
		
		textField_1 = new JTextField();
		textField_1.setBounds(69, 67, 484, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBillNo = new JLabel("Bill No");
		lblBillNo.setBounds(10, 102, 58, 14);
		contentPane.add(lblBillNo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(69, 98, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPayMode = new JLabel("Pay Mode");
		lblPayMode.setBounds(195, 102, 71, 14);
		contentPane.add(lblPayMode);
		
		textField_3 = new JTextField();
		textField_3.setBounds(252, 98, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ref No.");
		lblNewLabel.setBounds(425, 102, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(467, 98, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRecdAmt = new JLabel("Recd Amt.");
		lblRecdAmt.setBounds(10, 139, 58, 14);
		contentPane.add(lblRecdAmt);
		
		textField_5 = new JTextField();
		textField_5.setBounds(69, 136, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Bill Amt");
		lblNewLabel_1.setBounds(195, 139, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(252, 136, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Chq Amt");
		lblNewLabel_2.setBounds(425, 139, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(467, 136, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTotalRecd = new JLabel("Total Recd");
		lblTotalRecd.setBounds(10, 173, 58, 14);
		contentPane.add(lblTotalRecd);
		
		textField_8 = new JTextField();
		textField_8.setBounds(69, 170, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblBillAmt = new JLabel("Bill Amt");
		lblBillAmt.setBounds(195, 173, 46, 14);
		contentPane.add(lblBillAmt);
		
		textField_9 = new JTextField();
		textField_9.setBounds(252, 167, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblBankName = new JLabel("Bank ");
		lblBankName.setBounds(10, 204, 58, 14);
		contentPane.add(lblBankName);
		
		textField_10 = new JTextField();
		textField_10.setBounds(69, 201, 484, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNew = new JButton("New");
		btnNew.setBounds(259, 232, 71, 23);
		contentPane.add(btnNew);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(353, 232, 71, 23);
		contentPane.add(btnModify);
		
		JButton btnSearch = new JButton("Delete");
		btnSearch.setBounds(434, 232, 71, 23);
		contentPane.add(btnSearch);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(525, 232, 71, 23);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage frame = new homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnExit.setBounds(618, 232, 71, 23);
		contentPane.add(btnExit);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(10, 237, 58, 23);
		contentPane.add(btnOk);
	}
}
