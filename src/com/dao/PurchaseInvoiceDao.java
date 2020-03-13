package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.beans.SalesInvoice;

public class PurchaseInvoiceDao
{
	public int add(SalesInvoice s)
	{
		int count = 0;
		String query = "INSERT INTO purchase_invoice("
				+ "cust_name, cust_address, party_gst, dispatch, state, state_code, "
				+ "del_name, del_address, purchase_invoice_no, order_no, challan_no) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = DbDao.getConnection();
		try 
		{
			PreparedStatement pre = con.prepareStatement(query);
			pre.setString(1, s.getCust_name());
			pre.setString(2, s.getCust_address());
			pre.setString(3, s.getParty_gst());
			pre.setString(4, s.getDispatch());
			pre.setString(5, s.getState());
			pre.setString(6, s.getState());
			pre.setString(7, s.getDel_name());
			pre.setString(8, s.getDel_address());
			pre.setInt(9, getInvoiceNo());
			pre.setInt(10, s.getOrder_no());
			pre.setInt(11, s.getChallan_no());
			
			count = pre.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return count;
	}

	private int getInvoiceNo() 
	{
		int count = 0;
		String query = "select count(*) from purchase_invoice";
		Connection con = DbDao.getConnection();
		try
		{
			Statement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				count = rs.getInt(1);	
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count+1;
	}
}
