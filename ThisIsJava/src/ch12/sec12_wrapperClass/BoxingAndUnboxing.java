package ch12.sec12_wrapperClass;

public class BoxingAndUnboxing {
	public static void main(String[] args) {
		// Boxing

//		Integer obj1 = new Integer(100);
//		이렇게 선언하면 new Integer(100)부분의 integer에 취소선이 그어진다.
//		이건 자바의 버전이 바뀌면서 deprecate(사용되지않음)을 의미하는 뜻인데, 실질적으로 사용하면 되나.
//		오작동이 일어날 시 책임지지 않겠다는 의미가 더욱 강하다. 가급적 사용하지 말것. 그래서 대체로

		Integer obj1 = 100; // 그냥 대입해 버리는 것이다. 이렇게 해도 위랑 의미는 같으니 안심하자.
		Integer obj2 = Integer.valueOf(200);
		Integer obj3 = Integer.valueOf("200");
		// valueOf 정적 메소드를 사용한다. 포장클래스타입.valueOf(포장값);으로 선언한다.
		// Integer클래스이지만 문자열을 넣어주어도 작동한다!.

		// Unboxing
		int value = obj1;
		int value2 = obj2;
		int value3 = obj3;
		// 언박싱은 기본타입 변수명 = 포장클래스변수명; 이런식으로 선언한다.

		System.out.println("value의 값은? : " + value);
		System.out.println("value2의 값은? : " + value2);
		System.out.println("value3의 값은? : " + value3);
		System.out.println("Unboxing후 값 비교 : " + (value2==value3));

		// 여기서의 핵심은 int value부분이다. 포장 클래스의 타입과 기본타입이 일치하면 박싱,언박싱이 자동으로 진행된다!!
		// int value 부분을 보면 객체가 기본타입에 저장이 된다는건 문법적으로 말이 안되는 일이다. 하지만 위에 써놓은 조건으로 인해
		// 가능하다.
		// 물론 이런것도 가능하다.
		value = obj1 + 200; // 이것도 문법적으로 말이 안돼지만 자동박싱언박싱으로 인해 가능하다.
		// value = obj2 + "100"; 이건 당연히 안된다 타입이 안맞기 때문.

		// "문자열"을 기본타입의 값으로 변환하기.
		// 기본타입 변수명 = 클래스타입.parse+기본타입("문자열");로 문자열을 기본타입으로 변환이 가능하다. 다음을 보자.
		int N = Integer.parseInt("123");
		// 여기서 int는 기본타입, Integer은 클래스타입이다. 출력을 해보면 놀랍게도 123이 나온다.
		System.out.println("문자열을 기본타입의 값으로 변환한 값은? : " + N);

		// Wrapper 값 비교
		// 포장이 된 객체는 "객체"이다. 무슨말인가? 말그대로 객체란말이다. 객체의 특징이 무엇인가를 생각해보면 된다.
		// 객체의 공통적인 특징은 "주솟값(번짓수)"이 있다는 것이다.
		// 이제 비교를 해 보자
		System.out.println("[-128~127범위 밖일 경우]");
		Integer obj4 = 400;
		Integer obj5 = 400;
		System.out.println("결과는 ? : " + (obj4 == obj5));
		System.out.println("equals 메소드 사용시의 결과는? : " + obj4.equals(obj5));

		System.out.println("[-128~127범위 내일 경우]");
		Integer obj6 = 40;
		Integer obj7 = 40;
		System.out.println("결과는 ? : " + (obj6 == obj7));
		System.out.println("equals 메소드 사용시의 결과는? : " + obj6.equals(obj7));
		// 결과는 false, 아래 true가 나온다. 어 뭐지? ==, != 연산자는 객체일경우 "번짓수"를 비교한다고 했는데?
		// ** -128과 127의 범위를 설정 해 둔 이유는 예외이기 때문이다. 저 범위 내에선 "예외"로 값만 비교하기 때문이다.
		// 그러면 순수한 "값"만을 비교할려면 어떻게 해야할까? equals();메소드를 사용하면 된다.위의 예시에서 다시보자
		// equals로 비교했을땐 "값"이 비교가 된 것 이므로 당연하게도 true가 나온다.System.out.println("equals 메소드 사용시의 결과는? : " + obj4.equals(obj5));
		// ** equals메소드는 어떤 메소드, 어떤 문법에서 사용하냐에 따라 비교하는 "방법"이 달라진다. 메소드 자체는 매우 기초적이나 매우 변칙적이라 어렵다.
		// Unboxing 값은 다루지 않겠다. 기본타입은 어차피 값만 비교한다.
	}

}
