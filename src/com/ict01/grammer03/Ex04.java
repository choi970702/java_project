package com.ict01.grammer03;
class Ex04
{
	public static void main(String[] args)
	{
	 // ���� ������ (���� ������ = ���ǹ��� if ~ else ���� ����.)
	 // ���� : ���庯�� = ���ǽ� ? �� �ϋ� ������ ���� : �����϶� ������ ���� ;
	 // 	 ���ǽĿ��� boolean, ������, �񱳿��� �� ��.
	 // ���ǻ��� : ���庯��, ���϶� ���� ���, �����϶� ������ 
	 //	     ��� �ڷ����� ���ƾ���
	 // 	    (���� ������ �� ū �ڷ����̸� ���� ����.)
	 // byte < short < char < int < long < float < double 
		int result = true ? 14 : 10 ;
		System.out.println("��� : " + result) ;	//14

		result = false ? 14 : 10 ;
		System.out.println("��� : " + result) ;	//10

		int result2 = false ? 14 : 'C' ;
		System.out.println("��� : " + result2) ;	//67
		System.out.println("��� : " + (char)(result2)) ; //67 �� C�� ǥ���Ϸ���

	 // �־��� sum�� 80 �̻��̸� "�հ�", �ƴϸ� "���հ�"
		int sum = 81 ;
		String result3 = (sum >= 80) ? "�հ�" : "���հ�" ;
		System.out.println("��� : " + result3) ;

	 // ��� ������ 90 �̻��̸� 'A' �ƴϸ� 'B'
		double avg = 87.0 ;
		double result4 = (avg >= 90) ? 'A' : 'B' ;
		System.out.println("��� : " + result4) ;
		System.out.println("��� : " + (char)(result4)) ;


	}

}