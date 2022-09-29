package ch11.sec07.user_define_exeption;

public class BalanceException extends Exception { // 예외 클래스 만들때 exception 맨 앞글자 대문자로.
	public BalanceException() { // 기본 생성자 선언
	}

	public BalanceException(String message) { // 예외 메세지를 전달 해주는 생성자 선언
		super(message); // 예외 메세지를 부모생성자의 매개값으로 전달. 예외객체의 부모생성자에는 기본적으로 getMessage(); 메소드가 선언이 되어있음.
	}

}
