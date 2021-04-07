package com.ict06.Thread;

// class ProducerCustomerEx
public class Ex20 {

	public static void main(String[] args) 
	{
		// 공통자원 => 임계영역(동기화 필요)
		Ex17 c = new Ex17();
		
		Ex18 producer = new Ex18(c);
		Thread tEx18 = new Thread(producer);
		
		Ex19 customer = new Ex19(c);
		Thread tEx19 = new Thread(customer);
		
		tEx18.start();
		tEx19.start();

	}

}
