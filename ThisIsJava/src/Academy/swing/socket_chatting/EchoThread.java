package Academy.swing.socket_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class EchoThread extends Thread{

	Socket socket;
	Vector<Socket> vec;
	
	// 명단을 받아와서 쓰레드를 실행, 접속대기 쓰레드임.
	public EchoThread(Socket socket, Vector<Socket> vec) {
		
		// 쓰레드가 연결되어 있는 소켓.
		this.socket = socket;
		this.vec = vec;
	}
	
	// 전송받은 문자열을 다른 클라이언트들에게 보내줌.
	public void run() {
		BufferedReader br = null;
		
		try {
			// 어느 소켓으로 정보를 받는지를 확인. 서버쪽에선 stream사용.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 대화 내용을 저장하는 변수
			String str = null;
			
			// 클라이언트가 접속을 끊을때까지 지속적으로 양방향 통신을 해야하므로 while문으로 돌린다. 서버 종료시 반복문 탈출.
			// => 한 클라이언트로부터 메세지가 오면 접속된 다른 사람들에게 메세지를 보내준다.
			while (true) {
				// readLine으로 읽어들인 클라이언트의 메세지를 str에 저장
				str = br.readLine();
				
				// 소켓의 접속이 끊어지면 쓰레드의 사용 이유가 없으므로 종료시킴
				if (str == null) {
					// 접속이 끊어진 클라이언트의 정보를 배열에서(vector == 접속된 클라이언트의 명단) 삭제한다.
					vec.remove(socket);
					break; // 연결된 상대가 없어졌으므로 쓰레드를 종료시킨다 (종료 : 반복문 탈출)
					
				}
				
				// 정상적인 메세지가 왔을 때. (연결된 다른 소켓들(vec배열 내에 저장되어있는 클라이언트)에게 문자열을 보내준다.
				sendMessage(str);
				
			}
			
		} catch (IOException ie) {
			System.out.println("이러한 이유로 예외가 발생하였습니다. : " + ie.getMessage());
		} finally {
			try {
				// not null이라는건 아직 연결이 된 상태. 하지만 finally는 위의 내용(쓰레드)이 종료된 상태.
				// 즉, 연결이 끊겨 종료된 상태인데 메세지가 계속 보내지는걸 막기 위함.
				if (br != null) {
					br.close(); // 접속이 끊겼는데 메세지가 남아있으면 그 메세지를 닫아준다. (메모리누수방지)
				}
				if (socket != null) {
					socket.close(); // 연결되어 있는 소켓들도 마찬가지로 닫아준다.
				}
			} catch (IOException ie) {
				System.out.println("예기치 못한 문제가 발생하였습니다. : " + ie.getMessage());
			}
		}
	}
	
	public void sendMessage(String message) {
		try {
			// List클래스는 배열의 정확한 값을 유추하기 힘드므로 향상된 for문으로 null직전까지 돌리는게 효율적.
			for (Socket socket : vec) {
				// 벡터리스트에 있는 내용을 가져와 Socket에 있는 참조배열에 저장 한 후 socket 참조변수에 저장 하여 출력.
				// 데이터를 보내준 클라이언트를 제외하고 나머지 연결된 클라이언트 (socket)에게 메세지를 보내줌.
				if (socket != this.socket) {
					// socket : 벡터 명단에서 추출한 클라이언트
					// this.socket : 쓰레드와 연결되어 있는 클라이언트.
					
					PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
					// 데이터를 송신하기 위해 보내는 Stream을 생성,(Stream 클래스를 가져와 객체화 ㅇㅇ)
					pw.println(message);
					
					pw.flush();
					// 메세지를 싹 다 보내버리는 메소드 flush == 물내리기(진짜이뜻임) 이렇게 생각하면 편함.
					// 여기서 작업하는 socket들은 다른 클라이언트들이므로 닫으면 절대 안된다.
					
					
				}
			}
			
		} catch (IOException ie) {
			System.out.println("메세지를 보내다가 알수없는 오류가 발생하였습니다. : " + ie.getMessage());
		}
	}
	
	
}
