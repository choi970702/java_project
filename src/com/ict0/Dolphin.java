package com.ict0;

public class Dolphin extends Animal
{
	public static void main(String[] args) 
	{
		String play = "����";
		Animal ani = new Animal();
		ani.setName("����");
		ani.setAge(25);
		ani.setGender(true);
		
		System.out.println(ani.getName()+"��");
		System.out.println(ani.getAge());
		if (ani.isGender()) 
		{
			System.out.println("���� �Դϴ�.");
		} else 
		{
			System.out.println("���� �Դϴ�.");
		}
		ani.play(play);
	}
}
