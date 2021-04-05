package com.ict03.class03;

// Ex02와 Ex03은 상속관계
public class Ex03 extends Ex02
{
	
		
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
		
	public Ex03() 
	{
		System.out.println("자식 클래스 생성자 : "+ this);
	}
	
	public void sound()
	{
		System.out.println("자식 클래스 메소드");
	}
	
	public void study()
	{
		// 객체 생성 없이 부모 클래스의 멤버를 사용한것.
		System.out.println("공부 장소 : "+ addr);
		
		System.out.println("name : "+ name); // 차두리
		// 부모의 name을 가져오려면 앞에 super.을 붙임
		System.out.println("name : "+ super.name); // 차범근
		
		// 상속관계라도 private는 사용할수 없다.
		// System.out.println("우리집 애완동물 : "+ dog);
	}
	
	// 오버라이딩(재정의) : 부모메소드를 겉모양은 그대로 사용하면서 내용만 변경하는것
	@Override
	public void eat() 
	{
		System.out.println("아침밥은 생략한다.");
		
	}
	
	// 오버라이딩을 할 수 없게하는 예약어 : final
	// 부모 메소드에 final 이 있으면 오버라이딩 할 수 없다.
	// 내용 수정 불가능
	/*public final void walk()
	{
		System.out.println("하루에 무조건 1시간은 안 걷는다.");
	}*/
	
	
	
	
}
