package ch08.sec08.exam4_overloading;

public class Calculator {
	//정 사각형의 넓이를 구하는 메소드
	
	double areaReactangle(double width) {
		return width*width;
	}
	
	//직 사각형의 넓이를 구하는 메소드
	double areaReactangle(double width, double height) {
		return width*height;
	}
	
	//메소드 오버로딩은 리턴 타입은 무관하며 메소드 이름은 동일해야한다!!
	//매개변수의 타입과 갯수 순서가 반드시반드시 달라야한다.
	//ex int매소드이면 뒤에 따라오는 매개변수의 타입은 반드시 int.

}
