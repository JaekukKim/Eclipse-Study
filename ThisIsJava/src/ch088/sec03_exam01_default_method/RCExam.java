package ch088.sec03_exam01_default_method;

public class RCExam {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Tv(); // 인터페이스에는 구현 객체만 대입이 가능하다. 인터페이스 객체를 대입하는건 불가능.
		//구현 객체가 대입이 되어있지 않으면 디폴트 메소드를 사용 할 수 없다. 반드시 구현 객체가 대입이 되어야한다.
		//디폴트 메소드는 구현 객체의 인스턴스 메소드인 셈이다. ***중요***
		//디폴트 메소드는 재정의 하여 사용 할 수 있다. ***

		// 본격적인 개발코드 선언 (메소드 호출)
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(true); // 이건 디폴트 메소드를 그대로 사용하고 있는 중이다.
		rc.batteryAlarm();
		RemoteControl.changeBattery();
		
		System.out.println();
		
		rc = new Audio(); // 구현객체의 생성 번지가 인터페이스의 변수로 대입된다.
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(false);
		rc.batteryAlarm();
		RemoteControl.changeBattery();
		

	}

}
