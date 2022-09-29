package ch08.sec08.exam01_method__declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		myCal.powerOn(); // powerOn메소드는 리턴타입이 없기때문에 호출만 해도 잘 끝난다.
		
		int result1 = myCal.plus(20, 30);
		// 연산 한 결과를 받기 위해 새로운 변수를 생성한다.
		System.out.println(result1);
		
		byte a = 10;
		byte b = 4;
		double result2 = myCal.divide(a, b);
		System.out.println(result2);
		
		
		
	}

}
