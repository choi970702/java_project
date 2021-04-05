package com.ict03.class05;

public interface Ex01 
{
	// interface : 서비스를 제공하는 목록과 같은 것 이다.
	// 				상수와 추상메소드들로 이루어졌다.
	//				생성자가 없음.(객체 생성 못함) => 실제로 사용못함 => 다중상속이 가능
	//				실제 사용하기 위해서는 interface를 상속 받는 클래스가 있고
	//				상속받은 클래스를 사용하는 것이다.
	// ** interface가 같다라는 말은 대체(호환)가 가능하다라는 뜻임.
	
	// ** interface는 상수와 추상메소드만 가지고 있다.
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	// 위의 멤버필드들은 모두 static final이다.
	
	// 추상메소드가 아니므로 오류발생
	// public void prn(){};
	
	// 일반적인 추상메소드 형식
	public abstract void like();
	
	// interface 안에서는 abstract 예약어를 사용하지 않아도 됨.
	public void sound();
	
	
	
	
	
	
	
	
	
	
	
	
}
