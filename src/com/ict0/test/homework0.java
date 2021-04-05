package com.ict0.test;

import java.util.Scanner;

public class homework0 {

	public static void main(String[] args) 
	{
		// 야구게임 만들기
		// 컴퓨터가 랜덤으로 번호생성
		int arr[] = new int[3];
		
		
		// 내가 번호 입력
		// 내가 입력한 변호와 컴퓨터의 번호를 비교
		// 9번하면 게임 종료
		int[] choice = new int[3];
		int c = 0;
		Scanner scan = new Scanner(System.in);
		
		while (c < 9) 
		{
			c++;
			if(c==1) 
			{
				for (int i = 0; i < arr.length; i++) 
				{
					arr[i] = 0;
				}
				while(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2])
				{
					
					for (int i = 0; i < arr.length; i++) 
					{		
						arr[i] = (int)(Math.random()*10);
						
					}
				}
			}
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			System.out.println("첫 번째 숫자");
			choice[0] = scan.nextInt();
			
			System.out.println("두 번째 숫자");
			choice[1] = scan.nextInt();
			
			System.out.println("세 번째 숫자");
			choice[2] = scan.nextInt();
			
			for (int i = 0; i < choice.length; i++) 
			{
				if(arr[i] == choice[i])
				{
					strike++;
				}else if(choice[i]==arr[0] || choice[i]==arr[1] || choice[i]== arr[2])
				{
					ball++;
				}else 
				{
					out++;
				}
			}	
			if(out == 3)
			{
				System.out.println("삼진out!!!!!");
				c = 9;
			}else if (strike == 3)
			{
				System.out.println("죽하!!맞췄음");
				c = 9;
			}else
			{	
				System.out.println(c+"번째 "+"스트라이크 : "+strike+"   ball : "+ball+"   out : "+out);
			}	
			
			if(c == 9)
			{
				System.out.println("정답은 : ");
				for (int i = 0; i < choice.length; i++) 
				{
					System.out.print(arr[i]);
				}
				
				System.out.println();
				System.out.print("재도전 하시겟습니까?");
				System.out.println("1. 네\t2. 아니요");
				int retry = scan.nextInt();
				if(retry == 1)
				{
					System.out.println("다시 시작합니다.");
					c = 0;
				}
				
			}
			
			System.out.println();
				
				
			
			
		}
			
		
		
		

	}

}
