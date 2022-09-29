package ch08.sec13.exam03_field_method.package2;

import ch08.sec13.exam03_field_method.package1.A;
//패키지가 다릅니당.

public class C {
	public void C() {
		A a = new A();
		
		a.field1 = 3;
//		a.field2 = 3; 디폴트 접근제한자라서 다른 패키지에서 안됨
//		a.field3 = 3; 프라이빗이라 안됨
		
		a.method1();
//		a.method2(); 위와 마찬가지
//		a.method3(); 위와 마찬가지.
	}

}
