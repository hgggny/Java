package com.kh.object.prcatice;

public class Product {
	private String id; 		// 상품 아이디
	private String name;	// 상품명
	private String site;	// 생산지
	private int price; 		// 가격
	private double tax;		// 부가세비율
	
	public Product() {		// 기본 생성자 생성
	}
	
	
	public Product(String id, String name, String site, int price, double tax) {	// 매개변수 5개인 생성자
		this.id = id;
		this.name = name;
		this.site = site;		
		this.price = price;
		this.tax = tax;
				
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String infomation() { // 같은 클래스 안이여서 this 안붙여도 된다. 
		return this.id + " " + this.name + " " + this.site + " " + this.price + " " + this.tax;
	}

	@Override
	public String toString() {
		return "상품명 = " + id  + "\n부가세 포함 가격 = " + (int)(price + (price * tax)) + "원";
	}
	
	

}
