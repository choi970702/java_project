package com.ict03.class07;

public class Ex02_main {

	public static void main(String[] args) 
	{
		// - Member 내부클래스는 별도로 객체 생성 못함
		// Inner01 t1 = new Inner01();
		
		// 외부클래스를 통해서 내부클래스 사용가능
		Ex02 t1 = new Ex02();
		// 외부를 통해서 내부클래스 생성
		Ex02.Inner01 t2 = t1.new Inner01();
		
		// 달러 표시('$')가 있으면 내부클래스의 주소임
		/*외부클래스 생성자 : com.ict03.class07.Ex02@4926097b
		내부클래스 생성자 : com.ict03.class07.Ex02$Inner01@5d22bbb7*/
		System.out.println(t2.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		System.out.println();
		// 외부클래스 메소드
		t2.play();
		System.out.println();
		
		
		
		
		
		

	}

}
