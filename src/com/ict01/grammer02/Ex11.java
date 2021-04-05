package com.ict01.grammer02;
class Ex11
{
	public static void main(String[] args)
	{
	 // 증감 연산자 : 1만큼 증가 하거나 감소 시키는 연산자임.
	 // 	       char , 정수, 실수에 사용 가능
	 // ++ 변수 : 먼저 변수 값이 1이 증가되고 그 다음에 연산을 함
	 // 변수 ++ : 현재 변수값을 가지고 연산을 한 후에 1을 증가 시킴
		int s1 = 10 ;
		int s2 = 10 ;
		System.out.println(++s1 + 2); // 13, s1 = 11
		System.out.println(s2++ + 2); // 12 s2 = 11
		System.out.println();
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);




	}

}