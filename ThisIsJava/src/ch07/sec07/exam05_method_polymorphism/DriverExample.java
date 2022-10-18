package ch07.sec07.exam05_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver 객체를 불러오고
		
		//버스와 택시 객체도 생성한다.
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//여기서 driver.drive로 driver객체에 있는 drive메소드를 호출 해 주는데
		//메소드 호출 시 매개변수에 어떤 객체가 들어가느냐에 따라서
		//자식객체에서 재정의된(같은 동작이지만 결과가 다른) 메소드가 실행이 된다.
		
		driver.drive(taxi);
		// 메소드의 매개값으로 객체 자체를 생성하는것도 가능하다.
		// 위 아래 driver.drive(); 의 괄호안에 taxi와 bus가 있는데 taxi와 bus는
		// new Taxi();, new Bus();와 똑같다. 이제 앞으로 프로젝트를 할텐데 프로젝트에서 굉장히 많이 보이는
		// 문구이니 신경써서 보자!
		driver.drive(bus); 
		
		//정답
	}

}
