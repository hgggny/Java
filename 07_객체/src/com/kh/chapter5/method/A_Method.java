package com.kh.chapter5.method;

import java.util.Arrays;

import com.kh.chapter4.constructor.User;

public class A_Method {

	// 1. 매개 변수가 없고 반환값도 없는 메소드
	public void method1() { // void : 반환값이 없다. () : 매개변수가 없다.
		System.out.println("매개 변수와 반환값이 둘 다 없는 메소드입니다.");
		
//		return문을 사용할 때 return 문 뒤에 반환값이 오면 에러가 발생한다. 
//		return "Hello";
		return; // 반환값 없이 사용은 가능하다. (생략도 가능 -> JVM에서 자동으로 넣어준다.)
		
//		System.out.println("리턴 이후 실행"); // error [Unreachable code]
	}
	
	
	
	
	// 2. 매개 변수가 없고 반환값이 있는 메소드
	public String method2() { // void가 없으면 error가 생기므로 String의 return값이 있어야 한다.
		String str = "매개 변수가 없지만 반환값이 있는 메소드입니다.";
		
		
		return str; // 문자열의 참조값(주소)을 주고 받는다. 
		
//		return "매개 변수가 없지만 반환값이 있는 메소드입니다."; // 한번에 표시도 가능
	}
	
	
	
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개 변수가 있고 반환값이 없는 메소드");
		System.out.println("입력받은 매개 변수 num1 + num2 = " + (num1 + num2));
	}
	
	
	
	
	// 4. 매개 변수가 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		
		return num1 * num2;
	}
	
	
	
	
	// 5. 매개 변수로 User 객체를 전달받는 메소드
	public void method5(User user) { // user의 주소값을 받아서 이름과 나이를 setter하고 있다. 
		user.setName("박현진");
		user.setAge(29);
	}
	
	
	
	
	// 6. 매개 변수로 가변 인자를 전달받는 메소드
	// 기존에 배열을 사용해서 가변 인자를 받는 방법
	public void method6(int[] numbers) {
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
	
	// 가변 인자를 처리하는 방법 (자바 1.5부터 지원)
	// 가변 인자는 매개 변수가 여러개 있을 때 항상 매개 변수 마지막에 있어야 한다. 
	// 가변 인자는 사용 시 값을 주지 않아도 호출이 되기 때문에 인자에서 예외를 처리하는 코드가 필요하다.
//	public void method7(int ...numbers, String name) { // error -> 가변 인자는 마지막에!
//	public void method7(int ...numbers) { // 정수형 배열
	public void method7(String name, int ...numbers) { // OK
		System.out.println(name);
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
}
