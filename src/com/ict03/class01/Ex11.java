package com.ict03.class01;

public class Ex11 
{
	// ������ : Ŭ������ ��ü�� ���� �� �ڵ����� �ѹ� ȣ��ȴ�.
	// ���� : ����ʵ�(����, ���)�� �ʱ�ȭ
	// Ư¡ : Ŭ���� �̸��� ������ �̸��� ����.
	//		Ŭ�����̸�(����=�Ű�����);
	//		��ȯ���� ���� �żҵ��� �Ѵ�.
	//		�����ڸ� ������ ������ �ڵ����� �⺻ �����ڷ� ������.
	//		�⺻ �����ڶ� ���ڰ� ���� �����ڸ� ����. ex) Ŭ�����̸�()
	//		Ŭ�����ȿ��� �����ڸ� ��������� ������� �����ڸ� ����ؾ� �Ѵ�.
	//		�����ڵ� �����ε��� ������.
	//		�ϳ��� Ŭ������ ���� �����ڰ� ������ �� ����. ��, ������ ������ ������ ������ �޶�ߵ�.
	//		�����ε��̶� �ϳ��� Ŭ���� �ȷ� ���� �̸��� �޼ҵ尡 ������ �����ϴ� ���� ����.
	
	
	private String name = "�Ѹ�";
	private int age = 24;
	private boolean gender = true;
	
	// ������ �����ε�(2�� �̻�)
	// �⺻ ������
	public Ex11() 
	{
		System.out.println("�⺻ ������");
		name = "�±Ǻ���";
		age = 43;
	}
	
	// �⺻ �����ڰ� �ƴ� �ٸ� ������(���ڰ� �ִ� �����ڸ� ����)
	public Ex11(String name, int age) 
	{
		System.out.println(1);
		this.name = name ;
		this.age = age ;
	}
	
	// �⺻ �����ڰ� �ƴ� �ٸ� ������(���ڰ� �ִ� �����ڸ� ����)
	public Ex11(int age, String name) // ������ �ٲٸ� �����ȳ�, ������ �ٲٸ� �ٸ� �����ڰ���.
	{
		System.out.println(2);
		this.name = name ;
		this.age = age ;
	}
	
	// getter, setter
	public String getName() 
	{
		return name;
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
	public void setGerder(boolean gender) 
	{
		this.gender = gender;
	}
	
	
	
}
