package com.ict01.grammer02;
class Ex08
{
	public static void main(String[] args)
	{
	 // �Ƹ޸�ī�밡 2500�� �̴�. ģ���� ���̼� 10000���� ���� �ֹ��ߴ�. 
	 // �ܵ��� ���ΰ�?(�ΰ��� 10%�� �߰��ȴ�.)
	 // Ŀ�ǰ��� a , �ΰ����� b, ���ݾ��� c, �Ž������� d
		int a = 2500 * 2 ;
		int b = a / 10 ;
		int c = 10000 ;
		int d = c - (a + b);
		System.out.println(d + "��");

	 // �Է����� 
		String coff = "�Ƹ޸�����" ;
		int dan = 2500 ;
		int su = 2 ;
		int input = 10000 ;

		int total = dan * su ;
		int vat = (int)(total * 0.1) ;

		int output = input - (total + vat) ;
		System.out.println("�ܵ� : " + output) ;
	 // �ΰ��� ���ϴ� ����� Ŀ�ǰ� * 1.1
	 // �Ǵ� Ŀ�ǰ� * 0.1 + Ŀ�ǰ�

	}

}