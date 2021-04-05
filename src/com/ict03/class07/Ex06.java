package com.ict03.class07;

interface Remocon
{
	void on();
	void off();
	
}

class Machine
{
	Remocon tv = new Remocon() 
	{
		
		@Override
		public void on() 
		{
			System.out.println("tv¸¦ ÄÕ´Ï´Ù.");
			
		}
		
		@Override
		public void off() 
		{
			System.out.println("tv¸¦ ²ü´Ï´Ù.");
			
		}
	};
	Remocon radio = new Remocon() 
	{
		
		@Override
		public void on() 
		{
			System.out.println("radio¸¦ ÄÕ´Ï´Ù.");
			
		}
		
		@Override
		public void off() 
		{
			System.out.println("radio¸¦ ²ü´Ï´Ù.");
			
		}
	};
	
	
}




public class Ex06 
{
	public static void main(String[] args) 
	{
		Machine machine = new Machine();
		machine.tv.on();
		machine.tv.off();
		machine.radio.on();
		machine.radio.off();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
