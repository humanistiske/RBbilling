package com.gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Quotation extends JFrame {

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
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quotation frame = new Quotation();
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
	public Quotation() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 300, 800, 550);
		setTitle("RB Private Limited-Quotation");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDetailsOfCustomer = new JLabel("Details of Customer");
		lblDetailsOfCustomer.setBounds(10, 11, 209, 14);
		contentPane.add(lblDetailsOfCustomer);
		
		JLabel lblDetailsOf = new JLabel("Delivery Details");
		lblDetailsOf.setBounds(375, 11, 399, 14);
		contentPane.add(lblDetailsOf);
		
		JLabel lblName = new JLabel("Name          :");
		lblName.setBounds(10, 34, 72, 14);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel("Address      :");
		lblAddress.setBounds(10, 56, 72, 14);
		contentPane.add(lblAddress);
		
		JLabel lblNewLabel = new JLabel("Party GST   :");
		lblNewLabel.setBounds(10, 81, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblName_1 = new JLabel("Name          :");
		lblName_1.setBounds(375, 36, 86, 14);
		contentPane.add(lblName_1);
		
		JLabel lblAddress_1 = new JLabel("Address      :");
		lblAddress_1.setBounds(375, 56, 86, 14);
		contentPane.add(lblAddress_1);
		
		textField = new JTextField();
		textField.setBounds(76, 31, 272, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 53, 272, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 78, 272, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(451, 31, 323, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(451, 53, 323, 20);
		contentPane.add(textField_4);
		
		JLabel lblDispatch = new JLabel("Dispatch      :");
		lblDispatch.setBounds(10, 108, 72, 14);
		contentPane.add(lblDispatch);
		
		textField_5 = new JTextField();
		textField_5.setBounds(76, 105, 143, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblState = new JLabel("STATE         :");
		lblState.setBounds(10, 133, 72, 14);
		contentPane.add(lblState);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Maharastra", "Mumbai"}));
		comboBox.setBounds(76, 133, 120, 20);
		contentPane.add(comboBox);
		
		JLabel lblStateCode = new JLabel("State Code  :");
		lblStateCode.setBounds(206, 136, 64, 14);
		contentPane.add(lblStateCode);
		
		textField_6 = new JTextField();
		textField_6.setBounds(272, 133, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblInvoiceNo = new JLabel("Invoice No. :");
		lblInvoiceNo.setBounds(375, 81, 91, 14);
		contentPane.add(lblInvoiceNo);
		
		JLabel lblOrderNo = new JLabel("Order No.   :");
		lblOrderNo.setBounds(375, 108, 86, 14);
		contentPane.add(lblOrderNo);
		
		JLabel lblNewLabel_1 = new JLabel("Challan No. :");
		lblNewLabel_1.setBounds(375, 133, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(451, 78, 150, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(451, 105, 150, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(451, 130, 150, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblDate = new JLabel("Date   :");
		lblDate.setBounds(611, 81, 46, 14);
		contentPane.add(lblDate);
		
		JLabel label = new JLabel("Date   :");
		label.setBounds(611, 108, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Date   :");
		label_1.setBounds(611, 133, 46, 14);
		contentPane.add(label_1);
		
		textField_10 = new JTextField();
		textField_10.setBounds(656, 78, 118, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(656, 105, 118, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(656, 130, 118, 20);
		contentPane.add(textField_12);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 172, 764, 251);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Sr. No.", "Product", "HSN Code", "Qty", "Per", "Rate", "Total", "SGST %", "SGST Amt", "CGST %", "CGST Amt", "GRAND TOTAL"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class, Integer.class, Float.class, Integer.class, Double.class, Integer.class, Double.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(51);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(70);
		table.getColumnModel().getColumn(3).setPreferredWidth(56);
		table.getColumnModel().getColumn(4).setPreferredWidth(37);
		table.getColumnModel().getColumn(5).setPreferredWidth(66);
		table.getColumnModel().getColumn(6).setPreferredWidth(70);
		table.getColumnModel().getColumn(7).setPreferredWidth(60);
		table.getColumnModel().getColumn(9).setPreferredWidth(60);
		table.getColumnModel().getColumn(11).setPreferredWidth(90);
		scrollPane.setViewportView(table);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage frame = new homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCancel.setBounds(685, 477, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnSend = new JButton("Send Email");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSend.setBounds(586, 477, 89, 23);
		contentPane.add(btnSend);
		
		JLabel lblForm = new JLabel("Form :");
		lblForm.setBounds(224, 108, 46, 14);
		contentPane.add(lblForm);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Local", "IGST"}));
		comboBox_1.setBounds(260, 105, 88, 20);
		contentPane.add(comboBox_1);
		
		JButton btnNewQuotation = new JButton("New Quotation");
		btnNewQuotation.setBounds(10, 477, 112, 23);
		contentPane.add(btnNewQuotation);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(132, 477, 72, 23);
		contentPane.add(btnModify);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(210, 477, 72, 23);
		contentPane.add(btnDelete);
		
		JButton btnBillSearch = new JButton("Bill Search");
		btnBillSearch.setBounds(288, 477, 81, 23);
		contentPane.add(btnBillSearch);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEmail.setBounds(10, 446, 58, 20);
		contentPane.add(lblEmail);
		
		textField_13 = new JTextField();
		textField_13.setBounds(62, 446, 257, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		
		
	}
}
