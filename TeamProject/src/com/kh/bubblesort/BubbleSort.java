package com.kh.bubblesort;

public class BubbleSort {
	public void bubblesort1() {
		// a = 임시 저장
		int[] sort = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int a;

		System.out.println("<버블 정렬 적용 전>");
		for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}

		System.out.println();
		System.out.println();

		System.out.println("<버블 정렬 적용 후>");
		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < sort.length - i - 1; j++) { // -1을 안할 경우 error [Index 10 out of bounds for length 10]
				if (sort[j] > sort[j + 1]) { 
					a = sort[j]; // sort[j]가 sort[j + 1] 보다 클 경우 sort[j]의 값을 a 변수에 임시 저장 
					sort[j] = sort[j + 1]; // sort[j + 1]을 sort[j]에 대입하고 
					sort[j + 1] = a; // a 변수에 임시로 저장된 sort[j]의 값을 sort[j + 1]에 넣어준다.
				}
			}
		}
		System.out.println();
		for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
	}

	// j=0 9 10 8 7 6 5 4 3 2 1
	// j=1 9 8 10 7 6 5 4 3 2 1
	// j=2 9 8 7 10 6 5 4 3 2 1
	// ...
	// j=8 9 8 7 6 5 4 3 2 1 10

	// i=0 9 8 7 6 5 4 3 2 1 10
	// i=1 8 7 6 5 4 3 2 1 9 10
	// ...
	// i=9 1 2 3 4 5 6 7 8 9 10

	
}
