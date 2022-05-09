package com.kh.chapter2.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.chapter2.set.vo.Music;

public class A_HashSet {
	// HashSet을 생성하고 저장, 출력 테스트
	public void method1() {
		Set<String> set = new HashSet<>();  // 생성자에 있는 < > 안에 내용(type parameter)을 생략 가능
		
		set.add(null);
		set.add("반갑습니다");
		set.add(new String("반갑습니다"));
		set.add("여러분");
		set.add("반갑습니다");
		set.add("여러분");
		set.add(null);
		/*
		 * 저장 순서가 유지되지 않고 중복된 데이터는 제거된다.  ->> list는 저장 순서 유지, 중복 저장 가능
		 * 	 - String 클래스에는 hashCode(), equals() 메소드가 오버라이딩 되어있다. 
		 *   - 실제 데이터가 동일한 경우에 동일 객체로 인식되어서 저장되지 않는다. (주소값 상관 없다!)
		 */
		System.out.println("set : " + set); // set : [null, 반갑습니다, 여러분]
		System.out.println();
		
		
		
		// 인덱스가 없기 때문에 인덱스로 접근할 수 없다
		// Set에 저장된 객체에 접근하는 방법
		
		// 1. 향상된 for문 사용하는 방법 (인덱스로 접근 X -> 일반 for문 사용 못함 !)
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println();
		
		// 2. Iterator 반복자를 사용하는 방법
		//   - 가져올 객체가 있는지 확인할 때는 hasNext() 메소드를 사용한다.
		// 	 - 하나의 객체를 가져올 때는 next() 메소드를 사용한다. 
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		// 3. HashSet에 저장된 객체들을 ArrayList에 담아서 사용하는 방법
		ArrayList<String> list = new ArrayList<String>(set);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
	}
	
	// HashSet에 Music 객체를 저장, 출력 테스트
	public void method2() {
		Set <Music> set = new HashSet<>();
		
		// 중복 객체
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("나는 트로트가 싫어요", "임창정", 5));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));

		
		
		/*
		 * Music 클래스는 hashCode(), equals() 메소드를 
		 * 오버라이딩 하지 않았기 때문에 중복제거가 되지 않는다. 
		 * 
		 * Object 클래스에 있는 hashCode(), equals() 메소드는 주소값을 가지고
		 * 비교하기 때문에 필드 값과 상관없이 모두 다른 객체로 인식해서 
		 * 중복이 제거되지 않는다. 
		 * 
		 * Music 클래스에서 hashCode(), equals() 메소드를 오버라이딩(재정의) 해야 한다. 
		 */
		
		for (Music music : set) {
			System.out.println(music);
		}
	}
}
