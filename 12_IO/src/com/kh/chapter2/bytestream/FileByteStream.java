package com.kh.chapter2.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileByteStream {
	public void fileSave() { // 파일을 생성하고 데이터를 작성
		FileOutputStream fos = null; // OutputStream(추상메소드)을 상속
		byte[] arr = {99, 100, 101};
		
		try {
			fos = new FileOutputStream("a_byte.dat");
//			fos = new FileOutputStream("a_byte.dat", true); // append가 되는지 여부 - 기존에 있던 것에 덮어쓰게 된다. 
			
			// write는 입력만 가능하고 수정하려면 덮어써야 한다. 
			fos.write(97);   // a 
			fos.write('b');  // b
			fos.write(10);   // 줄바꿈 문자가 저장
			fos.write(97);   // a 
			fos.write(arr);  // 여러개의 바이트를 한번에 넘기고 싶을 경우 [배열]을 이용한다.
			
			arr = new byte[] {'a', 'b', 'c', 'd'};
			
			fos.write(10);   // 줄바꿈 문자가 저장
			fos.write(arr, 1, 2); // 1번부터 2개가 저장 -> bc 출력
			
//			fos.write('한'); // 한글은 2byte로 표현되기 때문에 바이트 단위 스트림으로는 제한이 있다. 
			
			fos.flush();
			
			// write() 메소드 실행 시 IOException이 발생했을 경우 close()가 실행되지 않는다. 
			// 반드시 finally 블록 안에서 close() 메소드를 실행해야 한다. 
//			fos.close(); // 예외가 발생하면 실행되지 않으므로 finally 안으로 !
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 항상 동작 !
			try {
				// 스트림의 사용이 끝났으면 반드시 닫아주어야 한다.
				fos.close(); // 예외처리가 들어가야 한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() { // 위에서 저장한 내용을 읽기.
		FileInputStream fis = null; // InputStream을 상속한다.
		byte[] arr = new byte[100];
		
		try {
			// 파일이 존재하지 않으면 [FileNotFoundException] 예외가 발생.
			// FileInputStream : 예외처리 코드가 없으면 에러가 발생 - Surround with try/catch
			fis = new FileInputStream("a_byte.dat"); 
			
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용한다.
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
			 * 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지 데이터를 읽어오면 된다.
			 */
			
			// fis.read() : 예외처리 코드가 없으면 에러가 발생 - Surround with try/catch 
//			System.out.println((char)fis.read()); // 형변환
//			System.out.println((char)fis.read()); 
//			System.out.println((char)fis.read()); 
//			System.out.println((char)fis.read()); 
//			System.out.println(fis.read(arr));
//			System.out.println(Arrays.toString(arr));
//			System.out.println(fis.read);
			
			int value = 0;
			
			while((value = fis.read()) != -1) {
				System.out.println((char) value);
			}
			
			System.out.println("끝");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// fis.close() : 예외처리 코드가 없으면 에러가 발생 - Surround with try/catch
				fis.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
