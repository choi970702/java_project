package com.ict01.grammer02;
class Ex05
{
	public static void main(String[] args)
	{
	 // 자료형 : DataType = 자바에서 정보를 처리할때 구분하는 형태
	 // 1. 기본 자료형 : 컴파일러에 의해서 해석되는 자료형
	 // boolean, char, byte, short, int, long, float, double
	 // 2. 참조 자료형 : class를 자료형으로 선언

	 // String : 참조 자료형이지만 기본 자료형 처럼 사용
		String str = "Hello Java" ;
		System.out.println(str);

	 // String + 연산 : 실제로 더하기 연산을 하지 않음
	 // 		문자를 연결하는 역할을 한다.
	 //		String 에서 + 연산을 하면 결과는 String이다.
		String k1 = "1000" ;
		int k2 = 1000 ;
		System.out.println(k1 + 10); // 10010
		System.out.println(k2 + 10); // 1010

		int s1 = 20 ;
		int s2 = 4 ;
		System.out.println(s1 + s2);
		System.out.println("결과 : " + s1 + s2);
		System.out.println("결과 : " + (s1 + s2));


	}

}