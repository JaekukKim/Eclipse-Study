package ch07.sec10.exam02_abstract_method;

public class Cat extends Animal{
	
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}

}
