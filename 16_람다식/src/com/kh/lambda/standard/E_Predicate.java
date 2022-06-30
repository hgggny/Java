package com.kh.lambda.standard;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.kh.lambda.standard.model.vo.Student;

public class E_Predicate {
	/*
	 * Predicate
	 * 	 - Predicate 함수적 인터페이스는 매개변수와 boolean 값을 리턴하는 testXXX() 추상 메소드를 가지고 있다.
	 * 	 - testXXX() 추상 메소드는 매개값을 조사해서 true/false를 리턴하는 역할을 한다. 
	 */
		
	public void method1( ) {
		Student student1 = new Student("문인수", 20, "남자", 80, 70);
		Student student2 = new Student("성춘향", 20, "여자", 100, 100);
		
//		Predicate<Student> predicate = (Student s) -> {
//			return s.getGender().equals("여자");
		Predicate<Student> predicate = (s) -> s.getGender().equals("여자");
		
		System.out.println("문인수는 여자입니까? : " + predicate.test(student1)); // false
		System.out.println("성춘향는 여자입니까? : " + predicate.test(student2)); // true
		
		BiPredicate<Student, Student> biPredicate = (s1, s2) -> {
//			return s1.getGender().equals(s2.getGender());
			return s1.getGender().equals("여자") && s2.getGender().equals("여자");
		};
		
		System.out.println(biPredicate.test(student1, student2)); // false
		
//		IntPredicate intPredicate = (int a) -> {
//			return 100 < a;
//		};
		IntPredicate intPredicate = (value) ->  100 < value;
		
		System.out.println(intPredicate.test(100)); // false
		System.out.println(intPredicate.test(101)); // true
	}
}
