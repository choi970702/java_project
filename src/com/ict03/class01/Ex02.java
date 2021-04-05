package com.ict03.class01;

public class Ex02 
{
	// Ŭ�����ȿ��� 3������ ����.
	// ����ʵ�, ����޼ҵ�, ������
	
	// ����ʵ� : ����� ����, static�� instance�� ������.
	// final�� �����ϸ� ���
	// static�� ������ instance(��ü ������ ���� ����� ���� ��)
	// static = ��ü ������ ������� �̸� ����� ����.
	int k1 = 80 ; // instance ���� = �Ϲݺ���
	static int k2 = 90 ; // static ���� (������ ���� �ٲܼ� ����)
	final int K3 = 85 ; // instance ��� (����� ���� �� �ٲ�)
	static final int K4 = 95 ; // static ��� = API���� �����ϴ� �������
	
	// ����޼ҵ� : ����, ���
	// �޼ҵ�� �ڱ⸦ ȣ���� ������ �ǵ��� ����.
	
	// instance, ��ȯ�� ����
	public void prn01() 
	{
		// ���� ������ �� �־ ����
		k1 = k1 + 20 ;
		k2 = k2 + 10 ;
		System.out.println("k1 : " + k1);
		System.out.println("k2 : " + k2);
		// final�� ������ ���, ����� �� ������ �Ҽ� ����.(�׷��� �����߻�)
		// K3 = K3 + 15 ;
		// K4 = K4 + 5 ;
		
		// �������� : �żҵ� �ȿ��� ������� ����
		//			�޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���Ҷ� �����ȴ�.
		//			�޼ҵ尡 ������ �������.
		//			���������� static�� ���� �� ����.
		int s1 = 10 ;
		// static int s2 = 90 ;
		final int s3 = 85 ;
		// static final int s4 = 95 ;
				
	}
	
	//static, ��ȯ�� ����
	public static void prn02() 
	{
		// static�޼ҵ忡�� instance������ ����� �� ����.
		// k1 = k1 + 20 ;
		k2 = k2 + 10 ;
		// K3 = K3 + 15 ;
		System.out.println("k2 : " + k2);
		System.out.println("K4 : " + K4);
		
		// ���������� static�� ���� �� ����.
		int s1 = 10 ;
		// static int s2 = 90 ;
		final int s3 = 85 ;
		// static final int s4 = 95 ;
		
		
		return ; // ��� ��(�����ʹ� ��������)
	}
	
	// instance, ��ȯ�� ����, (��ȯ�� �ִ°���)������ �� return '���� ������'
	public int prn03()
	{
		
		return 'c' ; // ��ȯ������ ���� �ڷ���
		//return 14 ; ��ȯ���̶� ���� �ڷ���
	}
	
	// static, ��ȯ�� ����
	public static double prn04()
	{
		
		return 147 ;
		//return 3.14 ;
	}
	
	
}
