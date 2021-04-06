package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 
{
	public static void main(String[] args) 
	{
		// Map interface : Key �� Value�� �����ϴ� ������ �̷����
		// Key�� �ߺ��ɼ� ����.(key�� �ߺ��Ǹ� ����Ⱑ �ȴ�, value�� �ߺ�����)
		// Key�� ȣ���ϸ� Value�� ���´�.
		// Key�� set�÷��ǿ� ������ �����Ѵ�. => keySet()
		
		// �ֿ�޼ҵ�
		// add()�� �߰�, ���� �ȵ�
		// - put(k key, V value) : �߰�, ����
		// - keySet() : key�� set���� ����
		// - containsKey(Object key) : boolean
		// ���ڷ� ���� key�� �����ϸ� true, ������ false
		// - containsValue(Object value) : boolean
		// ���ڷ� ���� value�� �����ϸ� true, ������ false
		// - get(Objcet key) : Ű�� �޾Ƽ� value ���� �����Ѵ�.
		// - remove(Objcet key) : Ű�� �޾Ƽ� ����
		// - replace(K key, V value) : ġȯ�ϱ�
		
		// 1. key�� �����ִ� ���ڷ� ����� ��½� for�� ��� ����
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "�ѱ�");
		map1.put(2, "�̱�");
		map1.put(3, "�߱�");
		map1.put(4, "����");
		map1.put(5, "�±�");
		System.out.println(map1);
		
		map1.put(3, "�Ϻ�"); // key�� �ߺ�(�����)
		System.out.println(map1);
		
		map1.put(6, "�ѱ�"); // value�� �ߺ�
		System.out.println(map1);
		
		// �ϳ��� �����ϴ� ���
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println(map1.get(6));
		System.out.println();
		// �Ϲ����� for�� ��� ���� ������ for���� ��� �Ұ�
		for (int i = 1; i < map1.size()+1; i++) 
		{
			System.out.println(map1.get(i));
		}
		System.out.println("1");
		
		// ������ for�� ��� => keySet() ���
		for (Integer k : map1.keySet()) 
		{
			System.out.println(map1.get(k));
		}
		System.out.println("2");
		// iterator ��� => keySet()���
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) 
		{
			int s1 = (int) it.next();
			System.out.println(map1.get(s1));
		}
		System.out.println("==============================================");
		// 2. key�� ���ڷ� ����� ��½� ������ keySet()�� ����ؾ� �Ѵ�.(�Ϲ���)
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("�̸�", "��浿");
		map2.put("����", "34");
		map2.put("�ּ�", "������");
		map2.put("����", "����");
		map2.put("���", "���ڱ�");
		System.out.println(map2);
		System.out.println();
		
		System.out.println(map2.get("�̸�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("�ּ�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("���"));
		System.out.println();
		
		// ������ for��
		for (String str : map2.keySet()) 
		{
			System.out.println(map2.get(str));
		}
		System.out.println();
		
		// Iterator ���
		Iterator<String> it2 = map2.keySet().iterator();
		
		while (it2.hasNext()) 
		{
			String k = (String) it2.next();
			System.out.println(map2.get(k));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
