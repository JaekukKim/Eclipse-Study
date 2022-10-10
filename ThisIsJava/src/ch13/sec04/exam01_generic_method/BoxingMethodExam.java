package ch13.sec04.exam01_generic_method;

public class BoxingMethodExam {
	
//	public static <T> Box<T> boxing(T t) {
//		 메소드를 제네릭 메소드로 선언하겠다. T를 매개변수의 타입과 리턴타입으로 사용을 하겠다. 라는 의미
//		 앞으로 boxing라고 하는 메소드를 호출한다면 구체적인 타입에 T가 들어가서 매개변수의 타입과 리턴타입이 결정이 된다.
//		Box<T> box = new Box<>();
//		box.set(t);
//		return box;
//		 T에 어떤 타입이 들어오느냐에 따라서 box객체의 타입이 결정이 된다.
//		 외부로 부터 객체를 받아서(매개변수) 그 객체로부터 box객체를 만들고 그 안에 저장을 하겠다는 의미이다.
//
//	}
	
	// 아래의 설명을 위해 Util 클래스에 있는 정적 메소드를 복사해와 주석처리 하였다.

	public static void main(String[] args) {

		Box<Integer> box = Util.<Integer>boxing(100);
		// Integer타입으로 boxing 메소드를 호출했기에 타입에 맞기 100 매개변수를 넣어 주었다.
		// 만약 다른 타입(문자열같은거)일 경우 에러난다.
		
		// [클래스명<타입파라미터> 변수 = 메소드명(args);] 의 방식같은 경우는 위에 주석처리 된 메소드가 한 클래스 내에 동시에 존재해야 사용이 가능하다.
		// 만약 Util 클래스에 있는 것 처럼 메소드가 다른 클래스에 존재한다면 반드시 클래스명.<타입파라미터>메소드이름(전달값)으로 호출해주어야 한다!.

		// Util클래스의 정적메소드 boxing를 호출해주었다. boxing 메소드는 타입 파라미터로 리턴타입이 지정되어 있어
		// 호출 할 때 구체적인 타입을 명시를 해 주어야 한다. 그리고 그 타입에 맞게 매개변수도 넣어주어야 한다.

		int value = box.get();
		System.out.println("Util클래스 boxing제네릭 메소드에 들어간 매개변수의 값은? : " + value);
		
		// 다른 타입의 값을 한번 얻어보자.
		Box<String> box2 = Util.boxing("재국");
		// 위의 Integer와는 다르게 이쪽엔 String의 타입파라미터를 뒷부분에 명시 해 주지 않았다. 하지만 괜찮다 왜냐?
		// 자바의 컴파일러는 매개값에 따라 타입을 "유추"를 한다. 그렇다고 아예 안쓰는게 좋은건 아니다.
		// 변수 선언부(Box<String> box2)에서는 필수적으로 명시를 해주어야 한다.
		String value2 = box2.get();
		System.out.println("Util클래스 boxing제네릭 메소드에 들어간 매개변수의 값은? : " + value2);
		
		// 핵심은 Util클래스의 boxing 제네릭 메소드이다.
	}

}
