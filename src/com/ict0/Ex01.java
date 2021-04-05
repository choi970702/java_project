package com.ict0;
import java.util.Scanner;

public class Ex01 
{
	// 번호, 국어, 영어, 수학점수를 입력받아서
	// 번호, 총점, 평균, 학점, 순위를 구하고 정렬하자
	Scanner scan = new Scanner(System.in);
	int arr[][] = new int[5][];
	int rank = 1;
	
	for (i=0;i<arr.length;i++ )
	{
		System.out.println("번호 : ");
		int num = scan.nextInt();
		System.out.println("국어 : ");
		int kor = scan.nextInt();
		System.out.println("영어 : ");
		int eng = scan.nextInt();
		System.out.println("수학 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math ;
		double evg = sum/3.0 ;
		int hak = 0;
		
		if (evg>= 90) 
		{
			hak = 'A' ;
		}else (hak >= 80)
		{
			hak = 'B' ;
		}else (hak >= 70)
		{
			hak = 'C' ;
		}else
		{
			hak = 'F' ;
		}
		
		int[] res = new int[] ;
		
		res[0]
	}
	
}
