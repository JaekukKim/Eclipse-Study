package ch07.exam02._promotion_access;

public class Child extends Parents{
	@Override
	public void method2() {
		System.out.println("자식 메소드 2");
		
	}
	public void method3() {
		System.out.println("자식 메소드 3");
	}

}
