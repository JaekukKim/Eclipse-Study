package ch13.sec04.exam01_generic_method;

public class Util {
	public static <T> Box<T> boxing(T t) {
	// 메소드를 제네릭 메소드로 선언하겠다. T를 매개변수의 타입과 리턴타입으로 사용을 하겠다. 라는 의미
	// 앞으로 boxing라고 하는 메소드를 호출한다면 구체적인 타입에 T가 들어가서 매개변수의 타입과 리턴타입이 결정이 된다.	
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	// T에 어떤 타입이 들어오느냐에 따라서 box객체의 타입이 결정이 된다.	
	// 외부로 부터 객체를 받아서(매개변수) 그 객체로부터 box객체를 만들고 그 안에 저장을 하겠다는 의미이다.
		
	// 접근제한자 <타입파라미터> 리턴타입 메소드명(매개변수1...){...}
	//	public static <T> Box<T> boxing(T t)
	// 의 방식이며 타입 파라미터는 리턴타입과 매개변수타입에 기재를 해주어야 한다.
	// 정확한 리턴타입은 <타입파라미터>를 갖는 "리턴타입"이다.
		
		
	}

}
