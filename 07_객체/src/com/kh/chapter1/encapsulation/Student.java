package com.kh.chapter1.encapsulation;

public class Student {
	// 필드(속성)
	// 캡슐화를 적용시키기 위해서 접근 제한자를 private로 변경한다. 
	private int sNum; // 학번
	private String name; // 이름
	private int age; // 나이
	private int math; // 수학 점수
	private int eng; // 영어 점수
	
	// 메소드 (기능)
	public int sum() {
		return math + eng;
	}
	
	public double avg() {
		return sum() / 2.0; // 같은 클래스 안에 있는 메소드를 객체 생성하지않고 호출 가능.
	}
	
	/*
	 * 1. Getter 메소드 (
	 * 	- 외부에서 접근이 가능해야 하기 때문에 접근 제한자를 public으로 사용해야 한다. 
	 * 	- 메소드 이름은 getXXX와 같이 붙여주게 된다.(카멜케이스로 작성해야 한다.)
	 * 	- 필드 타입이 boolean일 경우에는 Getter는 get으로 시작하지 않고 is로 시작하는 것이 관례이다
	 *  
	 * 2. Setter 메소드
	 * 	- 외부에서 접근이 가능해야 하기 때문에 접근 제한자를 public으로 사용해야 한다.
	 * 	- 메소드 이름은 setXXX와 같이 붙여주게 된다. (카멜케이스로 작성해야 한다.)
	 */
		

	// 마우스 오른쪽 > source (alt + shift + s) > generate getters and setters

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) { // -> sNum 은 매개변수
		this.sNum = sNum; // this.sNum = 필드의 sNum
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age >= 1) ? age : 1;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math >= 0) {
			if(math > 100) {
				this.math = 100;
			} else {
				this.math = math;
			} 
		} else {
			this.math = 0;
		}
//		this.math = (math >= 0) ? math : 0;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = (eng >= 0) ? eng : 0;
	}
	
	public String information() {
		return "학번 : " + this.sNum + ", 이름 : " + this.name + ", 수학점수 : " + this.math + ", 영어 점수 : " + this.eng + ", 총점 : " + this.sum() + ", 평균 : " + this.avg();}
		
	}
		

