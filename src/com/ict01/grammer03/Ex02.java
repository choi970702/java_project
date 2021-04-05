package com.ict01.grammer03;
class Ex02
{
	public static void main(String[] args)
	{
	 // || (OR, 논리합)
	 // 주어진 조건 중 하나라도 true 이면 결과는 true
	 // 조건중 ture 를 만나면 이후 연산을 실행하지 않음.\
		int s1 = 10 ;
		int s2 = 7 ;

		boolean result = false || false ;
		System.out.println("결과 : " + result) ;

		result = (s1 >= 15) || (s2 <= 5) ;
		System.out.println("결과 : " + result) ;

		result = true || false ;
		System.out.println("결과 : " + result) ;

		result = (s1 >=15) || (s2 >= 5) ;
		System.out.println("결과 : " + result) ;

	 // OR은 true를 만나면 뒤에 연산을 하지 않음.
		result = ((s1 = s1 + 2) > 20) || (s1 == (s2 = s2 + 5)) ;
		System.out.println("결과 : " + result) ;
		System.out.println("s1 : " + s1) ;
		System.out.println("s2 : " + s2) ;

		result = ((s1 = s1 + 2) < 20) || (s1 == (s2 = s2 + 5)) ;
		System.out.println("결과 : " + result) ;
		System.out.println("s1 : " + s1) ;
		System.out.println("s2 : " + s2) ;

	 // ! (NOT, 논리 부정)
	 // 주어진 논리값을 반대로 만든다.
	 // true -> false, false -> true
		result = true ;
		System.out.println(!result) ;	// false
		System.out.println(!!result) ;	// true
		System.out.println(!!!result) ;	// false


	}

}