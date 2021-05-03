package com.ict0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 
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
			conn = DriverManager.getConnection(url, user, password);
			String sql = "insert into customer(custid, name, address, phone)"
					+ "values(8, '바보', '한국', '010-6666-0006')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			while (result > 0) 
			{
				System.out.println("삽입 성공");
				
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
