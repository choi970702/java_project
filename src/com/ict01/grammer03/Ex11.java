package com.ict01.grammer03;
class Ex11
{
public static void main(String[] args)
	{
	 // 다중 if문 : 조건식이 거짓일때 다시 조건식을 사용한다.
	 // if(조건식){
	 //	조건식1이 참일때 실행;
	 // } else if(조건식2) {
	 // 	조건식 1은 거짓이면서 조건식2가 참일때 실행 ;
	 // } else if(조건식3){
	 // 	조건식 1,2 가 거짓인데 조건식3 일때 참일때 실행 ;
	 // } else {
	 // 조건식 1,2,3, 다 거짓일때 실행, 나머지 경우 ;
	 // }

	 // int k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
		int k1 = 80 ;
		char s = 'z' ;
		if(k1 >= 90)
		{
			s = 'A' ;
		} else if (k1 >= 80)
		{
			s = 'B' ;
		} else if (k1 >= 70)
		{
			s = 'C' ;
		} else 
		{
			s = 'F' ;
		}
		System.out.println("점수 : " + s) ;


	 // char k2가 대문자인디, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = '/' ;
		String c = "없음" ;
		if(k2 >= 'A' && k2 <= 'Z')
		{
			c = "대문자" ;
		} else if (k2 >= 'a' && k2 <= 'z')
		{
			c = "소문자" ;
		} else if (k2 <= 9)
		{
			c = "숫자" ;
		} else 
		{
			c = "기타문자" ;
		}
		System.out.println("k2 : " + c + "이다. ") ;


	 // char k3가 A,a이면 아프리카 B,b이면 브라질 C, c 이면 캐나다 나머지 한국
		char k3 = 'k' ;
		String nara = "미국" ;
		if(k3 == 'a' || k3 == 'A')
		{
			nara = "아프리카" ;
		} else if (k3 == 'b' || k3 == 'B')
		{
			nara = "브라질" ;
		} else if (k3 == 'c' || k3 == 'C')
		{
			nara = "캐나다" ;
		} else 
		{
			nara = "한국" ;
		}
		System.out.println("결과 : " + nara) ;

	 // menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
	 // 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다
	 // 친구와 2잔을 10000원 내고 먹었다.
	 // 잔돈은 얼마인가? (단, 부가세 10%를 포함시키자)
		int pay = 10000 ;
		int m = 0 ;
		int menu = 2 ;
		if(menu == 1)
		{
			m = 10000 - (int)(3500 * 2 * 1.1) ;
		} else if (menu==2)
		{
			m = 10000 - (int)(4000 * 2 * 1.1) ;
		} else if (menu==3)
		{
			m = 10000 - (int)(3000 * 2 * 1.1) ;
		} else 
		{
			m = 10000 - (int)(3500 * 2 * 1.1) ;
		}
		System.out.println("거스름돈 : " + m) ;


	}

}