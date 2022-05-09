package com.kh.chapter5;

import com.kh.chapter4.constructor.User;
import com.kh.chapter5.method.A_Method;
import com.kh.chapter5.method.C_StaticMethod;

public class Application {

	public static void main(String[] args) {
		A_Method method = new A_Method(); // 객체 생성
		
		// 1. 매개 변수가 없고 반환값도 없는 메소드 호출
		method.method1();
		
		
		
		// 2. 매개 변수가 없고 반환값이 있는 메소드
		/*
		 * method2가 호출되고 return의 주소 값을 문자열 참조 변수인 str에 담아준다.
		 * 문자열 객체, 배열은 주소값이 넘어간다. 
		 * 문자열, 객체, 배열 외는 그 값 자체가 넘어간다.
		 */
		
		String str = method.method2();
		System.out.println(str);
		
		
		
		// 3. 매개 변수가 있고 반환값이 없는 메소드
		method.method3(10, 20); // 매개 변수로 지정된 변수에 값을 타입과 순서에 맞춰 지정해준다. 
		
		
		
		// 4. 매개 변수가 있고 반환값도 있는 메소드
		System.out.println(method.method4(20, 30)); 
		
		
		
		// 5. 매개 변수로 User 객체를 전달받는 메소드
		User user = new User(); // 기본 생성자로 객체 생성, user에는 주소값이 들어있다. 
		
		System.out.println(user.information()); // 0, 0, 0, 0 ->  method5의 매개변수를 넣기 전
		method.method5(user); // user의 주소값을 매개변수로 넘겨 받는다. 
		System.out.println(user.information()); // return 받지 않고 
		
		
		
		// 6. 매개 변수로 가변 인자를 전달받는 메소드
		int[] arr = {1, 2, 3, 4};
		
		method.method6(arr);
//		method.method6({1, 2, 3, 4, 5}); // error -> 문법적인 에러, int[] numbers; numbers = {1, 2, 3, 4, 5}; 로 된다.
//		method.method6(new int[]{1, 2, 3, 4, 5}; // OK
//		method.method6();
		
//		method.method7(1, 2, 3, 4, 5);
//		method.method7(1, 2, 3);
//		method.method7();
	
		
		method.method7("홍길동");
		method.method7("홍길동", 1, 2, (1 + 2));
		 
		
		
		// 정적 메소드(Static Method)
		// 1. 매개 변수와 반환값이 없는 메소드 호출
		C_StaticMethod.method1();// class로 직접 접근이 가능하다. 
		
		// 정적 멤버는 객체 참조 변수로도 접근이 가능하지만 정적 멤버는 클래스 이름으로 접근하는 것이 좋다.
		// new C_StaticMethod.method();
		
		// 2. 매개 변수가 없고 반환값이 있는 메소드 호출
		int result = 0; // 변수 선언
		
		result = C_StaticMethod.method2(); // 단순하게 정수값 두개 더해서 리턴하기 때문에 result에는 값이 들어간다. 
		
		System.out.println(result);
		
		// 3. 매개 변수가 있고 반환값이 없는 메소드
		C_StaticMethod.method3(30);
		
		// 4. 매개 변수와 반환값이 있는 메소드
		result = C_StaticMethod.method4();
		
		System.out.println(result);
		System.out.println(C_StaticMethod.method4(8,9));
		System.out.println(C_StaticMethod.method4(8,9, 10, 20, 30));
		
	}

	
}
