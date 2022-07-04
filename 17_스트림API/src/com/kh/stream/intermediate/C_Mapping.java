package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class C_Mapping {
	/*
	 * 매핑
	 * 	 - 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 말한다.
	 * 		- mapXXX() : 요소를 대체하는 요소로 구성된 새로운 스트림을 생성한다. 
	 * 		- flatMapXXX() : 하나의 요소를 복수의 요소들로 구성된 새로운 스트림을 생성한다. 
	 * 		- asDoubleStream() : IntStream을 DoubleStream으로 변환해서 리턴한다. 
	 * 		- asLongStream() : IntStream을 LongStream으로 변환해서 리턴한다. 
	 * 		- boxed() : int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 스트림을 생성하고 리턴한다. 
	 * 
	 */
	
	// mapXXX()
	public void method1() {
		List<Student> students = Arrays.asList(
				new Student("문인수", 18, "남자", 80, 50),
				new Student("홍길동", 30, "남자", 80, 80),	
				new Student("성춘향", 20, "여자", 100, 100)
			);
		
		students.stream()
				.map(student -> student.getName())
				.forEach(name -> System.out.print(name + " ")); // 문인수 홍길동 성춘향 
		
		// 스트림 사용 끝나면 다시 불러야 한다. 
		double avg = students.stream()
				.mapToInt(student -> student.getMath())
				.average()
				.getAsDouble();
		
		System.out.println("수학점수의 평균 : " + avg); // 수학점수의 평균 : 86.66666666666667
	}
	
	// flatMapXXX()
	public void method2() {
		List<String> list = Arrays.asList("Java11 Lambda", "StreamAPI Filtering Mapping");
		
		list.stream().forEach(System.out::println);

		list.stream()
//			.flatMap(str -> {
//				String[] array = str.split(" ");
//				
//				return Arrays.stream(array);
//			})
			.flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(System.out::println);

	}
	
	// asDoubleStream(), asLongStream(), boxed()
	public void method3() {
		int[] array1 = {1, 2, 3, 4, 5};
		double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		
		Arrays.stream(array1)
//			  .asDoubleStream()
			  .asLongStream()
			  .forEach(System.out::println);
		/*
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */
		
		System.out.println();
		
		Arrays.stream(array2)
			  .boxed()
			  .sorted(Comparator.reverseOrder())
			  .forEach(System.out::println);
		/*
		 * 5.5
		 * 4.4
		 * 3.3
		 * 2.2
		 * 1.1
		 */
	}
}

