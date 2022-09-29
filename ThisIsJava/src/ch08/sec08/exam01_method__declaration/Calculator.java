package ch08.sec08.exam01_method__declaration;

public class Calculator { // 아래 void powerOn 메소드를 사용하기 위해선 이 설계도 (클래스)에서 객체를 만들고 사용해야함.
	void powerOn() {
		System.out.println("전원을 켭니다");
	}

	int plus(int x, int y) {
		int result = x + y; // 이 상태에서 디버깅하면 에러가 생긴다. 리턴값을 반드시 환원해줘야한다.
		return result; // 리턴값은 result다. 라는 걸 명시 해 줘야한다. 메소드의 리턴 타입을 반드시 확인 한 후 결과를 도출해야한다. 매우중요.
	}

	double divide(int x, int y) {
		double result = (double) x / y;
		return result;

	}

}