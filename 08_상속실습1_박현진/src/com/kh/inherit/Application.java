package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {
		String name = null, dept = null;
		int age = 0, salary = 0, count = 0;
		double height = 0.0, weight = 0.0;
		char ch = ' ';

		Student[] students = new Student[3]; // 3명의 학생 정보를 기록할 수 있는 객체 배열 할당
		Employee[] employee = new Employee[10]; // 최대 10명의 사원 정보를 기록할 객체 배열 할당
		Scanner s = new Scanner(System.in);

		students[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과"); // 객체 생성
		students[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");

		for (Student student : students) { // 반복문을 이용하여 출력
			System.out.println(student.information());
		}

//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].information());
//		}

		while (true) {
			System.out.print("이름: ");
			name = s.nextLine();

			System.out.print("나이: ");
			age = s.nextInt();

			System.out.print("키: ");
			height = s.nextDouble();

			System.out.print("몸무게: ");
			weight = s.nextDouble();

			System.out.print("급여: ");
			salary = s.nextInt();
			s.nextLine();

			System.out.print("부서: ");
			dept = s.nextLine();

			// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
			employee[count] = new Employee(name, age, height, weight, salary, dept);

			// 한 명씩 추가 될 때마다 카운트함
			count++;

			System.out.print("계속 입력하겠습니까? (Y/N) : ");
			ch = s.nextLine().toUpperCase().charAt(0);

			if (ch == 'N') {
				break; 	// break : 가장 가까운 조건문에서 벗어난다 
			}

			for (int i = 0; i < count; i++) {
				System.out.println(employee[i].information());
			}
		}

	}

}
