package com.kh.chapter4.generics;

import java.util.ArrayList;
import java.util.List;

//public class MyGenerics<T> { // 객체를 생성하는 시점에 T 타입을 결정한다 -> Application class 에서 확인 !
	public class MyGenerics<T extends Number> { 
	private T[] values;
	
	public MyGenerics() {
	}

	public MyGenerics(T[] values) {
		this.values = values;
	}
	
	public void print() {
		for (T t : values) {
			System.out.println(t);
		}
		
	}
	
	public List<T> toList() {
		List<T> list = new ArrayList<>();
		
		for (T t : values) {
			list.add(t);
			
		}
		
		return list;
	}
}
