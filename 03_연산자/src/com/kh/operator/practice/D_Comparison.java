package com.kh.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	/*
	 * 비교 연산자
	 * 	a < b : a가 b보다 작은가?
	 * 	a > b : a가 b보다 큰가?
	 * 	a <= b : a가 b보다 작거나 같은가?
	 * 	a >= b : a가 b보다 크거나 같은가?
	 * 	a == b : a가 b가 같은가?
	 * 	a != b : a가 b가 같지 않은가?
	 * 	
	 * 	- 비교 연산자는 조건을 만족하면 true, 만족하지 않으면 false를 반환한다. 
	 */
	public void method1() {
//		int num1 = 10;
//		int num2 = 25;
//		int num3 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		boolean result = false;
		
		//관계상 잘 사용하지 않는다. 
		int num1 = 10, num2 = 25, num3 = 0;
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		
		result = (num1 != num2);
		System.out.println(result);
		
		result = ('A' == 65); // 65(A의 코드값) == 65
		System.out.println(result);
		
		result = (3.0 == 3); // 3.0 == 3.0
		System.out.println(result);
		
		// 대부분의 비교 연산에서는 정수 타입을 사용한다. 
		result = (0.1 == 0.1f); // false double 0.1 == float 0.1
		System.out.println(result);
		
		// 산술연산 + 비교연산
		// 사용자에게 입력받은 값이 짝수인지, 홀수인지 판단
		System.out.print("임의의 정수를 입력해주세요 > "); // print로 하면 옆에 숫자가 출력 println은 아래에 숫자가 출력
		num3 = scanner.nextInt();
		
		// ((num3 % 2) == 0
		System.out.printf("%d는 짝수인가요? %b\n", num3, ((num3 % 2) == 0));
		System.out.printf("%d는 홀수인가요? %b\n", num3, ((num3 % 2) != 0));
//		System.out.printf("%d는 홀수인가요? %b\n", num3, ((num3 % 2) == 1));
		
		System.out.printf("%d는 5의 배수인가요? %b\n", num3, ((num3 % 5) == 0));
		
		scanner.close();
	}
}
		
