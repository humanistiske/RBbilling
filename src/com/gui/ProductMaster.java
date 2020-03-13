package com.gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductMaster extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductMaster frame = new ProductMaster();
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
	public ProductMaster() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 602, 265);
		setTitle("RB Private Limited-Product Master");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStockName = new JLabel("Stock Name");
		lblStockName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStockName.setBounds(10, 26, 89, 14);
		contentPane.add(lblStockName);
		
		textField = new JTextField();
		textField.setBounds(101, 23, 474, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblHsnCode = new JLabel("HSN Code");
		lblHsnCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHsnCode.setBounds(10, 66, 81, 14);
		contentPane.add(lblHsnCode);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 63, 158, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPer = new JLabel("Per");
		lblPer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPer.setBounds(293, 66, 46, 14);
		contentPane.add(lblPer);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(10, 106, 46, 14);
		contentPane.add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(79, 103, 180, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCostPrice = new JLabel("Cost Price");
		lblCostPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCostPrice.setBounds(293, 106, 68, 14);
		contentPane.add(lblCostPrice);
		
		textField_3 = new JTextField();
		textField_3.setBounds(362, 103, 158, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblOpStock = new JLabel("Op.Stock");
		lblOpStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOpStock.setBounds(10, 144, 61, 17);
		contentPane.add(lblOpStock);
		
		textField_4 = new JTextField();
		textField_4.setBounds(79, 141, 180, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNew = new JButton("New");
		btnNew.setBounds(101, 191, 77, 23);
		contentPane.add(btnNew);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(188, 191, 89, 23);
		contentPane.add(btnModify);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(287, 191, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(386, 191, 89, 23);
		contentPane.add(btnSearch);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage frame = new homepage();
				frame.setVisible(true);
				dispose();
				}
		});
		btnExit.setBounds(486, 191, 89, 23);
		contentPane.add(btnExit);
		
		textField_5 = new JTextField();
		textField_5.setBounds(362, 63, 113, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
