package com.ict01.grammer03;
class Ex05
{
	public static void main(String[] args)
	{
	 // int k1�� 60 �̻��̸� �հ� �ƴϸ� ���հ�
		int k1 = 58 ;
		String res1 = (k1 >= 60) ? ("�հ�") : ("���հ�") ;
		System.out.println("��� : " + res1) ;

	 // int k2�� Ȧ������ ¦�� ���� �Ǻ�����
		int k2 = 28;
		int a = k2 % 2 ;	// a�� k2�� 2�� ���� ������
		String res2 = (a == 0) ? ("¦��") : ("Ȧ��") ;
		System.out.println("��� : " + res2) ;

	 // char k3�� �빮������ �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'A';
		String res3 = ((k3 >= 65) && (k3 <= 90)) ? ("�빮��") : ("�ҹ���") ;
		System.out.println("��� : " + res3) ;
		
	 // �ٹ��ð��� 8�ð������� �ð��� 8720�� �̰�
	 // 8�ð��� �ʰ��� �ð���ŭ�� 1.5�� �̴�.
	 // ���� �ٹ��ð��� 10�ð��̴�.
	 // �󸶸� �޾ƾ� �ϴ°�?
		int k4 = 10 ;
		int won = 8720 ;
		int res4 = (k4 >= 8) ? ((won * 8) + (int)(((k4 - 8) * won * 1.5))) : (k4 * won) ;
		System.out.println("��� : " + res4 + "��") ;


	}

}