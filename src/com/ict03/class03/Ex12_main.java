package com.ict03.class03;
import java.util.Scanner;
public class Ex12_main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요. (1. 고양이  2. 강아지)");
		int s1 = scan.nextInt();
		
		/*if(s1 == 1)
		{
			Ex10_Cat cat = new Ex10_Cat();
			cat.sound();
			cat.hobby();
			cat.like();
			cat.sleep();
			
		}else if(s1 == 2)
		{
			Ex11_Dog dog = new Ex11_Dog();
			dog.sound();
			dog.hobby();
			dog.like();
			dog.sleep();
			
		}*/
		
		Ex09_Animal animal = null;
		if(s1==1)
		{
			animal = new Ex10_Cat();
		}else if(s1==2)
		{
			animal = new Ex11_Dog();
		}
		
		// 특징 : 부모클래스에 없는 메소드는 사용못함
		animal.sound();
		// animal.hobby();
		animal.like();
		animal.sleep();
		
		
		
		
		
		
		
	}

}
