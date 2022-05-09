package com.kh.network.receiver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver implements Runnable {
	private Socket client;

	public Receiver(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		String message = null;
		PrintWriter pw = null;
		BufferedReader br = null;

		try {
			// 5. 연결된 클라이언트와 입출력 스트림 생성한다.
			// 6. 보조 스트림을 통해 스트림의 성능을 개선한다.
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());

			// 7. 스트림을 통해 데이터를 읽고 쓴다.
			while (true) {
				// 클라이언트로 부터 입력이 있을 때까지 대기
				message = br.readLine();

				if (message == null || message.equals("exit")) {
					System.out.println("클라이언트 접속 종료..");

					break;
				}
				System.out.printf("%s가 보낸 메시지 : %s\n", client.getInetAddress().getHostAddress(), message);
				pw.println("메시지 받기 성공 ..");
				pw.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			//  8. 통신을 종료한다.
			try {
				br.close();
				pw.close();
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
