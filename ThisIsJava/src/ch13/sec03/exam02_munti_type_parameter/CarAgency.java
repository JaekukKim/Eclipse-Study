package ch13.sec03.exam02_munti_type_parameter;

public class CarAgency implements Rentable<Car>{ // 타입 파라미터 P를 Car로 대체한다.

	@Override
	public Car rent() {
		return new Car();
		// 이럴때도 반드시 리턴타입은 Car 객체가 되어야한다.
	}

}
