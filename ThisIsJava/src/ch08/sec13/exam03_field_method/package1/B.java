package ch08.sec13.exam03_field_method.package1;

public class B {
	public void method1() {
		A a = new A();
		
		a.field1=2;
		a.field2=4;
//		a.field3=6; private 접근권한자로 설정이 되어서 안됨.
		// private은 같은 클래스 내에서만 가능.
		
		a.method1();
		a.method2();
//		a.method3(); 위와 마찬가지.
	}
}