package com.ict09.jdbc;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Ex6 
{
	// 데이터를 받아서 vo에 넣자
	public static void main(String[] args) 
	{
		ArrayList<VO> list = new ArrayList<VO>();
		Scanner scan = new Scanner(System.in);
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
			esc:
			while (true) 
			{
				System.out.println("학번 : ");
				int no = scan.nextInt();
				System.out.println("이름 : ");
				String name = scan.next();
				System.out.println("학과 : ");
				String det = scan.next();
				System.out.println("주소 : ");
				String addr = scan.next();
				System.out.println("전화 : ");
				String tel = scan.next();
				
				list.add(new VO(no, name, det, addr, tel));
				while (true) 
				{
					System.out.println("계속할까요?(y/n) ");
					String msg = scan.next();
					if (msg.equalsIgnoreCase("y")) 
					{
						continue esc;
					} else if(msg.equalsIgnoreCase("n"))
					{
						break esc;
					}else
					{
						continue;
					}
				}
			}
			// 저장정보 DB입력
			for (VO vo : list) 
			{
			
			String sql = "insert into student_tb(no,name,det,addr,tel)"
					+ "values("+vo.getNo() +",'"+vo.getName() 
					+"','"+vo.getDet() +"','"+vo.getAddr() 
					+"','"+vo.getTel() +"')";
			stmt = conn.createStatement();
			result =  stmt.executeUpdate(sql);
			if (result < 0) 
			{
				System.out.println("오류발생");
			}
			
			}
			
			String sql = "select * from student_tb";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("번호\t이름\t학과\t주소\t전화");
			while (rs.next()) 
			{
				System.out.println(rs.getString("no")+"\t");
				System.out.println(rs.getString("name")+"\t");
				System.out.println(rs.getString("det")+"\t");
				System.out.println(rs.getString("addr")+"\t");
				System.out.println(rs.getString("tel")+"\t");
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
