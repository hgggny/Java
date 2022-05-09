package com.kh.chapter2._class;

// 접근 제한자 생략시 default 접근 제한이 적용된다. 
class Phone { // 만들 때 modifiers > package 체크 : default 
	private String name;
	
	private String color;
	
	private String brand;

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	// 기본 생성자 > 객체 생성할 때 호출되기만 한다. 
	public Phone() {
		
	}
}
