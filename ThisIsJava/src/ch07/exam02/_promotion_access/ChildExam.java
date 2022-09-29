package ch07.exam02._promotion_access;

public class ChildExam {
	public static void main(String[] args) {
		Child ch = new Child(); // child 생성자 호출
		Parents pa = ch; // 호출된 child 생성자를 부모클래스의 참조변수를 만들어 대입 (자동 타입 변환)
		
		pa.method1(); // 부모클래스의 참조변수를 이용해 method1 호출
		pa.method2(); //*** 부모클래스의 참조변수를 이용해 method2 호출, 하지만 method2는 child클래스에서 오버라이딩됨.
					  //결국 child에서 오버라이딩(재정) 된 메소드 2로 출력될것임.
		//원래 메소드2의 출력값은 부모 메소드 2이나. 이대로면 자식메소드 2로 바뀌어서 출력됨. 이부분은 다형성의 개념으로 매우 중요함
//		pa.method3(); // child타입에서 method3이 생성되어서 호출이 불가능함.
	}
}
