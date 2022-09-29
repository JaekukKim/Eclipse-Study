package ch07.sec10.exam01_abstract_class;

public abstract class Phone { //abstract는 클래스 생성시 체크하여 생성 가능, 뺴먹었다면 반드시 접근제한자와 클래스 사이에 써넣을것!
	
	//필드 생성
	public String owner;
	
	//생성자 (반드시 있어야함)
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//메소드 생성.
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
		
	}

}
