package com.ict01.grammer03;
import java.util.Scanner ;
class Ex07
{
	public static void main(String[] args)
	{
	 // Scanner Ŭ���� �˾ƺ���
	 // Scanner�� �Ҽ��� java.util.Scanner�̴�.
	 // java.lang �� �Ҽӵ� Ŭ������ ������� ��������� 
	 // �̿ܿ� Ŭ������ �Ҽ��� ǥ���ؾ� �ȴ�.(import)
	 // Ŭ���� �ȿ��� :  Constructor(������), Method(�޼���), Field(�ʵ�)
	 // Method => ����, ���, �ϴ� ��

	 // next�ڷ���() => �ش��ڷ������� ������.
	 // ex) nextint() => int������ ���� 

	 // Ű���忡 �Էµ� ������ scan �� ����ȴ�.
		Scanner scan = new Scanner(System.in) ;
		System.out.print("����� �̸� : ") ;

	 // ����� ������ ��������(������ �� ������ String ���� ������.)
		String name = scan.next() ;

	 // ����� ������ ��������(������ �� ������ int ���� ������.)
		System.out.print("���� ���� : ") ;
		int kor = scan.nextInt() ;

		System.out.print("���� ���� : ") ;
		int eng = scan.nextInt() ;

		System.out.print("���� ���� : ") ;
		int math = scan.nextInt() ;

		int sum = kor + eng + math ;
		System.out.println("���� : " + sum) ;

	 // ���� ������ double ������ 
		System.out.print("����� Ű : ") ;
		double ki = scan.nextDouble();
		System.out.println(ki) ;

	 // ���� ������ boolean ������ 
		System.out.print("����� ������ �����Դϱ�?(true/false)") ;
		boolean gender = scan.nextBoolean() ;
		String str = gender ? "�����Դϴ�." : "�����Դϴ�," ;
		System.out.println(str) ;


	}

}