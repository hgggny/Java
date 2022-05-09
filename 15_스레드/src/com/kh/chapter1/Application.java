package com.kh.chapter1;

import com.kh.chapter1.thread.Thread1;
import com.kh.chapter1.thread.Thread2;

public class Application {

	public static void main(String[] args) {
		System.out.println("메인 스레드 실행");
		
		Thread th1 = new Thread1();
		
		th1.setPriority(1);
		th1.setPriority(Thread.MAX_PRIORITY); // 우선순위 방식 (Priority)
		
		// 두 개 출력값 비교하기
//		th1.run(); // Thread1 클래스에 run()이 수행되고 그 다음에 메인으로 돌아와서 나머지 것을 수행한다. 
		th1.start(); // 작업 스레드가 모두 종료되야 프로그램이 종료된다. 
		
		
		Thread th2 = new Thread(new Thread2());
		th2.setPriority(Thread.MIN_PRIORITY); // 우선순위 방식 (Priority)
		
		th2.start();
		
		
		// 익명 구현 객체 사용하는 방법
		Thread th3 = new Thread(new Runnable() { 
			
			@Override
			public void run() {
				// 작업하고자 하는 코드를 작성
				
				for (int i = 0; i <= 1000; i++) {
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
				}
			}
		});
		
		th3.start();
				
		// 람다식을 사용하는 방법
		Thread th4 = new Thread(() -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}
		});
		
		th4.start();
		
		try {
			th1.join(); // 모든 thread가 종료되야 종료된다. 
			th2.join();
			th3.join();
			th4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료");

	}

}
