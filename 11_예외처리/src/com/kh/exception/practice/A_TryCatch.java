package com.kh.exception.practice;

/*
 * try-catch
 * 
 *   [표현법]
 *     try {
 *     		// 예외가 발생할 가능성이 있는 코드가 위치한다.
 *     } catch(Exception e) {
 *     		// try 블록에서 예외가 발생하면 실행을 멈추고 catch 블록으로 이동하여 예외처리를 실행한다.
 *     } [finally {
 *     		// 예외가 발생하지 않거나 예외가 발생해 catch 블록을 실행한 후 무조건 실행되는 코드 블록이다.
 *     		// finally 블록은 생략이 가능하다. 
 *     }]
 */
public class A_TryCatch {
	public void method1() {
		try {
			// 예외가 발생할 가능성이 있는 코드
//			int result = 10 / 0;
//			System.out.println(result);
			
			System.out.println("method2() 호출 전");
			
			method2();
			
			System.out.println("method2() 호출 후");
		} catch (Exception e) {
			System.out.println("에러발생 : " + e.getMessage());
//			e.printStackTrace(); // 에러는 보여주고 프로그램 끝까지 마무리.
			
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행된다. ");
			
		}
	}
	
	public void method2() throws Exception {
		throw new Exception("강제로 예외를 발생");
	}
}
