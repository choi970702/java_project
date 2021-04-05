package com.ict01.grammer03;
class Ex10
{
	public static void main(String[] args)
	{
	 // if ~ else ~ : 조건식이 참일때와 거짓일때 각각 나눠서 처리함.
	 // 형식 : if (조건식) 
	 // {
	 // 참일때 실행하는 문장 ;
	 // } 
	 // else { 
	 // 조건식이 거짓일때 실행하는 문장 ;
	 // } (단, 실행할 문장이 한줄이면 {} 생략가능.)

	 // int k1가 60 이상이면 합격 아니면 불합격
		int k1 = 50 ;
		String res = "초기값" ;
		if (k1 >= 60)
			{
			res = "합격" ;
			}
		else
			{
			res = "불합격" ;
			}
		System.out.println("결과 : " + res) ;

	 // int k2가 홀수인지 짝수 인지 판별하자
		int k2 = 40 ;
		int a = k2 % 2 ;
		String res2 = "초기값" ;
		if(a == 0)
			{
			res2 = "짝수" ;
			}
		else
			{
			res2 = "홀수" ;
			}
		System.out.println("k2는 " + res2) ;

	 // char k3가 대문자인지 대문자가 아닌지 판별하자
		char k3 = 'a' ;
		String res3 = "초기값" ;
		if (k3 >= 'A' && k3 <= 'Z')
			{
			res3 = "대문자" ;
			}
		else
			{
			res3 = "대문자 아님" ;
			}
		System.out.println("k3는 " + res3) ;

	 // 근무시간이 8시간까지는 시간다 8720원 이고
	 // 8시간을 초과한 시간만큼은 1.5배 이다.
	 // 현재 근무시간이 10시간이다.
	 // 얼마를 받아야 하는가?
		int t = 10 ;
		int m = 8720 ;
		int res4 = 0;
		if(t >= 8)
			{
			res4 =(int)((t - 8) * m * 1.5) + m * 8 ;
			}
		else
			{
			res4 = t * m ;
			}
		System.out.println("받을돈은 " + res4 + "원") ;

	}

}