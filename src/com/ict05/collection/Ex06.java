package com.ict05.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 
{

	public static void main(String[] args) 
	{
		// list interface �� ������ Ŭ���� : Stack, ArrayList, Vector
		// ArrayList �� Vector : �迭�� ����� ��������, ����, ����, �߰��� �����ο�.
		//						ũ�⸦ �̸� �������� �ʾƵ� �ȴ�.
		//						ArrayList(����ȭ���� ����), Vector(����ȭ����=��������)
		
		// Set ������ ������ ����. �ߓ� �ȵ�.
		// List ������ ������ ����, �ߺ� ����
		ArrayList<String> list = new ArrayList<String>();
		// �߰� : add
		list.add("����ȣ");
		list.add("������");
		list.add("�����");
		System.out.println(list);
		
		// ���� : add
		list.add(1, "�߽ż�");
		System.out.println(list);
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("�Ѹ�");
		vector.add("�����");
		vector.add("��ġ");
		
		System.out.println(vector);
		
		// ����
		vector.add(2, "����");
		System.out.println(vector);
		
		if (list.contains("�����")) 
		{
			// �˻� : ��ġ�� �˻�
			System.out.println(list.indexOf("�����")+"��° ��ġ");
			// �˻� : �ش� ��ġ��(index��) �����ϴ� ��ü �˻�
			System.out.println(list.get(3)); 
			System.out.println(list.get(list.indexOf("�����")));
			
		}else
		{
			System.out.println("�������� ����");
		}
		System.out.println(list.size()+"��Ұ� ������");
		
		// ġȯ : set
		list.set(3, "�̴�ȣ");
		System.out.println(list);
		
		// �߽ż��� ������ �߽ż��� ���������� ġȯ�Ͻÿ�.
		if (list.contains("�߽ż�")) 
		{
			list.set(list.indexOf("�߽ż�"), "�̴�ȣ");
			System.out.println(list);
		}else
		{
			System.out.println("����");
		}
		System.out.println();
		
		// �ϳ��� ������ (for, iterator)
		for (String str : list) 
		{
			System.out.println(str);
		}

		System.out.println("=============================");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) 
		{
			String s1 = (String)it.next();
			System.out.println(s1);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
