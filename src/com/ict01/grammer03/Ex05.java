package com.ict01.grammer03;
class Ex05
{
	public static void main(String[] args)
	{
	 // int k1가 60 이상이면 합격 아니면 불합격
		int k1 = 58 ;
		String res1 = (k1 >= 60) ? ("합격") : ("불합격") ;
		System.out.println("결과 : " + res1) ;

	 // int k2가 홀수인지 짝수 인지 판별하자
		int k2 = 28;
		int a = k2 % 2 ;	// a는 k2를 2로 나눈 나머지
		String res2 = (a == 0) ? ("짝수") : ("홀수") ;
		System.out.println("결과 : " + res2) ;

	 // char k3가 대문자인지 대문자가 아닌지 판별하자
		char k3 = 'A';
		String res3 = ((k3 >= 65) && (k3 <= 90)) ? ("대문자") : ("소문자") ;
		System.out.println("결과 : " + res3) ;
		
	 // 근무시간이 8시간까지는 시간다 8720원 이고
	 // 8시간을 초과한 시간만큼은 1.5배 이다.
	 // 현재 근무시간이 10시간이다.
	 // 얼마를 받아야 하는가?
		int k4 = 10 ;
		int won = 8720 ;
		int res4 = (k4 >= 8) ? ((won * 8) + (int)(((k4 - 8) * won * 1.5))) : (k4 * won) ;
		System.out.println("결과 : " + res4 + "원") ;


	}

}