package com.ict01.grammer03;
class Ex09
{
	public static void main(String[] args)
	{
	 // �ܼ� if�� : ���ǽ��� ���϶��� ������.
	 // 	     �����϶��� if�� ����
	 // ���� : if (���ǽ�){
	 // ���ǽ��� ���϶� �����ҹ��� ;
	 // ���ǽ��� ���϶� �����ҹ��� ;
	 // }
	 // ��, ������ ������ �����̸� {} (���) ���� ����
		int k1 = 90 ;
		String res = "���հ�" ;
		if (k1 >= 80)
		{
		res = "�հ�" ;
		}	
		System.out.println("����� : " + res) ;

	 // �� �� �� ū���� ����Ͻÿ�
		int k2 = 15 ;
		int k3 = 10 ;
		int res2 = k3;
		if(k2 > k3)
		{
		res2 = k2 ;
		}

		System.out.println("�� �� �� ū���� " + res2 + "�̴�.") ;



	}

}