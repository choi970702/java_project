package com.ict01.grammer04;
class Ex02 
{
	public static void main(String[] args) 
	{
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		// ���� : for(�ʱ�� ; ���ǽ� ; ������){
		//			���ǽ��� ���϶� ������ ����;
		//			���ǽ��� ���϶� ������ ����;
		//			}
		// for���� ������ ������ �ʱ������ �̵�
		// �ʱ�Ŀ����� ���ǽ����� �̵�
		// ���ǽ��� ���̸� for�� ����
		// ���ǽ��� �����϶��� for�� ������ ��������
		// for���� �����߿� for���� ���� ������ ������ ���������� ��.
		// �������� ������ ���ǽ����� �̵�

		// �ȳ��ϼ���, ���� ����ϱ�
		for (int i = 1 ; i < 11 ; i++ )
		{
			System.out.println("�ȳ��ϼ���. - " + i);
		}
		// 0~15 ���� �������
		for (int i = 0 ; i < 16 ; i++ )
		{
			System.out.print(i + "  ");
		}
		System.out.println();

		// 0~10 ���� ¦���� ���
		for (int i = 0 ; i < 11 ; i++ )
		{
			if (i % 2 == 0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		//0~10 ���� Ȧ���� ���
		for (int i = 1 ; i < 11 ; i++ )
		{
			if (i % 2 == 1)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		// 0~50 ���� 7�� ����� ���
		for (int i = 0 ; i < 51 ; i += 7  )
		{
			System.out.print(i + "  ");
		}
		System.out.println();
		// 5�� ���
		for (int i = 0 ; i < 10 ; i++ )
		{
			System.out.println(" 5 * " + i + " = " + (5 * i));
		}
		System.out.println();
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 1 ;i < 17 ; i++ )
		{
			System.out.print("0 ");
			if (i%4 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
		
		// 0-10 ���� ������ ���ϱ�
		int sum = 0 ;
		for (int i = 0 ; i < 11; i++ )
		{
			sum = sum + i ;
		}
		System.out.println(sum) ;

		// Ȧ���� ������
		int s1 = 0 ;
		for (int i = 0 ;i < 11 ; i++ )
		{
			if (i%2 == 1)
			{
			  s1 = s1 + i ;
			}
		}
		System.out.println("Ȧ���� ������ : " + s1) ;

		// ¦���� ������

		int s2 = 0 ;
		for (int i = 0 ; i < 11 ; i++ )
		{
			if (i % 2 == 0)
			{
				s2 = s2 + i ;
			}
		}
		System.out.println("¦���� ������ : " + s2) ;
		System.out.println() ;

		//Ȧ���� ¦���� �������� ���� ���Ͻÿ�.
		int s3 = 0 ; // Ȧ���� ������
		int s4 = 0 ; // ¦���� ������
		for (int i = 0 ; i < 11 ; i++ )
		{
			if (i%2 == 0)
			{
				s4 = s4 + i ;
			}
			else
				s3 = s3 + i ;
		}
		System.out.println("Ȧ���� ������ : " + s3);
		System.out.println("¦���� ������ : " + s4);

		// 7!(���丮��)
		int pa = 1 ;
		for (int i = 7; i > 0 ; i-- )
		{
			pa = pa * i ;
		}
		System.out.println("7�� ���丮�� : " + pa) ;


	}
}
