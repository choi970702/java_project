package com.ict01.grammer02;
class Ex07
{
	public static void main(String[] args)
	{
	 // 이름이 홀길동인 사람의 국어 : 90, 영어 : 80, 수학 : 90.이다
	 // 총점과 평균을 구해서 이름, 총점, 평균을 출력하자
	 // (단, 평균은 소숫점 첫째자리까지 구한다.)
	 //국어는 a, 영어는 b, 수학은 c, 총점은 sum, 평균은 s
		String name = "홍길동" ;
		int a = 90 ;
		int b = 80 ;
		int c = 90 ;
		int sum = a + b + c ;
		double d = (double)(sum / 3.0)  ;
		double s =(int)( d * 10) / 10.0;
		System.out.println("이름 : " + name);
		System.out.println("총점은 : " + sum);
		System.out.println("평균은 : " + s);


	}
}