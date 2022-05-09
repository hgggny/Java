package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = { 8, 6, 4, 9, 2, 5, 10, 7, 3, 1 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void practice2() {
		int[] arr = { 8, 6, 4, 9, 2, 5, 10, 7, 3, 1 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

//		int[] arr = new int[10];
//
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = arr.length - i;
//		}
//
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

	public void practice3() {
		int[] num;
		int count = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("양의 정수: ");
		count = scanner.nextInt();
		num = new int[count];

		for (int i = 0; i < count; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
		scanner.close();
	}

	public void practice4() { // string의 비교는 equals
		String[] str = new String[] { "사과", "귤", "포도", "복숭아", "참외" };

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("귤")) {
				System.out.printf("%s은 %d번째이다.", str[i], i + 1);
			}
		}
	}

	public void practice5() {
		String str = null;
		char ch = '\u0000';
		int count = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열 > ");
		str = scanner.nextLine();

		System.out.print("문자 > ");
		ch = scanner.nextLine().charAt(0);

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : %d", ch, count);
		scanner.close();

//		char ch = '\u0000';
//		String str = "";
//		char[] arr = null;
//		int count = 0;
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("문자열 : ");
//		str = scanner.nextLine();
//
//		System.out.print("문자 : ");
//		ch = scanner.nextLine().charAt(0);
//
//		arr = new char[str.length()];
//
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = str.charAt(i);
//		}
//
//		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
//
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == ch) { 
//				System.out.print(i + " ");
//
//				count++;
//			}
//		}
//
//		System.out.println();
//		System.out.println(ch + "개수 : " + count);
	}

	public void practice6() {
		String[] weekday = new String[] { "월", "화", "수", "목", "금", "토", "일" };
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("0 ~ 6 사이 숫자 입력 : ");
			num = scanner.nextInt();

			if (num >= 0 && num <= 6) {
				for (int i = 0; i < weekday.length; i++) {
					if (i == num) {
						System.out.printf("%s요일", weekday[i]);
					}
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
			continue;
		}

	}

	public void practice7() {
		int[] arr;
		int count = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 : ");
		count = scanner.nextInt();

		arr = new int[count];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		System.out.printf("총 합 : %d", sum);
	}

	public void practice8() {
		int size = 0;
		int count = 1;
		int[] arr;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			size = scanner.nextInt();

			if (size % 2 != 0 && size >= 3) {
				arr = new int[size];

				for (int i = 0; i < arr.length; i++) {
					arr[i] = count;
					if (i < arr.length / 2) {
						count++;
					} else {
						count--;
					}
					System.out.print(arr[i]);
				}
				System.out.println();
				break;

			} else {
				System.out.println("다시 입력하세요");
				continue;
			}

		}
	}

	public void practice9() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10) + 1;
			System.out.print(num[i] + " ");
		}
	}

	public void practice10() {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10) + 1;
			System.out.print(num[i] + " ");
		}
		System.out.println();

		Arrays.sort(num);

		System.out.println("max : " + num[9]);
		System.out.println("min : " + num[0]);
	}

	public void practice11() {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--; // i를 감소시켜서 다시 뽑을 수 있도록 한다.

					break;
				}
			}
		}
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j] + " ");

		}
	}

	public void practice12() {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
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
	}

	public void practice13() { // 배열 선언과 초기화 따로 하는 방법, 정확히 숙지!
		String id = null;
		char[] ch;

		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		id = scanner.nextLine();
		ch = new char[id.length()];

		for (int i = 0; i < id.length(); i++) {
			if (i < 7) {
				ch[i] = id.charAt(i);
			} else {
				ch[i] = '*';
			}
			System.out.print(ch[i]);
		}
		scanner.close();
	}

}
