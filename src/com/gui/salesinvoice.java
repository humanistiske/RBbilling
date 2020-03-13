package com.gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

import com.beans.SalesInvoice;
import com.dao.SalesInvoiceDao;
import com.toedter.calendar.JDateChooser;

public class salesinvoice extends JFrame {

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
	private JTable table;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_10;
	
	private JComboBox combo_form = new JComboBox();
	private JDateChooser dateChooser_3 = new JDateChooser();
	private JDateChooser dateChooser_4 = new JDateChooser();
	private JDateChooser dateChooser_5 = new JDateChooser();
	private JDateChooser dateChooser = new JDateChooser();

	/*private void clearfields() {
		textField.setText(null);
		textField_1.setText(null);
		textField_2.setText(null);
		textField_3.set(null);
		textField_5.setText(null);
		textField_6.setText(null);
		textField_7.setText(null);
		textField_8.setText(null);
		textField_9.setText(null);
		textField_10.setText(null);
			}*/

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salesinvoice frame = new salesinvoice();
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
	public salesinvoice() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 300, 800, 590);
		setTitle("RB Private Limited-Sales");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Name      :");
		lblName.setBounds(10, 37, 55, 14);
		 
		textField = new JTextField();
		textField.setBounds(76, 34, 315, 20);
		textField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address  :");
		lblAddress.setBounds(10, 66, 62, 14);
		
		JLabel lblDetalisOfCustomer = new JLabel("Detalis of customer");
		lblDetalisOfCustomer.setBounds(10, 16, 174, 14);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 63, 320, 20);
		textField_1.setColumns(10);
		
		JLabel lblPartysGst = new JLabel("Party's GST :");
		lblPartysGst.setBounds(10, 97, 84, 14);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(76, 89, 320, 20);
		textField_2.setColumns(10);
		
		JLabel lblDispach = new JLabel("Dispach   :");
		lblDispach.setBounds(10, 123, 62, 14);
		
		JLabel lblState = new JLabel("STATE     :");
		lblState.setBounds(10, 148, 66, 14);
		
		textField_10 = new JTextField();
		textField_10.setBounds(76, 145, 86, 20);

		
		JLabel lblStateCode = new JLabel("State Code  :");
		lblStateCode.setBounds(172, 148, 73, 14);
		
		textField_4 = new JTextField();
		textField_4.setBounds(242, 145, 55, 20);
		textField_4.setColumns(10);
		
		JLabel lblDeliveryDetails = new JLabel("Delivery Details");
		lblDeliveryDetails.setBounds(426, 16, 174, 14);
		
		JLabel lblName_1 = new JLabel("Name     :");
		lblName_1.setBounds(426, 41, 58, 14);
		
		textField_5 = new JTextField();
		textField_5.setBounds(496, 37, 283, 20);
		textField_5.setColumns(10);
		
		JLabel lblAddress_1 = new JLabel("Address  :");
		lblAddress_1.setBounds(426, 69, 60, 14);
		
		textField_6 = new JTextField();
		textField_6.setBounds(496, 66, 283, 20);
		textField_6.setColumns(10);
		
		JLabel lblInvoiceNo = new JLabel("Invoice No. :");
		lblInvoiceNo.setBounds(426, 95, 70, 14);
		
		textField_7 = new JTextField();
		textField_7.setBounds(496, 92, 128, 20);
		textField_7.setColumns(10);
		
		JLabel lblOrderno = new JLabel("Order No.  :");
		lblOrderno.setBounds(426, 121, 66, 14);
		
		textField_8 = new JTextField();
		textField_8.setBounds(496, 120, 128, 20);
		textField_8.setColumns(10);
		
		JLabel lblChallanNo = new JLabel("Challan No.  :");
		lblChallanNo.setBounds(426, 150, 84, 14);
		
		textField_9 = new JTextField();
		textField_9.setBounds(496, 147, 128, 20);
		textField_9.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 198, 769, 252);
		
		JButton btnNewBill = new JButton("New Bill");
		btnNewBill.setBounds(10, 516, 84, 23);
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModify.setBounds(98, 516, 86, 23);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(194, 516, 73, 23);
		
		JButton btnBillSearch = new JButton("Bill Search");
		btnBillSearch.setBounds(276, 516, 95, 23);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(693, 516, 76, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage frame = new homepage();
				frame.setVisible(true);
				dispose();
				
			}
		});
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				SalesInvoice s = new SalesInvoice();
				s.setCust_name(textField.getText());
				s.setCust_address(textField_1.getText());
				s.setParty_gst(textField_2.getText());
				s.setDispatch(textField_3.getText());
				s.setState(textField_10.getText());
				s.setState_code(textField_5.getText());
				s.setDel_name(textField_6.getText());
				s.setDel_address(textField_7.getText());
				s.setOrder_no(Integer.parseInt(textField_8.getText()));
				s.setChallan_no(Integer.parseInt(textField_9.getText()));
				
				if(new SalesInvoiceDao().add(s) > 0)
				{
					JOptionPane.showMessageDialog(null,"data saved");	
				}
				else
				{
					JOptionPane.showMessageDialog(null,"data not saved");				
				}
			}
		});
		btnOk.setBounds(614, 516, 62, 23);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setBounds(20, 461, 45, 14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(63, 456, 86, 20);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" SGST :");
		lblNewLabel.setBounds(149, 461, 46, 14);
		
		textField_14 = new JTextField();
		textField_14.setBounds(194, 456, 86, 20);
		textField_14.setColumns(10);
		
		JLabel lblCgst = new JLabel("CGST :");
		lblCgst.setBounds(291, 461, 47, 14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(329, 456, 86, 20);
		textField_15.setColumns(10);
		
		JLabel lblGrandTotal = new JLabel("Grand Total :");
		lblGrandTotal.setBounds(592, 459, 84, 14);
		
		textField_16 = new JTextField();
		textField_16.setBounds(684, 456, 95, 20);
		textField_16.setColumns(10);
		
		JLabel lblIgst = new JLabel("IGST :");
		lblIgst.setBounds(426, 461, 70, 14);
		
		textField_17 = new JTextField();
		textField_17.setBounds(460, 456, 86, 20);
		textField_17.setColumns(10);
		
		JLabel lblForm = new JLabel("Form  :");
		lblForm.setBounds(225, 123, 42, 14);
		
		JLabel label = new JLabel("");
		label.setBounds(323, 606, 0, 0);
		
		combo_form.setModel(new DefaultComboBoxModel(new String[] {"Local", "sales"}));
		combo_form.setBounds(269, 120, 122, 20);
		contentPane.add(combo_form);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(308, 145, 107, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Tax Invoice", "GST Invoice", "Proforma Invoice"}));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null, null, null, null, null, "", null},
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
				"S.N", "Product", "HSN Code", "Qty", "Per", "Rate", "Total", "SGST %", "SGST Amt", "CGST %", "CGST Amt", "GRAND TOTAL"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(32);
		table.getColumnModel().getColumn(1).setPreferredWidth(165);
		table.getColumnModel().getColumn(2).setPreferredWidth(66);
		table.getColumnModel().getColumn(3).setPreferredWidth(43);
		table.getColumnModel().getColumn(4).setPreferredWidth(32);
		table.getColumnModel().getColumn(5).setPreferredWidth(51);
		table.getColumnModel().getColumn(6).setPreferredWidth(65);
		table.getColumnModel().getColumn(7).setPreferredWidth(65);
		table.getColumnModel().getColumn(8).setPreferredWidth(65);
		table.getColumnModel().getColumn(9).setPreferredWidth(65);
		table.getColumnModel().getColumn(10).setPreferredWidth(65);
		table.getColumnModel().getColumn(11).setPreferredWidth(92);
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(comboBox_2);
		contentPane.add(scrollPane);
		contentPane.add(lblName);
		contentPane.add(textField);
		contentPane.add(lblAddress);
		contentPane.add(textField_1);
		contentPane.add(lblPartysGst);
		contentPane.add(textField_2);
		contentPane.add(lblDetalisOfCustomer);
		contentPane.add(lblDispach);
		contentPane.add(lblForm);
		contentPane.add(lblState);
		contentPane.add(lblStateCode);
		contentPane.add(textField_4);
		contentPane.add(lblDeliveryDetails);
		contentPane.add(lblName_1);
		contentPane.add(lblChallanNo);
		contentPane.add(lblOrderno);
		contentPane.add(lblInvoiceNo);
		contentPane.add(textField_9);
		contentPane.add(textField_8);
		contentPane.add(textField_7);
		contentPane.add(textField_5);
		contentPane.add(lblAddress_1);
		contentPane.add(textField_6);
		contentPane.add(lblTotal);
		contentPane.add(textField_13);
		contentPane.add(lblNewLabel);
		contentPane.add(textField_14);
		contentPane.add(lblCgst);
		contentPane.add(textField_15);
		contentPane.add(lblIgst);
		contentPane.add(textField_17);
		contentPane.add(lblGrandTotal);
		contentPane.add(btnNewBill);
		contentPane.add(btnModify);
		contentPane.add(btnDelete);
		contentPane.add(btnBillSearch);
		contentPane.add(btnOk);
		contentPane.add(btnCancel);
		contentPane.add(textField_16);
		
				contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 120, 139, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
