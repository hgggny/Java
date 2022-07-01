package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.kh.stream.model.vo.Student;

import lombok.EqualsAndHashCode;

public class A_Filtering {
	/*
	 * 필터링
	 * 	 - 중간 처리 기능으로 요소를 걸러내는 역할을 한다.
	 * 	 	- distinct() : 중복을 제거하는 메소드이다. equals() 메소드가 true를 리턴하면 동일한 객체로 판단한다.
	 * 		- filter(Predicate) : 매개 값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다. 
	 */
	
	// 중복 제거 (distinct())
	public void method1() {
		List<String> names = Arrays.asList("문인수", "홍길동", "이몽룡", "성춘향", "문인수", "성춘향");

		Stream<String> stream = names.stream();
		
//		stream.forEach((String name) -> {System.out.print(name + " ");});
		stream.forEach(name -> System.out.print(name + " ")); // 최종 처리 완료
		
		// 이미 최종 처리까지 호출된 스트림은 다시 사용할 수 없다. (컬렉션으로부터 다시 스트림을 얻어와야 한다.)
//		stream.distinct().forEach(name -> System.out.print(name + " "));

		System.out.println();
		
		// equals()가 재정의 되어있지 않은 경우, 꼭 해야 한다. (현재 롬복 사용으로 재정의 되어있다. )
		names.stream().distinct().forEach(name -> System.out.print(name + " "));
		names.stream().distinct().forEach(System.out::println);
		
		System.out.println();
		
		// 원래 변수는 상단에 표시해야 하지만 연습으로 아래 놓기
		// equals() 재정의 없는 test
		List<Student> Students = Arrays.asList(
				new Student("문인수", 20, "남자", 80, 50),
				new Student("문인수", 20, "남자", 80, 50),
				new Student("문인수", 20, "남자", 80, 50),
				new Student("홍길동", 30, "남자", 80, 80),	
				new Student("성춘향", 20, "여자", 100, 100)
			);
		
		// Student 클래스에서 @EqualsAndHashCode 구현하면 중복 제거 가능
		Students.stream().distinct().forEach(student -> System.out.println(student)); // 현재 중복 제거 안됨
		System.out.println();
		
		Students.stream().forEach(student -> System.out.println(student));
	}

	
	// 필터 메소드
	public void method2() {
		List<String> names = Arrays.asList("문인수", "홍길동", "이몽룡", "성춘향", "문인수", "성춘향", "변사또", "이순신");
		
		names.stream()
	//		 .filter((String name) -> {return name.startsWith("이");})
			 .filter(name -> name.startsWith("이"))
			 .forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		names.stream()
	//		 .distinct() // 최종 처리 메서드 전에만 두면 된다. (위치 상관없음)
			 .filter(name -> name.startsWith("성"))
			 .distinct()
			 .forEach(name -> System.out.print(name + " "));
		
		
		List<Student> Students = Arrays.asList(
				new Student("문인수", 20, "남자", 80, 50),
				new Student("문인수", 20, "남자", 80, 50),
				new Student("문인수", 20, "남자", 80, 50),
				new Student("홍길동", 30, "남자", 80, 80),	
				new Student("성춘향", 20, "여자", 100, 100)
			);
	
		// 성별이 여자인 요소만 출력
		Students.stream()
//				.filter((Student student) -> {
//						return student.getGender().equals("여자");
//				})
//				.forEach((Student student) -> {
//					System.out.println(student);
//				});
				.filter(student -> student.getGender().equals("여자"))
				.forEach(student -> System.out.println(student));
		
		// 수학 점수, 영어 점수가 둘 다 60점 이상인 요소만 출력
//		Students.stream()
//				.filter((Student student) -> {
//					return student.getMath() >= 60 && student.getEnglish() >= 60;
//				})
//				.forEach((Student student) -> {
//					System.out.println(student);
//				});
		Students.stream()
		.filter(student -> student.getMath() >= 60 && student.getEnglish() >= 60)
		.forEach(System.out::println);
		}
}