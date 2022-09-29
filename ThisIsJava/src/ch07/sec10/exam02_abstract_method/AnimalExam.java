package ch07.sec10.exam02_abstract_method;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog(); // Dog클래스에서 불러온 dog객체 생성
		Cat cat = new Cat(); // Cat클래스에서 불러온 cat 객체 생성

		dog.sound(); // 멍멍 뜰거임
		cat.sound(); // 야옹 뜰거임
		System.out.println("-----------위에는 추상메소드임미다 아래는 자동타입변환임미다-----------");

		Animal ani = new Dog(); // 자식 객체를 부모 객체에 대입 == 자동타입변환
		ani.sound(); // 자식 객체 Dog에 있는 오버라이딩 된 sound가 호출됨.

		Animal ani2 = new Cat(); // 위랑 같음
		ani2.sound(); // 오버라이딩 메소드 호출
		System.out.println("-----------위에는 자동타입변환 아래는 클래스타입의 매개변수-----------");

		AnimalSound(new Dog());
		AnimalSound(new Cat());
	}

	public static void AnimalSound(Animal animal) { // 매개변수가 클래스타입일 경우 매개변수 안에 자식객체가 어떤거든 올 수 있음
		animal.sound();

	}

}
