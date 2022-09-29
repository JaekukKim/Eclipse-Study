package ch07.sec03.Exam_parents_constructor;

public class People {
	String name;
	String ssn;

	/*
	 * public People() { // Student.java의 클래스에서 오류(빨간줄)이 나오는걸 방지하기 위해 만들어준 기본 클래스이다.
	 * 기본클래스가 자동으로 생성이 된다면 // 오류가 발생하진 않으나, 생성자에 매개변수를 넣었기 때문에 기본생성자가 생성이 안되었다. 이럴때
	 * 만들어줘서 오류를 해결해주자. 이것이 // 방식2. // (개인적인생각) 데이터에 영향을 크게주지 않는 한. 왠만해선 기본생성자를
	 * 만들어주는게 좋은거같다. }
	 */
	public People(String name, String ssn, int stuNo) {
		this.name = name;
		this.ssn = ssn;

		System.out.println("부모객체 생성 완료.");
	}
// 생성자는 this 꼭 써주장 변수표현.

}
