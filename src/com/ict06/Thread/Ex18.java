package com.ict06.Thread;

// class Producer
public class Ex18 implements Runnable
{
	// Ŭ������ �ڷ������� ���(�����ڷ���)
	private Ex17 car;
	// �����ڿ��� ���� ���ڴ� ������ ���������� ������ 
	public Ex18(Ex17 car)
	{
		// ���������� ���������� �����(�̸��� ������ �������� �տ� this�� ����)
		this.car = car;
	}
	
	public void run()
	{
		String carName=null;
		for (int i = 0; i < 20; i++) 
		{
			// �ڵ��� ����
			carName = car.getCar();
			// ����� �ڵ����� â�� �ֱ�
			car.push(carName);
			try 
			{
				// sleep�� try~catch ��ߵ�
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
