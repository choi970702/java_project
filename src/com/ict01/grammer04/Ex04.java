package com.ict01.grammer04;
class Ex04 
{
	public static void main(String[] args) 
	{
		// while�� : for���� ���� �ݺ���
		// ����1)							����2)
		// �ʱ��;						�ʱ��
		// while(���ǽ�){					while(true){
		// ���ǽ��� ���϶� ������ ���� ;		if(������������) break;(����Ż��)
		// ���ǽ��� ���϶� ������ ���� ;		���ǽ��� ���϶� ������ ���� ;
		// ���ǽ��� ���϶� ������ ���� ;		if(������������) break;(����Ż��)
		// ������;						������;
		// }							}(�������� ������ �����ϳ���)
		// ** while�� ���� ������ ���ǽ����� �̵�

		// 0~15 ���� �������
		int i = 0 ;
		while (i < 16)
		{
			System.out.print(i + " ") ;
			i++ ;
		}
		System.out.println() ;

		// 0~15 ���� �������
		i = 0 ;
		while (true)
		{
			System.out.print(i + " ") ;
			if (i > 16) break;
			i++ ;
		}
		System.out.println() ;

		// 0~15 ���� �������
		i = 0 ;
		while (true)
		{
			if (i >= 16) break;
			System.out.print(i + " ") ;
			i++ ;
		}
		System.out.println() ;

		// 0~10 ���� Ȧ���� ���
		i = 0 ;
		while (i < 11)
		{
			if (i%2==1)
			{
				System.out.println(i) ;
			}
			i++ ;
		}
		System.out.println() ;

		// 0~10 ���� ¦���� ���
		i = 0 ;
		while (i < 11)
		{
			if (i%2==0)
			{
				System.out.print(i+ " ") ;
			}
			i++ ;
		}
		System.out.println() ;

		// 0~50 ���� 7�� ����� ���
		i = 1 ;
		while (i < 51)
		{
			if (i%7 == 0)
			{
				System.out.print(i+ " ");
			}
			i++ ;
		}
		System.out.println();

		// 5�� ���
		i = 1 ;
		while (i < 51)
		{
			if (i%5==0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i = 1 ;
		while (true)
		{
			System.out.print("0 ");
			if (i%4==0)
			{
				System.out.println();
			}
			if (i > 15) break;
			i++ ;
		}

		// 0~10 ���� ������ ���ϱ�
		i = 0 ;
		int sum = 0 ;
		while (i < 11)
		{
			sum = i + sum ;
			i++ ;
		}
		System.out.println("������ : " +sum);

		//Ȧ���� ¦���� �������� ���� ���Ͻÿ�.
		i = 0 ;
		int old = 0 ;
		int even = 0 ;
		while (i < 11)
		{
			if (i%2==0)
			{
				even = even + i ;
			}
			else
				old = old + i ;
			i++ ;
		}
		System.out.println("Ȧ�� : " + old);
		System.out.println("¦�� : " + even);

	}
}
