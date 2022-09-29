package ch08.sec08.callthemethod.outter;

public class RunCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		
		myCar.run();
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도는 : " + speed + "km/h 입니다.");

	}

}
