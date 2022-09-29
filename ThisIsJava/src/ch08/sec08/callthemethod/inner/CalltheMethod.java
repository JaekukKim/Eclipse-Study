package ch08.sec08.callthemethod.inner;

public class CalltheMethod {
	int plus(int x , int y) {
		int result = x+y;
		return result;
	}
	
	//라이브러리 클래스 내의 메소드는 한 메소드당 하나의 일만 할수 있게 코드를 짜주는것이 좋다.
	
	double avg(int x , int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(10,10); // 메소드 이름(매개변수타입과 수에 맞는 값 제공) 매우 중요함.
		System.out.println("execute의 값은? : " + result);
	}
	
	void println1(String anything) {
		System.out.println("ㅎㅇ");
	}
}

//라이브러리 클래스라서 실행해도 결과가 안나온다 다른데서 불러와서 실행해야함.