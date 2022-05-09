package com.kh.inherit.after;

public class Product {
	private String pCode; // 상품 코드 private -> public으로 바꾸면 -> Desktop에서 확인
	
	private String name; // 상품명
	
	private String brand; // 브랜드
	
	private int price; // 가격
	
	public Product() {
		System.out.println("부모 클래스의 기본 생성자");
	}
	
	public Product(String pCode, String name, String brand, int price) {
		super();
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + "price";
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
