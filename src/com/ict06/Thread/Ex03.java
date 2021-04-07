package com.ict06.Thread;

// Thread�� start() => run() �̵��ؾ� Thread ó���� ��
//			start() => start() ������ �ƴ�
//			run() => run() ������ �ƴ�(���� �̸��� ã�ư��°� �켱������ �� ����)

// ������ ������ Thread Ŭ������ ���, Runnable interface�� ���
// Thread Ŭ������ start(), run() ��� ������ �ִ�.
// Runnable interface�� run()�� ������ �ִ�.

public class Ex03 extends Thread
{
	public void go() 
	{
		for (int i = 1; i < 10; i++) 
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
		}
		
	}
	
	
	/*@Override
	public void start() 
	{
		for (int i = 11; i < 20; i++) 
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
		}
		
	}*/
	
	
	@Override
	public void run() 
	{
		for (int i = 1; i < 10; i++) 
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
		}
		
	}
	
	
	
}
