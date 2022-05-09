package com.kh.chapter3.field;

/*
 * 필드의 초기화 순서
 *   1. 필드
 *   	1) JVM이 정한 기본값으로 초기화
 *   	2) 명시적 초기화
 *   	3) 인스턴스 블록을 이용한 초기화
 *   	4) 생성자를 이용한 초기화
 *   
 *   2. 클래스 변수 (static 필드) > 생성자 X
 *   	1) JVM이 정한 기본값으로 초기화
 *   	2) 명시적 초기화
 *   	3) static 블록을 이용한 초기화
 */

public class D_InitBlock {
	// 1) JVM이 정한 기본값으로 초기화
	private String name;
	private static int age;
	
	// 2) 명시적 초기화
	private String phoneName = "아이폰12"; 
	
	private int price = 1090000;
	
	private static String brand = "애플";
	
	// 3) 초기화 블록을 이용한 초기화
	// 인스턴스 블록은 필드를 초기화 시키는 블록으로 인스턴스 생성 시마다 실행되고 초기화한다. 
	{
		phoneName = "아이폰13";
		price = 1190000;
		
//		인스턴스 블록에서는 클래스 변수도 초기화할 수 있다.
//		brand = "삼성"; // static은 클래스로 접근해야 한다. 
	}
	
	// static 블록은 클래스 변수를 초기화 시키는 블록으로 프로그램 시작 시 단 한번만 실행되고 초기화한다.
	static {
		age = 20;
		
//		static 블록에서는 필드를 초기화할 수 없다.
//		name = "문인수";
	}
	
	// 4. 생성자를 이용한 초기화
	public D_InitBlock () {
		name = "박현진";
	}
	
	public String getName() {
		return name;
	}
	
	public static int getAge() {
		return age;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public int getPrice() {
		return price;
	}

	public static String getBrand() {
		return brand;
	}
}
