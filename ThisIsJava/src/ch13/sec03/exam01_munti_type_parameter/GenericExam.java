package ch13.sec03.exam01_munti_type_parameter;

public class GenericExam {
	public static void main(String[] args) {
		
		// 제네릭 타입 파라미터 K 는 TV, M 은 String으로 설정해준다.
		// 이 때 반드시 K에는 TV객체만, M에는 String 타입만 와야한다. 반드시!
		Product <TV, String> product1 = new Product<>();
		// 맨 뒤 괄호 앞 다이아몬드 연산자 <> 는 앞 타입과 같다면 빈칸으로 넣어도 괜찮다. 중복 파라미터 생략의 기능이라 오히려 좋다.
		
		// Setter의 매개값은 반드시 TV와 String만 제공되어야한다.
		product1.setKind(new TV());
		product1.setModel("좋은 TV");
		
		// Getter의 리턴값은 TV와 String이 된다.
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//------------딴걸로
		
		// 이제 K는 Car로, M은 String로 대체해보자. 대체방법? 간단하다 다시 선언해주면됨 ㅋㅋ
		Product <Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("좋은자동차");
		
		// 매개변수가 바뀌었으니 이제 setter의 매개값은 반드시 Car과 String가 와야한다.
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		
		// 정리해보자.
		// 제네릭 멀티타입은 파라미터를 2개 이상 선언해 줄때 멀티타입제네릭이라고 부른다.
		// 필드나 메소드가 선언이 될 때는 타입이 지정되지 않는다 (신기)
		// 하지만 제네릭을 "꺼내 쓸 때" 타입을 지정해 주어야 하는데 보통 타입은 객체나 클래스로 지정해준다.
		// 한번 지정된 타입은 재선언 할때까지 타입과 순서를 "반드시" 고정 해 주어야 하며 만약 다른 타입으로 바꾸고 싶을 경우
		// 선언된 작업을 모두 끝내고 다른 타입으로 바꿔 주는걸 추천한다.
	}
}
