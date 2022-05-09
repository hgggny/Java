package com.kh.inherit.after;

public class Desktop extends Product {
	
	private boolean allInone; // 일체 여부

	public Desktop() {
//		super();
		System.out.println("자식 클래스의 기본 생성자");
//		pCode -> Product에서 pcode를 public 바꾸면 설정해서 가능
	}

	/*
	 * 부모 인스턴스 필드를 초기화할 수 있는 방법
	 * 1. 부모의 setter 메소드를 통해서 초기화 -> setter는 public이고 Desktop에 상속이 된다. 
	 * 	 - 부모 클래스에서 setter 메소드를 제공하면 자식 객체에서 부모의 setter 메소드를 통해서
	 *     필드의 초기화가 가능하다. (setter는 public 접근 제한자를 갖는다.)
	 *     
	 * 2. 부모 생성자를 호출해서 초기화
	 * 	 - super를 통해서 부모의 필드, 메소드, 생성자에 접근이 가능하다. (private는 해당 안됨)
	 *   - super([매개값, ...])을 통해서 자신의 생성자에서 부모의 생성자를 호출할 수 있다. 
	 * 	
	 */
	
	// 부모 초기화
	// 자식 생성자에서 부모에 해당하는 초기의 값들도 다 받아줘야 한다.
	public Desktop(String pCode, String name, String brand, int price, boolean allInone) {
		// 1. 부모의 setter 메소드를 통해서 초기화
//		super.setpCode(pCode); // 어떤 setter인지 헷가릴 경우 부모는 super. 자식은 this.를 붙여준다.
//		super.setName(name);
//		super.setBrand(brand);
//		super.setPrice(price);
		
		// 2. 부모 생성자를 호출해서 초기화
		super(pCode, name, brand, price);  // 개수랑 순서는 동일해야하고, 제일 위에 있어야 한다. 
		
		
		this.allInone = allInone; // Desktop 클래스에 있는 것
	}

	@Override
	public String toString() {
		return "Desktop [" + super.toString() + ", allInone=" + allInone + "]";
	}

	public boolean isAllInone() {
		return allInone;
	}

	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
}
