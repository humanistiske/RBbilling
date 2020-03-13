package com.gui;


//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

public class homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 342);
		setTitle("HomePage");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("      RB PVT LTD");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(118, 11, 156, 23);
		contentPane.add(lblNewLabel_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 94, 402, 184);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel dataentrypanel = new JPanel();
		layeredPane.add(dataentrypanel, "name_485296648230999");
		dataentrypanel.setLayout(null);
		
		JButton btnSalesInvoice = new JButton("Sales Invoice ");
		btnSalesInvoice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSalesInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salesinvoice si = new salesinvoice();
				setVisible(true); 
				si.setVisible(true);

			}
		});
		btnSalesInvoice.setBounds(139, 11, 134, 23);
		dataentrypanel.add(btnSalesInvoice);
		
		JButton btnQutation = new JButton("Quotation");
		btnQutation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnQutation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quotation quo = new Quotation();
				setVisible(true); 
				quo.setVisible(true);

			}
		});
		btnQutation.setBounds(139, 45, 134, 23);
		dataentrypanel.add(btnQutation);
		
		JButton btnPurchaseInvoice = new JButton("Purchase Invoice");
		btnPurchaseInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PurchaseInvoice purin = new PurchaseInvoice();
				setVisible(true); 
				purin.setVisible(true);
			}
		});
		btnPurchaseInvoice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPurchaseInvoice.setBounds(139, 79, 134, 23);
		dataentrypanel.add(btnPurchaseInvoice);
		
		JButton btnPaymentrecepits = new JButton("Recepits");
		btnPaymentrecepits.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPaymentrecepits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receipts rap = new Receipts();
				setVisible(true); 
				rap.setVisible(true);

			}
		});
		btnPaymentrecepits.setBounds(139, 113, 134, 23);
		dataentrypanel.add(btnPaymentrecepits);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment pay = new Payment();
				setVisible(true); 
				pay.setVisible(true);
			}
		});
		btnPayment.setBounds(139, 147, 134, 23);
		dataentrypanel.add(btnPayment);
		
		JPanel reportpanel = new JPanel();
		layeredPane.add(reportpanel, "name_86459397655875");
		reportpanel.setLayout(null);
		
		JButton btnBillwiseBalance = new JButton("Billwise Balance");
		btnBillwiseBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Billwise bill = new Billwise();
				setVisible(true); 
				bill.setVisible(true);
			}
		});
		btnBillwiseBalance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBillwiseBalance.setBounds(109, 22, 161, 23);
		reportpanel.add(btnBillwiseBalance);
		
		JButton btnProductstockBalance = new JButton("Product/Stock Balance");
		btnProductstockBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductStock pro = new ProductStock();
				setVisible(true); 
				pro.setVisible(true);
			}
		});
		btnProductstockBalance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnProductstockBalance.setBounds(109, 63, 161, 23);
		reportpanel.add(btnProductstockBalance);
		
		JButton btnIntroductionLetter = new JButton("Introduction Letter");
		btnIntroductionLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntroLetter letter = new IntroLetter();
				setVisible(true); 
				letter.setVisible(true);
			}
		});
		btnIntroductionLetter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnIntroductionLetter.setBounds(109, 142, 161, 23);
		reportpanel.add(btnIntroductionLetter);
		
		JButton btnNewButton = new JButton("Product Master");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductMaster promar = new ProductMaster();
				setVisible(true); 
				promar.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(109, 104, 161, 23);
		reportpanel.add(btnNewButton);
		
		JButton btnDataEntry = new JButton("Data Entry");
		btnDataEntry.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDataEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(dataentrypanel);
				layeredPane.repaint();
				layeredPane.revalidate();

			}
		});
		btnDataEntry.setBounds(41, 60, 114, 23);
		contentPane.add(btnDataEntry);
		
		JButton btnReportMiscellaneous = new JButton("Report & Miscellaneous");
		btnReportMiscellaneous.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnReportMiscellaneous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(reportpanel);
				layeredPane.repaint();
				layeredPane.revalidate();

			}
		});
		btnReportMiscellaneous.setBounds(199, 60, 192, 23);
		contentPane.add(btnReportMiscellaneous);
	}
}
