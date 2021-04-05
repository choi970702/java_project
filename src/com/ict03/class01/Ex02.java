package com.ict03.class01;

public class Ex02 
{
	// 클래스안에는 3가지가 존재.
	// 멤버필드, 멤버메소드, 생성자
	
	// 멤버필드 : 상수와 변수, static과 instance로 나눠짐.
	// final이 존재하면 상수
	// static이 없으면 instance(개체 생성시 같이 만들어 지는 것)
	// static = 객체 생성과 상관없이 미리 만들어 진다.
	int k1 = 80 ; // instance 변수 = 일반변수
	static int k2 = 90 ; // static 변수 (변수는 값을 바꿀수 있음)
	final int K3 = 85 ; // instance 상수 (상수는 값을 못 바꿈)
	static final int K4 = 95 ; // static 상수 = API에서 제공하는 상수형태
	
	// 멤버메소드 : 동작, 기능
	// 메소드는 자기를 호출한 곳으로 되돌아 간다.
	
	// instance, 반환형 없음
	public void prn01() 
	{
		// 값을 변경할 수 있어서 변수
		k1 = k1 + 20 ;
		k2 = k2 + 10 ;
		System.out.println("k1 : " + k1);
		System.out.println("k2 : " + k2);
		// final이 붙으면 상수, 상수는 값 변경을 할수 없다.(그래서 오류발생)
		// K3 = K3 + 15 ;
		// K4 = K4 + 5 ;
		
		// 지역변수 : 매소드 안에서 만들어진 변수
		//			메소드 안에서 만들어진 변수는 메소드를 호출할때 생성된다.
		//			메소드가 끝나면 사라진다.
		//			지역변수는 static를 만들 수 없다.
		int s1 = 10 ;
		// static int s2 = 90 ;
		final int s3 = 85 ;
		// static final int s4 = 95 ;
				
	}
	
	//static, 변환형 없음
	public static void prn02() 
	{
		// static메소드에는 instance변수를 사용할 수 없다.
		// k1 = k1 + 20 ;
		k2 = k2 + 10 ;
		// K3 = K3 + 15 ;
		System.out.println("k2 : " + k2);
		System.out.println("K4 : " + K4);
		
		// 지역변수는 static을 만들 수 없다.
		int s1 = 10 ;
		// static int s2 = 90 ;
		final int s3 = 85 ;
		// static final int s4 = 95 ;
		
		
		return ; // 없어도 됨(데이터는 못가져감)
	}
	
	// instance, 반환형 있음, (반환이 있는것은)마지막 줄 return '보낼 데이터'
	public int prn03()
	{
		
		return 'c' ; // 반환형보다 작은 자료형
		//return 14 ; 반환형이랑 같은 자료형
	}
	
	// static, 반환형 있음
	public static double prn04()
	{
		
		return 147 ;
		//return 3.14 ;
	}
	
	
}
