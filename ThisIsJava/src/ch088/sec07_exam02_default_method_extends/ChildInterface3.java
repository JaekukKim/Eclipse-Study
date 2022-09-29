package ch088.sec07_exam02_default_method_extends;

public interface ChildInterface3 extends ParentsInterface{
	public void method3();
	
	public void method2(); 
	//부모인터페이스에 정의된 메소드2를 추상메소드로 바꿔버림. 이것도 오버라이딩에 해당된다.
	//앞으로 이 메소드는 디폴트가 아닌 추상메소드로 취급이 된다.
	//그러므로 앞으로 이 클래스, ChildInterface3이 implements된 클래스에서는 이 메소드는 반드시 overriding이 되어서 사용되어야 한다.
	//매우 중요한부분이다. 디폴트메소드->추상메소드->재정의 후 사용 이 단계이다.

}
