package com.ict03.class02;
import java.util.Scanner;

public class Ex04 
{
	public static void main(String[] args) 
	{
		// ����(0), ����(1), ��(2) ����
		// �·� ���ϱ�
		// ���ʹ� �������� ����, ����, ���� ���´�.
		// ����ڰ� ����, ����, ���� �����ؼ� ���Ϳ� �������Ѵ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� �� �Ұ���? (���ڸ� ������)");
		int game = scan.nextInt();
		int i = 0 ;
		int win = 0;
		
		while(true)
		{
			
			i++;
			int com = (int)(Math.random()*3);
			System.out.println("������ ������?");
			System.out.println("1. ����\t2. �ָ�\t3. ��");
			System.out.println();
			int choice = scan.nextInt();
		
			System.out.println(i+"��° ��");
			
			if(choice == 0 && com ==2)
			{
				win++;
				System.out.println("�̰���");
				System.out.println();
			}else if(choice == 1 && com == 0)
			{
				win++;
				System.out.println("�̰���");
				System.out.println();
			}else if(choice == 2 && com == 1)
			{
				win++;
				System.out.println("�̰���");
				System.out.println();
			}else if(choice == com)
			{
				System.out.println("���");
				System.out.println();
			}else
			{
				System.out.println("����");
				System.out.println();
			}
			
			
			if(i==game) break;
			
		}
		System.out.println(game+"�� �߿�");
		System.out.println(win +"�� �̰���ϴ�.");
		System.out.println("�·� : " + (win*100)/game + "%");
		
	}
}
