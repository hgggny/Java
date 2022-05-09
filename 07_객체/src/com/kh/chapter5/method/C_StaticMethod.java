package com.kh.chapter5.method;

public class C_StaticMethod {
	private static int num1 = 10; // ∵ private여도 class 내부에서 직접 접근하는 것이기 때문에 가능하다.
	public static int num2 = 10;
	
	// 1. 매개 변수와 반환값이 없는 메소드
	public static void method1() {
		System.out.println(C_StaticMethod.num1 + num2);
		
		C_StaticMethod.num1++; // class 이름으로 접근한다. 
		
//		this.num1; // error ∵ 객체가 있어야 사용이 가능하다. 
	}
	
	// 2. 매개 변수가 없고 반환값이 있는 메소드
	public static int method2() {
//		return C_StaticMethod.num1 + C_StaticMethod.num2;
		return num1 + num2;
		
	}
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드
	public static void method3(int num3) {
		System.out.println(num1 + num2 + num3); // num3는 매개 변수 num1 num2는 위에서 선언한 변수
		
	}
	
	// 4. 매개 변수와 반환값이 있는 메소드
	public static int method4(int ... numbers ) { // ... 는 가변인자 표현
		int sum = 0;
		
		for(int number : numbers) {
			sum +=number; // sum = sum + numbers;
		}

		
		return sum;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}