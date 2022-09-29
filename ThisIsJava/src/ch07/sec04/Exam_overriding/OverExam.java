package ch07.sec04.Exam_overriding;

public class OverExam {
	public static void main(String[] args) {
		int x = 13;
		Over over = new Over(); // Over 생성자 호출
		System.out.println("over의 값 출력 : " + over.areaCircle(x)); // Over 객체에서 areacircle 메소드 호출과 매개변수의 매개값에 대한 변수 대입.
		// areacircle 메소드에는 double x 라는 매개변수가 괄호안에 대입이 되어 있었음.

		sonsOver over1 = new sonsOver(); //sonsOver 생성자 호출
		System.out.println("sonsOver의 값 출력 : " + over1.areaCircle(x)); // sonsOver 객체에서 area~메소드 호출. 나머진
		//위와 마찬가지.

	}
}
