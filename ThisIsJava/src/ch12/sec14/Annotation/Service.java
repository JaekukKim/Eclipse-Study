package ch12.sec14.Annotation;

// 클래스 상단부에 어노테이션을 설정 해 주면 인식을 못한다. 왜냐면 열거상수로 메소드만 지정 해 주었기 때문.
// 클래스 상단부에서 어노테이션을 활성화 시켜주고 싶다면 @Target 어노테이션에 TYPE 열거상수를 추가해주면 된다
public class Service {
	@PrintAnnotation
	private void method1() {
		System.out.println("method1이 정상적으로 실행 되었습니다");
	}
	// 어노테이션의 매개변수를 주지 않고 디폴트 값으로만 굴린다.

	@PrintAnnotation("#")
	private void method2() {
		System.out.println("method2이 정상적으로 실행 되었습니다");
	}
	// 어노테이션의 매개변수 중 기본 엘리먼트인 value값만 변경해준다.
	// 기본 엘리먼트의 특징은 변수 명을 기술하지 않아도 된다는 점이다. 변수명 하나없이 기본타입에 맞게 값만 설정해주면 알아서 들어간다.
	
	@PrintAnnotation(value = "*", number = 20)
	private void method3() {
		System.out.println("method3이 정상적으로 실행 되었습니다");

	}
	// 매개변수로 설정되어있는 기본 엘리먼트와 넘버를 둘 다 바꿔준다
}
