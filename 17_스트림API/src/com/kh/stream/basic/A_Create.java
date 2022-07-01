package com.kh.stream.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.kh.stream.model.vo.Student;

public class A_Create {
	/*
	 * 스트림의 종류
	 * 	 - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다.
	 * 	 - Stream, IntStream, LongStream, DoubleStream이 있다. 
	 * 
	 * 스트림 생성
	 *   - 숫자 범위로 스트림을 생성하는 방법
	 *   	- IntStream의 range(), rangeClosed() 메소드를 이용해서 생성한다.
	 *   - 배열로부터 스트림을 생성하는 방법
	 *   	- Arrays.stream(배열) 메소드로 스트림을 생성한다.
	 *   	- 각 스트림(Stream, IntStream, ...)의 of(배열)
	 *   - 컬렉션으로부터 스트림을 생성하는 방법
	 *   	- 컬렉션의 stream() 메소드를 이용해서 생성한다. (java.util.Collection.stream())
	 */
	
	// 숫자 범위로 스트림을 생성하는 방법
	public void method1() {
		// 첫 번째 매개값 ~ 두 번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다. 
		IntStream stream = IntStream.range(1, 10);
		
		// peek - 합계 나오기 전에 숫자 나열
		// peek : 중간 처리
		// sum : 최종 처리 (값 형태로 나온다)
//		int sum = stream.peek((int value) -> {System.out.print(value + " ");}).sum();
		int sum = stream.peek(value -> System.out.print(value + " ")).sum();
		
		System.out.println("> Sum : " + sum);
		// 1 2 3 4 5 6 7 8 9 > Sum : 45
		
		// 첫 번째 매개값 ~ 두 번째 매개값까지 값을 요소로 가지는 스트림 객체를 생성한다.
		stream = IntStream.rangeClosed(1, 10);
		sum = stream.peek(value -> System.out.print(value + " ")).sum();
		System.out.println("> Sum : " + sum);
		// 1 2 3 4 5 6 7 8 9 10 > Sum : 55
	}
	
	// 배열로부터 스트림을 생성하는 방법
	public void method2() {
		String[] names = {"문인수", "홍길동", "이몽룡", "성춘향", "문인수"};
		
		// for문을 사용하여 출력
		for (String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력
//		Stream<String> stream = Arrays.stream(names);
//		Stream<String> stream = Stream.of("문인수", "홍길동", "이몽룡", "성춘향", "문인수");
		// <String> 생략 가능
		Stream<String> stream = Stream.<String>of(names);
		// 문인수 홍길동 이몽룡 성춘향 문인수 
	
//		stream.forEach((String name) -> {System.out.println(name + " ");});
//		stream.forEach(name -> System.out.print(name + " "));
		// 문인수 홍길동 이몽룡 성춘향 문인수 
		
		// 중복 제거
		stream.distinct().forEach(name -> System.out.print(name + " "));
		// 문인수 홍길동 이몽룡 성춘향 
	}
	
	// 컬렉션으로부터 스트림을 생성하는 방법
	public void method3() {
		// T...a : 가변인자라는 표시
		List<Student> list = Arrays.asList(
			new Student("문인수", 20, "남자", 80, 50),
			new Student("홍길동", 30, "남자", 80, 80),	
			new Student("성춘향", 20, "여자", 100, 100)
		);
		
		// for문을 사용하여 출력
		// size : list가 가지고 있는 요소의 개수
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력
		// 변수에 담아두고 사용하기
		Stream<Student> stream = list.stream();
		
		// 요소의 개수만큼 공급받고 반복해서 소비한다. (Consumer)
//		stream.forEach((Student student) -> {System.out.println(student);}); 
		
		// 변수에 넣을 경우, 최종 처리 후에 Stream을 다시 사용할 수 없다. 
//		stream.forEach(student -> System.out.println(student));
		
		// 그래서 변수에 넣지않고 list에서 바로 처리하고 여러번 사용이 가능하다.
		list.stream().forEach(System.out::println);
		list.stream().filter(student -> student.getGender().equals("남자")).forEach(System.out::println);
		List<Student> list2 = list.stream().filter(student -> student.getGender().equals("남자")).collect(Collectors.toList());
		System.out.println(list2);
	}
}
