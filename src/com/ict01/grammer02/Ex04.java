package com.ict01.grammer02;
class Ex04
{
	public static void main(String[] args)
	{
	 // ���ڵ��� ũ�⿡ ���� ���� ����
	 // char < int < long < float < double
	 // (����) (������ ����) ( �Ǽ��� ����)
	 // ����ȯ : �ڵ� ����ȯ�� ���� ����ȯ	
	 // �ڵ�����ȯ(���θ��) : ���� �ڷ����� ū �ڷ����� ����ɶ� �ڵ� ����ȯ�� ��.
 	 // char�� int�� �����Ҽ� �ִ�.
		char c1 = 'a' ;	// a
		System.out.println(c1);
		int s1 = 'a' ;	// 97
		System.out.println(s1);

	 // char c1 ������ �����͵� int s2�� �����
		int s2 = c1 ;	// 97
		System.out.println(s2);

	 // int �� long�� ������ �� �ִ�.
		long s3 = 117L ;
		System.out.println(s3);
		long s4 = 117 ;
		System.out.println(s4);

	 // long�� float �̳� double�� ���� ����
		float s5 = s3 ;
		System.out.println(s5);


	 // ������ ��ȯ : ū �ڷ����� ���� �ڷ������� �����Ҷ� ������ �߻�
	 // ������ �� ��ȯ�ؼ� ������ ���� �ʰ� �Ѵ�.
	 // �׷��� �����͸� �ս��� ���ɼ��� �ִ�.
	 // ������ ��ȯ ���(����) : ��ȣ�� �������� ������ ���� �ڷ����� �����.
	 //  ex) = (���� �ڷ���)(���) ;
		byte k1 = (byte)(256) ;
		System.out.println(k1);

	 // int �� char�� ����
		char k2 = 97 ;	
		System.out.println(k2);

		int k3 = 97 ;	
		char k4 = (char)(k3) ;
		System.out.println(k4);

	 // float �� double�� int �� ����
		int k5 = (int)(87.64) ;
		System.out.println(k5);





	}
}