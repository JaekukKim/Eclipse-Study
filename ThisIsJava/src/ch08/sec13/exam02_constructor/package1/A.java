package ch08.sec13.exam02_constructor.package1;

public class A {
	A a1 = new A(false);
	A a2 = new A(5);
	A a3 = new A("템다미");
	
	public A(boolean Nl) {}
	A(int N){}
	private A(String N) {}
	//생성자 오버로딩이다. 메소드 오버로딩은 리턴타입 메소드이름(매개변수의 타입과 갯수 순서..){} 에 리턴타입과 ()안쪽을 바꿔주지만
	//생성자 오버로딩은 클래스 이름(매개변수의타입){}에서 매개변수의 타입만 바꿔주면 오버로딩이 가능하다.
	//즉 둘다 어떠한 변수와 수식을 선언했을 때 변수와 수식을 골라서 쓰세요 라는 느낌으로 나열(오버로딩) 해주는 느낌이다.
	
	
	
	
	

}
