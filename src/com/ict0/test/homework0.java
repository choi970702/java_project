package com.ict0.test;

import java.util.Scanner;

public class homework0 {

	public static void main(String[] args) 
	{
		// �߱����� �����
		// ��ǻ�Ͱ� �������� ��ȣ����
		int arr[] = new int[3];
		
		
		// ���� ��ȣ �Է�
		// ���� �Է��� ��ȣ�� ��ǻ���� ��ȣ�� ��
		// 9���ϸ� ���� ����
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
			
			System.out.println("ù ��° ����");
			choice[0] = scan.nextInt();
			
			System.out.println("�� ��° ����");
			choice[1] = scan.nextInt();
			
			System.out.println("�� ��° ����");
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
				System.out.println("����out!!!!!");
				c = 9;
			}else if (strike == 3)
			{
				System.out.println("����!!������");
				c = 9;
			}else
			{	
				System.out.println(c+"��° "+"��Ʈ����ũ : "+strike+"   ball : "+ball+"   out : "+out);
			}	
			
			if(c == 9)
			{
				System.out.println("������ : ");
				for (int i = 0; i < choice.length; i++) 
				{
					System.out.print(arr[i]);
				}
				
				System.out.println();
				System.out.print("�絵�� �Ͻðٽ��ϱ�?");
				System.out.println("1. ��\t2. �ƴϿ�");
				int retry = scan.nextInt();
				if(retry == 1)
				{
					System.out.println("�ٽ� �����մϴ�.");
					c = 0;
				}
				
			}
			
			System.out.println();
				
				
			
			
		}
			
		
		
		

	}

}
