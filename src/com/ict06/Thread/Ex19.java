package com.ict06.Thread;

// class Customer
public class Ex19 implements Runnable
{
	
	private Ex17 car;
	public Ex19(Ex17 car)
	{
		this.car= car;
	}
	
	public void run()
	{
		String carName=null;
		for (int i = 0; i < 20; i++) 
		{
			// ÀÚµ¿Â÷¸¦ »ï
			carName = car.pop();
			try 
			{
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
