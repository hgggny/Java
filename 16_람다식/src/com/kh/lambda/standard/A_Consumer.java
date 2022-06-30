package com.kh.lambda.standard;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class A_Consumer {

	/*
	 * Consumer
	 * 	- Consumer 함수적 인터페이스는 리턴값이 없는 accept() 추상 메서드를 가지고 있다.
	 * 	- accept() 추상 메소드는 매개값을 소비하는 역할을 한다. 
	 */

	public void method1() {
//		Consumer<String> consumer = new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//			}
//		};
		
		// 매개값 1개, 반환값 X
		Consumer<String> consumer = (String str) -> {
			System.out.println(str);
		};
		
		consumer.accept("Consumer : 한 개의 매개값(제네릭으로 지정된 타입)을 받아서 소비한다. ");
		
		// 매개값 2개, 반환값 X
		// 데이터 타입과 중괄호 생략 가능
		BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + str2);
		
		biConsumer.accept("Biconsumer : ", "두 개의 매개값을 받아서 소비한다.");
		
		// 가독성을 위해 소괄호를 붙여도 된다. 
//		DoubleConsumer dConsumer = (value) -> System.out.println("DoubleConsumer : 하나의 double 타입의 값을 받아서 소비한다. \tvalue : " + value;
		// 매개값으로 받는 값만 출력 ! 
		DoubleConsumer dConsumer = System.out::println;
		
		dConsumer.accept(3.14);
		
		ObjIntConsumer<String> objIntConsumer = ((String str, int value) -> {
			System.out.println("ObjIntConsumer : 두 개의 매개값(제네릭으로 지정된 타입의 객체, int 타입의 값)을 받아서 소비한다");
			System.out.println(str + value);
		});
		
//		ObjIntConsumer.accept(); // 타입 확인 후 위에 람다식을 작성한다. 
		objIntConsumer.accept("Java", 11);
	}
}
