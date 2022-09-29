package ch088.sec03_exam01_default_method;

public class Tv implements RemoteControl {

	private int volume;
	private int N;

	// 클래스 명 아래 빨간줄 뜬 부분 마우스를 활용하여 추가함.
	@Override
	public void turnOn() {

		System.out.println("tv를 켭니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다.");

	}
	//디폴트 메소드는 여기 안에 선언이 되어있다고 생각을 해야한다. 직접 여기에 선언하지 않아도 인터페이스안에 있는걸로 구현클래스에 사용가능.

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Tv의 볼륨은 : " + this.volume + " 입니다");

	}

	@Override
	public void batteryAlarm() {
		// TODO Auto-generated method stub
		this.N = 15;
		System.out.println("배터리가" + N + " % 남았습니다.");
		
	}

//	//이클립스의 오버라이딩 기능 (source -> 오버라이딩 임플리먼트 메소드) 사용해서 출력한 결과
//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void turnOff() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void setVolume(int volume) {
//		// TODO Auto-generated method stub
//		
//	} // 추상 메소드를 오버라이딩 하라는 뜻으로 빨간줄이 뜬다.

}
