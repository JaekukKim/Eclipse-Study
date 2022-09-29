package ch088.sec06_exam01_interface_extends;

public class Exam {
	public static void main(String[] args) {
		ImplC imp = new ImplC();
		/*
		 * 구현객체가 인터페이스를 상속 했을 경우 해당하는 인터페이스만 사용이 가능하다. 하지만 해당하는 인터페이스가 상속이 된 인터페이스라면 상속이
		 * 된 인터페이스를 전부 사용이 가능하다. 매우 중요하다. 현업에서도 많이 쓰이는 인터페이스와 상속방식.
		 */
		
		InterA ia = imp;
		ia.methodA();
//		ia.methodB(); interface A에 대입해줄시 A메소드밖에 사용이 안됨.
		System.out.println();
		
		InterB ia2 = imp;
		ia2.methodB();
//		ia2.methodA(); 위와 마찬가지. B에 대입 해 줄시 B만 사용 가능, A랑은 전혀 연관이 없기때문.
		System.out.println();
		
		InterC ia3 = imp;
		ia3.methodA();
		ia3.methodB();
		ia3.methodC(); //모든걸 상속받은 InterC는 ABC의 모든 추상메소드를 사용 할 수 있다.
	}

}
