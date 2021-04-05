package com.ict01.grammer02;
class Ex04
{
	public static void main(String[] args)
	{
	 // 숫자들의 크기에 따른 저장 원리
	 // char < int < long < float < double
	 // (문자) (정수형 숫자) ( 실수형 숫자)
	 // 형변환 : 자동 형변환과 강제 형변환	
	 // 자동형변환(프로모션) : 작은 자료형이 큰 자료형에 저장될때 자동 형변환이 됨.
 	 // char를 int에 저장할수 있다.
		char c1 = 'a' ;	// a
		System.out.println(c1);
		int s1 = 'a' ;	// 97
		System.out.println(s1);

	 // char c1 변수의 데이터도 int s2에 저장됨
		int s2 = c1 ;	// 97
		System.out.println(s2);

	 // int 를 long에 저장할 수 있다.
		long s3 = 117L ;
		System.out.println(s3);
		long s4 = 117 ;
		System.out.println(s4);

	 // long이 float 이나 double에 저장 가능
		float s5 = s3 ;
		System.out.println(s5);


	 // 강제형 변환 : 큰 자료형은 작은 자료형으로 저장할때 오류가 발생
	 // 강제로 형 변환해서 오류가 나지 않게 한다.
	 // 그러나 데이터를 손실할 가능성이 있다.
	 // 강제형 변환 방법(디모션) : 등호를 기준으로 무조건 왼쪽 자료형에 맞춘다.
	 //  ex) = (왼쪽 자료형)(대상) ;
		byte k1 = (byte)(256) ;
		System.out.println(k1);

	 // int 를 char에 넣자
		char k2 = 97 ;	
		System.out.println(k2);

		int k3 = 97 ;	
		char k4 = (char)(k3) ;
		System.out.println(k4);

	 // float 나 double을 int 로 저장
		int k5 = (int)(87.64) ;
		System.out.println(k5);





	}
}