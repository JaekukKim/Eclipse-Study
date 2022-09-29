package ch07.sec10.exam02_abstract_method;

public class Dog extends Animal{ //animal에 있는 추상메소드인 sound를 반드시 포함하고 있다는 의미로 빨간줄이 뜸
	public Dog () {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
}
