package com.ict01.grammer02;
class Ex07
{
	public static void main(String[] args)
	{
	 // �̸��� Ȧ�浿�� ����� ���� : 90, ���� : 80, ���� : 90.�̴�
	 // ������ ����� ���ؼ� �̸�, ����, ����� �������
	 // (��, ����� �Ҽ��� ù°�ڸ����� ���Ѵ�.)
	 //����� a, ����� b, ������ c, ������ sum, ����� s
		String name = "ȫ�浿" ;
		int a = 90 ;
		int b = 80 ;
		int c = 90 ;
		int sum = a + b + c ;
		double d = (double)(sum / 3.0)  ;
		double s =(int)( d * 10) / 10.0;
		System.out.println("�̸� : " + name);
		System.out.println("������ : " + sum);
		System.out.println("����� : " + s);


	}
}