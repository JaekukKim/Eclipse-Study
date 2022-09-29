package ch07.sec10.exam01_abstract_class;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);

	}
	public void search() {
		System.out.println("인터넷 검색을 시작합니다.");
		
	}

}
