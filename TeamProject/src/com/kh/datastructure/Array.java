package com.kh.datastructure;

public class Array {
	// 배열은 다 아실 것 같아서 로또 배열 구현하는 코드로 넣었어요 !
	
	public void method1() {
		int[] lotto = new int [6]; // 6개의 정수값을 넣을 수 있는 배열 선언과 생성
		
		// for문을 이용하여 배열에 랜덤값 넣기
		for (int i = 0; i < lotto.length; i++) { 
			// 1~46까지의 임의의 수를 받는다.
			lotto [i] = (int)(Math.random() * 45) + 1; 
			
			// 로또 중복값 제거
			for (int j = 0; j < i; j++) {
				// 중복된 값이 있으면 
				if(lotto[i] == lotto[j]) { 
					i--;
					// 이전 for문으로 돌아가 다시 배열에 랜덤값 넣는다.
					break; 
				}
			}
			
		}
		 System.out.print("로또 번호 : ");
		 
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	
	}
}
