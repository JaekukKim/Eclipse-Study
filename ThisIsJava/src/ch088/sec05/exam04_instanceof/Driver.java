package ch088.sec05.exam04_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) { // drive메소드의 매개변수를 구현 객체로 지정하였다.

		vehicle.run();

		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.check();
		}
	
	}

}
