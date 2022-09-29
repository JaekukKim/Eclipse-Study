package ch07.sec09.exam07_instanceof;

public class InstanceExam {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { // 강제타입변환 하기전에 왠만해선 사용하자. 안전한 코딩, 빨간줄이 없는 코딩을 위해선 반드시 필요하다.
			Child child = (Child) parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("parent는 Child를 참조하지 않음.");
		}
	}
	
	public static void main(String[] args) {
		Parent pa1 = new Child(); // Parent클래스를 pa1이란 변수를 생성하여 상속받은 child클래스의 새로운 참조주소를 생성하여 pa1에 대입
		method1(pa1); // 자동타입변환 이루어짐.
		
		Parent pa2 = new Parent(); // 단순 parent생성자 호출. 자동타입변환 이루어지지 않음
		method1(pa2); // 이 경우엔 클래스 강제캐스팅 불가능.
		
	}

}
