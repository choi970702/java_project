package com.ict0;
import java.util.Scanner;

public class Ex01 
{
	// ��ȣ, ����, ����, ���������� �Է¹޾Ƽ�
	// ��ȣ, ����, ���, ����, ������ ���ϰ� ��������
	Scanner scan = new Scanner(System.in);
	int arr[][] = new int[5][];
	int rank = 1;
	
	for (i=0;i<arr.length;i++ )
	{
		System.out.println("��ȣ : ");
		int num = scan.nextInt();
		System.out.println("���� : ");
		int kor = scan.nextInt();
		System.out.println("���� : ");
		int eng = scan.nextInt();
		System.out.println("���� : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math ;
		double evg = sum/3.0 ;
		int hak = 0;
		
		if (evg>= 90) 
		{
			hak = 'A' ;
		}else (hak >= 80)
		{
			hak = 'B' ;
		}else (hak >= 70)
		{
			hak = 'C' ;
		}else
		{
			hak = 'F' ;
		}
		
		int[] res = new int[] ;
		
		res[0]
	}
	
}
