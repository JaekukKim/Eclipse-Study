package ch088.sec03_exam01_default_method;

public interface RemoteControl {
	//상수 선언
	int MAX_VOLUME = 10; // public static final 생략 가능. 자동으로 달아줌 기본값이라고 하는 개념 자체가 인터페이스 내부엔 없다.
	int MIN_VOLUME = 0;
	
	//추상메소드 선언 매우매우 중요한 부분, 인터페이스 안에서 ㅇㅇ 구현객체에서 실행 할 내용이다.
	public abstract void turnOn(); //추상메소드만 선언이 가능하며 public abstract는 생략해도 자동으로 달아준다.
	void turnOff();
	void setVolume(int volume); // 이런식으로 추상메소드를 선언해주어야 한다
	void batteryAlarm();
	
	
	//자바 8부터 추가된 default method 선언. 디폴트는 매우 중요하다.
	//구현 클래스가 있어야. 사용가능하다. 인터페이스 만으로 사용이 불가.
	default void setVolume(boolean mute) { // 실행 블록이 있다.
		if(mute == true) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드 선언 방법. static을 반드시 기재해 주어야 하며 실행 문구가 존재한다. 디폴트와 유사함.
	//인터페이스의 정적 메소드는 인터페이스명.정적메소드명();로 바로 호출이 가능하다.
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}

}
