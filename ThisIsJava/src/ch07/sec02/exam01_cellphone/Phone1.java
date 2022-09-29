package ch07.sec02.exam01_cellphone;

public class Phone1 extends CellPhone {
	int ch;
	
	Phone1(String model,String name,int ch){
		this.model=model;
		this.name=name;
		this.ch=ch;
	}
	void onPhone1() {
		System.out.println(ch + "채널이 켜져용");
	}
	void changech(int ch) {
		this.ch=ch;
		System.out.println(ch + "채널로 바꿔용");
	}
	void offPhone1() {
		System.out.println("꺼집니당.");
	}
}
