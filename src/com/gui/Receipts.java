package com.gui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receipts extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	protected Container layeredPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipts frame = new Receipts();
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
	public Receipts() {
		setTitle("RB private Limited-receipts\r\n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 753, 333);
		getContentPane().setLayout(null);
		
		JLabel lblRecdDate = new JLabel("Recd Date.");
		lblRecdDate.setBounds(258, 50, 69, 14);
		getContentPane().add(lblRecdDate);
		
		textField = new JTextField();
		textField.setBounds(315, 47, 93, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblConame = new JLabel("Co.Name ");
		lblConame.setBounds(29, 84, 75, 14);
		getContentPane().add(lblConame);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 81, 490, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBillNo = new JLabel("Bill No.");
		lblBillNo.setBounds(29, 119, 46, 14);
		getContentPane().add(lblBillNo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(90, 116, 86, 20);
		getContentPane().add(comboBox_1);
		
		JLabel lblPayMode = new JLabel("Pay Mode");
		lblPayMode.setBounds(222, 119, 75, 14);
		getContentPane().add(lblPayMode);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(283, 116, 81, 20);
		getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("Ref No.");
		lblNewLabel.setBounds(417, 119, 63, 14);
		getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(469, 116, 111, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Recd Amt.");
		lblNewLabel_1.setBounds(29, 156, 75, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(90, 150, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblBillAmt = new JLabel("Bill Amt.");
		lblBillAmt.setBounds(222, 156, 46, 14);
		getContentPane().add(lblBillAmt);
		
		textField_4 = new JTextField();
		textField_4.setBounds(283, 153, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblChqAmt = new JLabel("Chq Amt.");
		lblChqAmt.setBounds(417, 156, 86, 14);
		getContentPane().add(lblChqAmt);
		
		textField_5 = new JTextField();
		textField_5.setBounds(469, 153, 111, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTotalRecd = new JLabel("Total Recd.");
		lblTotalRecd.setBounds(29, 197, 63, 14);
		getContentPane().add(lblTotalRecd);
		
		textField_6 = new JTextField();
		textField_6.setText("");
		textField_6.setBounds(90, 194, 86, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblBillAmt_1 = new JLabel("Bill Amt.");
		lblBillAmt_1.setBounds(222, 197, 46, 14);
		getContentPane().add(lblBillAmt_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(283, 194, 86, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bank");
		lblNewLabel_2.setBounds(29, 236, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_8 = new JTextField();
		textField_8.setBounds(90, 233, 490, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNew = new JButton("New");
		btnNew.setBounds(258, 264, 80, 23);
		getContentPane().add(btnNew);
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModify.setBounds(348, 264, 93, 23);
		getContentPane().add(btnModify);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(451, 264, 87, 23);
		getContentPane().add(btnDelete);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSearch.setBounds(548, 264, 86, 23);
		getContentPane().add(btnSearch);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage frame = new homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnExit.setBounds(644, 264, 69, 23);
		getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBounds(283, 11, 117, 21);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblReceipts = new JLabel("           RECEIPTS");
		lblReceipts.setBounds(-21, 0, 151, 21);
		panel.add(lblReceipts);
		lblReceipts.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblSales = new JLabel("Sales");
		lblSales.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSales.setBounds(621, 11, 75, 21);
		getContentPane().add(lblSales);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(29, 264, 51, 23);
		getContentPane().add(btnOk);
	}
}
