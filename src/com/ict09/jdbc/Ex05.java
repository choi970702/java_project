package com.ict09.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Ex05 
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
			// 계정을 만들때 'test02'@'%'
			String url = "jdbc:mysql://203.236.220.120:3306/test02db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			
			String sql = "insert into student_tb(no,name,det,addr,tel)"
					+ "values(1,'홍길동','정통','서울','010-7777-9999')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if (result > 0) 
			{
				sql = "select * from student_tb";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) 
				{
					System.out.println(rs.getString("no")+"\t");
					System.out.println(rs.getString("name")+"\t");
					System.out.println(rs.getString("det")+"\t");
					System.out.println(rs.getString("addr")+"\t");
					System.out.println(rs.getString("tel")+"\t");
				}
			}
			
		} catch (Exception e) 
		{
			System.out.println("실패-1");
		}finally
		{
			try 
			{
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) 
			{
				System.out.println("실패-2");
			}
		}
		
		
	}
}
