package ch08.sec13.exam02_constructor.package2;

import ch08.sec13.exam02_constructor.package1.A;

public class C {
	A a1 = new A(false);
	//반드시 임포트!!! import 절대 까먹지 말자 진짜로.
	/*
	 * A a2 = new A(15);
	 * A a3 = new A("데모");
	 */
	
	//a2 와 a3는 각각 default 와 private 이 접근제한자로
	// 설정이 되어있기 때문에 "다른패키지"에선 접근이 안된다.

}
