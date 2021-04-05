package com.ict01.grammer03;
import java.util.Scanner ;
class Ex08
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in) ;
	 // 숫자를 받아서 홀수, 짝수를 구분하자
		System.out.print("구분할 숫자 : ") ;
		int num = scan.nextInt() ;
		int a = (num % 2) == 0 ? 0 : 1 ;
		String b = a == 0 ? "짝수 입니다." : "홀수 입니다." ;
		System.out.println(b) ;


	 // 국어, 영어, 수학을 받아서 
	 // 점수의 평균이 60이상이고, 각각의 점수는 40이상일때 합격, 아니면 불합격
		System.out.print("국어 점수 : ") ;
		int kor = scan.nextInt() ;
		System.out.print("영어 점수 : ") ;
		int eng = scan.nextInt() ;
		System.out.print("수학 점수 : ") ;
		int math = scan.nextInt() ;
		int c = (math + kor + eng) / 3 ;
		String res = (c >= 60 && math >= 40 && kor >=40 &&
		eng >= 40) ? "합격" : "불합격" ;
		System.out.println(res) ;

	 // 알바시간을 입력 받아서 
	 // 8 시간 까지는 시간당 8720이고
	 // 8시간을 초과한 시간만큼은 1.5배
	 // 받을 금액을 게산하자
		int d = 8720 ;
		System.out.print("알바 시간 : ") ;
		int t = scan.nextInt() ;
		int money = t >=8 ? (int)((t - 8) * 1.5 * d) + 8 * d : t * d ;
		System.out.println(money + "원");


	}

}