package com.ict03.class01;

import java.util.Scanner;

public class Ex12_main 
{

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		Ex12[] arr = new Ex12[5]; // 클래스를 저장하는 배열

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			System.out.print("수학 : ");
			int math = scan.nextInt();

			Ex12 person = new Ex12(name, kor, eng, math);
			person.setName(name);
			//person.p_sum(kor, eng, math);
			// person.p_avg();
			// person.p_hak();

			arr[i] = person;

		}
		// 순위
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (arr[i] == arr[j])
					continue;
				if (arr[i].getSum() < arr[j].getSum()) 
				{
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}

		// 정렬
		// 자리를 변경하기위한 임시저장 배열
		Ex12 tmp = new Ex12();
		for (int i = 0; i < arr.length - 1; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i].getRank() > arr[j].getRank()) 
				{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");
		}

	}

}
