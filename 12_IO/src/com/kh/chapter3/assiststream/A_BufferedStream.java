package com.kh.chapter3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_BufferedStream { 
//	public void fileSave() {
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		try {
//			fw = new FileWriter("c_buffer.txt"); // 문자 기반 출력 스트림 - 보조 스트림으로 넘기면 필요 없음
//			bw = new BufferedWriter(fw); // 보조 스트림
//			bw.write("안녕하세요. \n");
//			
//			bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//	}

	// 대폭 수정
	public void fileSave() {
		
		// 이렇게 하면 close() 따로 하지 않아도 된다. 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) { // true : 이어서 출력 가능.
			bw.write("안녕하세요. \n");
			bw.write("아직도 IO가 어려워?\n");
			bw.newLine();
			bw.write("줄바꿈이 적용되었나요?");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public void fileRead() {
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){ // 기존 스트림을 보조 스트림으로 만들어줬다.
			
//			System.out.println(br.readLine()); // 한 줄만 읽는다.
//			System.out.println(br.readLine()); // 한 줄만 읽는다.
//			System.out.println(br.readLine()); // 한 줄만 읽는다.
//			System.out.println(br.readLine()); // 한 줄만 읽는다. -> 다 읽으면 null 리턴
			
			// 위 코드 반복문 !
			String value = null;
			
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
