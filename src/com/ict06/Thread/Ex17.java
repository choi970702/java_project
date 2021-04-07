package com.ict06.Thread;

import java.util.*;


// class Car.676��
public class Ex17 
{
	// �÷��� : �ڵ������� ����
	private List<String> carList = null;
	// ������: �ش� Ŭ������ ��ü�� �����Ǹ鼭 carlist�� ����
	public Ex17()
	{
		carList = new ArrayList<String>();
	}
	// �������� �ڵ��� ����
	public String getCar()
	{
		String carName = null;
		switch ((int)(Math.random()*3)) 
		{
		case 0 : carName = "SM5"; break;
		case 1 : carName = "�ű׳ʽ�"; break;
		case 2 : carName = "ī����"; break;
			
		}
		return carName;
	}
	
	// �Һ��ڰ� �ڵ����� ��� �޼ҵ�
	public synchronized String pop()
	{
		String carName = null;
		if (carList.size()==0) 
		{
			try 
			{
				System.out.println("���� ����� �����Ҷ� ����"+" ��ٸ�����.");
				this.wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		// ��� �������� carList���� ���� ���߿� ���� ���� �Ǹ�(����)
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("�մ��� ���� �簬���ϴ�.." + "�մ��� ������ ���̸��� => \" "+carName+" \"");
		return carName;
	}
	
	// �ڵ����� carList�� �ֱ�
	// â�� �ڵ����� 5�밡 �Ǹ� �Һ��ڵ鿡�� �ǸŸ� �����Ѵ�.
	public synchronized void push(String car)
	{
		carList.add(car);
		System.out.println("���� ����� �����ϴ�."+"���̸��� \"" + car+"\"");
		if (carList.size()==5) 
		{
			// ��� 0�϶� ����Ų �����带 �غ���·� �����Ŵ
			this.notify();
		}
		
	}
	
	
}
