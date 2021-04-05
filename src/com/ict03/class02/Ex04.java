package com.ict03.class02;
import java.util.Scanner;

public class Ex04 
{
	public static void main(String[] args) 
	{
		// 가위(0), 바위(1), 보(2) 게임
		// 승률 구하기
		// 컴터는 랜덤으로 가위, 바위, 보를 갖는다.
		// 사용자가 가위, 바위, 보를 선택해서 컴터와 게임을한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 판 할거임? (숫자만 적으셈)");
		int game = scan.nextInt();
		int i = 0 ;
		int win = 0;
		
		while(true)
		{
			
			i++;
			int com = (int)(Math.random()*3);
			System.out.println("무엇을 낼거임?");
			System.out.println("1. 가위\t2. 주먹\t3. 보");
			System.out.println();
			int choice = scan.nextInt();
		
			System.out.println(i+"번째 판");
			
			if(choice == 0 && com ==2)
			{
				win++;
				System.out.println("이겼음");
				System.out.println();
			}else if(choice == 1 && com == 0)
			{
				win++;
				System.out.println("이겼음");
				System.out.println();
			}else if(choice == 2 && com == 1)
			{
				win++;
				System.out.println("이겼음");
				System.out.println();
			}else if(choice == com)
			{
				System.out.println("비김");
				System.out.println();
			}else
			{
				System.out.println("졌음");
				System.out.println();
			}
			
			
			if(i==game) break;
			
		}
		System.out.println(game+"판 중에");
		System.out.println(win +"판 이겼습니다.");
		System.out.println("승률 : " + (win*100)/game + "%");
		
	}
}
