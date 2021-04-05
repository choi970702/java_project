package com.ict01.grammer04;
class Ex07 
{
	public static void main(String[] args) 
	{
		// break문 : 현재 반복문을 탈출 할때 사용
		// continue문 :  continue문 이하의 수행문을 포기하고 다음 회차를 반복수행
		for (int i = 1;i<11 ;i++ )
		{
			if (i==4) break;
			System.out.print(i+" ");
		}
		System.out.println();

		for (int i = 1;i<11 ;i++ )
		{
			if (i==4) continue;
			System.out.print(i+" ");
		}
		System.out.println();

		int k = 1 ;
		while (k<21)
		{
			if(k==17) break;
			System.out.print(k+" ");
			k++;
		}
		System.out.println();

		// 17로 무한 반복된다.
		k = 11 ;
		while (k<21)
		{
			// if(k==17) continue; 무한루프
			System.out.print(k+" ");
			k++;
		}
		System.out.println();

		// 중첩 부분에서 break 사용 j가 3일때 break
		for (int i=1;i<4 ;i++ )
		{
			System.out.println();
			for (int j=1;j<6 ;j++ )
			{
				if (j==3) break;
				System.out.print(" i = "+i+", j = "+j);
			}
		}
		System.out.println();
		System.out.println();

				// 중첩 부분에서 break 사용 i가 2일때 break
		for (int i=1;i<4 ;i++ )
		{
			System.out.println();
			for (int j=1;j<6 ;j++ )
			{
				if (i==2) break;
				System.out.print(" i = "+i+", j = "+j);
			}
		}
		System.out.println();
		System.out.println();

				// 중첩 부분에서 continue 사용 j가 3일때 break
		for (int i=1;i<4 ;i++ )
		{
			System.out.println();
			for (int j=1;j<6 ;j++ )
			{
				if (j==3) continue;
				System.out.print(" i = "+i+", j = "+j);
			}
		}
		System.out.println();
		System.out.println();

				// 중첩 부분에서 continue 사용 i가 2일때 break
		for (int i=1;i<4 ;i++ )
		{
			System.out.println();
			for (int j=1;j<6 ;j++ )
			{
				if (i==2) continue;
				System.out.print(" i = "+i+", j = "+j);
			}
		}
	}
}
