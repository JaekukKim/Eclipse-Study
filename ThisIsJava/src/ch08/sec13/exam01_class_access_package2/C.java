package ch08.sec13.exam01_class_access_package2;

import ch08.sec13.exam01_class_access.ABC;
import ch08.sec13.exam01_class_access_package1.B;


//private class C {} 클래스는 public과 default 만 접근 제한자를 가질 수 있다 매우매우 중요하다.

class C {
	ABC abc;
//	A a; // A클래스는 디폴트 클래스
	B b;
	C c; // C클래스는 디폴트지만 같은 "패키지" 내에서 가능.
	
}