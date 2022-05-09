package com.kh.chapter3.assiststream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class D_ObjectStream {
	public void fileSave() {
		Member member = new Member("ismoon", "1234", "문인수", 20, 1843.7);

		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("e_object.dat"))) {
			System.out.println("객체 출력 전");

			oos.writeObject(member);

			System.out.println("객체 출력 후");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

	public void fileRead() {
		try (ObjectInput ois = new ObjectInputStream(new FileInputStream("e_object.dat"))) {
			
			System.out.println("객체 출력 전");
			
			Member member = (Member) ois.readObject();
			
			System.out.println("객체 출력 후");
			System.out.println(member);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
	}
}
