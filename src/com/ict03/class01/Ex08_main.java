package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main 
{

	public static void main(String[] args) 
	{
		
		Ex08 coffee = new Ex08();
		coffee.setName("커피음료");
		coffee.setPrice(1800);
		
		Ex08 ion = new Ex08();
		ion.setName("이온음료");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("과일음료");
		juice.setPrice(2200);
		
		// 배열에 넣자
		// 자료형[] 이름 = new 자료형[크기] ;
		/*Ex08[] arr = new Ex08[4] ;
		
		arr[0] = coffee ;
		arr[1] = ion ;
		arr[2] = cola ;
		arr[3] = juice ;*/
		
		Ex08[] arr = {coffee, ion, cola, juice};
		
		// arr 배열이 갖는 이름과 가격들을 출력하자
		/*for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i].getName()+", "+arr[i].getPrice());
		}*/
		
		// 동전 투입 
		Scanner scan = new Scanner(System.in);
		System.out.println("동전 투입 : ");
		int input = scan.nextInt();
		if (input < 1500)
		{
			System.out.println("금액이 부족합니다");
		}else
		{
			System.out.println("1. 커피\t2. 이온\t3. 탄산\t4. 과일");
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[i].getPrice() <= input)
				{
					System.out.print("O\t");
				}else
				{
					System.out.print("X\t");
				}
			}
		}
		System.out.println();
		System.out.println("번호로 선택하세요 >>");
		int drink = scan.nextInt();
		int output = 0 ;
		
		if(drink == 1)
		{
			output = input - arr[0].getPrice();
		}else if(drink == 2)
		{
			output = input - arr[1].getPrice();
		}else if(drink == 3)
		{
			output = input - arr[2].getPrice();
		}else if(drink == 4)
		{
			output = input - arr[3].getPrice();
		}
		
		// 숙제 *잔돈이 남았을때 다시 물어볼수 있도록 while문으로 사용*
		System.out.println("잔돈 : " + output);

		
		
		

	}

}
