package com.ict06.Thread;

public class Ex01 {

	public static void main(String[] args) 
	{
		// Thread 생성자
		// - Thread() : 기본 생성자
		// - Thread(Runnable target) : Runnable interface를 인자로 받아서 처리
		// 								익명 내부 클래스를 사용할 수 있다.
		// - Thread(Runnable target, String name) : 이때 name은 Thread이름 지정할 수 있다.
		//											Runnable interface를 받아서 인자로 받아서 처리
		// - Thread(String name) : 이때 name은 Thread이름 지정할 수 있다.
		
		// 주요메소드
		// - join() : 현재 Thread는 join()메소드를 호출한 Thread가 끝날때 까지 대기상태로 빠져 있다가
		//			join()를 호출한 Thread가 끝나야 다시 실행한다.
		//			즉, join()를 호출한 Thread가 끝날때 까지 실행 할 수 없다.
		// - start() : start()를 실행하면 run()호출한다. 만약에 start()가 있으면 start()로 간다.
		// - run() : start()가 호출해서 run()가 실행되면 이때 Thread 처리를 했다고 한다.
		// - sleep(long millis) : 1000이 1초를 의미하고, 잠시 대기상태로 빠져 있는 상태를 말함
		// - yield() : 수핼 중인 Thread 중 우선순위가 같은 다른 Thread에게 제어권을 넘긴다.
		// - getName() : Thread 이름 구하기
		// - setName(String Name) : Thread 이름 설정
		// - currentThread() : 현재 수행되는 Thread 객체를 리턴한다.(static)
		
		// 앞에서 만든 모든 처리는 main Thread가 혼자서 다 처리했다. => 싱글스레드
		// 스레드를 일처리하는 일꾼이라고 생각하자.
		// JVM이 main매소드를 호출하면 무조건 main스레드가 일처리를 한다.
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
