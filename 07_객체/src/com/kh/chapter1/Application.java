package com.kh.chapter1;

//import com.kh.chapter1.abstraction.Student;

import com.kh.chapter1.encapsulation.Student;

public class Application {
	/*
	 * 추상화 캡슐화
	 * 
	 * 1. 추상화
	 * 	- 프로그램에서 사용할 객체들이 가진 공통의 특성을 파악하고 불필요한 특성을 제거하는 과정.
	 * 	- 최종적으로는 선정된 속성들을 가지고 어떠한 자료형과 필드명으로 사용할지 정리해서 코드로 작성하는 것.
	 * 
	 * 2. 캡슐화
	 * 	- 추상화 통해서 정의된 속성들과 기능을 하나로 묶어서 관리하는 기법.
	 * 	- 객체의 필드, 메소드를 하나로 묶고 실제 구현 내용을 감추는 것을 말한다. 
	 * 	- 객체의 데이터에 직접 접근 제한을 막고, 데이터를 간접적으로 처리하는 
	 * 	  메소드들을 클래스 내부에 작성하여 제공하는 방법.
	 * 
	 */
	
	public static void main(String[] args) {
		// 박현진 학생 객체 만들기
//		int sNum1 = 1001;
//		String name1 = "박현진";
//		int age1 = 20;
//		int math1 = 90;
//		int eng1 = 80;
//		int sum1 = math1 + eng1;
//		double avg1 = sum1 / 2;
//		
//		// 홍길동 학생 객체 만들기
//		int sNum2 = 1002;
//		String name2 = "홍길동";
//		int age2 = 28;
//		int math2 = 70;
//		int eng2 = 65;
//		int sum2 = math2 + eng2;
//		double avg2 = sum2 / 2;
		
//		// Student 클래스는 new 연산자를 통해서 Heap 영역에 인스턴스로 생성
//		Student park = new Student(); // 인스턴스(객체) 생성
//		Student hong = new Student(); 
//		
//		// 필드에 직접 접근해서 초기화
//		park.sNum = 1001;
//		park.name = "박현진";
//		park.age = 20;
//		park.math = 90;
//		park.eng = 80;
//		
//		hong.sNum = 1002;
//		hong.name = "홍길동";
//		hong.age = 28;
//		hong.math = 70;
//		hong.eng = 65;
//		
//		
//		// 필드에 직접 접근해서 값을 출력
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f입니다.\n", park.name, park.math, park.eng, park.sum(), park.avg());
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f입니다.\n", hong.name, hong.math, hong.eng, hong.sum(), hong.avg());

		Student park = new Student();
		Student hong = new Student();
		
		// import를 동시에 적용하면 에러가 생기므로 같은 이름의 다른 클래스를 동시에 쓰기 위해서는 패키지명을 포함한 클래스을 다 써야한다. 
//		com.kh.chapter1.abstraction.Student park = new Studnet(); // 필기 제대로 못함 체크하기
		
		// 캡슐화를 하게 되면 아래와 같이 외부에서 직접 접근이 불가능하다. 
//		park.sNum = 1001;
//		park.name = "박현진"; 
//		park.age = 29;
		
		// 캡슐화 작업으로 인해 필드에 직접 접근을 막았다면 간접적으로 접근을 할 수 있도록 메소드를 제공한다. 
		park.setsNum(1001);
		park.setName("박현진");
		park.setAge(20);
		park.setMath(90);
		park.setEng(80);
		
		hong.setsNum(1002);
		hong.setName("홍길동");
		hong.setAge(30);
		hong.setMath(80);
		hong.setEng(65);
		
		
		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f입니다.\n", park.getName(), park.getMath(), park.getEng(), park.sum(), park.avg());
		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f입니다.\n", hong.getName(), hong.getMath(), hong.getEng(), hong.sum(), hong.avg());
		
		System.out.println(park.information());
		System.out.println(hong.information());
	}

}
