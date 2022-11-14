package Academy.swing.socket_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

// 키보드로 전송할 메세지를 입력받아서 서버로 전송하는 클래스
class WriteClass {
	Socket socket;
	ClientFrame cf;
	String msg;
	String id;

	public WriteClass(ClientFrame cf) {
		this.cf = cf;
		this.socket = cf.socket;
	}
	
	// 아이디를 알아내는 메소드
	public void getId() {
		this.id = Id.getId();
	}

	public void sendMessage() {
		// 키보드로부터 메세지를 읽어오기 위한 스트림 객체를 생성한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		PrintWriter pw = null;
		
		try {
			// 서버로 메세지를 전송하기 위해 스트림객체를 생성.
			pw = new PrintWriter(socket.getOutputStream(), true); // true쓰는 이유는 버퍼를 기다리지 않고 (8byte(window)) 보내기 위함이다.
			
			// 로그인을 하면, 상대방에게 나의 id,ip와 함께 들어왔다는걸 알린다.
			if (cf.isFirst == true) {
				InetAddress iaddr = socket.getLocalAddress();
				String ip = iaddr.getHostAddress();
				
				//입장할 때 입력한 아이디를 가져와서 id에 저장
				getId();
				
				msg = "[ " + id + " ] 님이 입장하셨습니다. (" + ip + ")";
						
			} else {
				msg = "[ " + id + " ] " + cf.txtF.getText();
			}
			
			//입력한 메세지를 서버로 전송한다.
			pw.println(msg);
			
		} catch (IOException ie) { //IOException == Input Output Exception
			System.out.println(ie.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				
			} catch (IOException ie) {
				System.out.println("리더기를 닫는 중 오류가 발생하였습니다." + ie.getMessage());
			}
		}
	}
	
} //----------------------------------------------

// 서버가 보내오는 문자열을 전송받는 쓰레드
class ReadThread extends Thread {
	Socket socket;
	ClientFrame cf;

	// 생성자 매개변수 소켓, 채팅창으로 선언. 소켓이 들어와 접속이 되면 채팅창이 열리고 상시대기중으로 바뀜.
	public ReadThread(Socket socket, ClientFrame cf) {
		this.socket = socket;
		this.cf = cf;
	}
	
	@Override // 쓰레드의 run메소드는 필수적, main() 메소드나 마찬가지
	public void run() {
		
		BufferedReader br = null;
		
		try {
			// 서버로부터 전송되는 문자열을 읽어오기 위한 스트림 객체를 생성한다.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 언제 메세지가 들어올지 모르므로 상시대기 상태여야 한다.
			while (true) {
				// 소켓으로부터(소켓은 br에 저장) 문자열을 읽어들인다.
				String msg = br.readLine();
				
				// 접속이 끊기면 쓰레드를 종료한다.
				if (msg == null) {
					System.out.println("접속이 끊겼습니다.");
					break;
				}
				
				// 전송받은 문자열을 화면 (대화나누기 화면)에 보여준다.
				cf.txtA.append(msg + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
} //----------------------------------------------

// 서버와 연결하는 메소드 생성.
public class MultiChattingClient {
	public static void main(String[] args) {
		
		// 접속할라면 소켓이 필요
		Socket socket = null;
		
		//소켓에 접속이 되면 채팅창을 띄워야함
		ClientFrame cf = null;
		
		try {
			// 클라이언트와 접속할 서버의 IP주소와 PORT정보로 소켓을 생성해서 접속을 요청한다.
			socket = new Socket("192.168.4.190", 7777);
			// *************소캣을 객체화만 시키고 주소를 대입을 안했다.
			
//			new Socket("localhost", 7777);
//			new Socket("127.0.0.1", 7777);
			// 위의 3개는 전부다 같은것이다.
			System.out.println("서버와 연결되었습니다.");
			
			// 연결이 되었으면 채팅 화면을 띄운다.
			cf = new ClientFrame(socket);
			
			// 서버로부터 메세지가 언제 올지는 모른다, 그러므로 수신상태를 열어놔야한다(쓰레드 구동).
			new ReadThread(socket, cf).start();
			
		} catch (IOException ie) {
			System.out.println("채팅방을 불러오는데 실패하였습니다. : " + ie.getMessage());
		}
	} //----------------------------------------------
} //----------------------------------------------
