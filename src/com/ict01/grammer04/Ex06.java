package com.ict01.grammer04;
import java.util.Scanner ;
class Ex06 
{
	public static void main(String[] args) 
	{
		// do ~ while�� : while���� ���� �ݺ���
		//				���� ���� �� ���߿� ����.
		// ����)
		// �ʱ��;
		// do {
		//    �����ҹ���;
		//    ������;
		//    }while(���ǽ�);

		// 0~10 ���� ���
		int i = 0 ;
		do
		{
			System.out.print(i+" ");
			i++;
		}
		while (i<11);
		System.out.println();

		// �ݺ�Ƚ���� �޾Ƽ� ó������
		Scanner scan = new Scanner(System.in) ;
		System.out.print("�ݺ�Ƚ�� : ");
		int su = scan.nextInt() ;
		su = su ;
		i = 0 ;
		do
		{
			System.out.println("Hello Java ");
			i++ ;
		}
		while (i<su);
		System.out.println();

		// �ݺ�Ƚ���� �Ǻ� ���ڸ� �޾Ƽ� Ƚ����ŭ �Ǻ����ڰ� Ȧ������ ¦������ ���
		i = 0 ;
		System.out.print("�ݺ�Ƚ�� : ");
		int su1 = scan.nextInt() ;
		String msg = "";
		do
		{
			System.out.print("�Ϲ� ���� : ");
			int num = scan.nextInt() ;
			if (num%2 == 0)
			{
				msg = "¦��";
			}
			else
				msg = "Ȧ��";
				System.out.println("�Է��� �� "+ num + "�� " +msg+"�Դϴ�.");
			i++ ;

		}
		while (i<su1);
		System.out.println();

	}
}
