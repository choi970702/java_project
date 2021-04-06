package com.ict05.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex07 {

	public static void main(String[] args) 
	{
		// Queue(큐) interface를 구현한 클래스 : LinkedList
		// FIFO(First In First Out) 선입선출
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		// 추가, 삽입 : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedlist.add("박찬호");
		linkedlist.offer("박세리");
		linkedlist.add("김미현");
		System.out.println(linkedlist);
		
		linkedlist.addFirst("김광현");
		System.out.println(linkedlist);
		
		linkedlist.offerFirst("둘리");
		System.out.println(linkedlist);
		// 박세리 검색하고 위치 받기
		if (linkedlist.contains("박세리")) 
		{
			System.out.println(linkedlist.indexOf("박세리"));
			System.out.println(linkedlist.get(linkedlist.indexOf("박세리")));
			System.out.println(linkedlist.getFirst());
			System.out.println(linkedlist.getLast());
		}else
		{
			System.out.println("없음.");
		}
		System.out.println(linkedlist.size()+" 요소가 존재함");
		
		// 둘리를 이대호로 바꾸자
		if (linkedlist.contains("둘리")) 
		{
			linkedlist.set(linkedlist.indexOf("둘리"), "이대호");
		}else
		{
			System.out.println("없음");
		}
		System.out.println(linkedlist);
		
		linkedlist.removeFirst();
		System.out.println(linkedlist);
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		System.out.println(linkedlist.remove(1)+"님 삭제 되었습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
