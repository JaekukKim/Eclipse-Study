package ch088.sec07_exam01_howtouse_default_method;

public class InterB implements InterM{

	@Override
	public void method1() { // 추상메소드는 반드시 오버라이딩 해야함.
		// TODO Auto-generated method stub
		System.out.println("InterB - method1 실행.");
	}
	
	@Override
	public void method2() { // 디폴트 메소드 오버라이딩 시에는 default 키워드를 반드시 빼고 써야한다.
		// TODO Auto-generated method stub
		System.out.println("InterB-default method2 실행");
	}

}
