package com.kh.stream.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {
	private String name;
	
	private int age;
	
	private String gender;
	
	private int math;
	
	private int english;	
	
	@Override
	public int compareTo(Student student) {
		
		// private여도 같은 클래스 안이여서 가능하다.
		return Integer.compare(this.age, student.age);
	}
}
