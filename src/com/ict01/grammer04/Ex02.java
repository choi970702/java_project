package com.ict01.grammer04;
class Ex02 
{
	public static void main(String[] args) 
	{
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		// 형식 : for(초기식 ; 조건식 ; 증감식){
		//			조건식이 참일때 실행할 문장;
		//			조건식이 참일때 실행할 문장;
		//			}
		// for문을 만나면 무조건 초기식으로 이동
		// 초기식에서는 조건식으로 이동
		// 조건식이 참이면 for문 실행
		// 조건식이 거짓일때는 for문 밖으로 빠져나감
		// for문을 실행중에 for문의 끝을 만나면 무조건 증감식으로 감.
		// 증감식이 끝나면 조건식으로 이동

		// 안녕하세요, 열번 출력하기
		for (int i = 1 ; i < 11 ; i++ )
		{
			System.out.println("안녕하세요. - " + i);
		}
		// 0~15 까지 출력하자
		for (int i = 0 ; i < 16 ; i++ )
		{
			System.out.print(i + "  ");
		}
		System.out.println();

		// 0~10 까지 짝수만 출력
		for (int i = 0 ; i < 11 ; i++ )
		{
			if (i % 2 == 0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		//0~10 까지 홀수만 출력
		for (int i = 1 ; i < 11 ; i++ )
		{
			if (i % 2 == 1)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		// 0~50 까지 7의 배수만 출력
		for (int i = 0 ; i < 51 ; i += 7  )
		{
			System.out.print(i + "  ");
		}
		System.out.println();
		// 5단 출력
		for (int i = 0 ; i < 10 ; i++ )
		{
			System.out.println(" 5 * " + i + " = " + (5 * i));
		}
		System.out.println();
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 1 ;i < 17 ; i++ )
		{
			System.out.print("0 ");
			if (i%4 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
		
		// 0-10 까지 누적합 구하기
		int sum = 0 ;
		for (int i = 0 ; i < 11; i++ )
		{
			sum = sum + i ;
		}
		System.out.println(sum) ;

		// 홀수의 누적합
		int s1 = 0 ;
		for (int i = 0 ;i < 11 ; i++ )
		{
			if (i%2 == 1)
			{
			  s1 = s1 + i ;
			}
		}
		System.out.println("홀수의 누적합 : " + s1) ;

		// 짝수의 누적합

		int s2 = 0 ;
		for (int i = 0 ; i < 11 ; i++ )
		{
			if (i % 2 == 0)
			{
				s2 = s2 + i ;
			}
		}
		System.out.println("짝수의 누적합 : " + s2) ;
		System.out.println() ;

		//홀수와 짝수의 누적합을 각각 구하시오.
		int s3 = 0 ; // 홀수의 누적합
		int s4 = 0 ; // 짝수의 누적합
		for (int i = 0 ; i < 11 ; i++ )
		{
			if (i%2 == 0)
			{
				s4 = s4 + i ;
			}
			else
				s3 = s3 + i ;
		}
		System.out.println("홀수의 누적합 : " + s3);
		System.out.println("짝수의 누적합 : " + s4);

		// 7!(팩토리얼)
		int pa = 1 ;
		for (int i = 7; i > 0 ; i-- )
		{
			pa = pa * i ;
		}
		System.out.println("7의 팩토리얼 : " + pa) ;


	}
}
