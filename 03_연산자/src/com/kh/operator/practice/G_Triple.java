package com.kh.operator.practice;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자 
	 * 
	 * [표현법]
	 * 	조건식 ? 식1(조건식이 참일 경우) : 식2(조건식이 거짓일 경우 수행);
	 * 
	 * 	- 조건식은 주로 비교, 논리 연산자가 사용된다. 
	 * 	- 조건식의 결과가 true이면 식1을 수행한다. 
	 *  - 조건식의 결과가 false이면 식2을 수행한다. 
	 * 	- 삼항 연산자는 중첩으로 사용이 가능하지만 가독성에 문제가 될 수 있기 때문에
	 *    상황에 따라서 적절하게 사용해야 한다. 
	 */
	
	// 입력받은 정수가 양수인지 아닌지 판별 후 출력 
	public void method1() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = scanner.nextInt();
		
		result = (num > 0) ? "양수이다." : (num == 0) ? "0 입니다," : "음수이다.";
		
		
		System.out.printf("%d 는(은) %s", num, result);
		
		
		scanner.close();
	}
	
	/*
	 * 실습 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아서
	 * 두 정수의 곱셈 결과 100보다 큰 경우 "결과가 100 이상입니다." 아닌 경우 "결과가 100 보다 작습니다." 출력
	 */
	
	
	public void practice1() {
		int num1 = 0;
		int num2 = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하시오 >");
		num1 = scanner.nextInt();
		
		System.out.print("두 번째 정수를 입력하시오 >");
		num2 = scanner.nextInt();
		
		result = (num1 * num2 >= 100) ? "결과가 100 이상입니다." : "결과가 100 보다 작습니다.";
				
		System.out.printf("%d 는(은) %s\n", (num1 * num2), result);
		
		scanner.close();
	}
	
	
	/*
	 * 실습 문제 2
	 * 
	 * 사용자한테 문자를 하나 입력 받아서
	 * 입력한 문자가 대문자이면 "대문자이다." 아닌 경우 "알파벳 대문자가 아니다." 출력
	 */
	
	public void practice2() {
		char ch = '\u0000';
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("영문자를 입력하시오 > ");
		ch = scanner.nextLine().charAt(0);
		
		result = (ch >= 'A') && (ch <='Z') ? "알파벳 대문자이다." : "알파벳 대문자가 아니다.";
		
		System.out.printf("%c 는(은) %s\n", ch, result);
		
		scanner.close();
		
	}
	
	/*
	 * 실습 문제 3
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
	
	public void practice3() {
		int num1 = 0;
		int num2 = 0;
		char op = '\u0000';
		String result = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 > ");
		num1 = scanner.nextInt();
		
		System.out.print("두 번째 수 > ");
		num2 = scanner.nextInt();
		
		scanner.nextLine(); // 버퍼 한번 비우는거 잊지말자 !!!
		
		System.out.print("연산자 입력(+ 또는 -) > ");
		op = scanner.nextLine().charAt(0);
		
		// 정수값과 빈 문자열("")을 + 연산하여 문자열로 변경한다.
		// String.valueOf() 메소드는 기본 자료형의 값들을 문자열로 변경한다.
		result = (op == '+') ? String.valueOf(num1 + num2) : (op == '-') ? String.valueOf(num1 - num2) : "잘못 입력했습니다.";
//		result = (op == '+') ? (num1 + num2) + "" : ((op == '-') ? (num1 - num2) + "" : "잘못 입력했습니다.");

		System.out.println();
		System.out.printf("%d %c %d = %s", num1, op, num2, result);
		scanner.close();
	}
}
