package com.ict01.grammer03;
class Ex04
{
	public static void main(String[] args)
	{
	 // 삼항 연산자 (조건 연산자 = 조건문인 if ~ else 문과 같다.)
	 // 형식 : 저장변수 = 조건식 ? 참 일떄 실행할 문장 : 거짓일때 실행할 문장 ;
	 // 	 조건식에는 boolean, 논리연산, 비교연산 이 들어감.
	 // 주의사항 : 저장변수, 참일때 실행 결과, 거짓일때 실행결과 
	 //	     모두 자료형이 같아야함
	 // 	    (저장 변수가 더 큰 자료형이면 문제 없음.)
	 // byte < short < char < int < long < float < double 
		int result = true ? 14 : 10 ;
		System.out.println("결과 : " + result) ;	//14

		result = false ? 14 : 10 ;
		System.out.println("결과 : " + result) ;	//10

		int result2 = false ? 14 : 'C' ;
		System.out.println("결과 : " + result2) ;	//67
		System.out.println("결과 : " + (char)(result2)) ; //67 을 C로 표시하려면

	 // 주어진 sum이 80 이상이면 "합격", 아니면 "불합격"
		int sum = 81 ;
		String result3 = (sum >= 80) ? "합격" : "불합격" ;
		System.out.println("결과 : " + result3) ;

	 // 평균 점수가 90 이상이면 'A' 아니면 'B'
		double avg = 87.0 ;
		double result4 = (avg >= 90) ? 'A' : 'B' ;
		System.out.println("결과 : " + result4) ;
		System.out.println("결과 : " + (char)(result4)) ;


	}

}