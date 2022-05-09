package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {
		public void printLottoNumbers() {
			int[] lotto = new int[6];
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(lotto);
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		}
		
		public void outputChar(int num, char c) {

			System.out.print(c + "문자 " + num + "개 출력 : ");
			for (int i = 1; i <= num; i++) {
				System.out.print(c + " ");
			}
		}
		
		public char alphabette() { 
			int num = 0;
			
			while(true) {
				num = (int)(Math.random() * 58 + 65); // 65부터 58개의 랜덤값 (즉, 65~122 사이의 랜덤값)
				
				if (num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z') {
					break;
				}
			}
			return (char)num; // 숫자를 문자로 형변환 !
		}
		
		public String mySubstring(String str, int index1, int index2) {
			String result = " ";
			
			if(!str.equals(null)) {
				for (int i = index1; i < index2; i++) {
					result +=str.charAt(i);
				}
			}
			return result;
		}
}
