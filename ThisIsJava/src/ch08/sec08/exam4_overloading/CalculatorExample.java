package ch08.sec08.exam4_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCal = new Calculator();
		
		double result = myCal.areaReactangle(10);
		//어떠한 사각형의 넓이를 구하는 메소드 호출.
		//하지만 매개값이 하나밖에 주어지지 않았기 때문에
		//정사각형의 넓이를 구하는 공식으로 자동으로 연산이 된다.
		//메소드 오버로딩 = 여러개의 메소드가 주어지고 매개변수에 알맞게 선택해서 사용하는 방식.
		
		double result1 = myCal.areaReactangle(10, 20);
		//이건 매개변수가 2개가 주어져서 직사각형으로 들어감.
		
		System.out.println("정사각형의 넓이는? : " + result);
		System.out.println("직사각형의 넓이는? : " + result1);

	}

}
