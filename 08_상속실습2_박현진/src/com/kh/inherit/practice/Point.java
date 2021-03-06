package com.kh.inherit.practice;

public class Point {
	private int x;
	private int y;
	
	public Point() {	// 기본 생성자 
	}
	
	public Point(int x, int y) {	// 매개변수 생선자
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {			// x, y 좌표 값을 출력하는 메소드
		System.out.println("\n(x, y) : " + "(" + x + ", " + y + ")" );
	}
}
