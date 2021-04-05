package com.ict01.grammer03;
import java.util.Scanner ;
class Ex07
{
	public static void main(String[] args)
	{
	 // Scanner 클래스 알아보기
	 // Scanner의 소속은 java.util.Scanner이다.
	 // java.lang 에 소속된 클래스는 마음대로 사용했지만 
	 // 이외에 클래스는 소속을 표시해야 된다.(import)
	 // 클래스 안에는 :  Constructor(생성자), Method(메서드), Field(필드)
	 // Method => 동작, 기능, 하는 것

	 // next자료형() => 해당자료형으로 꺼낸다.
	 // ex) nextint() => int형으로 꺼냄 

	 // 키보드에 입력된 내용이 scan 에 저장된다.
		Scanner scan = new Scanner(System.in) ;
		System.out.print("당신의 이름 : ") ;

	 // 저장된 정보를 가져오기(가지고 온 정보를 String 으로 만들자.)
		String name = scan.next() ;

	 // 저장된 정보를 가져오기(가지고 온 정보를 int 으로 만들자.)
		System.out.print("국어 점수 : ") ;
		int kor = scan.nextInt() ;

		System.out.print("영어 점수 : ") ;
		int eng = scan.nextInt() ;

		System.out.print("수학 점수 : ") ;
		int math = scan.nextInt() ;

		int sum = kor + eng + math ;
		System.out.println("총점 : " + sum) ;

	 // 들어온 정보를 double 형으로 
		System.out.print("당신의 키 : ") ;
		double ki = scan.nextDouble();
		System.out.println(ki) ;

	 // 들어온 정보를 boolean 형으로 
		System.out.print("당신의 성별은 남성입니까?(true/false)") ;
		boolean gender = scan.nextBoolean() ;
		String str = gender ? "남성입니다." : "여성입니다," ;
		System.out.println(str) ;


	}

}