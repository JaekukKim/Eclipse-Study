package ch09.exam_overlapclass.exam01;

public class A {
	A() {
		System.out.println("A 객체 생성.");

		B b = new B(); // A클래스 외부에서 B클래스를 사용하는 방식이다. 그 전에 했던거랑 익숙하게 하면됨.
		b.field1 = 3;
		b.method1();
	}

	class B {
		int field1;

//		static int field2; // 자바 17부터 가능.

		B() {
			System.out.println("B 객체 생성.");
		}

		void method1() {

		}

	}

	static class C {
		int field1;
		static int field2;

		C() {
			System.out.println("C객체가 생성됨.");

		}

		void method1() {

		}

		static void method2() {
		
	}
	}
}
