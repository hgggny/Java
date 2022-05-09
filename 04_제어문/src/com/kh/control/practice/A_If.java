package com.kh.control.practice;

import java.util.Scanner;

public class A_If {
	/*
	 * if 문
	 * 	[표현식]
	 * 	if (조건식) {
	 * 		.. 실행 코드 ..
	 * 	}
	 *  - 조건식에는 비교 연산자, 논리 연산자를 주로 사용한다.
	 *  - 조건식의 결과가 true이면 중괄호({}) 블록을 실행한다.
	 *  - 조건식의 결과가 false이면 중괄호({}) 블록을 실행하지 않는다. 
	 */
	public void method1() {
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d는(은) 짝수이다. \n", num);
		}
		
		if (num % 2 != 0) {
			System.out.printf("%d는(은) 홀수이다. \n", num);
		}
			
		scanner.close();
	}
	
	/*
	 * if-else 문
	 * 
	 * [표현법]
	 * 	if (조건식) {
	 * 	.. 실행코드 ..
	 * 	} else {
	 * 	.. 실행코드 ..
	 * 	}
	 *  - 조건식의 결과가 true인 경우 if 문 안에 실행 코드를 실행한다. 
	 *  - 조건식 결과가 false인 경우 else 문 안에 실행 코드를 실행한다. 
	 */
	public void method2() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d는(은) 짝수이다. \n", num);
		} else {
			System.out.printf("%d는(은) 홀수이다. \n", num);
		}
		scanner.close();
	}
	
	public void metho3() {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 기본 자료형들은 동등 비교 시에 ==, !=를 사용해서 동등 비교를 할 수 있다.
		 * 하지만, String 기본 자료형이 아닌 참조 자료형이다. (==, !=를 사용하면 주소값을 비교)
		 * 
		 * 문자열의 동등 비교 시에는 String 클래스에서 제공하는 equals() 메소드를 이용해서 비교해야 한다. 
		 */
//		System.out.println("박현진" == "박현진"); // true
//		System.out.println("박현진" == new String("박현진")); // false
//		System.out.println("박현진".equals(new String("박현진"))); // true
		
		System.out.print("이름을 입력하세요 > ");
		name = scanner.nextLine();
		
		if (name.equals("문인수")) {
			System.out.println("본인이다.");
		} else {
			System.out.println("본인이 아니다.");
		}
		
		scanner.close();
	}
	
	/*
	 * if-else if-else 문
	 * 
	 * [표현법]
	 *	if (조건식) {
	 * 	.. 실행코드 ..
	 * 	} else if(조건식) {
	 * 	.. 실행코드 ..
	 * 	} else if(조건식) {
	 * 	.. 실행코드 ..
	 * 	} else if(조건식) {
	 * 	.. 실행코드 ..
	 * 	}
	 * 
	 * 	- 같은 비교 대상으로 여러 개의 조건을 제시할 때 사용한다.
	 * 	- else 문이 제시되어 있을 경우 조건이 모두 false가 나오게 되면 else 구문을 실행한다. 
	 */
	public void method4() {
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자 입력 > ");
		ch = scanner.nextLine().charAt(0);
		
		if((ch >= 'A') && (ch <= 'Z')) {
			System.out.printf("%c는(은) 알파벳 대문자이다.", ch);
		} else if((ch >= 'a') && (ch <= 'z')) {
			System.out.printf("%c는(은) 알파벳 소문자이다.", ch);
		} else {
			System.out.printf("%c는(은) 알파벳이 아니다.", ch);
		}
		scanner.close();
		
	}
	
	/*
	 * 실습 문제 1
	 * G_Triple 클래스에 practice3() 코드를 if를 사용하는 코드로 변경하기
	 * 
	 * 두 정수를 입력받고 + 또는 -를 입력받아서 계산을 출력하라
	 * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
	 * 
	 * 예시)
	 * 	첫 번째 수 > 3
	 * 	두 번째 수 > 4
	 * 	연산자 입력 (+ 또는 -) > + 
	 * 
	 * 	3 + 4 = 7
	 */
	public void practice1() {
		int num1 = 0;
		int num2 = 0;
		char op = '\u0000';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 > ");
		num1 = scanner.nextInt();
		
		System.out.print("두 번째 수 > ");
		num2 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("연산자 입력 (+ 또는 -) > ");
		op = scanner.nextLine().charAt(0);
		
		System.out.println();
		
		if(op == '+') {
			System.out.printf("%d %c %d = %d", num1, op, num2, num1 + num2);
		} else if(op == '-') {
			System.out.printf("%d %c %d = %d", num1, op, num2, num1 - num2);
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		scanner.close();
		
	}
	
	/*
	 * 실습 문제 2
	 * 사용자에게 점수(0~100)를 입력 받아서 점수별로 등급을 출력하라
	 * 	- 90점 이상은 A 등급
	 * 	- 90점 미만 80점 이상은 B 등급
	 * 	- 80점 미만 70점 이상은 C 등급
	 * 	- 60점 미만 60점 이상은 D 등급
	 * 	- 60점 미만 F 등급
	 * 
	 * 예시)
	 * 	점수 > 90 
	 * 	당신의 점수는 90점이고 등급은 A입니다.
	 */
	public void practice2() {
		
		int score = 0;
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 > ");
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'c';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", score, grade);
		
		// 내가 만든 코드 ! 반성하자 
//		int num = 0;
//		char A = 'A';
//		char B = 'B';
//		char C = 'C';
//		char D = 'D';
//		char F = 'F';
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("점수 > ");
//		num = scanner.nextInt();
//		
//		if (num >= 90) {
//		System.out.printf("당신의 점수는 %d이고 등급은 %c입니다", num, A);
//		} else if (num < 90 && num >= 80) {
//			System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다", num, B);
//		} else if (num < 90 && num >= 70) {
//			System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다", num, C);
//		} else if (num < 90 && num >= 60) {
//			System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다", num, D);
//		} else {
//			System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다", num, F);
//		}
		scanner.close();
	}	
}