package com.kh.first.practice;

public class ValuePrinter {
	public void print() {
		// 1. 숫자 출력
		System.out.println(123); // 정수값 출력
		System.out.println(3.14);// 실수값 출력
		
		// 2. 연산 결과 출력
		System.out.println(125 + 40);
		System.out.println(1.23 - 0.12); // 실수값 연산은 불완전해서 오차가 생길 수 있다. 
		System.out.printf("%.2f\n",1.23 - 0.12); // 
		System.out.println(Math.ceil(1.23 - 0.12)); // 계산 후 올림
		System.out.println(Math.floor(1.23 - 0.12)); // 계산 후 내림
		
		// 3. 문자 출력
		System.out.println('a'); // 문자 하나 입력할 때, ''(작은 따옴표) 사용
		System.out.println('b');
		// 문자와 숫자를 연산하면 문자의 코드값과 연산 결과를 출력한다. 
		// 각 문자마다 컴퓨터가 인식하는 고유한 숫자값을 가지고 있다. (b:98)
		System.out.println('b' + 1);
		System.out.println('b' + '1');
		System.out.println((int) '1');
		System.out.println((char)('b' + 1)); // 형변환
		
		// 4. 문자열 출력
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
		
		// 5. 문자열과 그 외의 값들의 덧셈연산
		System.out.println("안녕하세요" + "반갑습니다.");
		System.out.println("반갑습니다." + 123);
		System.out.println((40 + 125) + "반갑습니다.");

		
		// 6. printf() 메소드
		
		int num1 = 10;
		int num2 = 20;
		float fnum = 3.141592f;
		double dnum = 4.1592;
		
		// %d 서식 지정자
		System.out.printf("%d\n", num1);
		System.out.printf("%5d\n", num1);
		System.out.printf("%d\n", num1, num2);
//		System.out.printf("%d %d/n", num1); // error
		
		// %f 서식 지정자 
		System.out.printf("%f %f\n", fnum, dnum);   // \n : 줄 바꿈
		System.out.printf("%f \t %f\n", fnum, dnum);  // \t : 수평 탭
		System.out.printf("%.3f \t %.3f\n", fnum, dnum);  // 
		
		
		
	}
}
