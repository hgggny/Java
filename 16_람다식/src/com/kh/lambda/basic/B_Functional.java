package com.kh.lambda.basic;

import com.kh.lambda.basic.functional.A_FunctionalInterface;
import com.kh.lambda.basic.functional.B_FunctionalInterface;
import com.kh.lambda.basic.functional.C_FunctionalInterface;

public class B_Functional {
	public void method1() {
		// 익명 구현 객체를 넘긴다. 
		// 중괄호 생략 가능
		A_FunctionalInterface fi = () -> {
			System.out.println("매개변수와 반환값이 없는 람다식");
		};
		
		// 익명 구현 객체의 추상 메서드를 호출 
		fi.method1();
		
		// 위 코드 풀어서 설명 !
//		fi = new A_FunctionalInterface() {
//			
//			@Override
//			public void method1() {
//				System.out.println("익명 구현 객체를 사용한 인터페이스 구현");
//			}
//		};
//		
//		fi.method1();
	}
	
	public void method2() {
//		B_FunctionalInterface fi = new B_FunctionalInterface() {
//			
//			@Override
//			public void method(int a) {
//			}
//		};
		
		// 변수명은 달라도 되지만 타입은 같아야 한다. 
		B_FunctionalInterface fi = (int x) -> {
			System.out.println(x * x);
		};
		
		// 매개변수를 넘겨준다. 
		// 객체를 통해서 메소드를 호출해야 한다. 
		fi.method(10);
		
		// 매개변수의 타입 생략 가능
		fi = (a) ->  {
			System.out.println(a * 2);
		};
		
		fi.method(20);
		
		// 소괄호, 중괄호 생략 가능
		fi = a -> System.out.println(a * 3);
		
		fi.method(30);
	}
	
	public void method3() {
//		C_FunctionalInterface fi = new C_FunctionalInterface() {
//			
//			@Override
//			public int method(int a, int b) {
//				return 0;
//			}
//		};
		
		int result = 0;
		C_FunctionalInterface fi = (int x, int y) -> {
			return x + y;
		};
		
		// 반환하는 값이 있으려면 변수가 따로 있어야 한다. 
		result = fi.method(10, 20);
		
		System.out.println(result);
	
		// 매개변수의 타입, return 구문과 중괄호 생략 가능
		fi = (x, y) -> x * y;
		
		System.out.println(fi.method(10, 20));
		
	}
}
