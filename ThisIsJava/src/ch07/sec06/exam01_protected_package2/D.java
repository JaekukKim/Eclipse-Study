package ch07.sec06.exam01_protected_package2;

import ch07.sec06.exam01_protected_package1.*;

public class D extends A{ // import 한 뒤 A클래스를 상속받아 자식클래스로 만들어준다.
	public D () {
		super(); // 자동으로 추가되지만 형식상 일단 써놓음. 부모객체 호출.
		this.A = 10; // 다른 패키지 이지만 상속을 받았기 때문에 가능.
		this.Amethod();
	}
	

}
