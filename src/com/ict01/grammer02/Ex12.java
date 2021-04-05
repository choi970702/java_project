package com.ict01.grammer02;
class Ex12
{
	public static void main(String[] args)
	{
	 // 비교 연산자 : 변수나 상수의 값을 비교할 때 사용
	 //		결과는 항상 boolean 이다.(논리값)
	 //		boolean 형은 조건식에 사용된다.
	 //		자료형이 String 인 경우에는  사용하면 안됨
		int s1 = 90 ;
		int s2 = 80 ;
		boolean res = s1 >= s2 ;
		System.out.println("결과 : " + res);

		char s3 = 'c' ;
		char s4 = 'a' ;
		res = s3 >= s4 ;
		System.out.println("결과 : " + res);

	 // char 와 int 를 비교
		res = 'a' >= 97 ;
		System.out.println("결과 : " + res);

	 // int 와 double 비교
		res = 97 >= 97.000001 ;
		System.out.println("결과 : " + res);

		res = 97 == 97.0 ;
		System.out.println("결과 : " + res);

		String str1 = "대한민국" ;
		String str2 = "대한민국" ;
		//res = str1 > str2 ;
		//System.out.println("결과 : " + res);
		res = str1 == str2 ;
		System.out.println("결과 : " + res);
	 // String에 비교연산자 ==는 결과는 나오지만 사용하면 안됨
	 // String은 비교하는 메소드가 별도로 존재함.

	}

}