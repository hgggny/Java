package com.kh.control.chap02;

import java.util.Scanner;

public class LoopPractice {

	public void paractice1() { // good
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		num = scanner.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		scanner.close();
	}

	public void practice2() { // good -> break 부분 위치 체크
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = scanner.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.print("잘못 입력하셨습니다. 다시 입력해주세요");
				System.out.println(" ");
				System.out.println(" ");
				continue;
			}

		}

	}

	public void practice3() { // good
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		num = scanner.nextInt();

		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice4() { // good
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = scanner.nextInt();

			if (num >= 1) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				System.out.println(" ");
				continue;
			}
		}

	}

	public void practice5() { // good
		int num = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i < num) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}
		}
		System.out.print(sum);
		;
		scanner.close();
	}

	public void practice6() { // good -> Math.min과 Math.max의 쓰임새 체크
		int num1 = 0;
		int num2 = 0;
		int min = 0;
		int max = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		num1 = scanner.nextInt();

		System.out.print("두 번째 숫자 : ");
		num2 = scanner.nextInt();

		if (num1 >= 1 && num2 >= 1) {
			min = Math.min(num1, num2);
			max = Math.max(num1, num2);

			if (num1 >= num2) {
				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("1 이상의 숫자만을 입력해주세요.");
			}
		}
	}

	public void practice7() { // good
		int num1 = 0;
		int num2 = 0;
		int min = 0;
		int max = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			num1 = scanner.nextInt();

			System.out.print("두 번째 숫자 : ");
			num2 = scanner.nextInt();

			if (num1 >= 1 && num2 >= 1) {
				min = Math.min(num1, num2);
				max = Math.max(num1, num2);

				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}

		}

	}

	public void practice8() { // good
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 : ");
		num = scanner.nextInt();

		System.out.println("=====" + num + "단 =====");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}

		scanner.close();

	}

	public void practice9() { // good -> 중첩 for문 체크
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 : ");
		num = scanner.nextInt();

		if (num >= 2 && num <= 9) {
			for (int i = num; i < 10; i++) {
				System.out.println("=====" + num + "단 =====");
				for (int j = 0; j < 10; j++) {

					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
			}

		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}

		scanner.close();
	}

	public void practice10() { // good -> break 부분 위치 체크
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			num = scanner.nextInt();

			if (num >= 2 && num <= 9) {
				for (int i = num; i < 10; i++) {
					System.out.println("=====" + num + "단 =====");
					for (int j = 0; j < 10; j++) {

						System.out.printf("%d X %d = %d\n", i, j, i * j);
					}
					System.out.println();
				}
				break;

			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}

		}

	}

	public void practice11() { // good -> 코드 순서에 따라 출력값이 달라진다는 것을 느꼈다.
		int start = 0;
		int num = 0;
		int[] iArray = new int[10];
		Scanner scanner = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		start = scanner.nextInt();
		System.out.print("공차 : ");
		num = scanner.nextInt();

		for (int i = 0; i < 10; i++) {
			iArray[i] = start;
			System.out.print(iArray[i] + " ");
			start += num;

		}
		scanner.close();
	}

	public void practice12() { // good -> 코드 리뷰 체크
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		String operator = "";
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			operator = scanner.nextLine();

			if (operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");

				break;
			}

			System.out.print("정수1 : ");
			num1 = scanner.nextInt();

			System.out.print("정수2 : ");
			num2 = scanner.nextInt();
			scanner.nextLine();

			if (operator.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요. \n");

				continue;
			}

			result = 0;

			switch (operator) {
			case "+":
				result = num1 + num2;

				break;
			case "-":
				result = num1 - num2;

				break;
			case "*":
				result = num1 * num2;

				break;
			case "/":
				result = num1 / num2;

				break;
			case "%":
				result = num1 % num2;

				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");

				continue;
			}
			System.out.printf("%d %s %d = %d\n", num1, operator, num2, result);
			System.out.println();
		}
	}
}
