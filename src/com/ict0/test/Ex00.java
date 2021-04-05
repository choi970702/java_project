package com.ict0.test;
import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String[] course = {"java", "C++", "HTML", "Architecture", "Android"};
		int[] score = {95, 88, 76, 62, 55};
		String[][] res = new String[2][5];
		
		res[0] = course;
		res[1] = String
		
		for (int i = 0; i < res.length; i++) 
		{
			for (int j = 0; j < res.length; j++) 
			{
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("과목을 입력하세요");
		String name = scan.next();
		
		
		
		
		
		

	}

}