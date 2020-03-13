package com.gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dao.DbDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField companyfeild;
	private JPasswordField passwordField;
	private static LOGIN frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LOGIN();
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
	public LOGIN() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ACER\\Desktop\\gst 1.jpg"));
		JLabel background;
		ImageIcon img = new ImageIcon ("gst pro.jpg");
		
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(100, 100, 515, 341);
		getContentPane().add(background);
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 341);
		setTitle("Login");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblRbPrivateLimited = new JLabel("RB Private Limited");
		lblRbPrivateLimited.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblRbPrivateLimited.setBounds(113, 37, 182, 37);
		contentPane.add(lblRbPrivateLimited);
		
		JLabel lblCompanyName = new JLabel("Company name");
		lblCompanyName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCompanyName.setBounds(31, 99, 129, 22);
		contentPane.add(lblCompanyName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setBounds(31, 144, 129, 14);
		contentPane.add(lblPassword);
		
		companyfeild = new JTextField();
		companyfeild.setBounds(170, 102, 187, 20);
		contentPane.add(companyfeild);
		companyfeild.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			Connection con = DbDao.getConnection();
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
                    String name= companyfeild.getText();
                    String password = passwordField.getText();
                    
                    String query = "select * from login  where name=? and password=?";
                    PreparedStatement stmt = con.prepareStatement(query);
                    stmt.setString(1, name);
                    stmt.setString(2, password);
                    
                    ResultSet set = stmt.executeQuery();
                    if(set.next()) 
                    {
                    	JOptionPane.showInternalMessageDialog(btnLogin, "Login succesful");
                    	
                    	homepage home = new homepage();
                    	home.setVisible(true);
                    	frame.setVisible(false);
                    }
                    else
                    {
                    	JOptionPane.showInternalMessageDialog(btnLogin, "Invalid username or password");
                    }
                    
				}catch(SQLException e) {
					e.printStackTrace();
				}
				finally
				{
					con = null;
				}
				
			}
		});
		
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLogin.setBounds(95, 186, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnNewButton = new JButton("CANCEL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(221, 186, 98, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 143, 187, 20);
		contentPane.add(passwordField);
	
}
}
