package com.kh.chapter3._interface;

public class Desktop extends Product {
	
	private boolean allInone; // 일체 여부

	public Desktop() {
	}

	public Desktop(String pCode, String name, String brand, int price, boolean allInone) {
		super(pCode, name, brand, price);  
		
		this.allInone = allInone; 
	}

	public boolean isAllInone() {
		return allInone;
	}

	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
	@Override
	public String toString() {
		return "Desktop [" + super.toString() + ", allInone=" + allInone + "]";
	}

	@Override
	public void turnOn() {
		System.out.println("데스크톱을 켭니다");		
		
	}

	@Override
	public void turnOff() {
		System.out.println("데스크톱을 종료합니다.");		
		
	}
	
	
}
