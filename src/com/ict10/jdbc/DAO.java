package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO 
{
	// DAO란 data access object의 약자로서 실질적으로 DB에 접근하는 객체를 말하낟.
	// DAO의 사용 이유는 효율적인 커넥션 관리와 보안성 때문이다.
	// DAO는 DB를 사용해 데이터를 조회하거나 조작하는 기능릉 전담하도록 만든 오브젝트다.
	Connection conn ;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	
	// DB에 접속하는 역할을 수행한다.
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
	// 각종 DB점근 메소드를 만들자
	// 전체 정보 출력하는 메소드
	public void getList()
	{
		try 
		{
			String sql = "select * from book order by bookid";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
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
	} // 메소드 끝
	
	// 삽입하는 메소드
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
				System.out.println("삽입성공");
			
			
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
	// 삭제하는 메소드
	public void getdelete(int delete_id)
	{
		try 
		{
			String sql = "delete from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,delete_id);
			result = pstmt.executeUpdate();
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
				pstmt.close();
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
			String sql = "update book set bookname = ?, publisher = ?, price = ? where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u_bookname);
			pstmt.setString(2, u_publisher);
			pstmt.setInt(3, u_price);
			pstmt.setInt(4, u_bookid);
			result = pstmt.executeUpdate();
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
				pstmt.close();
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
