package com.kh.chapter4.constructor;

/*
 * 생성자 
 * 	- 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다. (필드 초기화, 객체를 사용할 준비)
 *  - 생성자 작성 시 주의사항
 *    - 생성자의 이름은 반드시 클래스 이름과 동일해야 한다. 
 *    - 반환형이 존재하지 않는다.
 */
public class User {
	private String id;
	
	private String password;
	
	private String name;
	
	private int age;
	
	private char gender;
		
	// 기본 생성자 : 객체 생성을 목적으로 만든다. 
	public User() {
		System.out.println("기본 생성자 호출");
	}
	
	// 오버로딩 : 동일한 함수 또는 생성자를 매개변수에 따라서 여러개 가능하다 
	// 매개 변수가 있는 생성자(아이디, 패스워드, 이름)
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password; // 필드의 password = 매개변수의 password
		this.name = name;
	}
	
	// 매개 변수가 있는 생성자(아이, 패스워드, 이름, 나이, 성별)
	public User(String id, String password, String name, int age, char gender) {
//		this.id = id;
//		this.password = password; 
//		this.name = name;
		// 위 세개의 중복되는 코드를 아래로 정리
		// 클래스 내에서 문자열 매개 변수 3개를 가지는 생성자를 호출한다. 
		this(id, password, name);
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String information() {
//		this(id, password, name); // 다른 메소드에서 생성자를 호출하는 것은 불가능하다. 
		return this.id + "," + this.password + "," + this.name + "," + this.age + "," + this.gender;
	}

	
}
