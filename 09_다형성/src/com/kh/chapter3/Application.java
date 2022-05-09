package com.kh.chapter3;

import com.kh.chapter3._interface.Basic;
import com.kh.chapter3._interface.Desktop;
import com.kh.chapter3._interface.SmartPhone;

public class Application {

	public static void main(String[] args) {
		// 인터페이스 객체 생성 불가능 -> 미완성의 메서드를 가지고 있고 생성자가 없다.
		// 인터페이스를 구현하는 자식 클래스를 통해서 생성해야 한다.
//		Basic basic = new Basic(); 
		
		// 인터페이스는 객체 생성이 안될 뿐 참조 변수로 사용이 가능하다.
		// 다형성을 적용해서 인터페이스를 구현하는 객체를 생성해서 참조할 수 있다.
		Basic desktop = new Desktop("a1111", "아이맥 24인치", "애플", 2000000, true);
		Basic phone = new SmartPhone("a2222", "아이폰 12 미니", "애플", 960000, "KT");
		
		System.out.println(desktop); // 해당 객체의 toString 출력
		System.out.println(phone);
		System.out.println();
		
		// 객체가 공통적으로 구현해야 할 것이 있으면 인터페이스에서 구현하도록 정의하고 실제 객체(Desktop, SmartPhone)가 재정의하기 때문에 실제 객체의 메소드가 출력
		desktop.turnOn(); // Basic의 추상 메소드이며, Product가 Basic를 구현하고, Product를 Desktop이 상속받기 때문에 추상 메소드 출력
		desktop.turnOff(); // 인터페이스를 통해서 기능만 가져온다라고 생각!
		phone.turnOn(); 
		phone.turnOff(); 
		
	}
	
	public void turnOn(Basic basic) {
		
	}
}
