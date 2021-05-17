package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// ���ǻ縦 �޾Ƽ� �ش� ���ǻ簡 ������ ���� ���� ��θ� ����ϱ�
public class Ex02 
{
	public static void main(String[] args) 
	{
		// Scaaner�� �̿��ؼ� ���ǻ��� ������ ����
		Scanner scan = new Scanner(System.in);
		System.out.println("���ǻ縦 �Է��ϼ���.");
		String msg = scan.next();
		// DBó���� �ʿ��� Ŭ����
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;	// select��
		int result = 0;			// select���� ������ ������
		try 
		{
			// ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// �������� 3�� 
			String url = "jdbc:oracle:thin:@203.236.220.120:1521:xe";
			String user = "c##choi970702";
			String password = "chl147258";
			conn = DriverManager.getConnection(url, user, password);
			// ���� �ۼ�
			String sql = "select * from book where publisher like ? order by bookid";
			pstm = conn.prepareStatement(sql);
			// ? => ���ε�����
			pstm.setString(1, "%"+msg+"%");
			rs = pstm.executeQuery();
			System.out.println("������ȣ\t������\t���ǻ�\t����");
			while(rs.next())
			{
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price")+"\t");
			}
		} catch (Exception e) 
		{
			System.out.println(e);
		}finally
		{
			try 
			{
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) 
			{
				System.out.println(e2);
			}
		}
	}
}