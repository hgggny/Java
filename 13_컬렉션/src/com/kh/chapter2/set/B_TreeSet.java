package com.kh.chapter2.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chapter2.set.vo.Music; // -> chapter1은 x

public class B_TreeSet {
	// TreesSet을 생성하고 저장, 출력 테스트
	public void method1() {
		TreeSet<String> ts = new TreeSet<>(); // 기본은 오름차순! 바꾸면 싶으면 매개값으로 넣는다.
		
		// 중복제거, 객체를 오름차순으로 정렬, null 저장 안됨
		ts.add("하하하");
//		ts.add(null); // NullPointerException
		ts.add("나나나");
		ts.add("가가가");
//		ts.add(null);
		ts.add("다다다");
		ts.add("다다다");
//		ts.add(null);
		ts.add("하하하");
		
		System.out.println(ts);			// [가가가, 나나나, 다다다, 하하하]
		System.out.println(ts.first());	// 가가가 	-> set에는 없다!
		System.out.println(ts.last());	// 하하하	-> set에는 없다!
	}
	
	// TreesSet에 Music 객체를 저장, 출력 테스트
	public void method2() {
//		Set<Music> set = new TreeSet<>(); 
		Set<Music> set = new TreeSet<>(new Comparator<Music>() { // [익명구현객체] 만들기 - Music은 chapter2으로 import

			@Override
			public int compare(Music o1, Music o2) { // 정렬 기준을 새로 직접 해준다
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		}); 
		
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("나는 트로트가 싫어요", "임창정", 5));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		
		// chapter2.set에서 compareTo를 재정의해서 랭킹을 기준으로 오름차순
		// hashCode(), equals()도 오버라이딩 돼야 한다.
		for (Music music : set) {
			System.out.println(music);
		}
	}
}
