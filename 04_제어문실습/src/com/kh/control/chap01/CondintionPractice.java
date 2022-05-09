package com.kh.control.chap01;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class CondintionPractice {
	public void practice1() {
		int num = 0;
		String menu = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		num = scanner.nextInt();
		
		switch (num){
			case 1:
				menu = "입력";
				
				break;
			case 2:
				menu = "수정";
				
				break;
			case 3:
				menu = "조회";
				
				break;
			case 4:
				menu = "삭제";
				
				break;
			case 9:
				System.out.println("프로그램이 종료됩니다.");
				scanner.close();
			default:
				System.out.println("잘못입력하셨습니다.0");
				
				return;
		}
		System.out.printf("%s 메뉴입니다.", menu);
		scanner.close();
	}
	
	public void practice2() {
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num = scanner.nextInt();
		
//		if((num > 0) && (num % 2 == 0)) {
//			System.out.println("짝수다");
//		} else {
//			System.out.println("양수만 입력해주세요");
//		}
		if(num > 0) {
			if(num%2 ==0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			} } else {
				System.out.println("양수만 입력해주세요");
			}
		scanner.close();
		}
	
	public void practice3() { 
	
		int kor = 0;
		int math = 0;
		int eng = 0;
		int sum = 0;
		double avg = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		kor = scanner.nextInt();
		
		System.out.print("수학점수 : ");
		math = scanner.nextInt();
		
		System.out.print("영어점수 : ");
		eng = scanner.nextInt();
		
		sum = kor + math + eng;
		avg = sum / 3.0;
		
		if((kor >= 40) && (eng >= 40) && (math >= 40) && (avg >=60.0)) {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.println("불합격입니다.");
		}
		scanner.close();
	}
	
	public void practice4() {
		int num = 0;
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		num = scanner.nextInt();
		
		switch(num) {
			case 3:
			case 4:
			case 5:
			str = "봄";
			
			break;
			case 6:
			case 7:
			case 8:
				str = "여름";
				
				break;
			case 9:
			case 10:
			case 11:
				str = "가을";
				
				break;
			case 12:
			case 1:
			case 2:
				str = "겨울";
				
				break;
			default:
			System.out.printf("%d월은 잘못 입력된 달입니다.", num);
			scanner.close();
			
			return;
		}
		System.out.printf("%d월은 %s입니다.", num, str);
		scanner.close();
	}
	
	public void practice5() {
		String id = "hgggny";
		String passwords = "1234";
		String idInput = "";
		String passInput = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		idInput = scanner.nextLine();
		System.out.print("비밀번호 : ");
		passInput = scanner.nextLine();
		
		if(id.equals(idInput) && passwords.equals(passInput)) {
			System.out.println("로그인 성공");
		} else if(id.equals(idInput)){
			System.out.println("비밀번호가 틀렸습니다.");
		} else if(passwords.equals(passInput)){
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("모두 틀렸습니다.");
		}
		
		scanner.close();
	}
	
	public void practice6() {
		String level = null;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		level = scanner.nextLine();
		
		switch(level) {
			case "관리자":
				result = "회원관리, 게시물 관리, 게시글 작성, 댓글 작성, 게시물 조회";
				
				break;
			case "회원":
				result = "게시글 작성, 댓글 작성, 게시물 조회";
				
				break;
			case "비회원":
				result = "게시물 조회";
				
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				scanner.close();
				
				return;
		}
		System.out.println(result);
		scanner.close();
	}
	
	public void practice7() { 
		double height = 0.0;
		double weight = 0.0;
		double bmi = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		height = scanner.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		weight = scanner.nextDouble();
		
		bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
				System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else{
			System.out.println("고도비만");
		}
			
			scanner.close();
		}

	public void practice8() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		num1 = scanner.nextInt();
		System.out.print("피연산자2 입력 : ");
		num2 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		ch = scanner.nextLine().charAt(0);
		
		switch(ch) {
			case '+':
				result = num1 + num2;
				
				break;
			case '-':
				result = num1 - num2;
				
				break;
			case '*':
				result = num1 * num2;
				
				break;
			case '/':
				result = num1 / num2;
				
				break;
			case '%':
				result = num1 % num2;
				
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다. ");
				scanner.close();
				
				return;
		}
		
		System.out.printf("%d %c %d = %d", num1, ch, num2, result);
		scanner.close();
	}

	public void practice9() {
		double m = 0.0;
		double f = 0.0;
		double h = 0.0;
		double a = 0.0;
		double total = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		m = scanner.nextInt();
		System.out.print("기말 고사 점수 : ");
		f = scanner.nextInt();
		System.out.print("과제 점수 : ");
		f = scanner.nextInt();
		System.out.print("출석 회수 : ");
		a = scanner.nextInt();
		
		total = (m*0.2) + (f*0.3) + (h*0.3) + (a*0.2);
		System.out.println("====== 결과 ======");
		
		if(total >=70 && a >= 14) {
			System.out.println("중간 고사 점수(20) : " +  m*0.2);
			System.out.println("기말 고사 점수(30) : "+ f*0.3);
			System.out.println("과제 점수(30) : " + h*0.3);
			System.out.println("출석 점수(20) : " + a*0.2);
			System.out.println("총점 : " + total);
			System.out.println("PASS");
		} else {
			if(a < 14) {
				System.out.println("FAIL [출석 횟수 부족] ("+  a + "/20)");
		}
		} if (total < 70 ){
			System.out.println("FAIL [점수 미달] (총점 " + total + ")");
		}
		
		
	}
	
	public void practice10() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		CondintionPractice example = new CondintionPractice();
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.print("선택 : ");
		num = scanner.nextInt();
		
		switch(num) {
			case 1:
				example.practice1();
				
				break;
			case 2:
				example.practice2();
				
				break;
			case 3:
				example.practice3();
				
				break;
			case 4:
				example.practice4();
				
				break;
			case 5:
				example.practice5();
				
				break;
			case 6:
				example.practice6();
				
				break;
			case 7:
				example.practice7();
				
				break;
			case 8:
				example.practice8();
				
				break;
			case 9:
				example.practice9();
				
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
				scanner.close();
				
				return;
		}
		scanner.close();
		
	}

}

