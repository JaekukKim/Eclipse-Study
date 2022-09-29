package ch08.sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("캐스퍼");
		Car yourCar = new Car("리어카");
		//[2] 그럼 이 부분에서 생성자 타입에 맞는 값을 괄호안에 넣어주어야한다.
		//(현재는 string 타입이므로 문자열을 넣어야함.
		
		myCar.run();
		System.out.println();
		yourCar.run();
		
		
		

	}

}
