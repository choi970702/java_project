package com.ict03.class04;

// �Ϲ����� Ŭ������ �߻�Ŭ������ ����ϸ� �ݵ�� �߻�Ŭ������ �߻�޼ҵ带 �������̵� �ؾߵ�. 
// ��üȭ�� �ؾ��Ѵ�.
class Ex02 extends Ex01
{

	@Override
	public void sound() 
	{
		
	
	}
	
}

// �������̵��� ���� �ʴ� ��� : �ڽ�Ŭ������ �߻�Ŭ������ �����.
// �θ��� �߻�޼ҵ带 ��üȭ���� ����.
abstract class Ex03 extends Ex01
{
	public void song()
	{
		System.out.println("�뷡�ϱ�");
	}
}

// �������̵��� ���� �ʴ� ��� : �ڽ�Ŭ������ �߻�Ŭ������ �����.
// �θ��� �߻�޼ҵ带 ��üȭ���� ����.
// �߻�޼ҵ带 �߰�����.
abstract class Ex04 extends Ex01
{
	public void music()
	{
		System.out.println("����");
	}
	
	public abstract void pop();
	
	
	
	
}
