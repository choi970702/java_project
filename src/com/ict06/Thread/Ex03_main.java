package com.ict06.Thread;

public class Ex03_main {

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		t1.go();
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("===========");
		
		// ������ ó���ϱ� ���ؼ� start()�����ϸ� run()���� �������� ������ ó���� �ȴ�.
		// �׷��� start()�� �־ start()�� ����.
		// �̰��� ������ ó���� �ƴ�
		// Ex03�� �ִ� start()�� �ּ� ó���ϸ� 
		// start()���� run()���� ���Եȴ�.
		// �̰��� ������ ó�� �ߴٰ� �Ѵ�.
		System.out.println(Thread.currentThread().getName());
		t1.start();
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("===========");
		
		
	}

}