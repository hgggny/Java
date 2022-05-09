package com.kh.dimension.practice;

/*
 * 2차원 배열
 * 
 * 1. 2차원 배열의 선언
 * 	 [표현법]
 *  	자료형[][] 배열명;
 * 	 	자료형 배열명[][];
 * 
 * 2. 2차원 배열의 생성
 * 	 [표현법]
 * 		배열명 = new 자료형[행 크기][열 크기];
 * 
 * 3. 2차원 배열의 선언과 생성을 동시에 진행
 * 	 [표현법]
 *  	자료형[][] 배열명; = new 자료형[행 크기][열 크기];
 * 	 	자료형 배열명[][]; = new 자료형[행 크기][열 크기];
 * 		
 * 4. 2차원 배열의 초기화
 *    1) 배열 변수와 인덱스를 이용한 초기화
 *   	배열명 [0][0] = 값;
 *   	배열명 [0][1] = 값;
 *   	배열명 [1][0] = 값;
 *   	...
 *   
 *    2) 선언과 동시에 초기화
* 	  자료형[][] 배열명 = new 자료형[][] {{값, 값, ..}, {값, 값, ..}, ...};
 * 	  자료형 배열명[][] = new 자료형[][] {{값, 값, ..}, {값, 값, ..}, ...};
 * 	  자료형[][] 배열명 = {{값, 값, ..}, {값, 값, ..}, ...};
 * 	  자료형 배열명[][] = {{값, 값, ..}, {값, 값, ..}, ...}; 
 *    
 *    3) 중첩 반복문을 이용한 초기화 (반복문)
 *    
 *    
 */
public class DimensionalArray {
	// 2차원 배열의 선언, 생성, 초기화
	public void method1() {
		// 2차원 배열의 선언
		int[][] iArray; // 메모리(Stack)에 정수형 2차원 배열의 주소를 보관할 공간이 할당된다. (참조변수)
//			int iArray[][]; 
//			int[] iArray[];

//			iArray2 = {{15,14,13,12,11}, {10,9,8,7,6}, {5,4,3,2,1}}; // error
//			iArray2 = new int[][] {{15,14,13,12,11}, {10,9,8,7,6}, {5,4,3,2,1}}; // OK
//			int iArray2[][];
		int iArray2[][] = { { 15, 14, 13, 12, 11 }, { 10, 9, 8, 7, 6 }, { 5, 4, 3, 2, 1 } };

		// 2차원 배열의 생성
		iArray = new int[3][5]; // 메모리(Heap)에 총 15개의 정수형 데이터를 저장할 수 있는 2차원 배열 생성

		// 2차원 배열의 초기화
		/*
		 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 * 
		 * 바깥쪽 for문 -> 행의 개수만큼 반복 안쪽 for문 -> 열의 개수만큼 반복
		 * 
		 * iArray.length = 행길이 iArray[].length = 열길이
		 * 
		 */

		// 행의 길이 출력
		System.out.println(iArray.length);

		// 각 행별 열의 길이 출력
		System.out.println(iArray[0].length);
		System.out.println(iArray[1].length);
		System.out.println(iArray[2].length);

		int value = 1;

		// 값의 초기화
		for (int i = 0; i < iArray.length; i++) {
			for (int j = 0; j < iArray[i].length; j++) {
				iArray[i][j] = value++;
			}
		}

		// 값을 출력
//	for(
//	int i = 0;i<iArray.length;i++)
//	{
//		for (int j = 0; j < iArray[i].length; j++) {
//			System.out.printf("%2d ", iArray[i][j]);
//		}
//		System.out.println();
//	}

		// 생성과 동시에 초기화된 배열의 출력
		for (int i = 0; i < iArray2.length; i++) {
			for (int j = 0; j < iArray2[i].length; j++) {
				System.out.printf("%2d", iArray2[i][j]);

			}
			System.out.println();
		}

	}

	public void method2() {
		/*
		 * Java Oracle HTML CSS JS jQuery JSP Spring Docker
		 * 
		 */
		// 2차원 배열 선언 및 생성
		String[][] array = new String[3][3];

		// 2차원 배열의 선언, 생성, 초기화를 동시에 진행
//		String[][] array = new String[][] {
//			{"Java", "Oracle", "HTML"}, {""}, {}
//		};

		// 2차원 배열 초기화
		array[0][0] = "Java";
		array[0][1] = "Oracle";
		array[0][2] = "HTML";
//		array[0][3] = "HTML"; // error

		array[1][0] = "CSS";
		array[1][1] = "JS";
		array[1][2] = "jQuery";

		array[2][0] = "JSP";
		array[2][1] = "Spring";
		array[2][2] = "Docker";

		// 2차원 배열 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();

		}
	}

	public void method3() {
		// 가변 배열의 선언과 생성을 동시에 진행
		int arr1[][] = new int[3][];
		int arr2[][] = { { 1, 2, 3 }, { 4 }, { 5, 6, 7, 8, 9 }, { 10, 11 } };

		// 각 행에 다른 배열을 참조할 수 있도록 생성
		arr1[0] = new int[2]; // 0행은 2열
		arr1[1] = new int[3]; // 1행은 3열
		arr1[2] = new int[5]; // 2행은 5열
		
		
		// 가변 배열의 출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.printf("%2d", arr1[i][j]);
			}

			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%2d", arr2[i][j]);
			}

			System.out.println();
		}
		System.out.println();

		// 2차원 배열의 복사 > 얕은 복사가 된다. 
		int[][] arr3 = arr1.clone();

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.printf("%2d", arr1[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		
		System.out.println(arr1[0].hashCode()); // 1792845110
		System.out.println(arr1[1].hashCode()); // 896681694
		System.out.println(arr1[2].hashCode()); // 687241927
		System.out.println(arr3[0].hashCode()); // 1792845110
		System.out.println(arr3[1].hashCode()); // 896681694
		System.out.println(arr3[2].hashCode()); // 687241927
	}
}
