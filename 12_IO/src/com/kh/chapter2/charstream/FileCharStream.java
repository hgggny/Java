package com.kh.chapter2.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream { // FileByteStream보다 코드를 간소화.
	public void fileSave() { // 문자열 기반으로 저장했기 때문에 한글 입력해도 정확하게 출력 가능.
		// try-with-resource 문을 통해서 사용한 리소스를 자동으로 close 시킨다.
		try (FileWriter fw = new FileWriter("b_char.txt")){
			
			fw.write("IO 재미있으신가요?... ㅋㅋ\n");
			fw.write("아닌가여 ?ㅠ");
			fw.write('a');
			fw.write('b');
			fw.write('\n');
//			fw.write({'a'}); // error
			fw.write(new char[]{'a', 'p', 'p', 'l', 'e'}); // 매개값을 넘길 때는 new 연산자 사용하기
			
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try (FileReader fr = new FileReader("b_char.txt")){ // FileReader : 데이터를 문자 단위로 읽기.
			int value = 0;
			
			while((value = fr.read()) != -1) {
				System.out.println((char) value);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 없으면 error -> 왜??????????????????????????
			e.printStackTrace();
		}
	}
}
