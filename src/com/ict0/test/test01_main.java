package com.ict0.test;

public class test01_main {

	public static void main(String[] args) 
	{
		test01 t1 = new test01();
		
		Thread thread_1 = new Thread(t1, "dog");
		thread_1.start();
		Thread thread_2 = new Thread(t1, "cat");
		thread_2.start();

	}

}
