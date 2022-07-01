package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class B_Sorted {
	/*
	 * 정렬
	 *    - 스트림은 요소가 최종 처리 되기 전에 중간 단계에서 요소를 정렬해서 최종 처리 순서를 변경할 수 있다.
	 *    - IntStream, LongStream, DoubleStream은 요소를 오름차순으로 정렬한다. 
	 *    - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현하지 않을 경우 예외가 발생한다. 
	 */
	
	// 요소가 객체일 때
	public void method1 () {
		List<String> names = Arrays.asList("문인수", "홍길동", "이몽룡", "성춘향", "문인수", "성춘향");
		
		// 객체의 Comparable 인터페이스 구현 내용에 따라서 정렬
		names.stream()
			 .distinct()
//			 .sorted()
			 .sorted(Comparator.naturalOrder())
			 .forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		System.out.println();
		
		// 객체의 Comparable 인터페이스 구현 내용에 반대로 정렬
		names.stream()
			 .distinct()
//			 .sorted((name1, name2) -> {return name2.compareTo(name1);})
			 .sorted(Comparator.reverseOrder())
			 .forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		System.out.println();
		
		List<Student> students = Arrays.asList(
				new Student("문인수", 18, "남자", 80, 50),
				new Student("홍길동", 30, "남자", 80, 80),	
				new Student("성춘향", 20, "여자", 100, 100)
			);
		
		students.stream()
//				.sorted((o1, o2) -> o1.getAge() - o2.getAge())
				// Comparable 인터페이스를 구현하지 않았기 때문에 동작 안한다.
				// Student 클래스에서 구현 후 동작된다. 
//				.sorted()
//				.sorted(Comparator.naturalOrder())
				// 반대로 할 경우
				.sorted(Comparator.reverseOrder())
		 		.forEach(student -> System.out.println(student));
	}
	
	// 요소가 기본 자료형일 때
	public void method2() {
//		int[] arr = {1, 2, 3, 4, 5}; // 문제 없음
//		int[] arr;
//		arr = {1, 2, 3, 4, 5}; // 선언 후 배열 할 때 이렇게 하면 에러
//		arr = new int[] {1, 2, 3, 4, 5};
		
		// 기본 자료형의 요소를 가지는 스트림은 오름차순으로 정렬한다. 
		Arrays.stream(new int[] {3, 5, 1, 4, 2})
			  .sorted()
			  .forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		
		// 기본 자료형을 내림차순으로 정렬하는 방법
		Arrays.stream(new int[] {3, 5, 1, 4, 2})
			  .boxed() // 기본 자료형을 객체로 boxing
			  .sorted(Comparator.reverseOrder())
			  .forEach(value -> System.out.print(value + " "));

	}

}
