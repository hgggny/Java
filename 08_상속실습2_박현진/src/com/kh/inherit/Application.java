package com.kh.inherit;

import com.kh.inherit.practice.Circle;
import com.kh.inherit.practice.Rectangle;

public class Application {
   
	public static void main(String[] args) {
		Circle[] c = new Circle[2];
		Rectangle[] r = new Rectangle[2];
		
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("==== circle ====");
		for (Circle circle : c) {
			circle.draw();
			}
		
		System.out.println();
		System.out.println("==== rectangle ====");
		for (Rectangle rectangle : r) {
			rectangle.draw();
		}
	}

}
