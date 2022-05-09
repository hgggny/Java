package com.kh.chapter3.assiststream;

import java.io.Serializable;

public class Member implements Serializable { // 직렬하고자 하면 [Serializable] 을 구현해야 한다. 
	
	private static final long serialVersionUID = -5236124721796700179L;

	private String id;
	
	private transient String pwd; // transient : 직렬에서 제외.
	
	private String name;
	
	private int age;
	
	private transient double point;
	
	public Member(String id, String pwd, String name, int age, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", point=" + point + "]";
	}
}
