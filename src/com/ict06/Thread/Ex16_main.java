package com.ict06.Thread;

public class Ex16_main 
{
	public static void main(String[] args) 
	{
		Ex16 t1 = new Ex16();
		
		new Thread(t1, "첫번째 스레드").start();
		new Thread(t1, "두번째 스레드").start();
		
		
		
	}
}
