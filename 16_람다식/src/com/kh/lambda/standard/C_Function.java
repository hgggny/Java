package com.kh.lambda.standard;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongToDoubleFunction;
import java.util.function.ToIntFunction;

import com.kh.lambda.standard.model.vo.Student;

public class C_Function {
	/*
	 * Function
	 * 	 - Function 함수적 인터페이스는 매개값과 반환값이 있는 applyXXX() 추상 메소드를 가지고 있다.
	 * 	 - applyXXX() 추상 메소드는 주로 매개값을 반환값으로 매핑(타입 변환)하는 역할을 한다. 
	 */

	// Student 클래스와 연결
	public void method1( ) {
		Student student = new Student("문인수", 20, "남자", 80, 70);
//		Student student2 = new Student("문인수", 20, "남자", 80, 70);
		
//		System.out.println(student.hashCode());
//		System.out.println(student2.hashCode());
//		System.out.println(student.equals(student2)); // true
		
		// <객체 타입, 반환 타입>
//		Function<Student, String> function = (Student s) -> {
//			return s.getName();
//		};
		Function<Student, String> function = s -> s.getName();
		
//		function.apply(student); // 매개변수 타입 확인
		System.out.println("넌 이름이 뭐니? : " + function.apply(student));
		
		// Binary : 매개값이 두개
		// <객체 타입1, 객체 타입2, 반환 타입>
		// 제네릭스 안에는 객체만 존재할 수 있다. 
//		BiFunction<String, Integer, Student> biFunction = (String name, Integer age) -> {
//			return new Student(name, age);
//		};
//		BiFunction<String, Integer, Student> biFunction = (name,age) -> new Student(name, age);
		BiFunction<String, Integer, Student> biFunction = Student::new; // 두 개의 매개값을 받는 생성자가 없으면 오류
		
		// 35 -> 오토박싱 됨.
		System.out.println(biFunction.apply("홍길동", 35));
		
		System.out.print("[수학 점수] : ");
		// 동작을 람다식으로 해준다. 
//		printValue((s) -> {return s.getMath();}, student);
		printValue((s) -> s.getMath(), student);
		
		System.out.println("[영어 점수] : ");
		printValue((s) -> s.getEnglish(), student);
		
		// 평균 점수를 구해보기 ((영어 + 수학) / 2)
		// 코드 한번 확인하기
		System.out.print("[평균] : ");
		printValue((s) -> (s.getEnglish() + s.getMath()) / 2, student); // 75
		printValue((s) -> s.getAvg(), student); // 75
	}

	/* 
	 * double 타입의 변수를 받아서 <R>(제네릭스에 지정된 타입)으로 반환한다. 
	 * DoubleFunction<R>
	 * return 값의 타입(int)을 고정하고 객체 타입(제네릭스 타입)의 값로 리턴해준다. 
	 * ToIntFunction<T>
	 * long 타입의 데이터를 값을 받아서 double 타입으로 리턴한다. 
	 * LongToDoubleFunction
	*/
	public void printValue(ToIntFunction<Student> function, Student student) {
		System.out.println(function.applyAsInt(student));
	}
}
