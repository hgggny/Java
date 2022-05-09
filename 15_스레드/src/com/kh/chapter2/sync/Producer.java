package com.kh.chapter2.sync;

public class Producer extends Thread {
	private Buffer buffer;
	
	
	public Producer() {
	}
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				buffer.setData(i);
				
				// 스레드를 매개값에 지정된 시간만큼 지연시키는 메서드
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
