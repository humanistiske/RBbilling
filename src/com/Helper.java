package com;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Helper 
{
	public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException
	{
		ResultSetMetaData meta = rs.getMetaData();
		Vector<String> columnNames = new Vector<String>();
		int columnCount = meta.getColumnCount();
		for(int i=0; i<=columnCount; i++)
		{
			columnNames.add(meta.getColumnName(i));
		}
		
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		while(rs.next())
		{
			Vector<Object> v = new Vector<>();
			for(int i=0; i<=columnCount; i++)
			{
				v.add(rs.getObject(i));
			}
			data.add(v);
		}
	
		return new DefaultTableModel(data, columnNames);
	}
}
