package ch07.sec10.exam02_abstract_method;

public abstract class Animal {
	public String kind;

	public void breath() {
		System.out.println("숨을 쉬네용");
	}

	public abstract void sound(); // 추상메소드는 추상 클래스 내부에서만 작성 가능하다. 클래스앞에 저거 잘보셈.
}
