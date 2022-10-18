package ch07.sec07.exam05_method_polymorphism;

public class Taxi extends Vehicle{
	
	// 부모클래스 Vehicle에 있는 run 메소드를 오버라이딩 해준다.
	// 부모클래스에 있는 메소드 이름을 입력 한 뒤 컨트롤 스페이스바를 누르면 오버라이딩이 손쉽게 가능하다.
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}
