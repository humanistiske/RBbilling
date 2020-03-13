package com.gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PurchaseInvoice extends JFrame {

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
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseInvoice frame = new PurchaseInvoice();
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
	public PurchaseInvoice() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 300, 800, 580);
		setTitle("RB Private Limited-Purchase");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Details of Customer");
		lblNewLabel.setBounds(10, 11, 208, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Name         :");
		lblNewLabel_1.setBounds(10, 41, 63, 14);
		
		textField = new JTextField();
		textField.setBounds(80, 38, 259, 20);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Address     :");
		lblNewLabel_2.setBounds(10, 72, 73, 14);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 69, 259, 20);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Party GST  :");
		lblNewLabel_3.setBounds(10, 105, 73, 14);
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 102, 259, 20);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Dispatch     :");
		lblNewLabel_4.setBounds(10, 130, 73, 14);
		
		JLabel lblNewLabel_5 = new JLabel("Form       :");
		lblNewLabel_5.setBounds(209, 133, 61, 14);
		
		textField_3 = new JTextField();
		textField_3.setBounds(80, 130, 119, 20);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(265, 127, 74, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Local", "IGST"}));
		comboBox.setToolTipText("");
		
		JLabel lblNewLabel_6 = new JLabel("State          :");
		lblNewLabel_6.setBounds(10, 158, 73, 14);
		
		JLabel lblNewLabel_7 = new JLabel("State Code  :");
		lblNewLabel_7.setBounds(197, 158, 73, 14);
		
		textField_4 = new JTextField();
		textField_4.setBounds(265, 158, 73, 20);
		textField_4.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(80, 161, 107, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Maharashtra"}));
		
		JLabel lblNewLabel_8 = new JLabel("Details of Delivery");
		lblNewLabel_8.setBounds(421, 11, 162, 19);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_9 = new JLabel("Name      :");
		lblNewLabel_9.setBounds(421, 41, 57, 14);
		
		textField_5 = new JTextField();
		textField_5.setBounds(477, 38, 286, 20);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Address  :");
		lblNewLabel_10.setBounds(421, 72, 63, 14);
		
		textField_6 = new JTextField();
		textField_6.setBounds(477, 69, 286, 20);
		textField_6.setColumns(10);
		
		JLabel lblInvoiceNo = new JLabel("Invoice No  :");
		lblInvoiceNo.setBounds(421, 105, 79, 14);
		
		textField_7 = new JTextField();
		textField_7.setBounds(510, 100, 103, 20);
		textField_7.setColumns(10);
		
		JLabel lblDate = new JLabel("Date   :");
		lblDate.setBounds(623, 105, 46, 14);
		
		textField_8 = new JTextField();
		textField_8.setBounds(677, 102, 86, 20);
		textField_8.setColumns(10);
		
		JLabel lblOrderNo = new JLabel("Order No    :");
		lblOrderNo.setBounds(421, 133, 79, 14);
		
		textField_9 = new JTextField();
		textField_9.setBounds(510, 127, 103, 20);
		textField_9.setColumns(10);
		
		JLabel lblDate_1 = new JLabel("Date    :");
		lblDate_1.setBounds(623, 130, 46, 14);
		
		textField_10 = new JTextField();
		textField_10.setBounds(677, 130, 86, 20);
		textField_10.setColumns(10);
		
		JLabel lblChallanNo = new JLabel("Challan No  :");
		lblChallanNo.setBounds(421, 161, 79, 14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(510, 155, 103, 20);
		textField_11.setColumns(10);
		
		JLabel lblDate_2 = new JLabel("Date    :");
		lblDate_2.setBounds(623, 158, 46, 14);
		
		textField_12 = new JTextField();
		textField_12.setBounds(677, 155, 86, 20);
		textField_12.setColumns(10);
		
		JLabel lblTotal = new JLabel(" Total  :");
		lblTotal.setBounds(10, 466, 46, 14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(49, 466, 93, 20);
		textField_13.setColumns(10);
		
		JLabel lblSgst = new JLabel("SGST   :");
		lblSgst.setBounds(152, 466, 46, 14);
		
		textField_14 = new JTextField();
		textField_14.setBounds(197, 466, 93, 20);
		textField_14.setColumns(10);
		
		JLabel lblCgst = new JLabel("CGST   :");
		lblCgst.setBounds(300, 466, 46, 14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(344, 466, 93, 20);
		textField_15.setColumns(10);
		
		JLabel lblIgst = new JLabel("IGST   :");
		lblIgst.setBounds(447, 466, 46, 14);
		
		textField_16 = new JTextField();
		textField_16.setBounds(487, 466, 93, 20);
		textField_16.setColumns(10);
		
		JLabel lblTotal_1 = new JLabel("Total   :");
		lblTotal_1.setBounds(623, 466, 46, 14);
		
		textField_17 = new JTextField();
		textField_17.setBounds(663, 463, 100, 20);
		textField_17.setColumns(10);
		
		JButton btnNewBill = new JButton("New Bill");
		btnNewBill.setBounds(10, 507, 93, 23);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(113, 507, 86, 23);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(204, 507, 86, 23);
		
		JButton btnBillSearch = new JButton("Bill Search");
		btnBillSearch.setBounds(295, 507, 109, 23);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(670, 507, 89, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage frame = new homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(592, 507, 63, 23);
		

		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(414, 508, 103, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Tax Invoice", "GST Invoice", "Proforma Invoice"}));
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 199, 749, 232);
		
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
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"S.N", "PRODUCT", "HSN CODE", "QTY", "PER", "RATE", "TOTAL", "SGST%", "SGST AMT", "CGST %", "CGST AMT", "GRAND TOTAL"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(31);
		table.getColumnModel().getColumn(1).setPreferredWidth(160);
		table.getColumnModel().getColumn(2).setPreferredWidth(81);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(60);
		table.getColumnModel().getColumn(6).setPreferredWidth(65);
		table.getColumnModel().getColumn(7).setPreferredWidth(55);
		table.getColumnModel().getColumn(8).setPreferredWidth(70);
		table.getColumnModel().getColumn(9).setPreferredWidth(56);
		table.getColumnModel().getColumn(10).setPreferredWidth(70);
		table.getColumnModel().getColumn(11).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_8);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(textField_5);
		contentPane.add(lblNewLabel_9);
		contentPane.add(lblNewLabel_2);
		contentPane.add(textField_1);
		contentPane.add(lblNewLabel_10);
		contentPane.add(textField_6);
		contentPane.add(lblNewLabel_3);
		contentPane.add(textField_2);
		contentPane.add(lblInvoiceNo);
		contentPane.add(textField_7);
		contentPane.add(lblDate);
		contentPane.add(textField_8);
		contentPane.add(lblNewLabel_4);
		contentPane.add(textField_3);
		contentPane.add(lblNewLabel_5);
		contentPane.add(comboBox);
		contentPane.add(lblOrderNo);
		contentPane.add(textField_9);
		contentPane.add(lblDate_1);
		contentPane.add(textField_10);
		contentPane.add(lblNewLabel_6);
		contentPane.add(comboBox_1);
		contentPane.add(textField_4);
		contentPane.add(lblNewLabel_7);
		contentPane.add(lblChallanNo);
		contentPane.add(textField_11);
		contentPane.add(lblDate_2);
		contentPane.add(textField_12);
		contentPane.add(textField_13);
		contentPane.add(lblTotal);
		contentPane.add(textField_14);
		contentPane.add(lblSgst);
		contentPane.add(lblCgst);
		contentPane.add(textField_15);
		contentPane.add(lblIgst);
		contentPane.add(textField_16);
		contentPane.add(textField_17);
		contentPane.add(lblTotal_1);
		contentPane.add(btnNewBill);
		contentPane.add(btnModify);
		contentPane.add(btnDelete);
		contentPane.add(btnBillSearch);
		contentPane.add(comboBox_2);
		contentPane.add(btnOk);
		contentPane.add(btnCancel);
	}
}
