package com.ict01.grammer03;
class Ex01
{
	public static void main(String[] args)
	{
	 // 논리 연산자 : &&(AND, 논리곱) , ||(OR, 논리합), !(NOT, 논리 부정)
	 // 사용되는 자원 : boolean형, 비교 연산, 논리 연산
	 // 결과는 boolean 형으로 나옴 => 현실에 사용된다.

	 // && (AND, 논리곱, 교집합)
	 // - 주어진 조건이 모두 true 일때만 결과가 true
	 // - 주어진 조건들 중에 false를 만나는 순간 결과는 false.
	 // - false 를 만나면 이후에 있는 연산은 하지 않음

		int s1 = 10 ;
		int s2 = 7 ;
		boolean result = true && true ;
		System.out.println(result) ;

		result = (s1 >= 7) && (s2 >= 5) ;
		System.out.println(result) ;

		result = false && true ;
		System.out.println(result) ;

		result = (s1 <= 7) && (s2 >= 5) ;
		System.out.println(result) ;

	 // false 를 만나면 이루 연산하지 않는다.
		result = ((s1 = s1 + 2) > s2) && (s1 == (s2 = s2 + 5)) ;
		System.out.println("결과 : " + result) ;
		System.out.println("s1 : " + s1) ;
		System.out.println("s2 : " + s2) ;

		result = ((s1 = s1 + 2) < s2) && (s1 == (s2 = s2 + 5)) ;
		System.out.println("결과 : " + result) ;
		System.out.println("s1 : " + s1) ;
		System.out.println("s2 : " + s2) ;

	 // &&는 숫자일 경우 벙위를 지정할수 있음.
	 // a >= 10 && a <= 20 ; a는 10부터 20까지의 범위를 의미함.
		s1 = 24 ;
		result = (s1 >= 20) && (s1 <= 30) ;
		System.out.println("결과 : " + result) ;

	 // char c1 이 소문자 임??
		char c1 = 'D' ;  // D => 68
	 // result = (c1 >= 97) && (c1 <= 122) ; 소문자 범위
		result = (c1 >= 'a') && (c1 <= 'z') ;
		System.out.println("결과 : " + result) ;


	}

}