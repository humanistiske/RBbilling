package com.gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Billwise extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billwise frame = new Billwise();
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
	public Billwise() {
		setResizable(false);
		setTitle("RB Private Limited-Billwise");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 300, 800, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEnterCustomerName = new JLabel("Enter Customer Name");
		lblEnterCustomerName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterCustomerName.setBounds(10, 11, 188, 14);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 270, 20);
		textField.setColumns(10);
		
		JLabel lblRansaction = new JLabel("Transaction");
		lblRansaction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRansaction.setBounds(294, 11, 113, 14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(290, 32, 77, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sales ", "Purchase"}));
		
		JCheckBox chckbxUnselectForAll = new JCheckBox("Unselect for ALL");
		chckbxUnselectForAll.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxUnselectForAll.setBounds(380, 7, 146, 23);
		
		JLabel lblForm = new JLabel("Form");
		lblForm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblForm.setBounds(377, 35, 46, 14);
		
		textField_1 = new JTextField();
		textField_1.setBounds(414, 32, 104, 20);
		textField_1.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTo.setBounds(528, 34, 46, 14);
		
		textField_2 = new JTextField();
		textField_2.setBounds(550, 32, 96, 20);
		textField_2.setColumns(10);
		
		JCheckBox chckbxShowOnlyBalance = new JCheckBox("Show only balance Bills");
		chckbxShowOnlyBalance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxShowOnlyBalance.setBounds(528, 7, 179, 23);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 759, 362);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Bill Date", "Bill No", "Customer", "GST No", "Bill Amt", "Tax Amt", "Paid Amt"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(0).setMinWidth(9);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		contentPane.add(lblEnterCustomerName);
		contentPane.add(chckbxUnselectForAll);
		contentPane.add(lblRansaction);
		contentPane.add(chckbxShowOnlyBalance);
		contentPane.add(textField);
		contentPane.add(comboBox);
		contentPane.add(lblForm);
		contentPane.add(textField_1);
		contentPane.add(lblTo);
		contentPane.add(textField_2);
		contentPane.add(scrollPane);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage frame = new homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnExit.setBounds(670, 451, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnAZ = new JButton("A - Z");
		btnAZ.setBounds(10, 451, 64, 23);
		contentPane.add(btnAZ);
		
		JButton btnZA = new JButton("Z - A");
		btnZA.setBounds(77, 451, 64, 23);
		contentPane.add(btnZA);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSearch.setBounds(680, 31, 89, 23);
		contentPane.add(btnSearch);
	}
}
