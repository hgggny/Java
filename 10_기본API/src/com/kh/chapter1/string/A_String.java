package com.kh.chapter1.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class A_String {
	public void method1() {
		// 문자열 리터럴과 new 연산자로 생성된 문자열 비교
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		
		System.out.println(str1 == str2); // true
		System.out.println(str3 == str4); // false
		
		// toString() -> String 클래스에서 이미 오버라이딩 되어있다.
		System.out.println(str1.toString());
		str1.toString();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// equals() -> String 클래스에서 이미 오버라이딩 되어있다. (문자열을 비교할 수 있게 재정의)
		System.out.println("str1.equlas(str2) : " + str1.equals(str2)); // true
		System.out.println("str2.equlas(str3) : " + str2.equals(str3)); // true
		System.out.println("str3.equlas(str4) : " + str3.equals(str4)); // true
		
		// hashCode() 객체를 식별할 수 있는 정수값 -> String 클래스에서 이미 오버라이딩 되어있다. 
		// 데이터가 같으면 같은 정수값을 리턴할 수 있게 hashCode를 구현하고 있다. (hashCode ≠ 주소)
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		System.out.println(str3.hashCode()); // 99162322
		System.out.println(str4.hashCode()); // 99162322
		
		// 주소값 
		System.out.println(System.identityHashCode(str1)); // 1910163204
		System.out.println(System.identityHashCode(str2)); // 1910163204
		System.out.println(System.identityHashCode(str3)); // 305623748
		System.out.println(System.identityHashCode(str4)); // 758529971
	}
	
	public void method2() {
		String str = "Hello World!!";
		
		// 1. charAt(int index) : char 
		// 	  전달받은 index 위치의 하나의 문자만 추출해서 리턴.
		char ch = str.charAt(4);
		
		System.out.println("ch : " + ch); // o
		System.out.println();
		
		// 2. concat(String str) : String 
		//	  전달받은 str과 원본 문자열을 하나로 합친 <새로운 문자열>을 생성해서 리턴. 
		String str2 = str.concat("!!!!!!");
		String str3 = str + "!!!!!!";
		
		System.out.println("Str2 : " + str2); // Hello World!!!!!!!!
		System.out.println("Str3 : " + str3); // Hello World!!!!!!!!
		System.out.println("Str : " + str); // Hello World!! -> 원본 문자열에 영향을 주지 않는다. 
		System.out.println();
		
		// 3. substring(int beginIndex) : String
		//    문자열의 beginIndex 위치에서부터 끝까지의 문자열을 새로 생성해서 리턴.
		// 	  substring(int beginIndex, int endIndex) : String
		// 	  문자열의 beginIndex 위치에서부터 endIndex 이전까지의 새로운 문자열 생성해서 리턴.
		String str4 = str.substring(6);
		String str5 = str.substring(2, 7);
		
		System.out.println("str4 : " + str4); // World!!
		System.out.println("str5 : " + str5); // llo W
		System.out.println("Str : " + str); // 원본 문자열에 영향을 주지 않는다. 
		System.out.println();
		
		// 4. indexOf(String str) : int -> 전달받은 str의 시작 인덱스를 리턴한다. 
		// 								   주어진 문자열이 포함되어 있지 않으면 -1 리턴
		// 	  indexOf(int ch) : int     -> 전달받은 ch의 시작 인덱스를 리턴한다. 
		//  							   주어진 문자가 포함되어 있지 않으면 -1 리턴
//		int index = str.indexOf("World"); // 6
		int index = str.indexOf("World", 7); 
		System.out.println("index : " + index); // -1 ∵7부터 시작해서 해당하는 문자열이 있는지 묻기 때문에 
		
//		index = str.indexOf('o'); // 4
		index = str.lastIndexOf('o'); 
		System.out.println("index : " + index); // 7
		System.out.println();
		
		// 5. replace(char oldChar, char newChar) 
		// String -> 문자열에서 old 문자를 new 문자로 변경된 새로운 문자열을 생성해서 리턴한다.
		String str6 = str.replace('l', 'c'); // Hecco Worcd!!
		System.out.println("str6: " + str6);
		System.out.println("str: " + str); // 원본 문자열에는 영향 X
		System.out.println();
		
		// 6. toUppercase(), toLowerCase
		// String -> 문자열을 모두 대/소문자로 변경될 새로운 문자열을 생성해서 리턴한다. 
		String str7 = str.toUpperCase(); // HELLO WORLD!!
		String str8 = str.toLowerCase(); // hello world!!
		
		System.out.println("str7 : " + str7);
		System.out.println("str8 : " + str8);
		System.out.println("str: " + str); // 원본 문자열에는 영향 X
		System.out.println();
		
		// 7. trim() : String -> 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성해서 리턴한다. 
		str = " JAVA ";
		String str9 = str.trim();
		System.out.println("str9 :" + str9); // [JAVA] 앞뒤로 있던 공백이 사라진다. -> 로그인할 때 공백 들어가서 로그인 시도하는 경우, 자바쪽에서 공백을 제거하고 로그인 시도할 수 있게 !
		System.out.println("str: " + str); // [ JAVA ] 앞뒤로 공백이 한칸씩 있다. 
		System.out.println();
		
		// 8. toCharArray() : char[] -> 문자열의 문자들을 문자 배열에 담아서 해당 배열의 주소값을 리턴한다. 
		str = "Hello";
		char[] array = str.toCharArray(); // H
		System.out.println("array[0] : " + array[0]);
		System.out.println(Arrays.toString(array)); // [H, e, l, l, o]
		System.out.println();
		
		// 9. static valueOf([기본자료(문자 배열, 객체)]) : String -> 입력받은 값들을 문자열로 변경해서 리턴한다. 
		String str10 = String.valueOf(true);
		String str11 = String.valueOf(array);
		String str12 = String.valueOf(3.1415f);
		
		System.out.println("str10 : " + str10); // true
		System.out.println("str11 : " + str11); // Hello
		System.out.println("str12 : " + str12); // 3.1415
		System.out.println();
	}
	
	public void method3() {
		// 구분자를 이용하여 문자열 분리 
		// 분리된 문자의 최소단위를 토큰이라고 한다. 
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring"; 
		
		// 1. String 클래스의 split() 메소드를 이용하는 방법
		String[] strArr = str.split(",");
		
		System.out.println("strArray.length : " + strArr.length); // 6
		System.out.println(Arrays.toString(strArr)); // [Java, Oracle, JDBC, HTML, CSS, Spring]
//		for (String s : strArr) {
//			System.out.println(s);
//		}
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
		System.out.println();
		
		
		// 2. StringTokenizer 객체를 이용하는 방법
		// 	  countTokens() : 남아있는 토큰의 수를 리턴한다. 
		//	  hasMoreTokens() : 남아있는 토큰이 있는지 확인한다. 
		// 	  nextToken() : 토큰을 하나씩 꺼내온다. 
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println("분리 후 문자열의 개수 : " + st.countTokens()); // 6
		
		// while문으로 작성 -> 더 쉬움 !
		while(st.hasMoreElements()) {
			System.out.println(st.countTokens()); // 하나씩 꺼낼 때마다 개수가 줄어든다. 
			System.out.println(st.nextToken());
		}
		System.out.println();
		
		
		// for문으로 작성
//		int length = st.countTokens(); // length를 고정적으로 만들어서 사용한다. 
//		
//		for (int i = 0; i < length; i++) {
//			System.out.println(st.nextToken());
//		}
		
	}	
}
