package ch088.sec01.exam02_constant_field;

public interface RemoteControl {
	int MAX_VOLUME = 10; // public static final 생략 가능. 자동으로 달아줌 기본값이라고 하는 개념 자체가 인터페이스 내부엔 없다.
	int MIN_VOLUME = 0;
	
	/*
	 * static { MIN_VOLUME = 0; } 상수 필드 선언 자체가 안된다 인터페이스 내부에선.
	 */

}
