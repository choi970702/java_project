package com.ict04.exception;

import java.util.Scanner;

public class Ex05 
{
	// throws (���� �絵, ���� ����)
	// ���ܰ� �߻��ϸ� ���ܸ� ó������ �ʰ�, �ڽ��� ȣ���� ������ ���� ��ü�� �����ϴ� ��
	// ���߿��� ����ó��(try~catch)�� �ϴ� ���� ����.

	public static void main(String[] args) 
	{
		Ex05 test = new Ex05();
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		String msg = scan.next();
		test.setData(msg);
		

	}
	public void setData(String msg)
	{
		// msg�� ������ ���̰� �Ѱ� �̻��̸� ����
		if(msg.length()>=1)
		{
			String str = msg.substring(0,1); // ù ���ڸ� �����ض�
			prnData(str);
		}
		
		
	}
	public void prnData(String str)
	{
		int dan = Integer.parseInt(str);
		System.out.println(dan +" ��");
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(dan +" * "+" = "+(dan*i));
		}
		
		
	}
	
	
	//
	
	

}
