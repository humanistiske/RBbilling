package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.SalesInvoice;

public class SalesInvoiceDao 
{
	public int add(SalesInvoice s)
	{
		int count = 0;
		String query = "INSERT INTO sales_invoice("
				+ "cust_name, cust_address, party_gst, dispatch, state, state_code, "
				+ "del_name, del_address, sales_invoice_no, order_no, challan_no) "
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

	public int update(SalesInvoice s)
	{
		int count = 0;
		String query = "UPDATE sales_invoice set "
				+ "cust_name=?, cust_address=?, party_gst=?, dispatch=?, state=?, state_code=?, "
				+ "del_name=?, del_address=?, order_no=?, challan_no=? where  sales_invoice_no=?";
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
			pre.setInt(9, s.getOrder_no());
			pre.setInt(10, s.getChallan_no());
			pre.setInt(11, s.getInvoice_no());
			count = pre.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		return count;
	}

	public int getInvoiceNo() 
	{
		int count = 0;
		String query = "select count(*) from sales_invoice";
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


	public  SalesInvoice getInvoice(final int i) 
	{
		int count = 0;
		String query = "select * from sales_invoice where invoice_no=?";
		Connection con = DbDao.getConnection();
		SalesInvoice s = new SalesInvoice();
		try
		{
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, i);
			ResultSet rs = pre.executeQuery(query);
			while(rs.next())
			{
				s.setCust_name(rs.getString(1));
				s.setCust_address(rs.getString(2));
				s.setParty_gst(rs.getString(3));
				s.setDispatch(rs.getString(4));
				s.setState_code(rs.getString(5));
				s.setDel_name(rs.getString(6));
				s.setDel_address(rs.getString(7));
				s.setOrder_no(rs.getInt(8));
				s.setChallan_no(rs.getInt(9));
				s.setInvoice_no(i);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return s;
	}

	public ResultSet getInvoiceAll() 
	{
		ResultSet rs = null;
		String query = "select * from sales_invoice";
		Connection con = DbDao.getConnection();
		SalesInvoice s = new SalesInvoice();
		try
		{
			PreparedStatement pre = con.prepareStatement(query);
			rs = pre.executeQuery(query);
			while(rs.next())
			{
				s.setInvoice_no(Integer.parseInt(rs.getString(1)));
				s.setCust_name(rs.getString(2));
				s.setCust_address(rs.getString(3));
				s.setParty_gst(rs.getString(4));
				s.setDispatch(rs.getString(5));
				s.setState_code(rs.getString(6));
				s.setDel_name(rs.getString(7));
				s.setDel_address(rs.getString(8));
				s.setOrder_no(rs.getInt(9));
				s.setChallan_no(rs.getInt(10));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	public int delete(int s)
	{
		int count = 0;
		String query = "delete from sales_invoice where"
				+ " sales_invoice_no=?";
		Connection con = DbDao.getConnection();
		try 
		{
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, s);

			count = pre.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		return count;

	}
}
