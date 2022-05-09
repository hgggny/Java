package com.kh.inherit.practice;

public class Circle extends Point {
	private int radius;
	
	public Circle() {	// 기본 생성자
	}
	
	public Circle(int x, int y, int radius) {	// 매개변수 생성자
		super(x, y);							// x, y는 부모 생성자를 통해 초기화
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : " + Math.PI * radius * radius + "\n둘레 : " + Math.PI * radius * 2);
	}
	
	
}
