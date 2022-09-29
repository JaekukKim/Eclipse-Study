package ch07.sec10.exam01_abstract_class;

public class PhoneExam {
	public static void main(String[] args) {
//		Phone ph = new Phone(); 추상 클래스는 new연산자로 "직접적인"객체 생성이 불가능하다.
		SmartPhone sp = new SmartPhone("재국");
		// 추상 클래스는 직접 생성이 안돼지만 SmartPhone 클래스는 추상클래스가 아니라 객체생성이 가능하며, 심지어 추상클래스로부터 상속받은
		// 인스턴스멤버들도 사용이 가능하다. 이것이 간접적인 추상클래스 객체생성이다. 직접생성은 안됨!!!!!
		sp.turnOn();
		sp.search();
		sp.turnOff();
	}

}
