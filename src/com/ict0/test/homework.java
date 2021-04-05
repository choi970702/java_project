package com.ict0.test;
import java.util.Scanner;
public class homework 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[3];
		
		while(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2])
		{
			for (int i = 0; i < arr.length; i++) 
			{		
				arr[i] = (int)(Math.random()*10);
				
			}
		}
		int[] choice = new int[3];
		Scanner scan = new Scanner(System.in);
		
		
		
		for (int c = 0; c < choice.length; c++) 
		{
			System.out.println("첫 번째 숫자");
			choice[0] = scan.nextInt();
			
			System.out.println("두 번째 숫자");
			choice[1] = scan.nextInt();
			
			System.out.println("세 번째 숫자");
			choice[2] = scan.nextInt();
			
			int strike = 0;
			int ball = 0;
			int out = 0;
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
					out = 3;
					
				}
				
				
			}
			
			if(out == 3)
			{
				System.out.println("삼진out!!!!!");
				c = 8;
				c++;
			}
			
			System.out.println("스트라이크 : "+strike+" ball : "+ball+" out : "+out);
			
			if(c >= 9)
			{
				System.out.print("재도전 하시겟습니까?");
				System.out.println("1. 네\t2. 아니요");
				int retry = scan.nextInt();
				if(retry == 1)
				{
					System.out.println("다시 시작합니다.");
					c = 0;
				}else break;
			
			}
			
		}


		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);
		}
	}
}
