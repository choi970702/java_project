package com.ict06.Thread;

public class Ex15_main 
{
	public static void main(String[] args) 
	{
		Ex15 t1 = new Ex15();
		new Thread(t1, "첫번째 스레드").start();
		new Thread(t1, "두번째 스레드").start();
		
		
		
		/* Ex15 t1 = new Ex15();
		 * 
		 * Thread thread1 = new Thread(t1, "1번");
		 * thread1.start();
		 * 
		 * Thread thread2 = new Thread(t1, "2번");
		 * thread2.start();
		 * 
		 * 
		 * */
		
	}
	
	
}
