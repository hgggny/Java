package com.hgggny.control.practice;

public class For_A {
	/*
	 * For문을 이용해서 별(*)찍기 practice 
	 */
	
	public void practice1() {
		/*
		 * 예시)
		  ***** 
		  *****
		  *****
		  *****
		 */
		
		System.out.println("practice1");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void practice2() {
		/*
		 * 예시) 
		 1*** 2** 3* 4
		 */
		
		// 행이 1 ~ 4까지 반복
		// 열이 1 ~ 4까지 반복
		// 행과 열의 값이 같으면 숫자를 출력, 이외에는 * 출력
		
		System.out.println("practice2");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print(i + 1);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void practice3() {
		/*
		 * 예시)
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		
		System.out.println("practice3");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
}
