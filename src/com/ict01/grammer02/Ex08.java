package com.ict01.grammer02;
class Ex08
{
	public static void main(String[] args)
	{
	 // 아메리카노가 2500원 이다. 친구와 둘이서 10000원을 내고 주문했다. 
	 // 잔돈은 얼마인가?(부가세 10%가 추가된다.)
	 // 커피값은 a , 부가세는 b, 낸금액은 c, 거스름돈은 d
		int a = 2500 * 2 ;
		int b = a / 10 ;
		int c = 10000 ;
		int d = c - (a + b);
		System.out.println(d + "원");

	 // 입력정보 
		String coff = "아메리가노" ;
		int dan = 2500 ;
		int su = 2 ;
		int input = 10000 ;

		int total = dan * su ;
		int vat = (int)(total * 0.1) ;

		int output = input - (total + vat) ;
		System.out.println("잔돈 : " + output) ;
	 // 부가세 구하는 방법들 커피값 * 1.1
	 // 또는 커피값 * 0.1 + 커피값

	}

}