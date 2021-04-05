package com.ict01.grammer04;
class Ex01
{
	public static void main(String[] args)
	{
	 // switch case if문과 같은 조건문 
	 // if문의 조건식은 boolean, 비교연산, 논리연산
	 // switch case 문은 byte, short, int char, String 일때 사용
	 // 범위가 나오면 기본적으로 if문을 사용한다.
	 // switch문은 100% if문으로 변환이 가능하다.
	 // switch case문 형식 : switch (인자값(char,int,String)) 
	 // {
	 // case 조건값1 : 인자값이 요구하는 값이 조건값 1과 같을때 실행할 문장) ;
	 // case 조건값2 : 인자값이 요구하는 값이 조건값 2과 같을때 실행할 문장) ;
	 // case 조건값3 : 인자값이 요구하는 값이 조건값 3과 같을때 실행할 문장) ;
	 // default : 조건값 1,2,3 모두 요구하는 값이 아닐때 (즉, 나머지)(생략가능)
	 // break : break문이 없으면 다음 break를 만날때 까지 모든 실행들을 실행.
	 // break문은 현재 자기가 속해있는 블록을 빠져나간다.
	 // }

	 // char k1이 A이면 아프리카, B이면 브라질, C이면 개카나 나머지 한국
		char k1= 'c' ;
		String str = "" ;
		switch(k1)
			{
			case 'A' : str = "아프리카" ; break ;
			case 'B' : str = "브라질" ; break ;
			case 'C' : str = "캐나다" ; break ;
			default : str = "한국" ; 

			}
		System.out.println("결과 : " + str) ;

	 // char k1이 A, a 이면 아프리카, B, b 이면 브라질, C, c 이면 개카나 나머지 한국
		switch(k1)
			{
			case 'A' : 
			case 'a' : str = "아프리카" ; break ;
			case 'B' : 
			case 'b' : str = "브라질" ; break ;
			case 'C' : 
			case 'c' : str = "캐나다" ; break ;
			default : str = "한국" ; 

			}
		System.out.println("결과 : " + str) ;

	 // int k2 가 1또는 3이면 남자, 2 또는 4 이면 여자 
		int k2 = 3 ;
		String str2 = "" ; 
		switch(k2)
			{
			case 1 :
			case 3 : str2 = "남자" ; break ;
			case 2 : 
			case 4 : str2 = "여자" ; break ;
			}
		System.out.println("결과 : " + str2) ;

	 // String k3이 한국이면 서울, 중국이면 베이징, 일본이면 도쿄
		String k3 = "한국" ;
		String str3 = "" ;
		switch (k3)
			{
			case "한국" : str3 = "서울" ; break ;
			case "중국" : str3 = "베이징" ; break ;
			case "일본" : str3 = "도쿄" ; break ;
			default : str3 = "" ;
			}
		System.out.println("결과 : " + str3) ;

	}

}