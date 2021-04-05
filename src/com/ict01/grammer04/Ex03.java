package com.ict01.grammer04;
class Ex03 
{
	public static void main(String[] args) 
	{
		// 다중 for 문은 for문 안에 for문이 존재함
		for (int i = 1;i < 4 ; i++ )
		{
			for (int j = 1; j < 6 ; j++ )
			{
				System.out.println("i = " + i + ", j = "+ j) ;
			}
		}
		// 구구단1
		for (int i = 1; i < 10 ; i++ )
		{
			System.out.println() ;
			for (int j = 2; j < 10 ; j++ )
			{
				System.out.print(j+" * "+i+" = "+(i*j)+"  ");
			}
		}
		System.out.println() ;

		// 구구단2
		for (int i = 2; i < 10 ; i++ )
        {
			System.out.println(i + "단") ;
			for (int j = 1; j < 10 ; j++ )
			{
				System.out.println(i+" * "+j+" = "+(i*j)+"  ");
			}
		}
		// 구구단3
		for (int i = 2; i < 10 ; i++ )
        {
			System.out.println(i + "단") ;
			for (int j = 1; j < 10 ; j++ )
			{
				System.out.print(i+" * "+j+" = "+(i*j)+"  ");
			}
			System.out.println() ;
		}
		// 구구단 4
		for (int i = 1; i < 10 ; i++ )
        {
			System.out.println(i + "단") ;
			for (int j = 2; j < 10 ; j++ )
			{
				System.out.print(j+" * "+i+" = "+(i*j)+"  ");
			}
			System.out.println() ;
		}
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 1; i < 5 ; i++ )
		{
			for (int j = 1 ; j < 5 ; j++ )
			{
				System.out.print(0+" ");
			}
			System.out.println(i + "번줄") ;
		}

		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		for (int i = 1; i < 5 ; i++ )
		{
			for (int j = 1; j < 5 ; j++ )
			{
				if (j == i)
				{
					System.out.print(1);
				}
				else
					System.out.print(0);
			}
			System.out.println() ;
		}


	}
}
