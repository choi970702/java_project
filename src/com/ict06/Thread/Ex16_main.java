package com.ict06.Thread;

public class Ex16_main 
{
	public static void main(String[] args) 
	{
		Ex16 t1 = new Ex16();
		
		new Thread(t1, "ù��° ������").start();
		new Thread(t1, "�ι�° ������").start();
		
		
		
	}
}