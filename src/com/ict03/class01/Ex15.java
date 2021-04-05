package com.ict03.class01;

public class Ex15 
{
	int s1 = 100;
	// static 초기화전
	static int s2 = 200;
	
	// static 초기화
	static 
	{
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
		// s5 = 5000;
	
	}
	
	// 초기화 이후 선언해도 오류 발생 안함
	static int s3 = 300;
	static int s4;
	
	public static void main(String[] args) 
	{
		// main 메소드도 static이므로 전역변수가 instance이면 사용불가
		// System.out.println(s1); 
		System.out.println(s2); // 2000
		System.out.println(s3); // 300
		System.out.println(s4); // 4000
		
	}
}
