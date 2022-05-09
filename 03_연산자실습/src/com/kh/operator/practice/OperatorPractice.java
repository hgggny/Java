package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		int num1 = 0;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num1 = scanner.nextInt();
		
		result = num1 > 0 ? "양수다." : "양수가 아니다.";
		
		System.out.println(result);
		
//		if(num1 > 0) {
//			System.out.println("양수다");
//			
//		} else {
//				System.out.println("양수가 아니다");
//		}
		
		scanner.close();
		
			}
		
		
	
	public void practice2() {
		int num2 = 0;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num2 = scanner.nextInt();
		
		result = num2 > 0 ? "양수다" : (num2 < 0 ) ? "음수다" : "0이다";
			
		System.out.println(result);
		
		scanner.close();
		
//		if(num2 > 0) {
//			System.out.println("양수다");
//		} else if (num2 == 0){
//			System.out.println("0이다");
//		} else {
//		System.out.println("음수다");
//		}	
		scanner.close();
	} 
	
	public void practice3() {
		int num3 = 0;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num3 = scanner.nextInt();
		
		result = num3 % 2 == 0 ? "짝수다" : "홀수다";
		
		System.out.println(result);
		
//		if((num3 % 2) == 0) {
//			System.out.println("짝수다");
//		} else {
//				System.out.println("홀수다");
//			}
		
		scanner.close();
	}
	
	public void practice4() {
		int people = 0;
		int candy = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		people = scanner.nextInt();
		
		System.out.print("사탕 개수 : ");
		candy = scanner.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남은 사탕 개수 : " +  (candy % people));
		
//		System.out.printf("1인당 사탕 개수 : %d\n" , (candy / people));
//		System.out.printf("남은 사탕 개수 : %d" ,  (candy % people));
		
		scanner.close();
	}
	
	public void practice5() {
		int num5 = 0;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		num5 = scanner.nextInt();
		
		result = (num5 > 13 && num5 <=19) ? "어린이" : (num5 >= 19) ? "성인" : "청소년"; 
		
		System.out.println(result);
//		if ((num5 > 13) && (num5 <= 19)) {
//			System.out.println("청소년");
//		} else {
//			System.out.println("어린이");
//		}
		scanner.close();
		
	}

	public void practice6() {
		int num6 = 0;
		int num66 = 0;
		int num666 = 0;
		boolean result = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		num6 = scanner.nextInt();
		System.out.print("입력2 : ");
		num66 = scanner.nextInt();
		System.out.print("입력3 : ");
		num666 = scanner.nextInt();
		
		result = (num6 == num66) && (num66 == num666) && (num6 == num666) ? true : false;
		
		System.out.println(result);
		
//		if((num6 == num66) && (num66 == num666) && (num6 == num666)) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		scanner.close();
	}
}

