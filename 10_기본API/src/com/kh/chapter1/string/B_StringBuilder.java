package com.kh.chapter1.string;

public class B_StringBuilder {
	public void method1() {
		/*
		 * StringBuilder의 기본 생성자를 통해서 객체를 생성하면 
		 * 16개의 문자를 저장할 수 있는 버퍼가 생성된다.
		 *  
		 * StringBuilder의 생성자에 정수값을 전달해주면 
		 * 해당 크기 만큼의 버퍼가 생성된다.
		 * 
		 * StringBuilder의 생성자에 문자열을 전달해주면 
		 * 문자열 크기 + 16의 버퍼가 생성된다. 
		 * 
		 */
		StringBuilder sb = new StringBuilder(); // 기본 생성자 
		StringBuilder sb1 = new StringBuilder(30); 
		StringBuilder sb2 = new StringBuilder("Hello"); 
		
		
		System.out.println("sb의 문자열 길이 : "  + sb.length()); // 0
		System.out.println("sb의 버퍼의 크기 : "  + sb.capacity()); // 16 (버퍼는 기본적으로 16개의 문자열을 저장할 수 있다.)
		System.out.println("sb1의 문자열 길이 : "  + sb1.length()); // 0
		System.out.println("sb1의 버퍼의 크기 : "  + sb1.capacity()); // 30
		System.out.println("sb2의 문자열 길이 : "  + sb2.length()); // 5
		System.out.println("sb2의 버퍼의 크기 : "  + sb2.capacity()); // 21 (문자열 길이 + 16) -> 문자열의 길이에 따라 추가로 늘려준다. 
	}
	
	public void method2() {
		// StringBuilder를 이요한 문자열의 변경
		String str = "안녕하세요. ";
		StringBuilder sb = new StringBuilder("안녕하세요. ");
		
		System.out.println("str의 주소값 : " + System.identityHashCode(str)); // 1910163204
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb)); // 305623748
		System.out.println();
		
		// 기존 문자열 뒤에 문자열 추가하기
		str +="저는 박현진입니다."; // str = str + "저는 박현진입니다.";
		sb.append("저는 박현진입니다.");
		
		System.out.println(sb); // sb.toSting() -> 안녕하세요. 저는 박현진입니다.
		System.out.println("sb의 문자열 크기 : "  + sb.length()); // 17
		System.out.println("sb의 버퍼의 크기 : "  + sb.capacity()); // 23
		System.out.println("str의 주소값 : " + System.identityHashCode(str)); // 758529971 -> 변함
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb)); // 305623748 -> 그대로 
		System.out.println();
		
		
		sb.append("여러분 조금만 더 힘을 내세요 ~!");
		
		System.out.println(sb); // sb.toSting() -> 안녕하세요. 저는 박현진입니다.여러분 조금만 더 힘을 내세요 ~!
		System.out.println("sb의 문자열 크기 : "  + sb.length()); // 36
		System.out.println("sb의 버퍼의 크기 : "  + sb.capacity()); // 48
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb)); // 305623748 -> 그대로 
		System.out.println();
		
		
		// insert(int offset, String str) : 문자열의 offset 위치부터 전달받은 문자열을 추가한다. 
		sb.insert(1, "ㅎㅎㅎ");
		
		System.out.println(sb); // sb.toSting() -> 안ㅎㅎㅎ녕하세요. 저는 박현진입니다.여러분 조금만 더 힘을 내세요 ~!
		System.out.println("sb의 문자열 크기 : "  + sb.length()); // 39
		System.out.println("sb의 버퍼의 크기 : "  + sb.capacity()); // 48
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb)); // 305623748 -> 그대로 
		System.out.println();
		
		
		// delete(int start, int end) : start에서 end 이전까지의 인덱스에 해당하는 문자열을 삭제한다. 
		sb.delete(1, 4);
		
		System.out.println(sb); // sb.toSting() -> 안녕하세요. 저는 박현진입니다.여러분 조금만 더 힘을 내세요 ~!
		System.out.println("sb의 문자열 크기 : "  + sb.length()); // 36
		System.out.println("sb의 버퍼의 크기 : "  + sb.capacity()); // 48
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb)); // 305623748 -> 그대로 
		System.out.println();
		
		
		// reverse() : 문자열의 순서를 역으로 바꾼다. 
		sb.reverse();
		
		System.out.println(sb); // sb.toSting() -> !~ 요세내 을힘 더 만금조 분러여.다니입진현박 는저 .요세하녕안
		System.out.println("sb의 문자열 크기 : "  + sb.length()); // 36
		System.out.println("sb의 버퍼의 크기 : "  + sb.capacity()); // 48
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb)); // 305623748 -> 그대로 
		System.out.println();
		
		
		// * 메소드 체이닝
		StringBuilder sb2 = new StringBuilder("Java Program ");
		
		// 메소드를 이어서 사용할 수 있는 것을 메소드 체이닝이라고 한다. 
		sb2.append("API").delete(4, 11).reverse();
		
		System.out.println(sb2); // IPA mavaJ
	}

}