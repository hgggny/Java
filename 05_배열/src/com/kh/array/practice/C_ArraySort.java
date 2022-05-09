package com.kh.array.practice;

import java.util.Arrays;
import java.util.Collections;

public class C_ArraySort {
	public void method1() {
		int arr[] = {2, 7, 5, 1, 3};
		
//		for (int value : arr) {
//			System.out.printf("%d ", value);
//		}
		System.out.println(arr.hashCode()); // 1910163204
		System.out.println(Arrays.toString(arr)); // [2, 7, 5, 1, 3]
		
		// 오름차순으로 정렬
		Arrays.sort(arr);
		
		System.out.println(arr.hashCode()); // 1910163204 - 정렬을 바꿔도 주소값을 동일
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 7]
		
		// Array.sort는 오름차순만 제공한다 
		// 내림차순으로 정렬
		// 1. for문 사용해서 원본 배열을 오름차순으로 정렬한 다음 값을 반대로 새로운 배열에 대입한다. 
		// 오름차순 배열은 위에서 적용했으므로 반대 배열만 적용시키면 된다. 
		int[] copy = new int[5];
		for (int i = 0; i < arr.length; i++) {
			copy[4 -i ] = arr[i];
//			copy[arr.length -i -1] = arr[i];
//			copy[copy.length -i -1] = arr[i];
		}
		
		System.out.println(arr.hashCode()); // 1910163204
		
		// 2. 아래와 같이 작성하는 방법이 있다. (추후 설명)
		Integer[] iArray = {2, 7, 5, 1, 3};
		
		Arrays.sort(iArray, Collections.reverseOrder());
		
		System.out.println();
		System.out.println(Arrays.toString(iArray)); // [7, 5, 3, 2, 1]
	}
	
	public void method2() {
		String[] array = {"메론", "orange", "apeach", "banana", "apple", "레몬"};
		
		// 오름차순 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		// 내림차순 정렬
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}
	
	/*
	 * 조별 과제
	 * 
	 *  1. 개별로 정렬 알고리즘을 하나씩 선택해서 정리해 주세요.
	 *  	- 삽입 정렬, 버블 정렬, 선택 정렬, 퀵 정렬 ...
	 *  
	 *  2. 시간 복잡도와 공간 복잡도를 정리 
	 *  
	 *  3. 반드시 정리된 내용은 조원들끼리 공유 및 코드 리뷰 진행해 주세요
	 *  
	 *  4. 4/17(일)까지 프로젝트 하나도 만들어서 내용 정리 후 메일로 보내주세요.
	 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

