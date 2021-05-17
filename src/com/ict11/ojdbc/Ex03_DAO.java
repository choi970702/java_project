package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03_DAO 
{
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	int result;
	
	private static Ex03_DAO dao = new Ex03_DAO();
	public static Ex03_DAO getinstance()
	{
		return dao;
	}
	public Connection getConnection()
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.120:1521:xe";
			String user = "c##choi970702";
			String password = "chl147258";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
		return conn;
	}
	public void getList()
	{
		try 
		{
			conn = getConnection();
			String sql = "select * from book order by bookid";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
			while (rs.next()) 
			{
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) 
		{
			System.out.println("2"+e);
		}finally
		{
			try 
			{
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
	} // 메소드 끝
	
	// 삽입하는 메소드
	public void getinsert(int i_bookid, String i_bookname, String i_publisher, int i_price)
	{
		try 
		{
			conn = getConnection();
			String sql = "insert into book values(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1,i_bookid);
			pstm.setString(2,i_bookname);
			pstm.setString(3,i_publisher);
			pstm.setInt(1,i_price);
			result = pstm.executeUpdate();
			if (result > 0)
				System.out.println("삽입성공");
			
			
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
				// TODO: handle exception
			}
		}
	}
	// 삭제하는 메소드
	public void getdelete(int delete_id)
	{
		try 
		{
			conn = getConnection();
			String sql = "delete from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1,delete_id);
			result = pstm.executeUpdate();
			if(result > 0)
				System.out.println("삭제성공");
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
				// TODO: handle exception
			}
		}
	}
	// 수정하는 메소드
	public void getupdate(int u_bookid, String u_bookname, String u_publisher, int u_price)
	{
		try 
		{
			conn = getConnection();
			String sql = "update book set bookname = ?, publisher = ?, price = ? where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, u_bookname);
			pstm.setString(2, u_publisher);
			pstm.setInt(3, u_price);
			pstm.setInt(4, u_bookid);
			result = pstm.executeUpdate();
			if(result > 1)
				System.out.println("수정성공");
			else
				System.out.println("수정실패");
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
	}
	// 검색하는 메소드
	public void getselect(int select_id)
	{
		try 
		{
			conn = getConnection();
			String sql = "select * from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, select_id);
			rs = pstm.executeQuery();
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
