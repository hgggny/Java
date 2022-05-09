package com.kh.chapter3.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class B_JavaTime {
	public void method1() {
//		LocalDateTime now = new LocalDateTime(); // private 이므로 직접 객체 생성 X
		
		// 시스템으로부터 현재 날짜 및 시간을 읽어와 LocalDateTime 객체를 생성 후 리턴한다.
		LocalDateTime now = LocalDateTime.now();
		// 매개값으로 주어진 날짜 및 시간 정보에 대한 LocalDateTime 객체를 생성 후 리턴한다.
		LocalDateTime when = LocalDateTime.of(2022, 5, 25, 22, 42, 59);
		
		LocalDateTime LocalDateTime = now;
		System.out.println(LocalDateTime);
		System.out.println(when); // 2022-05-25T22:42:59
		System.out.println(ZonedDateTime.now()); // 2022-04-19T10:07:39.718892900+09:00[Asia/Seoul]
		System.out.println();
		
		// getYear, getMonth 등 : 정적 메소드
		System.out.println(LocalDateTime.getYear());
		System.out.println(LocalDateTime.getMonth()); 	 // APRIL
		System.out.println(LocalDateTime.getMonthValue()); // 4
		System.out.println(LocalDateTime.getDayOfMonth());
		System.out.println(LocalDateTime.getDayOfWeek());
		System.out.println(LocalDateTime.getDayOfYear());
		System.out.println(LocalDateTime.getHour());
		System.out.println(LocalDateTime.getSecond());
		System.out.println(LocalDateTime.getNano());
		
		
//		LocalDateTime plusDays = now.plusDays(1); // 현재를 기준으로 +1, 원본은 변화 없음
		LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(1); // 이어서 쓰는 것 - 메소드체이닝
		LocalDateTime minusMonths = now.minusMonths(2);
		
		System.out.println(now); 			// 2022-04-19T09:49:27.346120300
		System.out.println(plusDays);		// 2022-04-20T09:49:27.346120300
		System.out.println(minusMonths);	// 2022-02-19T09:49:27.346120300
		System.out.println();
		
		System.out.println(now.isAfter(plusDays));		// false, now 기준으로 plusDays보다 후에 있는가
		System.out.println(now.isBefore(plusDays));		// true, now 기준으로 plusDays보다 전에 있는가
		System.out.println(now.isAfter(minusMonths));	// true
		System.out.println(now.isBefore(minusMonths));	// false
		System.out.println();
		
		
		
		// Date랑 Time을 따로 받으므로 같은 of라도 매개값을 다르게 받는다. 
//		LocalDate localDate = LocalDate.now();
//		LocalDate localDate = LocalDate.of(2022, 5, 25); // 2022-05-25
		LocalDate localDate = now.toLocalDate(); 		// 위에서 지정한 LocalDateTime에서 날짜만 빼오기
		
//		LocalTime localTime = LocalTime.now();
//		LocalTime localTime = LocalTime.of(9,27,34);	// 09:27:34
		LocalTime localTime = now.toLocalTime(); 		// 위에서 지정한 LocalDateTime에서 시간만 빼오기

		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println();
		
		
		// 문자열을 LocalDate 객체로 파싱
		localDate = LocalDate.parse("2022-09-09");
//		localDate = LocalDate.parse("20220909"); // error [java.time.format.DateTimeParseException] 
//		localDate = LocalDate.parse("20220909", DateTimeFormatter.ofPattern("yyyyMMdd")); // 해결 1. 포맷 지정해주기
//		localDate = LocalDate.parse("20220909", DateTimeFormatter.BASIC_ISO_DATE); // 해결 2. 상수를 정의되어 있는 것을 사용
		
		System.out.println(localDate);
		System.out.println();
		
		
		// LocalDateTime 객체를 문자열로 변환 [toString / DateTimeFormatter]
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(now.toString());
		System.out.println(now.format(formatter));
		
		
		formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
		System.out.println(now.format(formatter));
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
//		System.out.println(now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)); // now에는 시간정보가 없어서 error
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)); // 위 error 해결
	}
}
