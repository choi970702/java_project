package com.ict03.class05;

// interface ��ӹޱ�
// 1. �Ϲ�Ŭ������ interface�� ��� ������
//		=> ������ �������̵� �ؾ���.
// 2. �߻�Ŭ������ interface�� ����ϸ�
//      => �������̵� �ʿ����.
// 3. interface�� interface�� ����ϸ�
//	    => �������̵� �ʿ����.
// 4. ���� ����� �����ϴ�.
// interface �ڽ� extends interface�θ�1, interface�θ�2, interface�θ�3 ;
// 5. �Ϲ� Ŭ������ �θ�Ŭ������ �θ� interface�� ���� ����ϸ� 
// class Ŭ�����̸� extends �θ�Ŭ�����̸� implements interface�̸�
// 6. interface => interface , Ŭ���� => Ŭ���� : extends ����� ���
//	Ŭ���� => interface : implements ����� ��� ,    interface => Ŭ���� : ���Ұ�

// �Ϲ�Ŭ������ interface�� ��� : �ݵ�� �������̵� �ؾߵ�
class Ex03 implements Ex01
{

	@Override
	public void like() 
	{
		
	}

	@Override
	public void sound() 
	{
		
	}	
	
	
}

// �߻�Ŭ������ interface ��� : �������̵� �ʿ����.
abstract class Ex04 implements Ex01
{
	
}

// �������̽��� �������̽��� ��� : �������̵� �ʿ����.
interface Ex05 extends Ex01
{
	
}








