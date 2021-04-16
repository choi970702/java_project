package com.ict0;

public abstract class Ex02 
{
	private int energe;
	private String productName;
	
	public Ex02() 
	{
		// TODO Auto-generated constructor stub
	}
	public int energe(int energe) 
	{
		this.energe = energe;
		return this.energe;
	}
	
	public String productName(String productName) 
	{
		this.productName = productName;
		return this.productName;
	}
	
	
	public abstract void electricMeter();
}
