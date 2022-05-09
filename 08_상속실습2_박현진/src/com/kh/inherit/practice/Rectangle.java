package com.kh.inherit.practice;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {	// 기본 생성자
	}

	public Rectangle(int x, int y, int width, int height) {		// 매개변수 생성자
		super(x, y);	// x,y는 부모 생성자를 통해 초기화
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : " + Math.PI * width * height + "\n둘레 : " + (width + height) * 2);
	}
	
	
	
}
