package com.kh.chapter2.wrapper;

public class A_Wrapper {
	public void method1() {
		// Boxing : 기본 자료형 -> Wrapper
		int iNum = 10;
		double dNum = 3.14;
		double dNum2 = 3.14;
		
		// 1. 객체 생성을 통한 방법 (Deprecated(비권장))
		Integer integer = new Integer(iNum);
		Double double1 = new Double(dNum);
		Double double2 = new Double(dNum2);
		
		System.out.println(integer);
		System.out.println(double1);
		System.out.println(double2);
		System.out.println(double1 == double2); // false -> 주소값을 비교하기 때문에 false가 나온다.
		
		// 클래스에서 제공하는 메소드들을 사용할 수 있다.
		System.out.println(double1.equals(double2)); // true
		// 두 값을 비교해서 double1이 double2보다 작으면 -1, 같으면 0, 크면 1이 출력된다. 
		System.out.println(double1.compareTo(double2));
		System.out.println();
		
		// 2. 정적 메소드를 통한 방법
		integer = Integer.valueOf(3);
		double1 = Double.valueOf("1.11");
		
		System.out.println(integer);
		System.out.println(double1);
		System.out.println();
		
		// 3. Auto Boxing 통한 방법
		Integer integer2 = 5; // 같은 타입만 Auto Boxing이 가능하다.
		Double double3 = 3.555;
		
		System.out.println(integer2);
		System.out.println(double3);
		System.out.println();
		
		// UnBoxing : Wrapper -> 기본 자료형
		// 1. Wrapper 객체의 메소드를 통한 방법
		int iNum2 = integer.intValue();
		int iNum3 = integer2.intValue();
		
		System.out.println(iNum2 + iNum3); // 8
		System.out.println();
		
		// 2. Auto UnBoxing을 통한 방법
		double dNum3 = double1; 
		double dNum4 = double3;
		
		System.out.println(dNum3 + dNum4);
		System.out.println();
	}
	
	public void method2() {
		String str1 = "10";
		String str2 = "3.14";
		
		System.out.println(str1 + str2); // 103.14
		
		// 1. 문자열 -> 기본 자료형 변경
		int iNum = Integer.parseInt(str1);
//		double dNum = Double.parseDouble(str1); 
		double dNum = Double.parseDouble(str2);
		
		System.out.println(iNum + dNum); //13.14

		// 2. 기본 자료형 -> 문자열로 변경
		// 	  1) String.valueOf() 메소드
		String str3 = String.valueOf(iNum);
		String str4 = String.valueOf(dNum);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		
		//    2) Wrapper 클래스에서 제공하는 valueOf().toString() 메소드
		System.out.println(Integer.valueOf(iNum).toString());
		System.out.println(Double.valueOf(dNum).toString());
	}
}
