package ch088.sec06_exam01_interface_extends;

public class ImplC implements InterC{ //인터페이스 A와B 글고 AB를 상속받은 C의 추상메소드까지 전부다 오버라이딩해줘야한다.

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("ImpC-methodA 실행");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("ImpC-methodB 실행");
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("ImpC-methodC 실행");
		
	}

}
