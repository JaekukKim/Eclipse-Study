package ch088.sec07_exam02_default_method_extends;

public class DefaultMethodExtends {
	public static void main(String[] args) {
		ChildInterface1 ch1 = new ChildInterface1() { // 부모가 갖고있는 추상메소드 1과 자식메소드의 추상메소드 3을 재정의 해야한다.

			@Override
			public void method1() {
				System.out.println("ch1의 overriding method1이 실행되었다.");
				//위 내용으로 오버라이딩 메소드가 출력될것임.
			}

			// 디폴트 메소드의 재정의는 선택이다. 방법1. 그냥 상속받는거.

			@Override
			public void method3() {
				System.out.println("ch1의 overriding method3이 실행되었다.");
				//위 내용으로 오버라이딩 메소드가 출력될것임.
			}
		};
		ch1.method1();
		ch1.method2();
		ch1.method3();
		System.out.println();
		
		ChildInterface2 ch2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ch2의 overriding method1이 실행되었다.");
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ch2의 overriding method3이 실행되었다.");
				
			}
		};
		ch2.method1();
		ch2.method2(); // 방법2 메소드의 실행 내용을 오버라이딩 해서 출력.
		ch2.method3();
		System.out.println();
		
		ChildInterface3 ch3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ch3의 overriding method1이 실행되었다.");
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ch3의 overriding method3이 실행되었다.");
			}
			
			@Override
			public void method2() {
				// 방법 3 추상메소드로 바꿔버리기
				//ChildInterface3에 있는 디폴트에서 추상으로 바뀐 메소드가 재정의 하라고 호출이 되었다, 자동호출의 결과.
				System.out.println("ch3의 overriding method2이 실행되었다.");
				
			}
		};
		ch3.method1();
		ch3.method2(); //method2의 글 색도 바뀌었다. 디폴트->추상->오버라이딩 후 실행 되었다는 의미
		ch3.method3();
	}

}
