package ch07.sec04.Exam_overriding;

public class Over {
	double areaCircle(double x) { // 리턴타입이 필요한 경우 없을 시 에러뜸
		System.out.println("부모객체의 areaCicle 실행");
		return 3.14*x*x;
	}

}
