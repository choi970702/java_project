package com.ict0;

import java.util.HashSet;
import java.util.Iterator;

public class study 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<String>();
		h1.add("abc");
		h1.add("def");
		h1.add("ghi");
		h1.add("jkl");
		h1.add("mno");
		
		System.out.println(h1);// 전체 보기
		
		for (String str : h1) // 개선된 for문으로 한번에 보기
		{
			String msg = str;
			System.out.println(msg);
		}
		System.out.println("==============");
		Iterator<String> it = h1.iterator();
		while (it.hasNext()) 
		{
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
