package ch13.sec02.exam02_generic_type;

public class Box <T>{ // 제네릭타입의 알파벳은 대문자 어떤거든 상관 없다
	private T object; // 타입이 들어가는 자리에 대문자를 넣어주면된다 
	
	public void set(T obj) {
		this.object=obj; // 오브젝트를 매개변수로 선언하면 자바에서 쓰일 수 있는 모든게 객체로 올 수 있다.
	}
	
	public T get() {
		return object;
	}

}
