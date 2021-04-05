package com.ict03.class01;
import java.util.Scanner;

public class Ex00_main 
{

	public static void main(String[] args) 
	{
		
	
		Ex00 coffee = new Ex00();
		coffee.setName("커피");
		coffee.setPrice(3000);
		
		Ex00 tansan = new Ex00();
		tansan.setName("탄산");
		tansan.setPrice(2000);
		
		Ex00 eon = new Ex00();
		eon.setName("이온");
		eon.setPrice(4000);
		
		Ex00 juice = new Ex00();
		juice.setName("주스");
		juice.setPrice(2500);
		
		Ex00[] arr = new Ex00[4];
		arr[0] = coffee;
		arr[1] = tansan;
		arr[2] = eon;
		arr[3] = juice;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 넣어 주세요");
		int won = scan.nextInt();
		
		System.out.println("구매 하시겠습니까?");
		System.out.println("1. 구매\t2.구매안함");
		int count = scan.nextInt();
		
		if(count == 1)
		{
			while(count == 1)
			{
				if(won < 2000)
				{
					System.out.println("금액이 부족합니다."); break;
				}else
				{
					System.out.println("음료를 선택하세요.");
					System.out.println("1. 커피\t2. 탄산\t3. 이온\t4. 주스");
					for (int i = 0; i < arr.length; i++) 
					{
						if (arr[i].getPrice() > won)
						{
							System.out.print("X\t");break;
						}else
						{
							System.out.print("O\t");
						}	
					}
					System.out.println();
			
				}
				System.out.println("번호로 선택하세요.");
				int drink = scan.nextInt();
				int output = 0;
				if(drink==1)
				{
					output = won - arr[0].getPrice();
				}else if(drink==2)
				{
					output = won - arr[1].getPrice();
				}else if(drink==3)
				{
					output = won - arr[2].getPrice();
				}else if(drink==4)
				{
					output = won - arr[3].getPrice();
				}else
				{
					System.out.println("잘못 입력하셨습니다.");
				}
			
				System.out.println("거스름돈 : "+output);
			
				won = output ;
			
				System.out.println("구매 하시겠습니까?");
				System.out.println("1. 구매\t2.구매안함");
				int count2 = scan.nextInt();
				if(count2==2)break;
				
			}
		}
	}

}
