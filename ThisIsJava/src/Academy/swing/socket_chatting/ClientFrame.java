package Academy.swing.socket_chatting;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 로그인창 구현 (닉네임 아이디 입력창)
class Id extends JFrame implements ActionListener {

	// 클래스에서 사용될 필드
	static JTextField tf = new JTextField(8); // 닉네임은 최대 8글자로 제한
	JButton btn = new JButton("입장"); // 입력버튼 생성

	WriteClass wc; // 입력한 메세지를 서버로 전송하는 클래스를 불러와 필드선언
	ClientFrame cf; // 채팅창 클래스 불러와 필드선언

	// 생성자 선언
	public Id() {

	}

	// 서버가 보내오는 메세지를 받고, 채팅창을 띄워야한다
	public Id(WriteClass message, ClientFrame cf) {
		super("아이디");
		this.wc = message;
		this.cf = cf;

		setLayout(new FlowLayout()); // flowlayout는 하나의 컴포넌트 옆에 새로운 컴포넌트가 레이아웃되는것.
		add(new JLabel("아이디"));
		add(tf); // 아이디를 쓰는 칸을 붙여야함
		add(btn); // 입장버튼 붙여야함

		btn.addActionListener(this);

		setBounds(400, 200, 250, 200); // setBounds(int 시작x좌표, int 시작y좌표, int 초기 가로width, int 초기 높이height)
		setVisible(true);
	}

	@Override // ActionListener 인터페이스 오버라이딩.
	public void actionPerformed(ActionEvent e) {
		wc.sendMessage(); // 입장하였다는 메세지를 다른 클라이언트들에게 보낸다.
		cf.isFirst = false; // 입장하였으므로 첫 입장을 false로 바꾼다.
		cf.setVisible(true); // 이제 입장하였으니 채팅창을 띄운다.
		this.dispose(); // 채팅창을 띄웠으니 이제 로그인창은 쓸일이 없다. 없애버리자.
	}

	// 입장할때 입력한 아이디를 알아내는 메소드 언제어디서나 출력되야 하므로 정적으로 선언
	static public String getId() {
		return tf.getText();
	}
}

// 채팅창 구현
public class ClientFrame extends JFrame implements ActionListener {
	JTextArea txtA = new JTextArea(); // 대화 내용 보이기 창
	JTextField txtF = new JTextField(16); // 대화내용 입력 필드 // 대화내용 입력창.
	JButton btnTransfer = new JButton("전송"); // 대화내용전송버튼
	JButton btnExit = new JButton("닫기"); // 종료버튼
	JPanel pl = new JPanel(); // 메세지 입력, 전송, 닫기버튼을 올릴 판넬.

	boolean isFirst = true; // 처음 입장여부를 나타내는 변수. 첫 입장 후엔 false로 바뀐다.

	WriteClass wc;
	Socket socket;

	// 들어오는 소켓을 대기하는 채팅창의 매개변수 선언, 소켓이 들어오면 이 소켓값을 받아 채팅창을 제공한다.
	public ClientFrame(Socket socket) {
		super("대화 나누기");

		this.socket = socket;
		wc = new WriteClass(this);

		new Id(wc, this); // clientframe이 불러지면 로그인 화면을 생성한다.

		// 대화내용 보여주기
		txtA.setFont(new Font("굴림", Font.BOLD, 24));
		txtA.setBackground(Color.gray);
		add("Center", txtA);

		pl.add(txtF); // 문자열을 입력하는 창
		pl.add(btnTransfer); // 문자열 보내는 버튼
		pl.add(btnExit); // 닫기버튼
		add("South", pl); // 컨텐트 팬에 패널을 부착한다.

		// 전송버튼과 닫기버튼에 ActionListener를 연결한다.
		btnTransfer.addActionListener(this);
		btnExit.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 200, 350, 400);
		// 대화창을 숨긴다. - 로그인창에서 입장 버튼을 누르면 나타나게 만든다.
		setVisible(false);
	}

	@Override
	// 마찬가지로 여기도 오버라이딩. = 채팅창에서 이루어진 행위에 대한 결과를 코드로 작성한 후 리턴하는 메소드.
	// 채팅창에서 전송,닫기 버튼을 눌렀을 경우를 처리한다.
	public void actionPerformed(ActionEvent e) {
		
		// 전송 구현
		String id = Id.getId(); // 메세지를 전송한 사람이 누구인지를 먼저 밝혀야한다. id를 얻어와 참조변수에 저장.
		if (e.getSource() == btnTransfer) { // 전송 버튼을 눌렀을 때. (e.getSource()가 전송버튼에 들어갔을때. 라는 의미이다)
			
			// 메세지 입력없이 전송버튼을 눌렀을 경우 아무일도 일어나지 않아야한다.
			// (데이터전송이니 뭐니 하는 진짜로 "무"의 현상이 일어나야한다)
			if (txtF.getText().equals("")) {
				return; // 그럼 다시 메소드 시작부분으로 돌려보낸다.
				
			}
			
			// 자신이 입력한 메세지는 자신의 대화내용에 먼저 "보이고" 다른 사용자에게 "보내져야" 한다.
			// 보내지고 나서 다른 사용자의 메세지는 다음줄에 써져야한다.
			txtA.append("[ " + id + " ] " + txtF.getText() + "\n");
			// \n == (엔터키) 라인피드와 캐리지 리턴이 둘다 발생한다.
			
			wc.sendMessage(); // 내가 입력한 메세지를 서버에 전송한다.
			
			// 서버에 메세지가 전송되고 나면 전송된 메세지는 지워져야한다 == 대화입력창이 초기화 되야한다.
			txtF.setText("");

		} else { // 닫기 버튼 누르면 꺼져야한다.
			this.dispose();
		}
	}

}
