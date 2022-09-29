package ch088.sec01.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10; // public static final 생략 가능. 자동으로 달아줌 기본값이라고 하는 개념 자체가 인터페이스 내부엔 없다.
	int MIN_VOLUME = 0;
	
	public abstract void turnOn(); //추상메소드만 선언이 가능하며 public abstract는 생략해도 자동으로 달아준다.
	void turnOff();
	void setVolume(int volume); // 이런식으로 추상메소드를 선언해주어야 한다
}
