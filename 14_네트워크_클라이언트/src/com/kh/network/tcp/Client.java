package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 클라이언트 TCP 소켓 프로그래밍 순서
 * 
 * 1. 서버의 IP 주소와 포트 번호로 클라이언트용 소켓 객체를 생성한다.
 * 2. 서버와 연결된 입출력 스트림을 생성한다.
 * 3. 보조 스트림을 통해 스트림의 성능을 개선한다.
 * 4. 스트림을 통해 데이터를 읽고 쓴다.
 * 5. 통신을 종료한다.
 * 
 */
public class Client {
	public void start() {
		// 1. 서버의 IP 주소와 포트 번호로 클라이언트용 소켓 객체를 생성한다.
		int port = 30027; // 서버 프로그램의 포트 번호
		String serverIP = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scanner = null;
		String message = null;

		try {
			// serverIP = " "; // IP주소 넣기
			// 현재 PC의 IP 주소를 가져온다.
			serverIP = InetAddress.getLocalHost().getHostAddress(); // IP 주소를 넣었을 경우 삭제
			// Socket 객체를 생성하면 서버와 연결을 시도한다.
			// 서버와 연결이 성공한다면 서버와 연결된 소켓 객체를 대입한다.
			// 서버와의 연결이 실패한다면 null 반환한다.
			socket = new Socket(serverIP, port);

			if (socket != null) {
				// 2. 서버와 연결된 입출력 스트림을 생성한다.
				// 3. 보조 스트림을 통해 스트림의 성능을 개선한다.
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream(), true); // 두 번째 매개값 - true : auto flush

				// 4. 스트림을 통해 데이터를 읽고 쓴다.
				scanner = new Scanner(System.in);

				while (true) {
					System.out.print("서버에 보낼 내용 > ");
					message = scanner.nextLine();

					pw.println(message); // 출력 스트림
//					pw.flush();

					if (message == null || message.equals("exit")) {
						System.out.println("접속 종료");

						break;
					}

					System.out.print("받은 메시지 : " + br.readLine());
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 종료는 생성된 역순으로 종료
				scanner.close();
				pw.close();
				br.close();
				socket.close(); // socket은 항상 마지막에 종료

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
