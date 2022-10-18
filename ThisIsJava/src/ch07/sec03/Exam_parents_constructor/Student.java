package ch07.sec03.Exam_parents_constructor;

public class Student extends People {
	// student에 빨간줄이 그어져 있는 이유는. 상위 클래스(People)에 기본 생성자가 없기 때문이다.
	// Student 클래스에서 상위 클래스의 생성자를 호출하거나 ( super(매개변수); )사용
	// People 클래스에 기본 생성자를 구현하는 것. 둘중 하나이다.
		
	public int stuNo;
	
	public Student(String name, String ssn,int stuNo) {
		// 여기까지만 썼을때 여기서도 빨간줄이 뜨는 이유는 상위 클래스에 기본생성자가 없기 때문이다.
		super(name, ssn, stuNo);
		// 즉 super(매개값);으로 상위 클래스에 있는 생성자를 호출해주면 문제가 해결이 된다. 이것이 방식 1.
		this.stuNo = stuNo;
		// 방식 2는 People.java 파일로 넘어가도록 하자.
		System.out.println("자식객체 생성 완료.");
	} // Student 생성자 먼저 호출이 되지만 super로 인해서 부모생성자가 먼저 호출이 된다.
	// 부모 생성자 호출 뒤 부모 객체 생성(People 생성자->People객체), 자식 생성자 호출 뒤 자식 객체 생성(Student 생성자->Student 객체생성)

}
