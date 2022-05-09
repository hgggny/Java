package com.kh.exception.practice;

import java.io.IOException;

public class B_Throws {
	
	public void method1(){
		try {
		System.out.println("method2() 호출 전");
	
		method2();
		
		System.out.println("method2() 호출 후");
		
		} catch(ClassNotFoundException | IOException e) { // 멀티 catch
			System.out.println("ClassNotFoundExceptione, IOException 예외가 발생했습니다.");
		}
//		} catch(ClassNotFoundException e) { // 상위 클래스에 예외가 하위클래스에 예외보다 뒤에 있어야 한다. 
//			System.out.println("ClassNotFoundExceptione 예외가 발생했습니다.");
//			
//		} catch(IOException e) {
//			System.out.println("IOException 예외가 발생했습니다.");
//			
//			// 상위 클래스의 예외가 하위클래스의 예외보다 뒤에 있어야 한다. -> Exception e 이 위에 있으면 도달할 수 없는 에러 발생.
//		} 
		catch(Exception e) { // Exception e = new ClassNotFoundException(), Exception e = new IOException()
			System.out.println("예외가 발생했습니다.");
		}
	}
	
	public void method2() throws ClassNotFoundException, IOException {
		System.out.println("method3() 호출 전");
		method3();
		System.out.println("method3() 호출 후");
	}

//	public void method3() throws Exception { // 상속
	public void method3() throws ClassNotFoundException, IOException {
		int random = (int)(Math.random() * 4 + 1);
		
		/*
		 * CheckException
		 * 	  - Exception 클래스를 상속하고 있는 예외들을 CheckException이라 한다. 
		 * 	  - 컴파일 시 예외 처리 코드가 있는 검사하고 예외 처리 코드가 없으면 컴파일 에러를 발생시킨다. 
		 *  	(try-catch, throws)
		 *  
		 *  UnCheckedException
		 *    - RuntimeException 클래스를 상속하고 있는 예외들을 UnCheckedException이라 한다.
		 *    - 컴파일 시 예외 처리 코드가 있는지 검사하지 않는다. 
		 * 
		 */
		
		if(random == 1) {
			throw new ClassNotFoundException();
		} else if(random == 2) {
			throw new IOException();
		} else if(random == 3) {
			throw new ClassCastException();
		}
	}
}
