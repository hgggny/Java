package com.kh.object;

import com.kh.object.prcatice.Product;

public class Application {

	public static void main(String[] args) {

		// 매개변수 생성자를 이용해 3개의 객체 생성 후 출력
		Product product1 = new Product("ssgnote9", "갤럭시노트9",  "경기도 수원", 960000, 10.0);
		Product product2 = new Product("lgnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product product3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(product1.infomation());
		System.out.println(product2.infomation());
		System.out.println(product3.infomation());
		System.out.println("=====================================================");
		
		// setter 메소드를 이용해 가격을 모두 120만원으로, 부세율은 모두 0.05로 수정 후 출력
		product1.setTax(0.05);
		product2.setTax(0.05);
		product3.setTax(0.05);
		
		product1.setPrice(120000);
		product2.setPrice(120000);
		product3.setPrice(120000);
		
		System.out.println(product1.infomation());
		System.out.println(product2.infomation());
		System.out.println(product3.infomation());
		System.out.println("=====================================================");
		
		// 1. toString을 Product 클래스에서 오버라이딩 후 출력
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);

		System.out.println("=====================================================");
		// 2. getter 메소드를 이용해 각 객체의 가격에 부가세율을 적용한 실세 가격을 계산해 출력
		System.out.println("상품명 = " + product1.getName());
		System.out.println("부가세 포함 가격 = " + (int)(product1.getPrice() + (product1.getPrice() * product1.getTax())) + "원");

		System.out.println("상품명 = " + product2.getName());
		System.out.println("부가세 포함 가격 = " + (int)(product2.getPrice() + (product2.getPrice() * product2.getTax())) + "원");

		System.out.println("상품명 = " + product3.getName());
		System.out.println("부가세 포함 가격 = " + (int)(product3.getPrice() + (product3.getPrice() * product3.getTax())) + "원");	}

}
