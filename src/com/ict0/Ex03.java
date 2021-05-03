package com.ict0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Ex03
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			String sql = "select * from book";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) 
			{
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getString("price")+"\t");
			}
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
		
	}
}
