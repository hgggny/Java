package com.kh.chapter3;

import com.kh.chapter3.field.A_Field;
import com.kh.chapter3.field.B_StaticField;
import com.kh.chapter3.field.C_StaticFinalField;
import com.kh.chapter3.field.D_InitBlock;

public class Application {

	public static void main(String[] args) {
		// 변수 구분 테스트 
		A_Field field = new A_Field();
//		
//		// 매개 값으로 정수형 데이터를 넘겨주어야 한다.
		field.method1(10); // 매개변수 타입과 동일해야 한다. 

		// 접근 제한자 테스트
		// public : 필드 직접 접근이 가능하다.
		System.out.println(field.publicField);
		
//		protected : 같은 패키지 내에 존재하거나, 자식 클래스에서만 접근이 가능하다. 
//		System.out.println(field.protectedField);
//		
//		default : 같은 패키지 내에서만 직접 접근이 가능하다.
//		System.out.println(field.defaultField);
//		
//		private : 같은 클래스 내에서만 직접 접근이 가능하다.  
//		System.out.println(field.privateField);
		
		
		
		// 3. 클래스 변수 테스트
		// 클래스 변수는 프로그램 실행과 동시에 메모리(static)에 생성되었기 때문에 객체를 생성하지 않아도 접근이 가능하다. 
		System.out.println(B_StaticField.publicStacicField);
		System.out.println(B_StaticField.getPrivateStacicField());
		
		
//		정적 멤버는 객체의 참조 변수로도 접근이 가능하지만, 정적 멤버는 클래스 이름으로 접근하는 것을 지향한다.
//		B_StaticField staticField = new B_StaticField();
//		System.out.println(B_StaticField.publicStacicField);
//		System.out.println(B_StaticField.getPrivatesStacicField);
		
		
		
		
		// 4. 상수 필드 테스트
		// static 키워드로 생성된 필드이기 때문에 객체 생성이 필요없다. 
		System.out.println(C_StaticFinalField.MAX_LEVEL); // static이므로 클래스로 접근 가능하기에 객체 생성 안한다. 
		System.out.println(Math.PI);
		System.out.printf("byte의 표현 범위 : %d ~ %d\n",Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("int의 표현 범위 : %d ~ %d\n",Integer.MIN_VALUE, Integer.MAX_VALUE);
		// final 키워드로 인해서 값을 변경할 수 없다. 
//		C_StaticField.MAX_LEVEL = 99; 
		
		
		
		// 5. 필드 초기화 순서 테스트
		// 필드 > 인스턴스 생성해야 한다.
		D_InitBlock initBlock = new D_InitBlock();
		 
		System.out.println(initBlock.getName());
		System.out.println(initBlock.getPhoneName());
		System.out.println(initBlock.getPrice());
		
		// 클래스 변수 > 객체 필요없음
		System.out.println(D_InitBlock.getAge());
		System.out.println(D_InitBlock.getBrand());
		
		
		
	}

}
