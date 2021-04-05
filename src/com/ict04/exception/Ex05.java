package com.ict04.exception;

import java.util.Scanner;

public class Ex05 
{
	// throws (예외 양도, 예외 전가)
	// 예외가 발생하면 예외를 처리하지 않고, 자신을 호출한 곳으로 예외 객체를 전달하는 것
	// 나중에라도 예외처리(try~catch)를 하는 것이 좋다.

	public static void main(String[] args) 
	{
		Ex05 test = new Ex05();
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		String msg = scan.next();
		test.setData(msg);
		

	}
	public void setData(String msg)
	{
		// msg의 글자의 길이가 한개 이상이면 실행
		if(msg.length()>=1)
		{
			String str = msg.substring(0,1); // 첫 글자만 추출해라
			prnData(str);
		}
		
		
	}
	public void prnData(String str)
	{
		int dan = Integer.parseInt(str);
		System.out.println(dan +" 단");
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(dan +" * "+" = "+(dan*i));
		}
		
		
	}
	
	
	//
	
	

}
