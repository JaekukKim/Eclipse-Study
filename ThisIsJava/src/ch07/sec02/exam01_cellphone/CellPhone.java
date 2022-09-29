package ch07.sec02.exam01_cellphone;

public class CellPhone {
	String model;
	String name;

	void powerOn() {
		System.out.println("전원 켜집니당");
	}

	void powerOff() {
		System.out.println("전원 꺼집니당");

	}

	void bell() {
		System.out.println("벨이 울립니당");
	}

	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	void receiveVoice(String message1) {
		System.out.println("상대방 : " + message1);
	}
	
	void hangUp() {
		System.out.println("전화 끊어용");
	}

}
