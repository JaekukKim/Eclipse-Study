package ch088.sec05.exam03_method_polymorphism;

public class Driver {
	void drive(Vehicle vehicle) { // drive메소드의 매개변수를 구현 객체로 지정하였다.
		vehicle.run(); // 구현객체의 run메소드가 실행이 될 때 매개값으로 입력이 된 구현객체에 따라 결과가 달라진다.
	}

}
