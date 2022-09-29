package ch088.sec02.exam01_name_implement_class;

public class Audio implements RemoteControl {

	private int volume;

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

}
