package com.ict03.class01;

public class Ex02_main 
{

	public static void main(String[] args) 
	{
		// static �������� ��ü ������ ������� �̸� �������
		// ȣ���� Ŭ�����̸�.�޼ҵ�, Ŭ�����̸�.����
		// System.out.println(Ex02.k1); // instance
		System.out.println(Ex02.k2);
		// System.out.println(Ex02.K3); // instance
		System.out.println(Ex02.K4);
		
		// ��ȯ���� ���� �޴� ����� �޶�����.
		// void�� ������ �Ѿ���� ����
		Ex02.prn02();
		
		// void�� �ƴϸ� �ݵ�� ��ȯ���� ���缭 ��������
		 double su1 = Ex02.prn04();
		 System.out.println(su1);
		 
		 System.out.println("====��ü ���� ����====");
		
		// 1. Ex02Ŭ������ ����ϱ� ���ؼ� Ŭ������ ��ü�� ������
		// Ex02 Ŭ������ �����ڰ� �������� �����Ƿ� �⺻ �����ڷ� ��ü����
		// �⺻ �����ڶ� �μ�=�Ű������� ���� ������('Ŭ�����̸�()')
		// Ŭ���� �������� = new ������ ;
		Ex02 test = new Ex02();
		
		// �ּ�
		System.out.println(test);
		System.out.println(test.k1);
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		System.out.println(Ex02.K4);
		
		
		// �޼ҵ� ����
		test.prn01();
		test.prn02();
		Ex02.prn02();
		int su2 = test.prn03();
		System.out.println(su2);
		
		double su3 = test.prn04();
		System.out.println(su3);
		
		double su4 = Ex02.prn04();
		System.out.println(su4);
		
	}

}
