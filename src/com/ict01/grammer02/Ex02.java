package com.ict01.grammer02;
class Ex02
{
	public static void main(String[] args)
	{
	  // 문자형 : char , 한 글자를 저장 (한글, 한자. 특문 처리가능)
	  //		문자를 사용하기 위해서는 홑따옴표('')를 사용함.
	  //		숫자를 사용 할 수 있다.
	  //		최종 저장은 숫자로 저장된다.(연산이 가능함.)
	  //		호출을 하면 문자로 나온다.
		char k1 ;
		k1 = 'a'  ;
		System.out.println(k1);
		
		k1 = 65  ;
		System.out.println(k1);
		
		//문자를 표현하는 코드 ASCII, 유니코드
		char k2 = '대' ;
		System.out.println(k2);
		
	}
}