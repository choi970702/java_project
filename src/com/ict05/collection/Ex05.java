package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 
{
	// list interface 를 구현한 클래스 : Stack, ArrayList, Vector
	// Stack(스택) : LIFO(Last In First Out) : 후입선출
	// 주요 메소드
	// add, push, addElement => 추가
	// add(index, E) => 삽입
	// pop : 맨 위에 존재하는 객체를 반환하고 삭제한다.
	// peek : 맨 위에 존재하는 객체를 반환하고 삭제하지는 않는다. (무한루프 조심)
	// search : 검색(오른쪽, 1부터 찾음)
	// indexOf : 검색(왼쪽, 0부터 찾음) => 배열방식
	// elementAt(index) : 위치값을 받아서 해당 객체 추출
	// get(index) : 위치값을 받아서 해당 객체 추출
	// firstElement : 맨 처음 요소 추출
	// lastElement : 맨 마지막 요소 추출
	// setElement(Element, index) : 치환
	public static void main(String[] args) 
	{
		
		Stack<String> stack = new Stack<String>();
		stack.add("둘리");
		stack.addElement("공실");
		stack.push("마이콜");
		System.out.println(stack);
		
		stack.add(1, "도우너"); // 삽입
		stack.add(0, "또치"); // 삽입
		stack.add(1, "뿌끄"); // 삽입(중복이 아님)
		stack.add(1, "둘리"); // 중복 사용 가능
		System.out.println(stack);
		System.out.println("=====================");
		
		// 마지막 객체보기 : pop(삭제됨), peek(삭제안됨 = for문을 돌리면 무한루프)
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("=====================");
		
		// cotains, indexOf, search, get, elementAt, firstElement, lastElement
		if (stack.contains("둘리")) 
		{
			//System.out.println("있음");
			// 해당 객체의 위치값
			System.out.println(stack.indexOf("둘리")+"번째 위치");
			System.out.println(stack.search("둘리")+"번째 위치");
			// 해당 위치의 객체 꺼내기
			System.out.println(stack.get(1));
			System.out.println(stack.get(stack.indexOf("둘리")));
			System.out.println(stack.elementAt(stack.indexOf("둘리")));
			
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
			
		}else
		{
			System.out.println("없음");
		}
		System.out.println("=====================");
		
		// size, set(치환), setElementAt(치환)
		System.out.println(stack.size()+"요소가 존재 합니다.");
		// index가 3
		stack.set(3, "마이콜");
		// stack.setElementAt("마이콜", 3);
		System.out.println(stack);
		
		// 하나씩 꺼내기 (개선된 for문, Iterator(데이터가 그대로 존재), pop(데이터가 삭제))
		// 개선된 for문
		for (String str : stack) 
		{
			System.out.println(str);
		}
		System.out.println(stack.size()+"요소가 존재함");
		
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) 
		{
			String msg = (String) it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size()+"요소가 존재함");
		
		while (! stack.isEmpty()) 
		{
			String k = stack.pop();
			System.out.println(k+"삭제됨, 크기는 "+stack.size());
			
		}
		
		
		
		
		
		
	}

}
