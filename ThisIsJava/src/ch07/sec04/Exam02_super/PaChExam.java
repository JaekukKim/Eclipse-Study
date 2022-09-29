package ch07.sec04.Exam02_super;

public class PaChExam {
	public static void main(String[] args) { // 모든 실행은 메인메소드 내에서만 가능해요
		Child sa = new Child();
		sa.takeOff();
		sa.fly(); // 메소드는 순차적으로 실행이 된다.
		sa.flyMode = Child.SUPERSONIC;
		sa.fly();
	}

}
