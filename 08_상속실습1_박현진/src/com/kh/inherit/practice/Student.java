package com.kh.inherit.practice;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight); // private → 부모 생성자(super())를 통해 초기화
		super.name = name; 			// protected → 부모 필드 값에 직접 접근해서 초기화
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String information() {
		return super.information() + ", grade= " + grade + ", major= " + major;
	}
	
	
}
