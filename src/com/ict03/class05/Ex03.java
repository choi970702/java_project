package com.ict03.class05;

// interface 상속받기
// 1. 일반클래스가 interface를 상속 받을때
//		=> 무조건 오버라이딩 해야함.
// 2. 추상클래스가 interface를 상속하면
//      => 오버라이딩 필요없다.
// 3. interface가 interface를 상속하면
//	    => 오버라이딩 필요없음.
// 4. 다중 상속이 가능하다.
// interface 자식 extends interface부모1, interface부모2, interface부모3 ;
// 5. 일반 클래스가 부모클래스와 부모 interface를 같이 상속하면 
// class 클래스이름 extends 부모클래스이름 implements interface이름
// 6. interface => interface , 클래스 => 클래스 : extends 예약어 사용
//	클래스 => interface : implements 예약어 사용 ,    interface => 클래스 : 사용불가

// 일반클래스가 interface를 상속 : 반드시 오버라이딩 해야됨
class Ex03 implements Ex01
{

	@Override
	public void like() 
	{
		
	}

	@Override
	public void sound() 
	{
		
	}	
	
	
}

// 추상클래스가 interface 상속 : 오버라이딩 필요없음.
abstract class Ex04 implements Ex01
{
	
}

// 인터페이스가 인터페이스를 상속 : 오버라이딩 필요없음.
interface Ex05 extends Ex01
{
	
}








