package com.ict06.Thread;

public class Ex01 {

	public static void main(String[] args) 
	{
		// Thread ������
		// - Thread() : �⺻ ������
		// - Thread(Runnable target) : Runnable interface�� ���ڷ� �޾Ƽ� ó��
		// 								�͸� ���� Ŭ������ ����� �� �ִ�.
		// - Thread(Runnable target, String name) : �̶� name�� Thread�̸� ������ �� �ִ�.
		//											Runnable interface�� �޾Ƽ� ���ڷ� �޾Ƽ� ó��
		// - Thread(String name) : �̶� name�� Thread�̸� ������ �� �ִ�.
		
		// �ֿ�޼ҵ�
		// - join() : ���� Thread�� join()�޼ҵ带 ȣ���� Thread�� ������ ���� �����·� ���� �ִٰ�
		//			join()�� ȣ���� Thread�� ������ �ٽ� �����Ѵ�.
		//			��, join()�� ȣ���� Thread�� ������ ���� ���� �� �� ����.
		// - start() : start()�� �����ϸ� run()ȣ���Ѵ�. ���࿡ start()�� ������ start()�� ����.
		// - run() : start()�� ȣ���ؼ� run()�� ����Ǹ� �̶� Thread ó���� �ߴٰ� �Ѵ�.
		// - sleep(long millis) : 1000�� 1�ʸ� �ǹ��ϰ�, ��� �����·� ���� �ִ� ���¸� ����
		// - yield() : ���� ���� Thread �� �켱������ ���� �ٸ� Thread���� ������� �ѱ��.
		// - getName() : Thread �̸� ���ϱ�
		// - setName(String Name) : Thread �̸� ����
		// - currentThread() : ���� ����Ǵ� Thread ��ü�� �����Ѵ�.(static)
		
		// �տ��� ���� ��� ó���� main Thread�� ȥ�ڼ� �� ó���ߴ�. => �̱۽�����
		// �����带 ��ó���ϴ� �ϲ��̶�� ��������.
		// JVM�� main�żҵ带 ȣ���ϸ� ������ main�����尡 ��ó���� �Ѵ�.
		System.out.println(Thread.currentThread().getName());
		
		Ex02 test = new Ex02();
		System.out.println("1 "+Thread.currentThread().getName());
		test.add(5, 8);
		System.out.println("4 "+Thread.currentThread().getName());
		int result = test.sub(8, 5);
		System.out.println("7 "+Thread.currentThread().getName());
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
