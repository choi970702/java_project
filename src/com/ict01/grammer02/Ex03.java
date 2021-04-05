package com.ict01.grammer02;
class Ex03
{
	public static void main(String[] args)
	{
	 // 정수형 : 소숫점이 없는 숫자
	 // 정수형 : byte < short < int < long
	 // 정수형의 기본은 int 임.
	 // 주의 사항 : byte, short 를 연산하면 결과는 무조건 int 이상
	 // byte : -128 ~127 사이 숫자만 사용 가능
		byte s1 = - 127 ;
		System.out.println(s1) ;

		s1 = - 128;
		System.out.println(s1);
		
		// byte 범위가 벗어나서 오류 발생
		// s1 = -129;
		// System.out.println(s1);
		
	 // short : -32768 ~ 32767 안의 정수를 저장
	 // 오류발생 결과값이 저장됨. (결과를 먼저 구한다.)
	 //	short s2 = 32760 + 100 ;
	 //	System.out.println(s2); 

	 // int 와 long은 범위를 외울 필요는 없음.
	 // 앞으로 일반적인 정수는 int 임.
	 // 정수중 가장 큰 수를 쓸 때 long을 사용
	 // long 에는 숫자 뒤에 L 또는 l 을 붙인다.( 생략 가능 )
		int s3 = 117 ;
		long s4 = 117L ;
		long s5 = 117l ;
		long s6 = 117 ;
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

	 // 실수 : 소숫점이 존재하는 수
	 // 무조건 정수보다 크다.
	 // 실수의 기본형은 double 이다.
	 // float는 숫자 뒤에 반드시 F 또는 f 를 붙인다.(생략안됨)
	 // char < 정수(int < long) < float < double 

		float s7 = 3.14f ;
		System.out.println(s7) ;
		double s8 = 3.14 ;
		System.out.println(s8);


		double s9 = 117 ;
		System.out.println(s9);


	}
}
