package com.kh.chapter3.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class B_Properties {
	// Properties를 생성하고 저장, 출력(파일) 테스트 (즉, 데이터를 외부 데이터에 기록, 객체가 직접 저장)
	public void method1() {
		Properties prop = new Properties(); 
		// 제네릭스(<>) 가 없다. 
		// -> Properties는 Hashtable를 상속받고 Hashtable는 key와 value를 모두 Object로 저장, 
		
		// 순서 유지 X, key값 중복 X
		// Map과 비슷, 매개값을 String으로 받는 것만 다르다고 생각하기 !
		prop.setProperty("List", "LinkedList"); // 매개값을 String으로 받는 것으로 제한.
		prop.setProperty("List", "ArrayList"); // 중복될 경우 : 마지막으로 입력한 value로 덮어쓴다. 
		prop.setProperty("Set", "HashSet"); 
		prop.setProperty("Map", "HashMap"); 
		
		System.out.println(prop);
		System.out.println();
		
		// value 값 읽어오기
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Stack", "값이 없습니다." )); 
		// (String key, String defaultValue) : 저장 안된 key을 입력할 때 기본적으로 출력될 문자를 입력한다. 
		
		for (Entry<Object, Object> entry : prop.entrySet()) { // prop.entrySet()에서 바로 빼서 entry 담아주고 출력 
			String key = (String) entry.getKey(); // 형변환
			String value = (String) entry.getValue();
			
			System.out.printf("key : %s, value : %s\n", key, value);
			System.out.println(key);
			System.out.println(value);
		}
		
		try {
//			prop.store(new FileOutputStream("test1.properties"), "Properties Test 1");
//			prop.store(new FileWriter("test2.properties"), "Properties Test 1");
			prop.storeToXML(new FileOutputStream("test3.xml"), "XML Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Properties를 생성하고 저장(파일), 출력 테스트
	public void method2() {
		Properties prop = new Properties();
		
		try {
//			prop.load(new FileInputStream("test1.properties"));
//			prop.load(new FileReader("test2.properties"));
			prop.loadFromXML(new FileInputStream("test3.xml"));
			
			System.out.println(prop);
			System.out.println(prop.getProperty("List"));
			System.out.println(prop.getProperty("Set"));
			System.out.println(prop.getProperty("Map"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
