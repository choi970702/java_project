package com.ict06.Thread;

// Thread는 start() => run() 이동해야 Thread 처리가 됨
//			start() => start() 스레드 아님
//			run() => run() 스레드 아님(같은 이름을 찾아가는게 우선순위가 더 높음)

// 스레드 실행은 Thread 클래스를 상속, Runnable interface를 상속
// Thread 클래스는 start(), run() 모두 가지고 있다.
// Runnable interface는 run()만 가지고 있다.

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
