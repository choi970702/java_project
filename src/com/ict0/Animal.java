package com.ict0;

public class Animal 
{
	private String name;
	private int age;
	private boolean gender;
	
	
	public Animal() 
	{
		// TODO Auto-generated constructor stub
	}


	public Animal(String name, int age, boolean gender) 
	{
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	public String getName()
	{
		return name;
	}

	public void play(String play)
	{
		System.out.println(play+"를 잘한다.");
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}


	public int getAge()
	{
		return age;
	}


	public void setAge(int age) 
	{
		this.age = age;
	}


	public boolean isGender() 
	{
		return gender;
	}


	public void setGender(boolean gender) 
	{
		this.gender = gender;
	}
	
	
	
	
}
