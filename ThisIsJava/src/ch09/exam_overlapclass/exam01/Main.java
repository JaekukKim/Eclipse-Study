package ch09.exam_overlapclass.exam01;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); // 외부에서 B클래스에 접근하는 방법이다. 큰객체.인스턴스클래스 변수 = 큰객체의변수.new 인스턴스클래스명(); 식으로 한다

		b.field1 = 3;
		b.method1();
		System.out.println(b.field1);
		
		A.C c = new A.C();
		c.field1=2;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
	}
}
