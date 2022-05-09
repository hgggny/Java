package com.kh.chapter2;

import com.kh.chapter2._class.Person;

public class Application {

	public static void main(String[] args) {
		Person person = new Person(); // Person과 Application의 패키지가 달라도 public이므로 접근이 가능하다.
//		Phone // 같은 패키지가 아니라서 안된다. -> 같은 패키지 안에 있는 Person 에서는 가능하다.
		person.setName("홍길동");
		person.setAge(28);
		person.setPhone("아이폰 12 미니", "화이트", "애플");
		
//		Phone phone = new Phone; // 객체 생성 불가. 
//		person.setPhone(null);
		
		person.whoAreYou();
		
		
		
		
		
	}

	
	
}
