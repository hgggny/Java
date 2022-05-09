package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		// 1. 기본생성자를 이용한 객체생성, 매개변수를 이용한 객체생성 후 출력
		Book book1 = new Book();
		Book book2 = new Book("자바의 정석", 20000, 0.2, "윤상섭");
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		
		System.out.println("=============================");
		
		// 2. 첫번째 객체가 가진 값을 setter를 이용해서 수정 후 출력
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book1.information());
		
		System.out.println("=============================");
	
		System.out.println("도서명 = " + book1.getTitle());
		System.out.println("할인된 가격 = " + ((int)(book1.getPrice()) - (int)(book1.getPrice()*book1.getDiscountRate())) + "원");
		System.out.println("도서명 = " + book2.getTitle());
		System.out.println("할인된 가격 = " + ((int)(book2.getPrice()) - (int)(book2.getPrice()*book2.getDiscountRate())) + "원");
		
	}

}
