package Academy.swing.calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame implements ActionListener {

	final int MAX_INPUT_LENGTH = 20; // 화면에 보여지는 최대 자릿수
	final int INPUT_MODE = 0; // 입력상태
	final int RESULT_MODE = 1; // 출력상태
	final int ERROR_MODE = 2; // 에러상태
	int displayMode;

	// 계산기가 처음 시작되거나 연산이 끝나면 계산기의 상태를 true로 바꿈.
	// 이때 숫자버튼을 누르면 출력창에 연산전의 값은 보이지 않게 하고
	// 새로 계산할 숫자를 보여주기 위한 출력창을 먼저 지운후에 새로운 숫자를 보여준다.
	// 새로운 숫자가 나오면 false로 바꿈
	// 다음 연산 전까지 입력한 숫자를 지우지 않아야 연이어 입력한 숫자가 보여질 수 있다.
	boolean clearOnNextDigit;

	double lastNumber; // 연산 전의 값을 저장할 임시변수.

	String lastOperator;
	// 지금 누른 연산자 바로 전의 연산자를 저장할 변수. 만약 12+3인 상태에서 -를 누르면 lastNumber를 출력하고 -를 계산.
	// 12인 상태에서 +를 누르면 "0"을 가져가 processOperator(String op)를 처리한다.\

	// ==> + 를 누른 상태이지만 연산할 값이 하나밖에 없는 상태이기에 + 연산을 할 수가 없으므로
	// lastOperator는 "0"(연산을 할수있는 상태가 아니다)

	// 숫자 3을 더 입력한 상태에서 연산자 -를 누르면 그 전에 입력한 12+3 을 처리하기 위해서
	// lastOperator의 값인 +를 가지고 작업을 처리.

	private JLabel jlbOutput; // 출력창
	private JButton jbtnButtons[]; // 판에 나올 버튼들
	private JPanel jplMaster; //
	private JPanel jplBackSpace;
	private JPanel jplControl;

	Font f12 = new Font("Times New Roman", 0, 22);

	// 생성자
	public Calculator() {
		setBackground(Color.gray); // 계산기의 배경색 지정

		jplMaster = new JPanel();

		// 출력창 생성 및 디자인
		jlbOutput = new JLabel("0");
		jlbOutput.setBackground(Color.WHITE);
		jlbOutput.setFont(new Font("Serif", Font.PLAIN, 30));
		jlbOutput.setOpaque(true);

		// 가장 윗 쪽에 출력창을 배치한다.
		getContentPane().add(jlbOutput, BorderLayout.NORTH);

		// 23개의 버튼을 가리키는 참조변수 배열을 생성.
		jbtnButtons = new JButton[23];

		// 버튼이 올라갈 패널을 생성해 통으로 갖다붙이자.
		JPanel jplButton = new JPanel();

		// 숫자버튼 만들기
		for (int i = 0; i <= 9; i++) {
			jbtnButtons[i] = new JButton(String.valueOf(i));
		}

		// 각종 기능 버튼을 만든다.
		jbtnButtons[10] = new JButton("+/-");
		jbtnButtons[11] = new JButton(".");
		jbtnButtons[12] = new JButton("=");
		jbtnButtons[13] = new JButton("/");
		jbtnButtons[14] = new JButton("x");
		jbtnButtons[15] = new JButton("-");
		jbtnButtons[16] = new JButton("+");
		jbtnButtons[17] = new JButton("sqrt");
		jbtnButtons[18] = new JButton("1/x");
		jbtnButtons[19] = new JButton("%");

		// 백스페이스 버튼은 별도 panel에 추가한다
		jplBackSpace = new JPanel();
		jplBackSpace.setLayout(new GridLayout(1, 1, 2, 2));

		jbtnButtons[20] = new JButton("BackSpace");
		jplBackSpace.add(jbtnButtons[20]);

		// CE, C 버튼은 별도의 Panel에 추가한다.
		jplControl = new JPanel();
		jplControl.setLayout(new GridLayout(1, 2, 2, 2));

		jbtnButtons[21] = new JButton(" CE ");
		jbtnButtons[22] = new JButton("C");

		jplControl.add(jbtnButtons[21]);
		jplControl.add(jbtnButtons[22]);

		// 숫자버튼들의 글자 색을 파란색으로, 기능버튼들의 글자색을 내가 하고싶은걸로
		for (int i = 0; i < jbtnButtons.length; i++) {
			jbtnButtons[i].setFont(f12);
			if (i < 10) { // 숫자버튼 색칠해보자
				jbtnButtons[i].setForeground(Color.black);
			} else { // 기능버튼
				jbtnButtons[i].setForeground(Color.gray);
			}

		}

		// 4x5 grid 형태로 설정 (가로 세로 상하여백, 가로여백
		jplButton.setLayout(new GridLayout(4, 5, 2, 2));

		// 첫번째 줄 (백스페이스, ce c 를 제외한 첫번째 줄
		// 숫자판 맨 위 7부터 버튼부착
		for (int i = 7; i <= 9; i++) {
			jplButton.add(jbtnButtons[i]);
		}
		// 나누기 버튼과 sqrt버튼을 부착한다.
		jplButton.add(jbtnButtons[13]);
		jplButton.add(jbtnButtons[17]);

		// 두번째 줄 456 부착.
		for (int i = 4; i <= 6; i++) {
			jplButton.add(jbtnButtons[i]);
		}

		// x버튼과 x^2 버튼을 부착.
		jplButton.add(jbtnButtons[14]);
		jplButton.add(jbtnButtons[18]);

		// 세번째줄 123부착
		for (int i = 1; i <= 3; i++) {
			jplButton.add(jbtnButtons[i]);
		}

		// -버튼과 %버튼 부착
		jplButton.add(jbtnButtons[15]);
		jplButton.add(jbtnButtons[19]);

		// 네번째 줄 : 0, +/-, . , + , = 버튼을 부착.
		jplButton.add(jbtnButtons[0]);
		jplButton.add(jbtnButtons[10]);
		jplButton.add(jbtnButtons[11]);
		jplButton.add(jbtnButtons[16]);
		jplButton.add(jbtnButtons[12]);

		jplMaster.setLayout(new BorderLayout());
		jplMaster.add(jplBackSpace, BorderLayout.WEST);
		jplMaster.add(jplControl, BorderLayout.EAST);
		jplMaster.add(jplButton, BorderLayout.NORTH);

		// 백스페이스, ce, c 숫자 및 기능 버튼이 부착되어 있는 panel을 출력 창 아래쪽에 배치한다.
		getContentPane().add(jplMaster, BorderLayout.SOUTH);

		// 포커스를 설정한다.
		requestFocus();
		getContentPane().setFocusable(true);

		// 각 버튼들에 리스너를 설정.
		for (int i = 0; i < jbtnButtons.length; i++) {
			jbtnButtons[i].addActionListener(this);
		}

		// 계산기 초기화
		clearAll();

		// jframe의 우측 상단 x버튼 활성화
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// [22] 화면클리어
	void clearAll() {
		// 화면을 먼저 초기화.
		setDisplayString("0");
		lastOperator = "0";
		lastNumber = 0;
		displayMode = INPUT_MODE;
		clearOnNextDigit = true;

	}

	// 출력창에 매개변수로 입력받은 문자를 출력한다
	void setDisplayString(String str) {
		jlbOutput.setText(str);
	}

	// 출력창에 있는 문자를 가져온다.
	String getDisplayString() {
		return jlbOutput.getText();
	}

	// acper 오버라이딩 : 발생하는 이벤트들, 클릭, 연산 이런것들을 처리하는 메소드 오버라이딩.
	@Override
	public void actionPerformed(ActionEvent e) {
		double result = 0; // 연산결과 저장, 왜 더블이냐, sqrt, 나누기 등등

		// 각 키 별로 이벤트를 처리.
		// 숫자키는 기본적으로 화면에 세팅.
		// 각 기능 키 들은 각각의 기능을 처리한다.

		for (int i = 0; i < jbtnButtons.length; i++) {

			if (e.getSource() == jbtnButtons[i]) {
				switch (i) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					addDigitToDisplay(i);
					break;
				case 10: // +/- (음수양수변환) 버튼
					processSignChange();
					break;
				case 11: // 소숫점, . 버튼 활성화
					addDecimalPoint();
					break;
				case 12: // =
					processEquals();
					break;
				case 13: // 나누기
					processOperator("/");
					break;
				case 14: // 곱하기
					processOperator("x");
					break;
				case 15: // 뺴기
					processOperator("-");
					break;
				case 16: // 더하기
					processOperator("+");
					break;
				case 17: // 제곱근
					processSqrt();
					break;
				case 18: // 역수
					processReverse();
					break;
				case 19: // 백분율
					processPercentage();
					break;
				case 20: // 잘못쓴 글자 지우기 백스페이스
					processBackSpace();
					break;
				case 21 : // ce : 바로 전에 입력한 값만 지운다.
					clearExisting();
					break;
				case 22 : // 전부다 지워버림
					clearAll();
					break;
				}
			}
		}

	}

	// 숫자키를 누르면 현재 값 뒤에다가 붙여서 output창에 숫자를 출력한다.
	// 최대 20자 (man_input상수) 까지.
	void addDigitToDisplay(int digitNum) {

		// clearOnNextDigit
		// 계산기가 처음 시작되거나 어떤 연산이 끝난 후에 값을 true로 한다.
		// 이때 숫자버튼을 누르면 출력창에는 연산 전의 값은 보이지 않게 하고 새로 계산할 숫자를 보여주기 위해서
		// 출력창을 먼저 지운 후에 새로운 숫자를 보여준다.
		// 새로운 숫자를 입력하면 clearOnNextDigit의 값을 false로 만들어야
		// 다음 연산전까지 입력한 숫자를 지우지 않고 연이어 입력한 숫자가 보여질 수 있다.
		if (clearOnNextDigit) {
			setDisplayString(""); // 출력 창을 지운다.
		}

		// 출력 창의 값을 가져온다.
		String inputString = getDisplayString();

		// 맨앞에 0(인덱스0의 값이 o이라면) 이 있으면 0뒤에 모든 값을 가져온다. ex) "ABCDEFGHI"
		// substring(int a); 메소드 = 문자열에 해당하는 인덱스 (a) 이후의 값을 전부 가져온다.
		// substring(int a , int b); = a부터 b"전"까지 문자열 리턴. (a<= string <b)
		// substring 을 사용하여 0 이후 문자열을 전부 리턴시킨다.
		if (inputString.indexOf("0") == 0) {
			inputString = inputString.substring(1);
		}
		// equals 메소드 사용하여 숫자를 밀어내기.
		if ((!inputString.equals("0") || digitNum > 0) && inputString.length() < MAX_INPUT_LENGTH) {
			setDisplayString(inputString + digitNum);
		}

		displayMode = INPUT_MODE;
		clearOnNextDigit = false;
	}

	// [10] 음수 양수 변환 메소드 생성.
	void processSignChange() {
		if (displayMode == INPUT_MODE) { // 입력 모드
			String input = getDisplayString(); // 출력창의 결과를 가져와 저장한다.

			// indexOf(String str) = 문자의 위치를 찾는 메소드, 몇번째에 있는지를 리턴해준다.
			if (input.length() > 0 && !input.equals("0")) {
				// "-"라고 하는 문자가 0번째 인덱스에 있다면.
				if (input.indexOf("-") == 0) {
					setDisplayString(input.substring(1));
				} else {
					setDisplayString("-" + input);
				}
			}

		} else if (displayMode == RESULT_MODE) { // 결과 모드
			double numberInDisplay = getNumberInDisplay();

			if (numberInDisplay != 0) {
				displayResult(-numberInDisplay);
			}
		}
	}

	// [11]소숫점 생성 메소드
	void addDecimalPoint() {
		displayMode = INPUT_MODE;
		if (clearOnNextDigit) {
			setDisplayString("");
		}

		String inputString = getDisplayString(); // 출력창에 표시된 값을 가져오고

		// 소숫점은 숫자에서 하나만 가능하므로 하나만 추가한다.
		// indexOf(String str) : 특정 문자나 문자열에서 해당하는 문자의 인덱스 값을 리턴. 못찾았을 경우 -1 리턴.
		if (inputString.indexOf(".") < 0) {
			// 소숫점이 하나도 없을 때.
			setDisplayString(inputString + ".");
		}
	}

	// [12] 나누기 에러 및 결과값 출력
	void processEquals() {
		double result = 0;
		if (displayMode != ERROR_MODE) {
			try {
				result = processLastOperator();
				displayResult(result);
			} catch (ArithmeticException e) {
				displayError("왜 0으로 나눌려고 하는거에요!!!!");
			}
			lastOperator = "0";
		}
	}

	// [13][14][15][16] 사칙연산 메소드, 나누기는 예외가 존재
	double processLastOperator() throws ArithmeticException {
		double result = 0;
		double numberIndisplay = getNumberInDisplay(); // "두번째" 숫자들.

		if (lastOperator.equals("/")) { // 나누기
			if (numberIndisplay == 0) {
				throw (new ArithmeticException());
			}
			result = lastNumber / numberIndisplay;
		}

		if (lastOperator.equals("*")) {
			result = lastNumber * numberIndisplay;
		}

		if (lastOperator.equals("+")) {
			result = lastNumber + numberIndisplay;
		}

		if (lastOperator.equals("-")) {
			result = lastNumber - numberIndisplay;
		}

		return result;
	}
	// 사칙연산 버튼을 눌렀을 경우 처리하는 메소드
	// 입력받은 숫자를 처리한다, 한자리씩 입력을 받아 계속 누적
	// lastOperator : 지금 누른 연산자 바로 전의 연산결과를 저장하는 변수.
	// ex) 12+3인 상태에서 -를 누르면 전의 연산 결과인 15가 먼저 출력.
	// +를 누른 상태에서는 연산할 값이 하나밖에 없는 상태이기 때문에 + 연산을 할 상태가 아니므로 lastOperator는 "0인 상태가
	// 유지.
	// 숫자 3을 더 입력한 상태에서 연산자 - 를 누르면 그 전에 입력한 12+3을 처리하기 위해 lastOperator의 값인 +를 가지고
	// 작업을 처리.

	// [13][14][15][16] 사칙연산 메소드, 나누기는 예외가 존재
	void processOperator(String op) {
		if (displayMode != ERROR_MODE) {
			double numberInDisplay = getNumberInDisplay();
			System.out.println("lastOperator : " + lastOperator);

			if (!lastOperator.equals("0")) {
				try {
					double result = processLastOperator();
					displayResult(result);
				} catch (ArithmeticException e) {
					e.printStackTrace();
				}

			} else {
				// 연산자를 누르면 lastOperator는 0, 화면에 있는 값을 lastNumber에 저장한다.
				lastNumber = numberInDisplay;
			}
			clearOnNextDigit = true;
			lastOperator = op;
		}

	}

	// [17] 제곱근으로 만드는 메소드
	void processSqrt() {
		if (displayMode != ERROR_MODE) {
			double result = 0;
			try {
				// 제곱근 내의 숫자가 -이면 허수이므로 처리가 불가.
				if (getDisplayString().indexOf("-") == 0) {
					displayError("제곱근 내부에 -값은 사용 할 수가 없습니다.");
				}
				result = Math.sqrt(getNumberInDisplay());
				displayResult(result); // 구한 제곱근을 출력창에 보여준다.
			} catch (Exception e) {
				displayError("제곱근 계산에 유효하지 않습니다.");
				displayMode = ERROR_MODE;
			}
		}
	}

	// [18] 역수로 만드는 메소드 생성.
	void processReverse() {
		if (displayMode != ERROR_MODE) {
			try {
				double result = 0;
				if (getNumberInDisplay() == 0) {
					displayError("0으로 나눌 수 없습니다");
				}
				result = 1 / getNumberInDisplay();
				displayResult(result);
			} catch (Exception e) {
				displayError("0으로나눌수없습니다");
				displayMode = ERROR_MODE;
			}
		}
	}

	// [19] 백분율로 만드는 메소드.
	void processPercentage() {
		if (displayMode != ERROR_MODE) {
			try {
				double result = getNumberInDisplay() / 100;
				displayResult(result);
			} catch (Exception e) {
				displayError("유효한 값이 아닙니다");
				displayMode = ERROR_MODE;
			}
		}
	}

	// [20] 뒤로가기 버튼 눌렀을때 처리하는 메소드
	void processBackSpace() {
		if (displayMode != ERROR_MODE) {
			// 출력창에 있는 마지막 글자를 제외하고 나머지 글자들을 출력창에 다시 리턴.
			setDisplayString(getDisplayString().substring(0, (getDisplayString().length()) - 1));
			
			//마지막 남은 1자리를 지우면 backspace를 누르면 출력창에 0으로 보여줌
			if (getDisplayString().length() < 1) {
				setDisplayString("0");
			}
		}
	}
	
	// [21] CE버튼 구현
	void clearExisting() {
		setDisplayString("0");
		clearOnNextDigit = true;
		displayMode = INPUT_MODE;
	}

	// 에러메세지 출력 메소드
	void displayError(String errorMessage) {
		setDisplayString(errorMessage);
		lastNumber = 0;
		displayMode = ERROR_MODE;
		clearOnNextDigit = true;
	}

	// 출력창의 결과값을 가져오는 메소드
	double getNumberInDisplay() {
		String input = jlbOutput.getText();
		// 출력창의 결과는 "문자열"이므로 텍스트로 가져온다

		return Double.parseDouble(input);
	}

	// 연산이 끝난 결과를 보여주는 메소드
	void displayResult(double result) {
		setDisplayString(Double.toString(result));

		lastNumber = result;
		displayMode = RESULT_MODE;
		clearOnNextDigit = true;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.setTitle("1+1=3");
		cal.setSize(500, 500);

		cal.pack(); // 안쓰고 있는 공간들을 압축시켜 출력해준다.

		cal.setLocation(500, 300);
		cal.setVisible(true);
		// setvisible 메소드의 매개변수는 boolean타입
		cal.setResizable(false);
		// 크기 조절 불가하게 만든다.
	}
}

// 예외 클래스 생성.
class DivideByZeroException extends Exception {

	// 기본 생성자
	public DivideByZeroException() {
		super();
		System.out.println("DivideByZeroException super()");
	}

	// 매개변수가 있는 생성자.
	public DivideByZeroException(String str) {
		super(str);
		System.out.println("DivideByZeroException super(str)");
	}
}
