package com.kh.lambda.basic;

public class A_Lambda {
	public void method1( ) {
		Thread thread;
		
		// Runnable 인터페이스 : 추상메서드 O -> 객체를 만들 수 없다. -> new 연산자로 직접 객체를 만들어야 한다. (익명 구현 객체)
		// run : 추상메서드
		thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 반환값 X 매개변수 X
				System.out.println("익명 구현 객체를 이용한 Thread 생성");
			}
		});
		
//		thread.run();
		thread.start();
		
		// run 메소드를 구현해서 람다식으로 만들기
		thread = new Thread(() -> {
			// 매개변수로는 Runnable, run 메소드를 구현한 익명 구현 객체를 만들어져서 넘어간다. 
			System.out.println("람다식을 사용한 Thread 생성");
		});
		
		thread.start();
		
		// Runnable로 구현한 객체만 대입 가능 
		// 익명 구현 객체가 만들어져서 대입이 되는 것 !
		// 실행문이 하나기 때문에 중괄호와 세미콜론 생략 가능
		Runnable runnable = () -> System.out.println("람다식을 사용한 Thread 생성 2");
		
		thread = new Thread(runnable);
		
		thread.start();	
	}
}
