package com.ict06.Thread;

public class Ex09_main {

	public static void main(String[] args) 
	{
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07, Ex08, Ex09�� Runnable�� ��� �޾ұ� ������
		// start()�� ����.
		// t1.start();
		
		// ������ run()�޼ҵ带 ���� Ŭ���� ��, Ÿ���� �����ؾ� �ȴ�.
		// �⺻�����ڷδ� �ȵȴ�.
		Thread thread1 = new Thread(t1);
		thread1.start();
		// thread1�̶�� �ָ� �ٽ� ȣ���� �� �ִ�.
		
		// Thread thread2 = new Thread(t2);
		// thread2.start();
		// Thread thread3 = new Thread(t3);
		// thread3.start();
		
		// �̸��� ��� �ٽ� ȣ���� �� ����.
		new Thread(t2).start();
		// new Thread(t3).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// �ȵ���̵忡�� ���� ����ϴ� ���(�͸� ���� Ŭ����)
		new Thread(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				while (true) 
				{
					System.out.println(Thread.currentThread().getName()+"����������");
				}
				
			}
		}).start();
		
		
		

	}

}
