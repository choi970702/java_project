package com.ict06.Thread;

// 문제 : 두 개의 스레드를 생성하여 첫번째 스레드의 출력을 1~100까지 출력하고,
// 두번째 스레드의 출력은 101~200까지 출력하라(synchronized사용)
public class Ex15 implements Runnable
{
	int x = 0;
	
	@Override
	public synchronized void run() 
	{
		
		for (int i = 0; i < 100; i++) 
		{
			System.out.println(Thread.currentThread().getName()+" : "+(++x));
			
		}
			
		
	}
	
	
}





