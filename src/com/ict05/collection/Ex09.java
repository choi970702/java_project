package com.ict05.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 
{
	public static void main(String[] args) 
	{
		// ���� ������ �޾Ƽ� �ش� ������ ������ ����ϴ� ���α׷�
		
		// 1. ����� ������ ������ �ִ� ������
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�ѱ�", "����");
		map.put("���ѹα�", "����");
		map.put("KOREA", "����");
		map.put("korea", "����");
		map.put("�̱�", "������");
		map.put("�߱�", "�ϰ�");
		map.put("�Ϻ�", "����");
		map.put("�±�", "����");
		map.put("ĳ����", "��Ÿ��");
		
		// ���� set�÷��ǿ� ����
		Set<String> sets = map.keySet();
		
		Scanner scan = new Scanner(System.in);
		
		esc:
		while (true) 
		{
			System.out.print("���� : ");
			String msg = scan.next();
			if (sets.contains(msg)) 
			{
				String res = map.get(msg);
				System.out.println(msg+"�� ������ "+res+"�Դϴ�.");
			}else
			{
				System.out.println("�����Ϳ� ���� ���� �Դϴ�.");
			}
			while (true) 
			{
				System.out.println("��� �ұ��?(Y/N)");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) 
				{
					continue esc;
				}else if(str.equalsIgnoreCase("n"))
				{
					break esc;
				}else
				{
					System.out.println("�߸� �Է� �ϼ̳׿�. �ٽ� �Է� �ϼ���.");
					continue;
				}
			}
			
		}
		System.out.println("�����ϼ̽��ϴ�.");

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}
	
}
