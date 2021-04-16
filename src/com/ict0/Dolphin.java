package com.ict0;

public class Dolphin extends Animal
{
	public static void main(String[] args) 
	{
		String play = "수영";
		Animal ani = new Animal();
		ani.setName("돌고래");
		ani.setAge(25);
		ani.setGender(true);
		
		System.out.println(ani.getName()+"살");
		System.out.println(ani.getAge());
		if (ani.isGender()) 
		{
			System.out.println("수컷 입니다.");
		} else 
		{
			System.out.println("암컷 입니다.");
		}
		ani.play(play);
	}
}
