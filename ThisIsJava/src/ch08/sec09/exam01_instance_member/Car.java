package ch08.sec09.exam01_instance_member;

public class Car {
	String model;
	int speed;
	// 인스턴스 필드 선언

	Car(String model) { // 생성자 선언
		//[1]생성자 선언시 외부에서 값을 받기위한 매개변수(타입신경써서)를 입력해준다.
		this.model = model; // this 생략 불가, 매개변수가 우선순위를 가지기때문에 새로운 변수는 this로 구분.
	}

	// 인스턴스 멤버 안에서면 this가 사용이 가능하다!!!!!!!!!!!!!

	void setSpeed(int speed) { // 메소드 선언
		this.speed = speed;
		// 실행문에선 매개변수가 우선순위의 값을 가진다.
	}

	void run() { // 메소드 선언.
		for (int i = 10; i <= 100; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 " + this.speed + "km/h 의 속도로 달립니다.");
			// 여기선 this를 안붙여줘도 된다. 영향을 주는 부분이 없기때문, 하지만 명확하게 해주기 위하여 this로 구분지어준다.
		}
	}

}
