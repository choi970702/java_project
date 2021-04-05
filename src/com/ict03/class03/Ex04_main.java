package com.ict03.class03;

public class Ex04_main 
{	

	public static void main(String[] args) 
	{
		Ex03 t1 = new Ex03();
		System.out.println(t1);
		
		// 부모와 자식이 같이 갖고 있으면 자식의 멤버를 먼저 사용
		System.out.println(t1.name);
		// 자식에게 없는 멤버는 부모에게 있는 멤버를 사용함.
		System.out.println(t1.addr);
		
		// 메소드도 마찬가지임.
		t1.sound();
		t1.prn();
		System.out.println("===============================");
		
		// static은 객체 생성과 상관없음
		System.out.println(Ex03.hobby);
		System.out.println(Ex03.car);
		
		// 자식과 부모가 같은 메소드를 갖고 있으면 자식 메소드를 실행함.
		t1.eat();
		
		
	}

}
