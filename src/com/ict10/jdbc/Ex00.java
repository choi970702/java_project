package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex00 
{
	public static void main(String[] args) 
	{
		// JDBC(Java DataBase Connectivity)�� �ڹٿ��� �����ͺ��̽� ������ �� �ֵ��� ����.
		// �ڹ� API�̴�.
		
		// DB ó���� �ʿ��� Ŭ���� 3��
		Connection conn = null;
		// statement�� ��ӹ��� �������̽�
		PreparedStatement pstmt = null;
		ResultSet rs = null;	// select ���� ����� �޴� Ŭ������ cursor�� ����ؼ� ������ ������ �� �ִ�.
		int result = 0;			// select ���� ������ ������ ����� ���� �� ���.
		
		try 
		{
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			
			// ������ �ۼ�(insert, update, select, delete)
			String sql = "select * from book order by bookid";
			
			// ���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			// ���� DB�� �����ϰ� ��� �ޱ�
			rs = pstmt.executeQuery();
			
			// ��� ����
			while (rs.next()) 
			{
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price")+"\t");
			}
		} catch (Exception e) 
		{
		}finally
		{
			try
			{
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2)
			{
			}
		}
		
	}
}
