package ch08.sec10.exam04_singleton;

public class Singleton {
	public static Singleton singleton = new Singleton();
	
	//private 접근 권한을 갖는 정적 필드 선언과 초기화.
	
	private Singleton() {
		
	//private 접근 권한을 갖는 생성자 선언.
		
	}
	
	static Singleton getInstance() {
		return singleton;
		// 접근 권한을 갖는 정적 메소드 선언.
	}
	

}
