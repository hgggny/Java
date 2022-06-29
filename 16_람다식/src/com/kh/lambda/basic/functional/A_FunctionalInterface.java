package com.kh.lambda.basic.functional;

// 추상메서드가 하나라는 의미의 어노테이션을 붙여준다. 
@FunctionalInterface
public interface A_FunctionalInterface {
	// 인터페이스에서는 abstract 생략 가능 
	// 매개변수와 반환값이 없는 추상 메소드
	public void method1();
	
	// 추상 메서드가 두 개일 경우 [B_Functional] 에러 발생
//	public void otherMethod(); 
}
