package ch08.sec10.exam03_static_be_careful;

public class Car {
	int speed;

	void run() {
		for (int i = 10; i <=100; i+=10) {
			speed = i;
		}
		System.out.println(speed + "의 속도로 달립니다.");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();

	}
}
