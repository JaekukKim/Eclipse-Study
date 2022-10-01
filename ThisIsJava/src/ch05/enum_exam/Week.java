package ch05.enum_exam;

public enum Week {
	MONDAY,
	THUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY

}

// 열거타입의 핵심
// [1] 한정된 값을 갖는 경우에 사용한다. (ex) 사계절, 월화수목금토일, 지구의 반지름 등 변하지 않는 값.
// [2] 열거타입의 열거상수는 전부 대문자로 한다, 단어가 2개이상으로 구성될때는 _로 구분해준다. 나중에 final의 상수에서 한번 더 배운다.
// [3] 하나의 데이터 타입이므로 변수를 선언하고 사용 해 주어야 한다. 참조타입이라 null 대입이 가능.
// [4] 열거 상수 대입이 가능하나 대입 할 시에는 열거타입 변수명 = 열거타입 . 열거상수; 로 .(대입연산자)를 사용해야한다.
// [5] 열거 변수의 값이 특정 열거 상수인지 판단할때는 ==와 !=연산자를 사용한다.
// 		(ex)Week today = Week.SUNDAY;
//				 today == Week.SUNDAY // 결과 : true // 이런식으로 한다.
