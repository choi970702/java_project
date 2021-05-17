package com.ict11.ojdbc;

import java.util.Scanner;

import com.ict10.jdbc.DAO2;

public class Ex03 
{
	public static void main(String[] args) 
	{
		esc:
		while (true)
		{
			Ex03_DAO.getinstance().getList();
			Scanner scan = new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("다음을 선택하시오.");
			
			System.out.println("1. 삽입하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 수정하기");
			System.out.println("4. 검색하기");
			System.out.println("선택번호 : ");
			String su = scan.next();
			switch (su)
			{
			case "1" :
				System.out.println("bookid : ");
				int i_bookid = scan.nextInt();
				// next 띄어쓰기 못함
				System.out.println("bookname : ");
				String i_bookname = scan.next();
				System.out.println("publisher : ");
				String i_publisher = scan.next();
				System.out.println("price : ");
				int i_price = scan.nextInt();
				// 삽입하는 메소드
				Ex03_DAO.getinstance().getinsert(i_bookid, i_bookname, i_publisher, i_price);
				break;
			case "3" :
				System.out.println("bookid : ");
				int u_bookid = scan.nextInt();
				System.out.println("bookname : ");
				String u_bookname = scan.next();
				System.out.println("publisher : ");
				String u_publisher = scan.next();
				System.out.println("price : ");
				int u_price = scan.nextInt();
				Ex03_DAO.getinstance().getupdate(u_bookid, u_bookname, u_publisher, u_price);
				break;
			case "2" :
				System.out.println("삭제할 bookid : ");
				int delete_id = scan.nextInt();
				Ex03_DAO.getinstance().getdelete(delete_id);
				break;
			case "4" :
				System.out.println("검색할 id : ");
				int select_id = scan.nextInt();
				Ex03_DAO.getinstance().getselect(select_id);
			default : System.out.println("제대로 선택하세요."); continue esc;
			}
			while (true) 
			{
				System.out.println("계속할까요?(y/n)");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y"))
				{
					continue esc;
				}else
					break esc;
				
				
			}
			
		}
		System.out.println("변경된 내용입니다.");
		DAO2.getinstance().getList();
		
		
	}
}
