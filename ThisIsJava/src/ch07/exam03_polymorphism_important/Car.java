package ch07.exam03_polymorphism_important;

public class Car {
	Tire FLT = new Tire("왼쪽 앞", 1);
	Tire FRT = new Tire("오른쪽 앞", 2);
	Tire BLT = new Tire("왼쪽 뒤", 3);
	Tire BRT = new Tire("오른쪽 앞", 4);

	public void stop() {
		System.out.println("멈춤");
	}

	public int run() { // 4개의 타이어가 이상 없이 회전이 되면 0, 특정 타이어가 먼저 회전수가 끝나면 끝난 타이어의 수를 리턴.
		System.out.println("출발 부릉");

	if(FLT.rolling()==false) {
		stop();
		return 1;
	}
	if(FRT.rolling()==false) {
		stop();
		return 2;
	}
	if(BLT.rolling()==false) {
		stop();
		return 3;
	}
	if(BRT.rolling()==false) {
		stop();
		return 4;
	}
	return 0;

}
}
