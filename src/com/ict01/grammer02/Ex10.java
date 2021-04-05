package com.ict01.grammer02;
class Ex10
{
	public static void main(String[] args)
	{
	 // 9630초는 몇시간 몇분 몇초인가?	
	 //시간은 c, 분은 m, 초는 s
		int c = 9630 / 3600 ;
		int m = (9630 % 3600) / 60 ;
		int s = ((9630 % 3600) % 60) ;
 		System.out.println(c + "시" + m + "분" + s + "초");







	}

}