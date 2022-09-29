package ch088.sec03_exam01_default_method;

public class Audio implements RemoteControl {

	private int volume;
	private boolean mute;
	private int N;

	// 클래스 명 아래 빨간줄 뜬 부분 마우스를 활용하여 추가함.
	@Override
	public void turnOn() {

		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");

	}

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
		System.out.println("현재 Audio의 볼륨은 : " + this.volume + " 입니다");

	}
	
	@Override
	public void setVolume(boolean mute) { // 디폴트 메소드를 재정의 할때는 디폴트를 반드시 빼줘야한다 이것도 중요함.
		//오버라이딩 할 시에는 자동으로 맞게 선언이 되지만 그래도 알아두자.
		this.mute=mute;
		if (mute == true) {
			System.out.println("무음처리 합니다");
		} else {
			System.err.println("무음해제");
		}
	}

	@Override
	public void batteryAlarm() {
		// TODO Auto-generated method stub
		this.N = 5;
		System.out.println("배터리가 " + N + " % 남았습니다.");
		
	}

}
