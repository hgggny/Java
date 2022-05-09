package com.kh.chapter2;

import com.kh.chapter2.sync.Buffer;
import com.kh.chapter2.sync.Consumer;
import com.kh.chapter2.sync.Producer;

public class Application {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Thread producer = new Producer(buffer);
		Thread consumer = new Thread(new Consumer(buffer));
		
		producer.start(); // 생산
		consumer.start(); // 소비
		
	}

}
