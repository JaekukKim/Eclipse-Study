package ch088.sec02.exam01_name_implement_class;

public class RCExam {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Tv(); // 인터페이스에는 구현 객체만 대입이 가능하다. 인터페이스 객체를 대입하는건 불가능.

		// 본격적인 개발코드 선언 (메소드 호출)
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio(); // 구현객체의 생성 번지가 인터페이스의 변수로 대입된다.
		
		rc.turnOn();
		rc.turnOff();

	}

}
