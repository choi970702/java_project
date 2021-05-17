package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO 
{
	// DAO�� data access object�� ���ڷμ� ���������� DB�� �����ϴ� ��ü�� ���ϳ�.
	// DAO�� ��� ������ ȿ������ Ŀ�ؼ� ������ ���ȼ� �����̴�.
	// DAO�� DB�� ����� �����͸� ��ȸ�ϰų� �����ϴ� ��ɸ� �����ϵ��� ���� ������Ʈ��.
	Connection conn ;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	
	// DB�� �����ϴ� ������ �����Ѵ�.
	public DAO() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	// ���� DB���� �޼ҵ带 ������
	// ��ü ���� ����ϴ� �޼ҵ�
	public void getList()
	{
		try 
		{
			String sql = "select * from book order by bookid";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("������ȣ\t������\t���ǻ�\t����");
			while (rs.next()) 
			{
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) 
		{
			System.out.println(e);
		}finally
		{
			try 
			{
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
	} // �޼ҵ� ��
	
	// �����ϴ� �޼ҵ�
	public void getinsert(int i_bookid, String i_bookname, String i_publisher, int i_price)
	{
		try 
		{
			String sql = "insert into book values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,i_bookid);
			pstmt.setString(2,i_bookname);
			pstmt.setString(3,i_publisher);
			pstmt.setInt(1,i_price);
			result = pstmt.executeUpdate();
			if (result > 0)
				System.out.println("���Լ���");
			
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}finally
		{
			try 
			{
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
	}
	// �����ϴ� �޼ҵ�
	public void getdelete(int delete_id)
	{
		try 
		{
			String sql = "delete from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,delete_id);
			result = pstmt.executeUpdate();
			if(result > 0)
				System.out.println("��������");
		} catch (Exception e) 
		{
			System.out.println(e);
		}finally
		{
			try 
			{
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
	}
	// �����ϴ� �޼ҵ�
	public void getupdate(int u_bookid, String u_bookname, String u_publisher, int u_price)
	{
		try 
		{
			String sql = "update book set bookname = ?, publisher = ?, price = ? where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u_bookname);
			pstmt.setString(2, u_publisher);
			pstmt.setInt(3, u_price);
			pstmt.setInt(4, u_bookid);
			result = pstmt.executeUpdate();
			if(result > 1)
				System.out.println("��������");
			else
				System.out.println("��������");
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
	}
	// �˻��ϴ� �޼ҵ�
	public void getselect(int select_id)
	{
		try 
		{
			String sql = "select * from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, select_id);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
	}
	
	
	
	
	
}