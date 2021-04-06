package com.ict05.collection;

// VO(Value Object) : 데이터를 저장하는 객체를 뜻함.
// getter만 사용하면 수정할수 없게 만들 수 있다.
public class Ex03 
{
	private String name ;
	private int price;
	
	public Ex03() 
	{
		// TODO Auto-generated constructor stub
	}

	public Ex03(String name, int price) 
	{
		super();
		this.name = name;
		this.price = price;
	}
	

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	
	
	
}
