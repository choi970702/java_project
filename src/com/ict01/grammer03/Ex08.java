package com.ict01.grammer03;
import java.util.Scanner ;
class Ex08
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in) ;
	 // ���ڸ� �޾Ƽ� Ȧ��, ¦���� ��������
		System.out.print("������ ���� : ") ;
		int num = scan.nextInt() ;
		int a = (num % 2) == 0 ? 0 : 1 ;
		String b = a == 0 ? "¦�� �Դϴ�." : "Ȧ�� �Դϴ�." ;
		System.out.println(b) ;


	 // ����, ����, ������ �޾Ƽ� 
	 // ������ ����� 60�̻��̰�, ������ ������ 40�̻��϶� �հ�, �ƴϸ� ���հ�
		System.out.print("���� ���� : ") ;
		int kor = scan.nextInt() ;
		System.out.print("���� ���� : ") ;
		int eng = scan.nextInt() ;
		System.out.print("���� ���� : ") ;
		int math = scan.nextInt() ;
		int c = (math + kor + eng) / 3 ;
		String res = (c >= 60 && math >= 40 && kor >=40 &&
		eng >= 40) ? "�հ�" : "���հ�" ;
		System.out.println(res) ;

	 // �˹ٽð��� �Է� �޾Ƽ� 
	 // 8 �ð� ������ �ð��� 8720�̰�
	 // 8�ð��� �ʰ��� �ð���ŭ�� 1.5��
	 // ���� �ݾ��� �Ի�����
		int d = 8720 ;
		System.out.print("�˹� �ð� : ") ;
		int t = scan.nextInt() ;
		int money = t >=8 ? (int)((t - 8) * 1.5 * d) + 8 * d : t * d ;
		System.out.println(money + "��");


	}

}