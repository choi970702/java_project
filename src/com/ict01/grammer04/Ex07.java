package com.ict01.grammer04;
class Ex07 
{
	public static void main(String[] args) 
	{
		// break�� : ���� �ݺ����� Ż�� �Ҷ� ���
		// continue�� :  continue�� ������ ���๮�� �����ϰ� ���� ȸ���� �ݺ�����
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

		// 17�� ���� �ݺ��ȴ�.
		k = 11 ;
		while (k<21)
		{
			// if(k==17) continue; ���ѷ���
			System.out.print(k+" ");
			k++;
		}
		System.out.println();

		// ��ø �κп��� break ��� j�� 3�϶� break
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

				// ��ø �κп��� break ��� i�� 2�϶� break
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

				// ��ø �κп��� continue ��� j�� 3�϶� break
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

				// ��ø �κп��� continue ��� i�� 2�϶� break
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
