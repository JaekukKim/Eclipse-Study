package ch088.sec04_exam02_array_interface;

public class Car {
//	Tire FLT = new Han();
//	Tire FRT = new Han();
//	Tire BLT = new Han();
//	Tire BRT = new Han();
	// 이제 이걸 배열로 바꿔보자
	
	Tire[] tires = {
			new Han(),
			new Han(),
			new Han(),
			new Han(),
	};
	
//	void run() {
//		FLT.roll();
//		FRT.roll();
//		BLT.roll();
//		BRT.roll();
//	}
	//배열을 향상된 for문으로 바꿔서 메소드를 만들어보자.
	void run() {
		for(Tire tire : tires) { // for(타입 변수 : 배열){}
			tire.roll(); // 변수.메소드명(); 호출. tires의 인덱스 값에 따른 순차적 실행.
		}
	}

	
}
