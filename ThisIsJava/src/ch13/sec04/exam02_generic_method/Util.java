package ch13.sec04.exam02_generic_method;

public class Util <K,V>{
	// 멀티타입 파라미터를 변수로 받는 메소드를 만들어보자.
	public static <K,V> boolean compare(Pare<K,V> p1, Pare<K,V> p2){
	// 반드시 타입 파라미터 다음 리턴타입이 나와야한다.
	// compare라고 하는 메소드는 두개의 Pare 객체를 받아 Pare객체의 K값과V값을 비교해서 K값V값 둘다 같으면 TRUE를 리턴
	// 둘중 하나라도 값이 다르면 FALSE를 리턴하도록 하는 메소드 생성.
		
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		// p1에서 key값을 얻어내고 p2에서 key값을 얻어 비교를 하겠다는 의미.
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
		
	}

}
