package com.ict05.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex07 {

	public static void main(String[] args) 
	{
		// Queue(ť) interface�� ������ Ŭ���� : LinkedList
		// FIFO(First In First Out) ���Լ���
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		// �߰�, ���� : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedlist.add("����ȣ");
		linkedlist.offer("�ڼ���");
		linkedlist.add("�����");
		System.out.println(linkedlist);
		
		linkedlist.addFirst("�豤��");
		System.out.println(linkedlist);
		
		linkedlist.offerFirst("�Ѹ�");
		System.out.println(linkedlist);
		// �ڼ��� �˻��ϰ� ��ġ �ޱ�
		if (linkedlist.contains("�ڼ���")) 
		{
			System.out.println(linkedlist.indexOf("�ڼ���"));
			System.out.println(linkedlist.get(linkedlist.indexOf("�ڼ���")));
			System.out.println(linkedlist.getFirst());
			System.out.println(linkedlist.getLast());
		}else
		{
			System.out.println("����.");
		}
		System.out.println(linkedlist.size()+" ��Ұ� ������");
		
		// �Ѹ��� �̴�ȣ�� �ٲ���
		if (linkedlist.contains("�Ѹ�")) 
		{
			linkedlist.set(linkedlist.indexOf("�Ѹ�"), "�̴�ȣ");
		}else
		{
			System.out.println("����");
		}
		System.out.println(linkedlist);
		
		linkedlist.removeFirst();
		System.out.println(linkedlist);
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		System.out.println(linkedlist.remove(1)+"�� ���� �Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
