package ch08.sec12.import_package.Car;

import ch08.sec12.import_package.hangook.Tire01;
import ch08.sec12.import_package.jaekuk.*;
import ch08.sec12.import_package.kumho.Tire03;

// 구체적으로 명시하고 import 가능하당. 물론 아스타로도 가능하다.

public class InstanceCar {
	Tire01 tire01 = new Tire01(); // 풀네임으로 호출하기
	Tire02 tire02 = new Tire02(); // 아스타로 호출하기
	Tire03 tire03 = new Tire03(); // 단축키로 호출하기. ctrl+shift+O 단축키 매우 중요하다. 프레임워크별로 임포트 단축키는 반드시 알아둘것.
	//아스타로 임포트하기도 해봄.
	//임포트 하기 전에 생성자를 선언하거나 관련된 클래스를 반드시 호출 한 다음에 단축키를 이용하여 임포트 해줘야한다. 매우매우 중요함.

}
