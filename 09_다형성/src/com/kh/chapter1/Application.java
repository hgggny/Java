package com.kh.chapter1;

import com.kh.chapter1.polymorphism.Desktop;
import com.kh.chapter1.polymorphism.Product;
import com.kh.chapter1.polymorphism.SmartPhone;

public class Application {

	/*
	 * 다형성 
	 *   - 부모 클래스의 참조 변수로 자식 객체들을 다룰 수 있는 기술. 
	 *   - 상속 구조의 클래스 간에는 형 변환이 가능하기 때문에 다형성이 가능.
	 *   
	 * UpCasting
	 *   - 자식 타입 -> 부모 타입으로 형 변환이 발생하는 것
	 *   - 형 변환 연산자의 생략이 가능. (자동 형 변환)
	 *   - 자식 타입의 멤버(필드, 메소드)에는 접근이 불가능.
	 *   
	 * DownCasting
	 *   - 부모 타입 -> 자식 타입으로 형 변환이 발생하는 것.
	 *   - 형 변환 연산자를 사용해야 한다. (강제 형 변환)
	 *     ((자식타입)부모참조변수).자식메소드();
	 */
	
	public static void main(String[] args) {
		// 1. 부모 타입의 참조 변수로 부모 객체를 다루는 경우
		System.out.println("1. 부모 타입의 참조 변수로 부모 객체를 다루는 경우");
		Product product = new Product(); // OK
		System.out.println();
		
		// product 참조 변수로 Product의 멤버만 접근 가능.
		System.out.println("<product 참조 변수로 Product의 멤버만 접근 가능>");
		System.out.println(product);
		System.out.println();
	
		// 2. 자식 타입의 참조 변수로 자식 객체를 다루는 경우
		Desktop desktop = new Desktop();
		System.out.println();
		
		// desktop 참조 변수로 Product(부모), Desktop(자식)의 멤버에 접근 가능
		System.out.println("<desktop 참조 변수로 Product(부모), Desktop(자식)의 멤버에 접근 가능>");
		System.out.println(desktop);
		System.out.println(desktop.isAllInone()); // Desktop extends Product (상속)
		System.out.println();
		
		// 3. 부모 타입의 참조 변수로 자식 객체를 다루는 경우(다형성 적용)
		System.out.println("3. 부모 타입의 참조 변수로 자식 객체를 다루는 경우(다형성 적용)");
		product = /* (Product) */ new Desktop(); // 자동 형 변환 // product는 위에서 변수 선언했으므로 그대로 사용.
		
		// product 참조 변수로 Product의 멤버만 접근 가능
		// 하지만 Desktop의 멤버에 접근하고 싶을 때는 형 변환을 해야 한다. 
		System.out.println(product); // 부모 타입의 참조 변수이기 때문에 자식 객체의 메서드는 사용할 수 없고 부모 타입의 메서드만 사용할 수 있다.
		System.out.println(product.toString()); 
		//└오버라이딩 -> Product, DeskTop 둘다 toStrig이 있지만 Desktop에 있는 toString이 실행됨, 동적 바인딩 때문에 가능.
		System.out.println(((Desktop)product).isAllInone()); // 강제 형 변환 -> Desktop에 있는 메서드 사용 가능
		System.out.println();
		
		
		// 4. 객체 배열과 다형성 
		// 다형성을 사용하기 전에는 Desktop, SmartPhone 배열을 만들어야 한다.
		Desktop[] arr1 = new Desktop[2];
		
		arr1[0] = new Desktop();
		arr1[1] = new Desktop();
		
		SmartPhone[] arr2 = new SmartPhone[2];
		
		arr2[0] = new SmartPhone();
		arr2[1] = new SmartPhone();
		
		// 다형성을 적용하면 부모 클래스의 참조 변수로 자식 객체들을 가리킬 수 있다.
		Product[] arr3 = new Product[4];
		arr3[0] = new Desktop("a1111", "아이맥 24인치", "애플", 2000000, true);
		arr3[1] = new Desktop("d-01", "매직스테이션", "삼성", 1500000, false);
		arr3[2] = new SmartPhone("a2222", "아이폰 12 미니", "애플", 960000, "KT");
		arr3[3] = new SmartPhone("s-01", "갤럭시 22", "삼성",600000, "SKT" );
		
		// DownCasting
//		System.out.println(((Desktop)arr3[0]).isAllInone());
//		System.out.println(((Desktop)arr3[1]).isAllInone());
//		System.out.println(((SmartPhone)arr3[2]).getMobileAgency());
//		System.out.println(((SmartPhone)arr3[3]).getMobileAgency());
		
		System.out.println("<instanceof 연산자>");
		for(Product p : arr3) {
			/*
			 * instanceof 연산자
			 *   - 참조 변수가 실제로 어떤 클래스 타입의 객체의 주소를 참조하는지 확인할 때 사용.
			 */
//			System.out.println(((Desktop)p).isAllInone()); // error
			if(p instanceof Desktop) {
				System.out.println(((Desktop)p).isAllInone());
			} else {
				System.out.println(((SmartPhone)p).getMobileAgency());
			}
			// 오버라이딩의 개념을 확용해서 실제로 참조하고 있는 객체의 메소드를 찾아서 실행한다. 
//			System.out.println(p.toString());
			System.out.println();
		}
		// 매개 변수의 다형성
		print(new Desktop());
		print(new SmartPhone());
	}

	// 비효율적
//	public static void print(Desktop desktop) { // static 메소드니까 호출하려면 static이여야 한다.-> 인스턴스 접근 불가
//		System.out.println(desktop);
//	}
//
//	public static void print(SmartPhone smartPhone) {
//		System.out.println(smartPhone);
//	} 


	public static void print(Product product) { // 하나의 메서드로 두 개의 타입을 받아서 처리 가능.
		System.out.println("<매개 변수의 다형성>");
		System.out.println(product);
	}
}
