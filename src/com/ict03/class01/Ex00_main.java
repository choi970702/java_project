package com.ict03.class01;
import java.util.Scanner;

public class Ex00_main 
{

	public static void main(String[] args) 
	{
		
	
		Ex00 coffee = new Ex00();
		coffee.setName("Ŀ��");
		coffee.setPrice(3000);
		
		Ex00 tansan = new Ex00();
		tansan.setName("ź��");
		tansan.setPrice(2000);
		
		Ex00 eon = new Ex00();
		eon.setName("�̿�");
		eon.setPrice(4000);
		
		Ex00 juice = new Ex00();
		juice.setName("�ֽ�");
		juice.setPrice(2500);
		
		Ex00[] arr = new Ex00[4];
		arr[0] = coffee;
		arr[1] = tansan;
		arr[2] = eon;
		arr[3] = juice;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ��� �־� �ּ���");
		int won = scan.nextInt();
		
		System.out.println("���� �Ͻðڽ��ϱ�?");
		System.out.println("1. ����\t2.���ž���");
		int count = scan.nextInt();
		
		if(count == 1)
		{
			while(count == 1)
			{
				if(won < 2000)
				{
					System.out.println("�ݾ��� �����մϴ�."); break;
				}else
				{
					System.out.println("���Ḧ �����ϼ���.");
					System.out.println("1. Ŀ��\t2. ź��\t3. �̿�\t4. �ֽ�");
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
				System.out.println("��ȣ�� �����ϼ���.");
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
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			
				System.out.println("�Ž����� : "+output);
			
				won = output ;
			
				System.out.println("���� �Ͻðڽ��ϱ�?");
				System.out.println("1. ����\t2.���ž���");
				int count2 = scan.nextInt();
				if(count2==2)break;
				
			}
		}
	}

}
