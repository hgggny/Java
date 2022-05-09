package com.kh.chapter1.file;

import java.io.File;
import java.io.IOException;
// 노션에 없음 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class A_File {
	public void method1() {
		try { 
			// 경로를 지정하지 않으면 현재 프로젝트 폴더에 파일이 생성된다. 
			// 프로젝트 클릭 - F5(refresh) - text.txt 파일 생성 [메모리상에만 존재하는 객체]
			File file = new File("text.txt"); 
//			File file2 = new File("C:/Users/82105/test2.txt");
			
			// 만약에 존재하지 않는 경로를 제시하면 IOException이 발생한다.
			File file2 = new File("C:/Users/82105/temp/test2.txt"); // (1) error [지정된 경로를 찾을 수 없습니다]
			
			System.out.println(file.getName()); 		// 파일 이름
			System.out.println(file.getAbsolutePath());	// 절대 경로
			System.out.println(file.getPath());			// 상대 경로
			System.out.println(file.length());			// 파일 용량
			System.out.println(file.exists()); 			// 파일 존재 여부 // true
		
			file.createNewFile(); // 실제 파일이 생성된다. 
			file.delete(); // 실제 파일이 삭제된다.
			
//			file2.mkdir(); 											// (2) make directory - 텍스트 파일도 폴더 만들어 버린다 ㅠ(오류)
			File tempDir = new File("C:/Users/82105/temp/"); 		// (3) 존재하지 않는 폴더부터 생성
			tempDir.mkdir(); 										// (4) make directory
			file2.createNewFile(); 									// (5) 
			System.out.println(file.exists()); 			// false
			System.out.println(file2.exists()); 		// true
			System.out.println(file2.isDirectory()); 	// false
			System.out.println(tempDir.isFile());		// false
			System.out.println(tempDir.isDirectory());  // true
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
