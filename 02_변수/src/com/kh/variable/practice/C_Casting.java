package com.kh.variable.practice;

public class C_Casting {

		/*
		 * 형 변환(boolean 제외)
		 * 
		 * 	**컴퓨터에서의 값의 처리 규칙
		 * 		1) 대입 연산자를 사용할 때 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다. 
		 * 		2) 같은 자료형끼리만 연산이 가능하다. (연산 결과도 같은 자료형으로 나온다.) 
		 * 
		 * 1. 자동 형 변환(묵시적 형 변환)
		 * 	- 자동으로 형 변환이 이루어지기 때문에 개발자가 형 변환을 시켜줄 필요가 없다.
		 * 	- 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환한다. 
		 */
	
		public void autoCasting() {
			short s = 12;
			int i = s;   // short -> int 자동 형 변환, 작은 short를 큰 int !
			long l = i;  // int -> long 자동 형 변환
			
			// float이 long 보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환이 가능하다
//			float f = 1;
			float f = 10000000000000L;
			double d = f;
			double result = 0.0;			
			result = 12 + 3.3; // 정수 < 실수, 12.0 + 3.3 = 15.3
//			long result2 = 30 + 30;  // 30 + 30 = 60, 60을 long로 형 변환해서 저장(60L)
			long result2 = 30 + 30L; // 30L + 30L = 60L
			
			System.out.println("s : " + s);
			System.out.println("i : " + i);
			System.out.println("l : " + l);
			System.out.println("f : " + f);
			System.out.println("d : " + d);
			System.out.println("result : " + result);
			System.out.println("result2 : " + result2);
			
			i = '문';
			char ch = 47932; // 범위가 그 사이에 들어가야 한다. 
			byte b1 = 10;
			byte b2 = 20;
//			byte result3 = b1 + b2; // byte, short 타입의 데이터는 연산시 무조건 int 타입으로 처리한다. 
			byte result3 = (byte)(b1 + b2); 
			
			System.out.println("i : " + i);
			System.out.println("ch : " + ch);
			System.out.println("result3 : " + result3);
		}

		/*
		 * 2. 강제 형 변환(명시적 형 변환)
		 * 	- [표현법]
		 * 		(자료형) 데이터;
		 * 	- 범위가 큰 크기의 자료형의 데이터를 작은 크기의 자료형으로 변환하려고 할 때 사용한다. 
		 * 	- (자료형)을 형 변환 연산자라고 한다. 
		 * 	- 강제 형 변환의 경우 데이터 손실이 발생할 수 있다. 
		 * 	- boolean은 형 변환이 불가능하다. (true, false 값만 가질 수 있다.)
		 */
		public void casting() {
			double d = 3.14;
//			float f = d;  // error
			float f = (float) d;
			int i = (int) f;
//			int sum = 0;
			double sum = 0.0;
			
			System.out.println("d = " + d);
			System.out.println("f = " + f);
			System.out.println("i = " + i);
			
			i = 10;
			d = 5.76;
			// 1) 수행 결과를 int로 강제 형 변환
//			sum = (int) (i + d); // 10.0 + 5.76 = 15.76 -> 15
			
			// 2) double 타입의 값을 int로 강제 형 변환
//			sum = i + (int) d; // 10 + 5 = 15
			
			// 3) double 타입의 변수로 변경한다. 
			sum = i + d;
			
			System.out.println("sum : " + sum);
			System.out.println((byte) 256);
		}
}
