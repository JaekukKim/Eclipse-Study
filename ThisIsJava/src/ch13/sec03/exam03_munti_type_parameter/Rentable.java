package ch13.sec03.exam03_munti_type_parameter;

public interface Rentable <P>{
	// 타입 파라미터를 P로 설정 해주자.
	
	P rent();
	// 타입 파라미터 P를 리턴타입으로 사용한다.
}
