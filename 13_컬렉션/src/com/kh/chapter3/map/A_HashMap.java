package com.kh.chapter3.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chapter3.map.vo.Snack;

public class A_HashMap {
	// HashMap 생성하고 저장, 출력 테스트
	public void method1() {
		Map<String, Snack> map = new HashMap<>(); // Key와 ValueObject를 한번에 받고 (단일객체를 받는 것이 아니라), Key가 식별자 역할을 해 ValueObject에서 값을 찾는다. 
//		Map<String, Snack> map = new TreeMap<>(); // HashMap과 차이점 체크하기
		
		// 저장 순서 유지 X, key값 중복 X 
		// (단, 중복된 key값으로 저장하면 기존 있던 값을 덮어쓴다.)
		map.put("다이제", new Snack("초코맛", 1000)); // value 값은 Snack 객체 만들어서 넘긴다.
		map.put("칸쵸", new Snack("", 250));
		map.put("프링글스", new Snack("오리지날", 500));
		map.put("프링글스", new Snack("어니언맛", 500));
		map.put("허니버터칩", new Snack("꿀버터맛", 520));
		map.put("꼬북칩", new Snack("콘소메", 1200));
		map.put("꼬북칩", new Snack("시나몬초코", 1200));
		
		System.out.println(map);
		System.out.println();
		
		
		// Map 컬렉션에서 key 값에 해당하는 Value를 얻어오는 메서드.
		Snack snack = map.get("다이제");
		
		System.out.println(snack); 	// Snack [flavor=초코맛, calorie=1000]
		System.out.println();
		
		// Map 컬렉션에 담겨잇는 객체들의 개수를 얻어오는 메서드.
		System.out.println("개수 : " + map.size()); // 개수 : 5
		System.out.println();
		
		// Map 컬렉션에서 Key 값에 해당하는 Entry 객체를 삭제하는 메서드.
		map.remove("허니버터칩");
		System.out.println(map);
		System.out.println("개수 : " + map.size()); // 개수 : 4
		System.out.println(map.isEmpty()); // false, 비어있는 여부
		System.out.println();
	
		// Map 컬렉션에 담겨있는 모든 Entry 객체를 삭제하는 메서드. (Map 객체가 삭제되는 것 X)
		map.clear(); 
		
		System.out.println(map);
		System.out.println("개수 : " + map.size()); // 개수 : 0
		System.out.println(map.isEmpty()); // true, 비어있는 여부
		System.out.println();
	}
	
	public void method2() {
		Map<String, Snack> map = new HashMap<>(); 
		
		// 저장 순서 유지 X, key값 중복 X 
		// (단, 중복된 key값으로 저장하면 기존 있던 값을 덮어쓴다.)
		map.put("다이제", new Snack("초코맛", 1000)); // value 값은 Snack 객체 만들어서 넘긴다.
		map.put("칸쵸", new Snack("", 250));
		map.put("프링글스", new Snack("오리지날", 500));
		map.put("허니버터칩", new Snack("꿀버터맛", 520));
		map.put("꼬북칩", new Snack("콘소메", 1200));
		
		// Map은 인덱스의 개념이 없어서 반복문(for문)을 사용할 수 없다. 
//		for (int i = 0; i < map.size i++) {
//		}
		
		// Map은 Iterable 인터페이스를 구현하지 않아서 향상된 for문을 사용할 수 없다. 
//		for (Entry<String, Snack> entry : map) {
//		}
		
		// Map은 List랑 구조가 달라서 ArrayList 담아서 사용할 수 없다.
//		new ArrayList<E>(map) // Map은 컬렉션에 상속관계가 없다. ArrayList는 Collection 타입이어야 한다. 
		
		
		// 1. keySet() 메서드를 이용하는 방법
		Set<String> set = map.keySet(); // key 값을 set에 넣는다. 
		
		for (String key : set) { 		// key 값을 꺼내서 get 메소드로 호출한다.
			System.out.printf("key : %s, value : %s\n", key, map.get(key));
		}
		System.out.println();
		
		
		// 2. entrySet() 메소드를 이용하는 방법
		
		// Entry타입에 객체가 저장될 수 있는데, 
		// key는 String타입, value는 Snack객체 타입이 저장된다. 즉, 키랑 값을 같이 묶어서 저장한다. 
		Set<Entry<String, Snack>> entrySet = map.entrySet(); 
		Iterator<Entry<String, Snack>> iterator = entrySet.iterator();	// 향상된 for문을 사용해도 된다. 
		
		while (iterator.hasNext()) {
			Entry<String, Snack> entry = iterator.next();
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.printf("ket : %s, value : %s\n", entry.getKey(), entry.getValue());
		}
	}
}
