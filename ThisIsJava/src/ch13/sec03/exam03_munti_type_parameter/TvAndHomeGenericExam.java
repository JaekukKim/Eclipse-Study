package ch13.sec03.exam03_munti_type_parameter;

public class TvAndHomeGenericExam {
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		// HomeAgency 객체 생성 후 변수에 대입.
		
		Home home = homeAgency.rent();
		// homeAgency의 rent 메소드 호출을 객체화 시킨 뒤 home 변수에 대입
		// 이 때 HomeAgency는 Home객체타입의 Rentable를 상속받아 상위 메소드도 호출이 가능하다.
		// 상위메소드 : 리턴타입 P의 rent()메소드, 그리고 Home 객체의 turnOnLight 메소드.
		
		home.turnOnTv();
		// 위에서 설명한거처럼 상위 메소드 호출 성공.
		// home 객체의 turnOnLight 메소드를 실행 할 것이다.
		
		TvAgency tvagency = new TvAgency();
		Tv tv = tvagency.rent();
		tv.run();
		// 제네릭과는 다른 얘기지만 메소드를 선언할 때 정적메소드를 선언하며 메모리 효율 관련 경고문이 나온다.
		// 정적 메소드는 정말 필요할 때 만 사용 하여 주도록 하자.
	}

}
