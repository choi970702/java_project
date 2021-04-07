package com.ict06.Thread;

// class Producer
public class Ex18 implements Runnable
{
	// 클래스를 자료형으로 사용(참조자료형)
	private Ex17 car;
	// 생성자에서 받은 인자는 무조건 전역변수로 만들자 
	public Ex18(Ex17 car)
	{
		// 지역변수를 전역변수로 만들기(이름이 같을때 전역변수 앞에 this를 붙임)
		this.car = car;
	}
	
	public void run()
	{
		String carName=null;
		for (int i = 0; i < 20; i++) 
		{
			// 자동차 생산
			carName = car.getCar();
			// 생산된 자동차를 창고에 넣기
			car.push(carName);
			try 
			{
				// sleep은 try~catch 써야됨
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
