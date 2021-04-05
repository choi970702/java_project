package com.ict0;
import java.util.Scanner;

public class Ex00 
{

	public static void main(String[] args) 
	{
		int su = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			for (int j = i; j < num; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(su%10+" ");
				su++;
			}
			System.out.println();
		}
			
	}
}
