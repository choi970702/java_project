package com.ict06.Thread;

public class Ex03_main {

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		t1.go();
		System.out.println("수고하셨습니다.");
		System.out.println("===========");
		
		// 스레드 처리하기 위해서 start()실행하면 run()으로 가야지만 스레드 처리가 된다.
		// 그런데 start()가 있어서 start()로 갔음.
		// 이것은 스레드 처리가 아님
		// Ex03에 있는 start()를 주석 처리하면 
		// start()에서 run()으로 가게된다.
		// 이것을 스레드 처리 했다고 한다.
		System.out.println(Thread.currentThread().getName());
		t1.start();
		System.out.println("수고하셨습니다.");
		System.out.println("===========");
		
		
	}

}
