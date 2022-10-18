package ch07.sec07.exam05_method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) { 
		// vehicle객체만 들어올 수 있는게 아니라 vehicle객체를 상속받은 자식 객체들도 들어올 수 있다.
		//여기 위에 들어오는 객체에 따라서 그 객체에서 오버라이딩 된 메소드가 실행이 된다.
		
		vehicle.run();
		// 자식 객체 bus,taxi에 상속을 해 주었기 때문에 재정의된 run메소드가 실행이 된다.
		//본인은 여기서 vehicle 객체를 앞자를 대문자로 해주어서 클래스를 불러왔다. 매개변수를 지정해준 소문자로 시작하는 vehicle로 메소드를
		//호출해야 한다. 대소문자 구별도 오타에 포함된다 중요.
	}

}
