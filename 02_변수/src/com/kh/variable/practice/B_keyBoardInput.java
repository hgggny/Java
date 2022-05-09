package com.kh.variable.practice;

import java.util.Scanner;

public class B_keyBoardInput {
	public void inputByScanner() {
		/*
		 * Scanner 클래스
		 * 	- 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스이다. 
		 */
		
		//Scanner 생성
		
		String name = "";    // 초기화, "" 대신 참조변수라서 null 을 사용하기도 함 
		double height = 0.0;
		char gender = '\u0000';
		Scanner scanner = new Scanner(System.in);   // System.in 키보드로부터 입력을 받는다. (표준 입력)
		
				/*
				 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어온다. (공백 포함)
				 * scanner.next() : 사용자가 입력한 값 중에 공백이 있을 경우 공백 이전까지의 값만 읽어온다. 
				 * scanner.nextInt() : 정수를 입력받을 때 사용한다.
				 * scanner.nextDouble() : 실수를 입력받을 때 사용한다.
				 * ...
				 */
		
		System.out.println("당신의 이름은 무엇입니까?");
		name = scanner.nextLine();
		
		
		System.out.println("당신의 키는 몇 입니까?(소수점 첫째자리까지 입력하세요.)");
		height = scanner.nextDouble();
		
		System.out.println("당신의 성별은 무엇입니까? (남/여)");
		
				/*
				 * scanner.nextXXX() 메소드 뒤에 scanner.nextLine() (기본 자료형을 입력 받고 문자를 입력 받을 때) 메소드를 사용하게 되면 버퍼에 남아있는 	
				 * '엔터'를 빼주기 위해서 scanner.nextLine() 메소드를 한번 더 호출한다. 
				 */
		
		scanner.nextLine(); 
		gender = scanner.nextLine().charAt(0); // charAt() 문자열에서 제공해주는 메소드 
				/*
				 * [코드 해설]
				 * scanner.nextLine() 으로 "남자"라는 문자열 호출
				 * String 클래스의 charAt() 으로 "남자"라는 문자열에서 index 0인 첫번째 '남' 호출
				 * == charAt()에 위치를 지정하는 방법은 제일 앞의 문자부터 0으로 시작해서 1씩 증가하며 원하는 문자를 뽑아낸다. 
				 */
		
		// 같은 표현
//		gender = "남자".charAt(0); 
				/*
				 * [코드 해설]
				 * 입력값을 받지 않고 바로 호출, String은 new 로 만들지 않고도 바로 호출할 수 있는 유일한 클래스
				 * 0 : 0번째 문자를 말한다. >> 1로 바꿨을 경우 1번(두번째) '자'라는 문자가 호출
				 * 
				 */
//		gender = new String("남자").charAt(0);  // String 클래스를 생성하고 charAt 메소드를 호출
		
//		System.out.println("당신의 이름은 " + name + ", 키는 " + height + "cm, 성별은 " + gender + " 입니다.");
		System.out.printf("당신의 이름은 %s , 키는 %.1fcm, 성별은 %s입니다.", name, height, gender);
		scanner.close();
		
	}
}
