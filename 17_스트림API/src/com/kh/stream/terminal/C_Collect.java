package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.kh.stream.model.vo.Student;

public class C_Collect {
	/*
	 * 수집
	 * 	 - 스트림 요소들은 필터링 또는 매핑한 후 요소들을 수집하는 최종 처리 메소드인 collect()를 제공한다.
	 * 	 - collect() 메소드를 사용하면 필요한 요소만 새로운 컬렉션으로 담아서 리번 받을 수 있다. 
	 */
	
	public void method1() {
		List<Student> students = Arrays.asList(
				new Student(1, "문인수", 29, "남자", 80, 50),
				new Student(2, "홍길동", 20, "남자", 80, 80),	
				new Student(3, "성춘향", 17, "여자", 100, 100),
				new Student(4, "이몽룡", 23, "남자", 60, 70),
				new Student(5, "심청이", 15, "여자", 90, 90)
			);
		
		// 요소로 <Student>를 만들 수 있는 List
		List<Student> list = students.stream()
			 						 .filter(student -> student.getGender().equals("남자"))
									 .collect(Collectors.toList());
//									 .collect(Collectors.toSet());
		
		list.stream().forEach(System.out::println);
		
		System.out.println();
		
		HashSet<Student> set = students.stream()
							 			.filter(student -> student.getGender().equals("여자"))
//							 			.collect(Collectors.toSet());
//										.collect(Collectors.toCollection(() -> new HashSet<>()));
										.collect(Collectors.toCollection(HashSet::new));

		set.stream().forEach(System.out::println);
		
		Map<Integer, String> map = students.stream()
		// student.getIdx()를 key ! student.getName()를 value !
//											.collect(Collectors.toMap(student -> student.getIdx(), student -> student.getName()));
											.collect(Collectors.toMap(Student::getIdx, Student::getName));
		
		System.out.println(map);
		System.out.println();
		Map<Integer, Student> map2 = students.stream()
//											 .collect(Collectors.toMap(student -> student.getIdx(), 
//													   (Student student) -> {
//														   return student;
//											  .collect(Collectors.toMap(student -> student.getIdx(), student -> student));
											  .collect(Collectors.toMap(Student::getIdx, Function.identity()));
		
		System.out.println(map2);
		
		// 참고만 하기 !
		Map<String, List<Student>> map3 = students.stream()	
												  .collect(Collectors.groupingBy(student -> student.getGender()));
		
		System.out.println(map3);
	}
}
