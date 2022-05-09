package com.kh.inherit;

import com.kh.inherit.after.Desktop; // before -> after 로 바꾸기
import com.kh.inherit.after.SmartPhone;
import com.kh.inherit.before.Tv;
import com.kh.inherit.override.Book;

public class Application {

	public static void main(String[] args) {
		// Desktop 객체 생성
//		Desktop desktop = new Desktop(); // 1. 부모의 setter 메소드를 통해서 초기화
		Desktop desktop = new Desktop("a1111", "아이맥 24인치", "애플", 2000000, true); // 2. 부모 생성자를 호출해서 초기화
		SmartPhone smartPhone = new SmartPhone("a2222", "아이폰 12 미니", "애플", 960000, "KT");
		Tv tv = new Tv("t-01", "올레드 벽걸이 TV", "엘지", 2500000, 60);
				
		desktop.setAllInone(false);
		
		// 출력
//		System.out.println(desktop.toString()); 
		// Desktop [pCode=a1111, name=아이맥 24인치, brand=애플, price=2000000, allInone=true]
		// Desktop 클래스에 없어도 Object 클래스에 있는 toString이 실행
		// Desktop 클래스에 똑같이 있어도 Object 클래스에 있는 것이 아닌 Desktop 클래스의 toString이 실행 -> 오버라이딩
		// toString 객체 자체를 문자열로 표현하기 위해 만들어서 출력해주는 것.
		System.out.println(desktop); 
		// Desktop [pCode=a1111, name=아이맥 24인치, brand=애플, price=2000000, allInone=true]
		// 참조값만 넘겨줘도 Object클래스에 toString이 있기 때문에 내부적으로 toString을 찍는 것과 같다. 
		System.out.println(smartPhone);
		System.out.println(tv);
		System.out.println();
		
		// 오버라이딩 테스트 
		Book book1 = new Book("자바의 정석", "홍길동", 3000); // 기본 생성자
		Book book2 = new Book("자바의 정석", "홍길동", 3000); 
		Book book3 = new Book("자바 너무 어려워", "박현진", 200); 
		
		// toString() 테스트
		System.out.println(book1); // Book [title=자바의 정석, author=홍길동, price=3000] -> 참조값만 넘겨줘도 출력 가능.
		System.out.println(book1.toString()); // Book [title=자바의 정석, author=홍길동, price=3000]
		System.out.println();
		
		// equals() 테스트

		System.out.println(book2); 
		
		System.out.println("book1과 book2가 같은 책 입니까?" + (book1 == book2)); // false  ∵ 주소값을 비교하며, 두개의 주소값은 다르다. 
		System.out.println("book1과 book2가 같은 책 입니까?" + book1.equals(book2)); // false ∵ 객체 두개를 비교해서 주소값을 비교하게 만들어져 있다. (==와 동일하다) -> equals() 재정의해서 true로 나옴.
		System.out.println("book1과 book3이 같은 책 입니까?" + book1.equals(book3)); 
		System.out.println();
		
		// hashCode() 테스트
		System.out.println("book1의 hashCode : " + book1.hashCode());
		System.out.println("book2의 hashCode : " + book2.hashCode());
		System.out.println("book3의 hashCode : " + book3.hashCode());
		
	}
}