package ch13.sec01.exam01_box;

public class BoxExam {
	public static void main(String[] args) {
		Box box = new Box();

		box.set("재국"); //setter메소드로 객체 수정
		
		//박스에서 문자열을 꺼내기 위한 강제 타입 변환
		String obj =(String) box.get("문자열");
		
		//클래스 강제 타입 변환
		box.set(new Apple()); // box에 사과를 넣는 과정
		Apple apple = (Apple) box.get("사과");
	}

}

//하지만 이러한 방법은 효율이 매우 좋지 않다. 가급적 사용을 지양하자.
