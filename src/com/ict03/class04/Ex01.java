package com.ict03.class04;

public abstract class Ex01 
{
	// �߻� Ŭ���� : �߻� �޼ҵ带 1���̻� ������ �ִ� Ŭ����
	// 			�Ϲ����� �޼ҵ�� �ʵ带 ���� �� �ִ�.
	//			�߻� Ŭ�������� abstract �ݵ�� ���� ����Ѵ�.
	
	// �߻� �޼ҵ� : ��üȭ�� �������� �޼ҵ带 �ǹ���.
	//			body ����� �������� ���� �޼ҵ带 ����.
	//			body ����� ������ ���๮�� ����.(��üȭ�� ���� �ʾҴٴ� ��.)
	//			�߻� �޼ҵ忡�� abstract �ݵ�� ���� ����Ѵ�.
	
	// ������ : �ϳ��� �޼ҵ峪 Ŭ������ ���� �� �̰͵��� �پ��� ������� ���۽�Ű�°��� �ǹ���.
	
	int s1 = 10;	// instance����
	static int s2 = 10;	// static ����
	final int s3 = 10;	// instance ���
	static final int s4 = 10;	// static ���
	
	public void play()
	{
		System.out.println("instance �޼ҵ�");
	}
	
	public static void prn()
	{
		System.out.println("static �޼ҵ�");
	}
	
	// �߻� �޼ҵ�
	public abstract void sound() ;
	
	
	
	
	
	
}
