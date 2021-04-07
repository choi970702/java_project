package com.ict06.Thread;

public class Ex09_main {

	public static void main(String[] args) 
	{
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07, Ex08, Ex09는 Runnable을 상속 받았기 때문에
		// start()가 없다.
		// t1.start();
		
		// 실행할 run()메소드를 가진 클래스 즉, 타깃을 지정해야 된다.
		// 기본생성자로는 안된다.
		Thread thread1 = new Thread(t1);
		thread1.start();
		// thread1이라는 애를 다시 호출할 수 있다.
		
		// Thread thread2 = new Thread(t2);
		// thread2.start();
		// Thread thread3 = new Thread(t3);
		// thread3.start();
		
		// 이름이 없어서 다시 호출할 수 없다.
		new Thread(t2).start();
		// new Thread(t3).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// 안드로이드에서 많이 사용하는 방법(익명 내부 클래스)
		new Thread(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				while (true) 
				{
					System.out.println(Thread.currentThread().getName()+"ㅁㅁㅁㅁㅁ");
				}
				
			}
		}).start();
		
		
		

	}

}
