package com.kh.chapter3.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_Date {
	public void method1() {
		// 현재 시간과 날짜에 대한 정보를 가지고 Date 객체를 생성한다. 
		Date now = new Date();// java.util로 선택
		Date when = new Date(1); // long date
		
		System.out.println(now.toString()); // now.toString()
		
		// 1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위로 표기된다. 
		// 한국 표준 시간(KST)으로 출력될 땐 그리니치 평균 시간(GMT) 보다 +9 증가된 시간으로 표시된다. 
		System.out.println(when.toString());
		
		when = new Date(1000L);
		System.out.println(when);
		
		// Deprecated 된 생성자를 사용한 Date 객체 생성
		when = new Date((2022 - 1900),(4 - 1), 18); // java.util.Date
		System.out.println(when); // Mon Apr 18 00:00:00 KST 2022
		System.out.println(when.getYear() + 1900);
		System.out.println(when.getMonth() + 1);
		System.out.println(when.getDate());
		System.out.println(when.getTime()); // 1650207600000
		System.out.println(new Date(1650207600000L)); // Mon Apr 18 00:00:00 KST 2022
		System.out.println();
		
		// SimpleDateFormat 클래스 사용
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss:SSS초"); // 원하는 형태로 날짜를 출력할 수 있다. 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) a hh-mm-ss-SSS"); 
		String formatDate = sdf.format(now);
		
		System.out.println(formatDate);
		
	}
}
