package ch088.sec02.exam03_multi_implements_class;

import ch088.sec02.exam01_name_implement_class.RemoteControl;

public class ST implements RemoteControl, Searchable {

	
	private int volume;

	//Searchable 에 있는 추상메소드
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다.");
	}
	
	//RemoteControl 에 있는 추상메소드
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원을 끕니다.");
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
		System.out.println("현재 Tv의 볼륨은 : " + this.volume + " 입니다");
		}
	 //인터페이스 2개에 있는 추상메소드드들 모두 오버라이딩 해야한다.
}
	


