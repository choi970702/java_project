package com.ict01.grammer03;
class Ex10
{
	public static void main(String[] args)
	{
	 // if ~ else ~ : ���ǽ��� ���϶��� �����϶� ���� ������ ó����.
	 // ���� : if (���ǽ�) 
	 // {
	 // ���϶� �����ϴ� ���� ;
	 // } 
	 // else { 
	 // ���ǽ��� �����϶� �����ϴ� ���� ;
	 // } (��, ������ ������ �����̸� {} ��������.)

	 // int k1�� 60 �̻��̸� �հ� �ƴϸ� ���հ�
		int k1 = 50 ;
		String res = "�ʱⰪ" ;
		if (k1 >= 60)
			{
			res = "�հ�" ;
			}
		else
			{
			res = "���հ�" ;
			}
		System.out.println("��� : " + res) ;

	 // int k2�� Ȧ������ ¦�� ���� �Ǻ�����
		int k2 = 40 ;
		int a = k2 % 2 ;
		String res2 = "�ʱⰪ" ;
		if(a == 0)
			{
			res2 = "¦��" ;
			}
		else
			{
			res2 = "Ȧ��" ;
			}
		System.out.println("k2�� " + res2) ;

	 // char k3�� �빮������ �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'a' ;
		String res3 = "�ʱⰪ" ;
		if (k3 >= 'A' && k3 <= 'Z')
			{
			res3 = "�빮��" ;
			}
		else
			{
			res3 = "�빮�� �ƴ�" ;
			}
		System.out.println("k3�� " + res3) ;

	 // �ٹ��ð��� 8�ð������� �ð��� 8720�� �̰�
	 // 8�ð��� �ʰ��� �ð���ŭ�� 1.5�� �̴�.
	 // ���� �ٹ��ð��� 10�ð��̴�.
	 // �󸶸� �޾ƾ� �ϴ°�?
		int t = 10 ;
		int m = 8720 ;
		int res4 = 0;
		if(t >= 8)
			{
			res4 =(int)((t - 8) * m * 1.5) + m * 8 ;
			}
		else
			{
			res4 = t * m ;
			}
		System.out.println("�������� " + res4 + "��") ;

	}

}