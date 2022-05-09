package com.kh.chapter3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class B_ByteToCharStream {
	public void input() {
		String value = null;
		// 여러 개의 보조 스트림을 사용하는 것도 가능하다. 
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("문자열 입력 > ");
			
			value = br.readLine();
			
			System.out.println("value : " + value);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
	
	public void output() {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write("아직도 IO가 어려우신가요?");
			bw.newLine();
			bw.write("앞으로 Oracle, JDBC, HTML, CSS 등이 남아있습니다");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
