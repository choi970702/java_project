package com.ict06.Thread;

public class Ex14 implements Runnable
{
	// ����ȭ ó���� �� �������� �����带 ������ ��� ���·� ���� ��Ű��
	// �޼ҵ带 wait()(����.)�̶�� ��.
	// �ѹ� wait()�� ������� Ǯ������ ������ �״�� ��� ���¿��� ���α׷��� ����ȴ�.
	// wait()�� �����带 Ǯ���ִ� �޼ҵ带 notify()(�����.), notifyAll()�̶�� �Ѵ�.
	
	@Override  
	public synchronized void run() 
	{
		int x = 0;
		for (int i = 0; i < 50; i++) 
		{
			System.out.println(Thread.currentThread().getName()+" : "+(++x));
			if (x==25) 
			{
				try 
				{
					wait();
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}else
			{
				notify();
			}
			
		}
		
	}
	
	
	
}
