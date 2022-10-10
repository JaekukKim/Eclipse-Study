package ch13.sec03.exam02_munti_type_parameter;

public class HomeAgency implements Rentable<Home>{
	// 타입 파라미터 P를 Home 객체로 대체해주었다.

	@Override
	public Home rent() {
		return new Home();
		// 이럴땐 반드시 리턴타입이 Home객체가 되어야 한다.
		
	}
	
}
