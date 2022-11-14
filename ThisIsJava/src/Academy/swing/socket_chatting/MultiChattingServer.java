package Academy.swing.socket_chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MultiChattingServer {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		
		// 클라이언트와 연결된 소켓들을 배열처럼 저장할 백터 객체 생성.
		Vector<Socket> vec = new Vector<>();
		// 벡터 리스트는 arraylist와 동일한 구조를 가지고 있다.
		// 쓰레드 환경이 아닌 환경에선 거의 사용되지 않는다. == 쓰레드 환경에서 주로 사용된다. (동기화된 메소드로 구성됨)
		
		
		try {
			// 포트번호를 가지고 서버소켓을 생성.
			server = new ServerSocket(7777);
			
			while (true) {
				System.out.println("클라이언트의 접속을 기다림.");
				socket = server.accept();
				//연결된 소켓의 정보를 벡터에 저장
				vec.add(socket);
				
				// 클라이언트와 통신할 쓰레드를 구동.
				new EchoThread(socket, vec).start();
			}
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
