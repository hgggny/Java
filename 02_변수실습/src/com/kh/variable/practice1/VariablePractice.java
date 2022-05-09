package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		String name = null;
		char gender = '\u0000';
		int age = 0;
		double height = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		name = scanner.nextLine();
		
		System.out.println("나이를 입력하세요");
		age = scanner.nextInt();
			// Q. 20살 입력하면 숫자 20만 출력 가능한가?	
		System.out.println("성별을 입력하세요(남/여)");
		scanner.nextLine();
		gender = scanner.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요(cm)");
		height = scanner.nextDouble();
		
		System.out.printf("키는 %.1fcm인 %d살 %c %S님 반갑습니다^^", height, age, gender, name);
			// Q. gender "남"이 아닌 "남자"로 출력하는 방법 체크
		
		scanner.close();
	}
	
	public void method2() {
		
		int firstInt = 0;
		int secondInt = 0; 
//		int addTotal = firstInt + secondInt;
//		int subTotal = firstInt - secondInt;
//		int multiTotal = firstInt * secondInt;
//		int divTotal = firstInt / secondInt;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요");
		firstInt = scanner.nextInt();
		System.out.println("두 번째 정수를 입력하세요");
		secondInt = scanner.nextInt();
		
		System.out.println("");
		
//		System.out.printf("더하기 결과 : %f", (firstInt + secondInt));
//		System.out.printf("빼기 결과 : %f", (firstInt - secondInt));
//		System.out.printf("곱하기 결과 : %f", (firstInt * secondInt));
//		System.out.printf("나누기 결과 : %.1f", (firstInt / secondInt));
		
		System.out.println("더하기 결과 : " + (firstInt + secondInt)); // 괄호를 안하게 되면 문자열로 인식하여 숫자 두개가 붙어서 나온다.
		System.out.println("빼기 결과 : " + (firstInt - secondInt)); // 마찬가지로 괄호를 안하게되면 '문자열-정수'로 인식하여 오류 발생
		System.out.println("곱하기 결과 : "+ (firstInt * secondInt));
		System.out.println("나누기 결과 : "+ (firstInt / secondInt));
		
			// Q. 실행 왜 안돼? - 해결
		scanner.close();
	}

	public void method3() {
		
		double width = 0.0;
		double height = 0.0;
		double a = width * height;
		double r = (width + height)*2;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로");
		width = scanner.nextDouble();
		
		System.out.print("세로");
		height = scanner.nextDouble();
		
//		System.out.printf("면적 : %d \n 둘레 : %2d", a, r);
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + ((width + height) * 2));
		
	}
	
	public void method4() {
		
		String str = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 > ");
		str = scanner.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}


}
